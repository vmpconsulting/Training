/**
 *
 */
 
package com.vmpconsulting.training.demo;

/**
 * This class prints out the triangle and the code has no OOPS design, meant as a startup for the freshers who are graduating from PL to OOPS based coding...
 */
public class ShapesVersionOne {

    final static char THE_STAR = '*';
    final static char THE_SPACE = ' ';
    final static char NEW_LINE = '\n';
    public static void main(String args[]) {
        //System.out.println("Hello Java!!!");
        //Every other functionality gets implemented within main() not by heart, but, for the sake of making the class understand the basics of PL coding...
        int numOfLines = 10;
        int margin = 20;
        int numOfStars = 1;

        
        for (int i = 0; i < numOfLines; i++) {
          for (int k = 0; k < numOfLines - i; k++) { 
            System.out.print(THE_SPACE);
            //System.out.print(" ");    //Why not this...Strings are immutable and an object gets created within JVM everytime we print this statement and it would
                                        //become a memeory intensive program...
          }
          for (int j=0; j < numOfStars; j++) {
            System.out.print(THE_STAR);
            //System.out.print("*");
          }
          numOfStars += 2;
          System.out.println(NEW_LINE);
        }
        System.console().readLine();
        
        numOfStars-=2;
        //Inverted Triangle...
        for (int i = 0; i < numOfLines; i++) {
          for (int k = 0; k < i ; k++) {
            System.out.print(THE_SPACE);
          }
          for (int j = 0; j < numOfStars; j++) {
            System.out.print(THE_STAR);
          }
          numOfStars -= 2;
          System.out.println(NEW_LINE);
        }
        System.console().readLine();
    }
}
