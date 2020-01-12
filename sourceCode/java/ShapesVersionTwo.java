/**
 *
 */
 
package com.vmpconsulting.training.demo;

public class ShapesVersionTwo {
  
  public static void main(String args[]) {
    Shapes myShapes = new Shapes();
    myShapes.displayTriangle();
    myShapes.displayReversedTriangle();
  }
}

/**
 *
 * Treated as an subclass, for the time being...
 */
class Shapes {
  
   //Class level variables...
   final static char THE_STAR = '*';
   final static char THE_SPACE = ' ';
   final static char NEW_LINE = '\n';
  
  //No constructor nothing, for the time being...

   public void displayTriangle() {

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
  }
  
   public void displayReversedTriangle() {

    int numOfLines = 10;
    int numOfStars = 19;

    
    for (int i = 0; i < numOfLines; i++) {
      for (int k = 0; k < i; k++) {
        System.out.print(THE_SPACE);
        //System.out.print(" ");    //Why not this...Strings are immutable and an object gets created within JVM everytime we print this statement and it would
                                    //become a memeory intensive program...
      }
      for (int j=0; j < numOfStars; j++) {
        System.out.print(THE_STAR);
        //System.out.print("*");
      }
      numOfStars -= 2;
      System.out.println(NEW_LINE);
    }
    System.console().readLine();
  }
  

}