/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sss.wc.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Pathum
 */
@Entity
public class DevelopmentOfficer extends Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Lob
    String fullname;

    String namewithInitials;
    private String nic;

    @Lob
    String address;
    @ManyToOne
    Institute institution;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfBirth;
    String personalContactNumber;
    String officialContactNumber;

    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfAppointment;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfDutyAssumed;

    private Boolean absorptionToServiceMinute;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfAbsorption;

    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfCompletionOfEfficiencyBarExaminationGrade3;

    private Boolean serviceConfirmation;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date confirmed;
     String numberOfConfirmedLetter;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfConfirmedLetter;
   

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date completionOfSecondLanguageProficiency;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfGrade2Promotion;
    String numberOfGrade2PromotionLetter;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfGrade2PromotionLetter;
    

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ExaminationGrade2;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfGrade1Promotion;
      String numberOfGrade1PromotionLetter;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfGrade1PromotionLetter;
  
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ExaminationGrade1;
    private Boolean firstAppointmentIsOutOfSouthernProvince;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date publicServiceOfSouthernProvince;

    private Boolean actionsHasTaken;
    String numberOfDisciplinaryLetter;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateOfDisciplinaryLetter;

    private Boolean transferred;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateOfTransfer;
    String numberOfTransferLetter;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateOfTransferLetter;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateOfRetirement;
    String numberOfRetirementLetter;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateOfRetirementLetter;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getNamewithInitials() {
        return namewithInitials;
    }

    public void setNamewithInitials(String namewithInitials) {
        this.namewithInitials = namewithInitials;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Institute getInstitution() {
        return institution;
    }

    public void setInstitution(Institute institution) {
        this.institution = institution;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPersonalContactNumber() {
        return personalContactNumber;
    }

    public void setPersonalContactNumber(String personalContactNumber) {
        this.personalContactNumber = personalContactNumber;
    }

    public String getOfficialContactNumber() {
        return officialContactNumber;
    }

    public void setOfficialContactNumber(String officialContactNumber) {
        this.officialContactNumber = officialContactNumber;
    }

    public Date getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(Date dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public Date getDateOfDutyAssumed() {
        return dateOfDutyAssumed;
    }

    public void setDateOfDutyAssumed(Date dateOfDutyAssumed) {
        this.dateOfDutyAssumed = dateOfDutyAssumed;
    }

    public Boolean getAbsorptionToServiceMinute() {
        return absorptionToServiceMinute;
    }

    public void setAbsorptionToServiceMinute(Boolean absorptionToServiceMinute) {
        this.absorptionToServiceMinute = absorptionToServiceMinute;
    }

    public Date getDateOfAbsorption() {
        return dateOfAbsorption;
    }

    public void setDateOfAbsorption(Date dateOfAbsorption) {
        this.dateOfAbsorption = dateOfAbsorption;
    }

    public Date getDateOfCompletionOfEfficiencyBarExaminationGrade3() {
        return dateOfCompletionOfEfficiencyBarExaminationGrade3;
    }

    public void setDateOfCompletionOfEfficiencyBarExaminationGrade3(Date dateOfCompletionOfEfficiencyBarExaminationGrade3) {
        this.dateOfCompletionOfEfficiencyBarExaminationGrade3 = dateOfCompletionOfEfficiencyBarExaminationGrade3;
    }

    public Boolean getServiceConfirmation() {
        return serviceConfirmation;
    }

    public void setServiceConfirmation(Boolean serviceConfirmation) {
        this.serviceConfirmation = serviceConfirmation;
    }

    public Date getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Date confirmed) {
        this.confirmed = confirmed;
    }

    public String getNumberOfConfirmedLetter() {
        return numberOfConfirmedLetter;
    }

    public void setNumberOfConfirmedLetter(String numberOfConfirmedLetter) {
        this.numberOfConfirmedLetter = numberOfConfirmedLetter;
    }

    public Date getDateOfConfirmedLetter() {
        return dateOfConfirmedLetter;
    }

    public void setDateOfConfirmedLetter(Date dateOfConfirmedLetter) {
        this.dateOfConfirmedLetter = dateOfConfirmedLetter;
    }

    public Date getCompletionOfSecondLanguageProficiency() {
        return completionOfSecondLanguageProficiency;
    }

    public void setCompletionOfSecondLanguageProficiency(Date completionOfSecondLanguageProficiency) {
        this.completionOfSecondLanguageProficiency = completionOfSecondLanguageProficiency;
    }

    public Date getDateOfGrade2Promotion() {
        return dateOfGrade2Promotion;
    }

    public void setDateOfGrade2Promotion(Date dateOfGrade2Promotion) {
        this.dateOfGrade2Promotion = dateOfGrade2Promotion;
    }

    public String getNumberOfGrade2PromotionLetter() {
        return numberOfGrade2PromotionLetter;
    }

    public void setNumberOfGrade2PromotionLetter(String numberOfGrade2PromotionLetter) {
        this.numberOfGrade2PromotionLetter = numberOfGrade2PromotionLetter;
    }

    public Date getDateOfGrade2PromotionLetter() {
        return dateOfGrade2PromotionLetter;
    }

    public void setDateOfGrade2PromotionLetter(Date dateOfGrade2PromotionLetter) {
        this.dateOfGrade2PromotionLetter = dateOfGrade2PromotionLetter;
    }

    public Date getExaminationGrade2() {
        return ExaminationGrade2;
    }

    public void setExaminationGrade2(Date ExaminationGrade2) {
        this.ExaminationGrade2 = ExaminationGrade2;
    }

    public Date getDateOfGrade1Promotion() {
        return dateOfGrade1Promotion;
    }

    public void setDateOfGrade1Promotion(Date dateOfGrade1Promotion) {
        this.dateOfGrade1Promotion = dateOfGrade1Promotion;
    }

    public String getNumberOfGrade1PromotionLetter() {
        return numberOfGrade1PromotionLetter;
    }

    public void setNumberOfGrade1PromotionLetter(String numberOfGrade1PromotionLetter) {
        this.numberOfGrade1PromotionLetter = numberOfGrade1PromotionLetter;
    }

    public Date getDateOfGrade1PromotionLetter() {
        return dateOfGrade1PromotionLetter;
    }

    public void setDateOfGrade1PromotionLetter(Date dateOfGrade1PromotionLetter) {
        this.dateOfGrade1PromotionLetter = dateOfGrade1PromotionLetter;
    }

    public Date getExaminationGrade1() {
        return ExaminationGrade1;
    }

    public void setExaminationGrade1(Date ExaminationGrade1) {
        this.ExaminationGrade1 = ExaminationGrade1;
    }

    public Boolean getFirstAppointmentIsOutOfSouthernProvince() {
        return firstAppointmentIsOutOfSouthernProvince;
    }

    public void setFirstAppointmentIsOutOfSouthernProvince(Boolean firstAppointmentIsOutOfSouthernProvince) {
        this.firstAppointmentIsOutOfSouthernProvince = firstAppointmentIsOutOfSouthernProvince;
    }

    public Date getPublicServiceOfSouthernProvince() {
        return publicServiceOfSouthernProvince;
    }

    public void setPublicServiceOfSouthernProvince(Date publicServiceOfSouthernProvince) {
        this.publicServiceOfSouthernProvince = publicServiceOfSouthernProvince;
    }

    public Boolean getActionsHasTaken() {
        return actionsHasTaken;
    }

    public void setActionsHasTaken(Boolean actionsHasTaken) {
        this.actionsHasTaken = actionsHasTaken;
    }

    public String getNumberOfDisciplinaryLetter() {
        return numberOfDisciplinaryLetter;
    }

    public void setNumberOfDisciplinaryLetter(String numberOfDisciplinaryLetter) {
        this.numberOfDisciplinaryLetter = numberOfDisciplinaryLetter;
    }

    public Date getDateOfDisciplinaryLetter() {
        return dateOfDisciplinaryLetter;
    }

    public void setDateOfDisciplinaryLetter(Date dateOfDisciplinaryLetter) {
        this.dateOfDisciplinaryLetter = dateOfDisciplinaryLetter;
    }

    public Boolean getTransferred() {
        return transferred;
    }

    public void setTransferred(Boolean transferred) {
        this.transferred = transferred;
    }

    public Date getDateOfTransfer() {
        return dateOfTransfer;
    }

    public void setDateOfTransfer(Date dateOfTransfer) {
        this.dateOfTransfer = dateOfTransfer;
    }

    public String getNumberOfTransferLetter() {
        return numberOfTransferLetter;
    }

    public void setNumberOfTransferLetter(String numberOfTransferLetter) {
        this.numberOfTransferLetter = numberOfTransferLetter;
    }

    public Date getDateOfTransferLetter() {
        return dateOfTransferLetter;
    }

    public void setDateOfTransferLetter(Date dateOfTransferLetter) {
        this.dateOfTransferLetter = dateOfTransferLetter;
    }

    public Date getDateOfRetirement() {
        return dateOfRetirement;
    }

    public void setDateOfRetirement(Date dateOfRetirement) {
        this.dateOfRetirement = dateOfRetirement;
    }

    public String getNumberOfRetirementLetter() {
        return numberOfRetirementLetter;
    }

    public void setNumberOfRetirementLetter(String numberOfRetirementLetter) {
        this.numberOfRetirementLetter = numberOfRetirementLetter;
    }

    public Date getDateOfRetirementLetter() {
        return dateOfRetirementLetter;
    }

    public void setDateOfRetirementLetter(Date dateOfRetirementLetter) {
        this.dateOfRetirementLetter = dateOfRetirementLetter;
    }
    
    
    

}
