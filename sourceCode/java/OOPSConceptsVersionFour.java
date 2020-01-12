/**
 * This class, Welcomes everyone to the training session and sincerely makes an attempt to make everyones' life, easy while learning the basic concepts of OOPS and
 * basic Java coding...
 *
 * @author VMP Consulting
 * @version 1.0
 */
 
package com.vmpconsulting.training.demo;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

import com.vmpconsulting.training.demo.Person;

/**
 * In the fourth version, we would introduce basic class called {@link com.vmpconsulting.training.demo.Person} which holds just two basic attributes, 
 * viz., <code>myName</code>, which is of type {@link java.lang.String} and <code>myAge</code> which is of type {@link java.lang.Integer}.  
 * This class would also have a helper function called {@link com.vmpconsulting.training.demo.Person#doTheDisplay} that would simply print out, both the
 * attributes values, to the console...
 *
 * <p>Also, we would introduce {@link java.util.ArrayList} to hold all the objects of class {@link com.vmpconsulting.training.demo.Person}
 *
 * @exercise If the current existing {@link #doTheDisplay} function itself to display the details, what changes needs to be made? - Clue: There are at least two
 * different ways, it could get achieved...
 *
 * @version 4.0
 *
 * In the third version, we're introducing {@link java.util.HashMap} to hold the the pair of name along with it's age, as gets entered by the user and after
 * all the entries are over, we would print them out to the console...
 *
 * @version 3.0
 *
 * Now, we are defining a method called {@link #doTheDisplay}, which receives the name and age of the user and prints it out... A step towards Modular programming,
 * but, we are still in Procedural Language world...Have not entered much into the OOPS world yet...Stay tuned...:)
 *
 * <p>Also, we're introducing the do-while loop of Java... Basically there is no difference between the way do while loop gets implemented between Java and C++.
 * In fact, across languages, the basic control structures would almost remain the same, but for subtle syntatical differences...
 *
 * @version 2.0
 *
 * This class, Welcomes everyone to the training session and sincerely makes an attempt to make everyones' life, easy while learning the basic concepts of OOPS and
 * basic Java coding...
 *
 * <p>A basic class, which would be the Entry point to rest of the Java classes, that are going to be discussed during the training session...
 * <p>As of the functionality, it simply receives the user name and the age and prints that out in the console...  We'll make this more sophisticated,
 * as we go along...
 * <p>All methods here in this class happen to the <code>static</code>, to keep things simple for now... We'll get into creation of object and calling it's
 * methods, little later, as we go along... For now, do know that, any <code>static</code> variable or a method, would be available one per Class 
 * than for the Object... We'll discuss more on that later...
 *
 * @version 1.0
 */

public class OOPSConceptsVersionFour {
  
    /**
     * The <code>java.io.BufferedReader</code> object, that facilitates the reading of the input from the user, through the console...
     *
     * @see #getTheConsole
     * @see java.io.BufferedReader
     */

     public static BufferedReader myReader;
    /**
     *  Receives both the name and the age of the user, through the console and displays it back by calling the 
     *  member function {@link #doTheDisplay}
     *  @param args[] The Command line parameters, passed as an array of String...
     *  @return none
     *  @throws <code>IOException</code> The thrown exception is not handled for the time being and is being rethrown for now...
     *          It would get handled in a better way, as we go along...
     *  @see #doTheDisplay
     *  @see java.io.IOException
     */
     
     /**
      * The {@link java.util.HashMap} object, that would hold all the values being entered by the user...
      * <p>Ignore the generic notation for now and we would understand it further, as we go along... Basically, the type of the object that is held
      * by this Map is pre-defined at the time of declaration itself so that, we would avoid a possible <code>ClassCastException</code> errors, during the course
      * of the lifecyle of the application...
      */
     public static HashMap<String, Integer> allDetails = new HashMap<String, Integer>();
     
     /**
      *  The {@link java.util.ArrayList} object, that holds the objects of class {@link com.vmpconsulting.training.demo.Person}
      */
     public static ArrayList<Person> allPersons = new ArrayList<Person>();

     public static void main(String args[]) throws IOException {
        String myName;
        Integer myAge;
        String myDecision = "y";

        do {
            System.out.println("Enter Your Name: ");
            myName = getTheConsole().readLine();
            System.out.println("Enter Your Age: ");
            myAge = Integer.valueOf(getTheConsole().readLine());
            //Call the newly created method...
            Person myPerson = new Person(myName, myAge);
            allPersons.add(myPerson);
            myPerson.doTheDisplay();
            //doTheDisplay(myName, myAge);
            System.out.println("Continue (y)es/(n)o");
            myDecision = getTheConsole().readLine();
        } while ((myDecision.equals("y") || (myDecision.equals("Y"))));
        
        //Now, let us display the values entered by the user, so far...
        System.out.println("The Values You've Entered So Far Are...");
        /*for (Map.Entry<String, Integer> entry: allDetails.entrySet()) {
            doTheDisplay(entry.getKey(), entry.getValue());
            System.out.println("********************************");
        }*/
        allPersons.forEach(person -> {
            person.doTheDisplay();
          });

        System.out.println("Press any key to quit the program: ");
        getTheConsole().readLine();
     }
     
     /**
      * To keep things simple for the beginner, let us have a separate function, that returns the {@link java.io.BufferedReader} object,
      * through which the console inputs could be read...
      * <p>For a while, not to worry about this method and it's implementation...:) Keep your heads light...You would get to know more 
      * on this, when the time is appropriate enough, as we go along...
      * <p>Important Note:  As a new bee, to Java, do not worry to much about the way this method gets implemented...All you need to know is, you could call
      * this method and could read the input from the user, through the console...In fact, this is exactly the definition of <code>Abstraction</code>
      * , one of the very concepts of OOPS... Just know how to call a particular function, with appropriate parameters... Not to worry on the way the
      * function gets implemented...
      * <p>In fact, the implementation of this method is another good example of a design patter called <code>Singleton</code>... But, just take a note for 
      * now and we would worry about the design patterns, at a later point of time...
      *
      * @return myReader, the <code>BufferedReader</code> object, that facilitates the reading of the input from the console...
      * @see java.io.BufferedReader
      */
     public static BufferedReader getTheConsole() {

       if (myReader == null ) {
         myReader = new BufferedReader(new InputStreamReader(System.in));
       }
       return myReader;
     }
     
     /**
      * Receives the name and age of the user and prints that out to the console... Kind of an attempt to separate the business logic than having everything 
      * implemented inside the {@link #main} function...
      * 
      * <p> Observe the naming convention of the parameters, here... It always helps to have a known and predefined naming conventions and standards for your
      * coding...It helps not only you first and also your team members and a poor soul at a far distance of this planet, who may have to undergo the nightmare
      * of maintaining your code... :)
      *
      * @param pName The <code>String</code> parameter, that holds the name of the user...
      * @param pAge  The <code>Integer</code> parameter, that holds the age of the user...
      *
      * @return none
      * @see #main
      * @see java.lang.String
      * @see java.lang.Integer
      *
      */

     public static void doTheDisplay(String pName, Integer pAge) {

        allDetails.put(pName, pAge);
        System.out.println("Your Name: " + pName);
        System.out.println("Your Age: " + pAge);
     }
}