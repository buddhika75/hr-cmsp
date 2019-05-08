package com.sss.wc.controllers;

import com.sss.wc.controllers.util.JsfUtil;
import com.sss.wc.controllers.util.JsfUtil.PersistAction;
import com.sss.wc.entity.Item;
import com.sss.wc.enums.ItemType;
import com.sss.wc.enums.PositionType;
import com.sss.wc.facades.ItemFacade;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Named("itemController")
@SessionScoped
public class ItemController implements Serializable {

    @EJB
    private com.sss.wc.facades.ItemFacade ejbFacade;
    private List<Item> items = null;
    private Item selected;

    public Item findItem(String name, ItemType type) {
        String jpql;
        Map m = new HashMap();
        jpql = "select i from Item i where lower(i.name) = :n and i.itemCategory = :cat";
        m.put("n", name.toLowerCase());
        m.put("cat", type);
        Item ti = getFacade().findFirstBySQL(jpql, m);
        if (ti == null) {
            ti = new Item();
            ti.setName(name);
            ti.setItemCategory(type);
            getFacade().create(ti);
        }
        return ti;
    }

    public List<Item> findItems(String name, ItemType type) {
        String jpql;
        Map m = new HashMap();
        jpql = "select i from Item i where lower(i.name) like :n and i.itemCategory = :cat";
        m.put("n", "%" + name.toLowerCase() + "%");
        m.put("cat", type);
        return getFacade().findBySQL(jpql, m);
    }

    public List<Item> completeDesignations(String name) {
        return findItems(name, ItemType.Designation);
    }

    public ItemController() {
    }

    public Item getSelected() {
        return selected;
    }

    public void setSelected(Item selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private ItemFacade getFacade() {
        return ejbFacade;
    }

    public Item prepareCreate() {
        selected = new Item();
        initializeEmbeddableKey();
        return selected;
    }

    public Item findOrCreateItem(ItemType it, PositionType pt) {
        String j = "select i from Item i ";
        Map m = new HashMap();
        if (it != null && pt != null) {
            j += " where i.itemCategory=:cat and i.positionType=:pt ";
            m.put("Cat", it);
            m.put("pt", pt);
        } else if (it != null) {
            j += " where i.itemCategory=:cat and i.positionType=:pt ";
            m.put("Cat", it);
            m.put("pt", pt);
        } else if (pt != null) {
            j += " where i.itemCategory=:cat and i.positionType=:pt ";
            m.put("Cat", it);
            m.put("pt", pt);
        } else {
            return new Item();
        }
        Item ti = getFacade().findFirstBySQL(j, m);
        if(ti==null){
            ti = new Item();
        }
        return ti;
    }

    public void create() {
        if (selected == null) {
            JsfUtil.addErrorMessage("Nothing to save");
            return;
        }
        if (selected.getItemCategory() == ItemType.Position) {
            String j = "Select i from Item i where i.itemCategory=:cat and i.positionType=:pt";
            Map m = new HashMap();
            m.put("cat", ItemType.Position);
            m.put("pt", selected.getPositionType());
            Item ti = getFacade().findFirstBySQL(j, m);
            if (ti != null) {
                JsfUtil.addErrorMessage("This Position is already added");
                return;
            }
        }
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle1").getString("ItemCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle1").getString("ItemUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle1").getString("ItemDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Item> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle1").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle1").getString("PersistenceErrorOccured"));
            }
        }
    }

    public Item getItem(java.lang.Long id) {
        return getFacade().find(id);
    }

    public List<Item> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Item> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Item.class)
    public static class ItemControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            ItemController controller = (ItemController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "itemController");
            return controller.getItem(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Item) {
                Item o = (Item) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Item.class.getName()});
                return null;
            }
        }

    }

}
