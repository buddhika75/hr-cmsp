/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sss.wc.entity;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Pathum
 */
@Entity
public class ReportsDO implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
     private String nic;
      String officerName;
      
      private Boolean DOServiceInTheSP;
      String period;
      
      
      private int yearSerial;
      private int yearNumber;
      private List<String>  namesOfDOfficersYear1999;
      private List<String>  namesOfDOfficersYear2005;
      private List<String>  namesOfDOfficersYear2008;
      private List<String>  namesOfDOfficersYear2013;
      private List<String>  namesOfDOfficersYear2015;
      private List<String>  namesOfDOfficersYear2018;
      private int noOfDOfficersYear1999;
      private int noOfODfficersYear2005;
      private int noOfDOfficersYear2008;
      private int noOfDOfficersYear2013;
      private int noOfDOfficersYear2015;
      private int noOfDOfficersYear2018;
      
      
      private List<String>  namesOfSCOfficersYear1999;
      private List<String>  namesOfSCOfficersYear2005;
      private List<String>  namesOfSCOfficersYear2008;
      private List<String>  namesOfSCOfficersYear2013;
      private List<String>  namesOfSCOfficersYear2015;
      private List<String>  namesOfSCOfficersYear2018;
      private int noOfSCOfficersYear1999;
      private int noOfSCOfficersYear2005;
      private int noOfSCOfficersYear2008;
      private int noOfSCOfficersYear2013;
      private int noOfSCOfficersYear2015;
      private int noOfSCOfficersYear2018;
      
      
       private List<String>  namesOfClass3OfficersYear1999;
      private List<String>  namesOfClass3OfficersYear2005;
      private List<String>  namesOfClass3OfficersYear2008;
      private List<String>  namesOfClass3OfficersYear2013;
      private List<String>  namesOfClass3OfficersYear2015;
      private List<String>  namesOfClass3OfficersYear2018;
      private int noOfClass3OfficersYear1999;
      private int noOfClass3OfficersYear2005;
      private int noOfClass3OfficersYear2008;
      private int noOfClass3OfficersYear2013;
      private int noOfClass3OfficersYear2015;
      private int noOfClass3OfficersYear2018;
      
      private List<String>  namesOfClass2OfficersYear1999;
      private List<String>  namesOfClass2OfficersYear2005;
      private List<String>  namesOfClass2OfficersYear2008;
      private List<String>  namesOfClass2OfficersYear2013;
      private List<String>  namesOfClass2OfficersYear2015;
      private List<String>  namesOfClass2OfficersYear2018;
      private int noOfClass2OfficersYear1999;
      private int noOfClass2OfficersYear2005;
      private int noOfClass2OfficersYear2008;
      private int noOfClass2OfficersYear2013;
      private int noOfClass2OfficersYear2015;
      private int noOfClass2OfficersYear2018;
      
      
      private List<String>  namesOfClass1OfficersYear1999;
      private List<String>  namesOfClass1OfficersYear2005;
      private List<String>  namesOfClass1OfficersYear2008;
      private List<String>  namesOfClass1OfficersYear2013;
      private List<String>  namesOfClass1OfficersYear2015;
      private List<String>  namesOfClass1OfficersYear2018;
      private int noOfClass1OfficersYear1999;
      private int noOfClass1OfficersYear2005;
      private int noOfClass1OfficersYear2008;
      private int noOfClass1OfficersYear2013;
      private int noOfClass1OfficersYear2015;
      private int noOfClass1OfficersYear2018;
      
       private List<String> officersWhoAbsorbedService2004;
       
    private int noOfOfficersGalle;
    private int noOfOfficersMatara;
    private int noOfOfficersHambanthota;
    private List<String>  namesOfOfficersGalle;
    private List<String>  namesOfOfficersMatara;
    private List<String>  namesOfOfficersHambanthota;
     
   private String namesOfOfficersRetiredAge60;
   String period;
   
  private Boolean DOConfirmedOver3YearProbationPeriod;
     
      
     
     

}
