package org.drools.demo.loan;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Applicant implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Name")
   private java.lang.String name;
   @org.kie.api.definition.type.Label(value = "Credit Score")
   private int creditScore;

   public Applicant()
   {
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public int getCreditScore()
   {
      return this.creditScore;
   }

   public void setCreditScore(int creditScore)
   {
      this.creditScore = creditScore;
   }

   public Applicant(java.lang.String name, int creditScore)
   {
      this.name = name;
      this.creditScore = creditScore;
   }

}