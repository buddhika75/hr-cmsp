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
public class ManagementAssistantsDB implements Serializable{
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
     String designation ;
     
     @Temporal(javax.persistence.TemporalType.DATE)
     Date dateOfDutyAssumed;
     
     private Boolean absorptionToServiceMinute2004
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

}
