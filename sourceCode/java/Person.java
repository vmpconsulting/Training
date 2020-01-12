/**
 * These classes were originally created for the Introduction to OOPS concepts sessions, orgainzed by Coindsys, Coimbatore...
 *
 * @author VMP Consulting
 * @date created Wed, 01Jan2020 @ 09:45 AM IST
 * @version 1.0
 */
 package com.vmpconsulting.training.demo;
 /**
  * This is the base class from which we'll gradually move from Procedural Language like code to implementing the OOPS based code...
  * Right now, it has just two attributes, and we'll keep every access modifier, for the class, attributes and for it's methods as 
  * <code>public</code> to keep things simple to get started with...
  * 
  * <p>Following are the two attributes of this class...
  *     <pre>    1.  Name -  Holds the name of the person, a parameter of type <code>String</code>
  *     <pre>    2.  Age  -  Holds the age of the given person, a parameter of type <code>Integer</code>
  *
  * @see java.lang.String
  * @see java.lang.Integer
  */


 public class Person {
   /**
    * The Member-Attribute of the class {link #Person} that holds the name of the given person/individual...
    */
    public String myName;
    
    /**
     *  The Member-Attribute of the class {link #Person} that holds the age of the given person/individual...
     */
    public Integer myAge;
    
    /**
     *  The Constructor with <code>public</code> access (which means, any code interested in accessing this constructor, could do so, with
     *  no inhibitions at all...
     *
     *  <p>Note that, it is good practice to name all the parameters for the Member-functions and for the Constructors, prefixing with <code>p</code> 
     *  followed by the name of the attribute in camelCase... The prescribed standards, if adopted, religiously, would make the code looking professional 
     *  and in fact, it is a very good first step to get started with, adhereing to the prescribed coding standards...
     *
     *  <p>Do note that, though this Constructor, construts an Object of type <code>Person</code> it does not make an explicit <code>return</code> since, 
     *  this is a constructor and the defintion also does not explicitly mentions a return type, which is a must in case of Member-functions...
     *
     * @param pName - The Name of the person
     * @param pAge  - The Age of the person
     */
     public Person(String pName, Integer pAge) {
        this.myName = pName;
        this.myAge = pAge;
     }
     
     /**
      *  The <code>getter</code> for one of the attributes {link #age}
      *  @return age, which is an @see java.lang.Integer
      */
     public Integer getAge() {
        return this.myAge;
     }
     
        /**
      *  The <code>getter</code> for one of the attributes {link #name}
      *  @return name, which is a @see java.lang.String
      */
     public String getName() {
        return this.myName;
     }
     
     /**
      *     Displays the relevant attributes, when called...
      */
      public void doTheDisplay() {
            System.out.println("\nYour Name: " + this.myName +
                               "\nYour Age : " + this.myAge +
                               "\n********************************");
      }


 }