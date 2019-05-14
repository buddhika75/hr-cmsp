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
public class ManagementAssistant extends Employee implements Serializable {

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
    Date dateOfFirstAppointment;
    String designation;

    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfDutyAssumed;

    private Boolean absorptionToServiceMinute2004;

    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfAbsorption2004;

    private Boolean absorptionToServiceMinute2013;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfAbsorption2013;

    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfCompletionOfEfficiencyBarExaminationGrade3;

    private Boolean serviceConfirmation;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date confirmed;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfConfirmedLetter;
    String numberOfConfirmedLetter;

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

    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfGradeofSpecialPromotion;
    String numberOfGradeofSpecialPromotion;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dateOfGrade1SpecialPromotionLetter;

    private Boolean firstAppointmentIsOutOfSouthernProvince;
    private Boolean diciplinaryAction;
    String numberOfDiciplinaryActionLetter;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateOfDisciplinaryActionLetter;

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

    public Date getDateOfFirstAppointment() {
        return dateOfFirstAppointment;
    }

    public void setDateOfFirstAppointment(Date dateOfFirstAppointment) {
        this.dateOfFirstAppointment = dateOfFirstAppointment;
    }


    public Date getDateOfDutyAssumed() {
        return dateOfDutyAssumed;
    }

    public void setDateOfDutyAssumed(Date dateOfDutyAssumed) {
        this.dateOfDutyAssumed = dateOfDutyAssumed;
    }

    public Boolean getAbsorptionToServiceMinute2004() {
        return absorptionToServiceMinute2004;
    }

    public void setAbsorptionToServiceMinute2004(Boolean absorptionToServiceMinute2004) {
        this.absorptionToServiceMinute2004 = absorptionToServiceMinute2004;
    }

    public Date getDateOfAbsorption2004() {
        return dateOfAbsorption2004;
    }

    public void setDateOfAbsorption2004(Date dateOfAbsorption2004) {
        this.dateOfAbsorption2004 = dateOfAbsorption2004;
    }

    public Boolean getAbsorptionToServiceMinute2013() {
        return absorptionToServiceMinute2013;
    }

    public void setAbsorptionToServiceMinute2013(Boolean absorptionToServiceMinute2013) {
        this.absorptionToServiceMinute2013 = absorptionToServiceMinute2013;
    }

    public Date getDateOfAbsorption2013() {
        return dateOfAbsorption2013;
    }

    public void setDateOfAbsorption2013(Date dateOfAbsorption2013) {
        this.dateOfAbsorption2013 = dateOfAbsorption2013;
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

    public Date getDateOfConfirmedLetter() {
        return dateOfConfirmedLetter;
    }

    public void setDateOfConfirmedLetter(Date dateOfConfirmedLetter) {
        this.dateOfConfirmedLetter = dateOfConfirmedLetter;
    }

    public String getNumberOfConfirmedLetter() {
        return numberOfConfirmedLetter;
    }

    public void setNumberOfConfirmedLetter(String numberOfConfirmedLetter) {
        this.numberOfConfirmedLetter = numberOfConfirmedLetter;
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

    public Date getDateOfGradeofSpecialPromotion() {
        return dateOfGradeofSpecialPromotion;
    }

    public void setDateOfGradeofSpecialPromotion(Date dateOfGradeofSpecialPromotion) {
        this.dateOfGradeofSpecialPromotion = dateOfGradeofSpecialPromotion;
    }

    public String getNumberOfGradeofSpecialPromotion() {
        return numberOfGradeofSpecialPromotion;
    }

    public void setNumberOfGradeofSpecialPromotion(String numberOfGradeofSpecialPromotion) {
        this.numberOfGradeofSpecialPromotion = numberOfGradeofSpecialPromotion;
    }

    public Date getDateOfGrade1SpecialPromotionLetter() {
        return dateOfGrade1SpecialPromotionLetter;
    }

    public void setDateOfGrade1SpecialPromotionLetter(Date dateOfGrade1SpecialPromotionLetter) {
        this.dateOfGrade1SpecialPromotionLetter = dateOfGrade1SpecialPromotionLetter;
    }

    public Boolean getFirstAppointmentIsOutOfSouthernProvince() {
        return firstAppointmentIsOutOfSouthernProvince;
    }

    public void setFirstAppointmentIsOutOfSouthernProvince(Boolean firstAppointmentIsOutOfSouthernProvince) {
        this.firstAppointmentIsOutOfSouthernProvince = firstAppointmentIsOutOfSouthernProvince;
    }

    public Boolean getDiciplinaryAction() {
        return diciplinaryAction;
    }

    public void setDiciplinaryAction(Boolean diciplinaryAction) {
        this.diciplinaryAction = diciplinaryAction;
    }

    public String getNumberOfDiciplinaryActionLetter() {
        return numberOfDiciplinaryActionLetter;
    }

    public void setNumberOfDiciplinaryActionLetter(String numberOfDiciplinaryActionLetter) {
        this.numberOfDiciplinaryActionLetter = numberOfDiciplinaryActionLetter;
    }

    public Date getDateOfDisciplinaryActionLetter() {
        return dateOfDisciplinaryActionLetter;
    }

    public void setDateOfDisciplinaryActionLetter(Date dateOfDisciplinaryActionLetter) {
        this.dateOfDisciplinaryActionLetter = dateOfDisciplinaryActionLetter;
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
