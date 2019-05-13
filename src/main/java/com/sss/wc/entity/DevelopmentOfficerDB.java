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
public class DevelopmentOfficerDB implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Lob
    String fullname;

    String nameWithInitials;
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

}
