/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sss.wc.controllers;

import com.sss.wc.enums.CivilStatus;
import com.sss.wc.enums.EmployeeType;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;
import com.sss.wc.enums.Gender;
import com.sss.wc.enums.ItemType;
import com.sss.wc.enums.LeaveType;
import com.sss.wc.enums.PositionType;
import com.sss.wc.enums.Privilege;

/**
 *
 * @author User
 */
@Named
@ApplicationScoped
public class EnumController {

    /**
     * Creates a new instance of EnumController
     */
    public EnumController() {
    }

    public Gender[] getGenders() {
        return Gender.values();
    }

    public ItemType[] getItemTypes() {
        return ItemType.values();
    }
    
    public PositionType[] getPositionTypes() {
        return PositionType.values();
    }

    public LeaveType[] getLeaveTypes() {
        return LeaveType.values();
    }

    public Privilege[] getPrivileges() {
        return Privilege.values();
    }

    public CivilStatus[] getCivilStatuses() {
        return CivilStatus.values();
    }

    public EmployeeType[] getEmployeeTypes() {
        return EmployeeType.values();
    }

}
