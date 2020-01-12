package com.vmpconsulting.training.demo;

/**
 *  An attempt to make the OOPS concepts understood, by the freshers, though Java...
 *
 *  Note:  Do observe that, there is no semicolon at the end of the definition of the classes... a difference between C++ and Java's ways of defining the classes...
 */
 
abstract class Shapes {
    
    public void describeSelf() {
        System.out.println("\nHi, This is the class Shapes, and I would be the PARENT class for my subclasses, "  +
                           "viz., Triangle, ReversedTriangle, Square, Rectangle, Forward and Backward slashes...");
    }
    
    abstract public void printYourShape();

    private void describeSelf(String pGreetings) {
        System.out.println("\n\nHi, I'm an overloaded method (note:  OVERLOADING (of methods) always happens WITHIN THE SAME CLASS) and " +
                           "the greeting message I've received is : " +  pGreetings + " and I happen to have a PRIVATE access, which means" +
                           "I'm not accessible beyond this boundaries of this class, either by it's child classes or other classes outside of this one...");
    }
    
    protected void describeSelf(String pGreetings, String pName) {
        describeSelf(pGreetings); //Calling the PRIVATE method, of this class, from within, one of it's own methods...
        System.out.println("\nHi, I'm one more version of overloaded method but, the difference here is, my access is PROTECTED, which means, I'm available to " +
                    "all of the child classes, which are getting inherited from me, the parent class, called Shapes...\n" +
                    "do note that, just because I'm having one more extra parameter from my sibling method, this overloading becomes possible..." +
                    "Otherwise, If I happen to have a same set of parameters as my sibiling method, you would get an compilation error..." +
                    "so, do note that, only when the signature of the method happen to be different, the OVERLOADING becomes a possibility..." +
                    "methods, with same signature, can never be called/make overloading possible...");
    }
}

class Triangle extends Shapes {

    public void describeSelf() {
        System.out.println("\nHi, This is the Triangle class, which is the CHILD class of my PARENT class called SHAPES..." +
                           "and by RETAINING THE SAME METHOD SIGNATURE as that of my PARENT class, I would be OVERRIDING the implementation of this " +
                           "method, which has my own (child) version of the implementation, which is different from the implementation of my PARENT class... ");
    }
    
    public void printYourShape() {
        System.out.println("Hi, I'm a Triangle!!!");
    };
    
    public void describeSelf(String pGreetings, String pName) {
        super.describeSelf(pGreetings, pName);
    }
}

class Square extends Shapes {
    
    public void printYourShape() {
        System.out.println("I'm a Square!!!");
    }
    
    public  String printYourShape(String pGreetings) {
        System.out.println("I'm a Square!!! and I'm returning a String!!!");
        return "Hi, How Are You Doing!!!";
    }
}

public class OOPSTrainingVersionThree {
  
    //The main() method, as usual...
    public static void main(String args[]) {
        String myGreetings = "Hi, Welcome To Coindsyz!!!";
        String myName = "M. Nachimuthu";
        //Shapes myShapes = new Shapes();
        Triangle myTriangle = new Triangle();
        Square mySquare = new Square();

        //System.out.println("\n\n\nCalling myShapes.describeSelf()...");
        //myShapes.describeSelf();

        //System.out.println("\n\n\nCalling myTriangle.describeSelf()...");
        //myTriangle.describeSelf();
        //System.console().readLine();
        //myShapes.describeSelf(pGreetings);
        //myShapes.describeSelf(pGreetings, pName);
        //System.out.println("\n\n\nCalling myTriangle.describeSelf(myGreetings, myName)...");
        //myTriangle.describeSelf(myGreetings, myName);
        
        //System.out.println("\n\n\nCalling myTriangle.printYourShape()...");
        //myTriangle.printYourShape();

        //System.out.println("\n\n\nCalling mySquare.printYourShape()...");
        //mySquare.printYourShape();
        
        letsPrintTheShapeOfAllChildren(myTriangle);
        letsPrintTheShapeOfAllChildren(mySquare);
        


        System.console().readLine();
    }
    
    public static void letsPrintTheShapeOfAllChildren(Shapes pShapes) {
        pShapes.printYourShape();
    }
}
