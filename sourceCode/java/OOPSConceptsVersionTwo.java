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

/**
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

public class OOPSConceptsVersionTwo {
  
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
            doTheDisplay(myName, myAge);
            System.out.println("Continue (y)es/(n)o");
            myDecision = getTheConsole().readLine();
        } while ((myDecision.equals("y") || (myDecision.equals("Y"))));
        //getTheConsole().readLine();
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

        System.out.println("Your Name: " + pName);
        System.out.println("Your Age: " + pAge);
     }
}