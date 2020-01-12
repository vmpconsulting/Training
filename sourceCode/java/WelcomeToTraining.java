/**
 * This class, Welcomes everyone to the training session and sincerely makes an attempt to make everyones' life, easy while learing the basic concepts of OOPS and 
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
 * This class, Welcomes everyone to the training session and sincerely makes an attempt to make everyones' life, easy while learing the basic concepts of OOPS and
 * basic Java coding...
 *
 * <p>A basic class, which would be the Entry point to rest of the Java classes, that are going to be discussed during the training session...
 */

public class WelcomeToTraining {
  
    /**
     * The <code>java.io.BufferedReader</code> object, that facilitates the reading of the input from the user, through the console...
     *
     * @see #getTheConsole
     * @see java.io.BufferedReader
     */

     public static BufferedReader myReader;
    /**
     *  Basic HelloWorld function and nothing beyond it...
     *  @param args[] The Command line parameters, passed as an array of String...{@link #main}
     *  @throws IOException The thrown exception is not handled for the time being and is being rethrown for now...
     *          It would get handled in a better way, as we go along...
     *  @see #getTheConsole
     */
     public static void main(String args[]) throws IOException {
        String dummyName = "TBD";

        Person myPerson = new Person("Saba", Integer.valueOf("49"));
        myPerson.doTheDisplay();
        


        System.out.println("Enter the value for the dummyName: ");
        dummyName = getTheConsole().readLine();

        System.out.println("You've entered the name as: " + dummyName);
        

        getTheConsole().readLine();
     }
     
     /**
      * To keep things simple for the beginner, let us have a separate function, that returns the @see java.io.BufferedReader object, 
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
}