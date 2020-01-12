/**
 * this is the first version of series, that is focused on teaching the basic OOPS concepts...viz., 
 *
 *      1. Inheritance
 *          1.1 Overriding
 *          (Topics to be covered in future)
 *          1.2  Single Inheritance
 *          1.3  Multiple Inheritance
 *          1.4
 *      2. Abstraction
 *      3. Encapulation
 *          3.1 Data Hiding
 *      4. Polymorphism
 *
 *      Note:   Overriding happens always between a PARENT and CHILD class...   (applicable only to public and protected methods and variables...
 *                                                      private methods and variables are always exempted, from being overridden...)
 *              Overloading happens always WITHIN A PARTICULAR CLASS... No relationship between the classes, involved...
 *      Tip:    This is a potential interview question... :)
 *  @exercise:  1.  Remove the semicolon at the end of the definition of either of the classes, and observe the compilation messages...
 *              2.  Remove the inclusion of <conio.h> header file and observe the compilation messages...
 *              3.  put two outstream characters, << << one after another in a cout statement and observe the compilation results/messages...
 *
 *
 *  @author Coindsyz
 *  @version  1.0
 *  @date Thu, 09Jan2020 @ 07:45 PM IST
 */
 
#include <iostream>
#include <string.h>
#include <conio.h>
using namespace std;

/**
 *  Shapes is the parent class all the rest of the child classes defined here...
 */
 class Shapes {
   
    // public key word defines the access modifier for the below function...
    public:    

        void describeSelf() {
            cout << "Hi, This is the class Shapes, and I would be the PARENT class for my subclasses, "  <<
                    "viz., Triangle, ReversedTriangle, Square, Rectangle, Forward and Backward slashes..."  << endl;
        }
        
        virtual void printYourName() {
            cout << "\n\nHi, I'm The Shape...";
        }

    private:
        void describeSelf(string pGreetings) {
            cout << "Hi, I'm an overloaded method (note:  OVERLOADING (of methods) always happens WITHIN THE SAME CLASS) and "  <<
                    "the greeting message I've received is : " << pGreetings << endl << " and I happen to have a PRIVATE access, which means" <<
                    "I'm not accessible beyond this boundaries of this class, either by it's child classes or other classes outside of this one..." << endl;
        }
        
    protected:
        void  describeSelf(string pGreetings, string pName) const {
            cout << "Hi, I'm one more version of overloaded method but, the difference here is, my access is PROTECTED, which means, I'm available to " <<
                    "all of the child classes, which are getting inherited from me, the parent class, called Shapes..." << endl <<
                    "do note that, just because I'm having one more extra parameter from my sibling method, this overloading becomes possible..." << endl <<
                    "Otherwise, If I happen to have a same set of parameters as my sibiling method, you would get an compilation error..." << endl <<
                    "so, do note that, only when the signature of the method happen to be different, the OVERLOADING becomes a possibility..." << endl <<
                    "methods, with same signature, can never be called/make overloading possible..."  << endl;

        }
 };
 
/**
 * Triangle class, inherits, itself from it's Parent class, called Shapes...
 */
class Triangle: public Shapes {
    public:
        //using Shapes::describeSelf(string, string);
        Shapes tempShape;

        void describeSelf() {
            cout << "Hi, This is the Triangle class, which is the CHILD class of my PARENT class called SHAPES..." <<
                    "and by RETAINING THE SAME METHOD SIGNATURE as that of my PARENT class, I would be OVERRIDING the implementation of this " <<
                    "method, which has my own (child) version of the implementation, which is different from the implementation of my PARENT class... "  << endl;
        }
        
        void printYourName() {
            cout << "\n\nHi, I'm a Triangle...";
        }
        /**
         * do note that, the private member of the parent class, is not accessible even from within the child class...
         */
         void describeSelf (string pGreetings) {
            //Shapes::describeSelf(pGreetings);
         }

        
        void describeSelf(string pGreetings, string pName) {
            Shapes::describeSelf(pGreetings, pName);
        }
};

class Square : public Shapes {
    public:
        void printYourName() {
            cout << "\n\nHi, I'm a Square...";

        }
};

//polymorphic, printYourName function...
void aPolymorphicFunction(Shapes pShapes) {
    pShapes.printYourName();
}

void aPolymorphicFunction(Triangle pTriangle) {
    pTriangle.printYourName();
}

void aPolymorphicFunction(Square pSquare) {
    pSquare.printYourName();
}

void actualPolymorpicFunction(Shapes* shapesPointer) {
    shapesPointer -> printYourName();
}
//Clarification it is an overloaded version of the function...
//void aPolymorphicFunction(Square pSquare) {
//    pSquare.printYourName();
//}

/** The main method, from which we would making the objects of the above classes, and would be calling their methods,
  * in order to understand the OOPS concepts, better...
  */
int main() {
  string myGreetings = "Hi, Welcome To Coindsyz!!!";
  string myName = "M. Nachimuthu";
  Shapes myShapes;
  Triangle myTriangle;
  Square mySquare;

  
  cout << endl << endl << "Calling myShapes.describeSelf()..." << endl << endl << endl;
  myShapes.describeSelf();

  cout <<endl << endl << "Calling myTriangle.describeSelf()..." << endl << endl << endl;
  myTriangle.describeSelf();
  
  //Now, let us make an attempt to call the PRIVATE overloaded method and observe the results...you should get a compile time error, itself...
  //myShapes.describeSelf(myGreetings);

  //Fine, we the compilation error as expected in the above call... and let us see, what happens in the below call...
  //Since, this is a protected method, we CANNOT access it from within main, since, the calling method, main() is not part SHAPES class's hierarchy/inheritence
  //tree...
  //myShapes.describeSelf(myGreetings, myName);

  //Let us see, if the child class, Triangle, attempts to call the above method...
  cout <<endl << endl << "myTriangle.describeSelf(myGreetings, myName)..." << endl << endl << endl;
  myTriangle.describeSelf(myGreetings, myName); //Gives error, which I myself, need to understand, further...
  getch();
  aPolymorphicFunction(myShapes);
  aPolymorphicFunction(myTriangle);
  aPolymorphicFunction(mySquare);
  getch();
  
  Shapes* shapesPointer;
  shapesPointer = &myTriangle;
  shapesPointer->printYourName();
  getch();
  shapesPointer = &mySquare;
  shapesPointer -> printYourName();
  getch();
  //actualPolymorphicFunction(&myShapes);
  //actualPolymorphicFunction(&myTriangle);
  //actualPolymorphicFunction(&mySquare);
  //getch();
}


 


