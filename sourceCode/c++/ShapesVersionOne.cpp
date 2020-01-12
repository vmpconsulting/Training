/**
 *
 */
 
#include <iostream>
#include <conio.h>
#include <stdio.h>
using namespace std;

class Shapes {
  
  public:
    //Again, no Constructor nothing, for the time being...
    void displayTriangle() {
      int numOfLines = 10;
      int margin = 20;
      int numOfStars = 1;
  
      for (int i = 0; i < numOfLines; i++) {
        for (int k = 0; k < numOfLines - i; k++) { 
          cout << " ";
        }
        for (int j=0; j < numOfStars; j++) {
          cout << "*";
        }
        numOfStars += 2;
        cout << endl;
      }
      getch();
    }
    
    void displayReversedTriangle() {
      int numOfLines = 10;
      int numOfStars = 19;
  
      for (int i = 0; i < numOfLines; i++) {
        for (int k = 0; k < i; k++) {
          //cout << " ";
          printf(" ");
        }
        for (int j=0; j < numOfStars; j++) {
          cout << "*";
        }
        numOfStars -= 2;
        cout << endl;
      }
      getch();
    }
    

};

int main() {
    //cout << "Hello, C++";
    Shapes myShapes;
    myShapes.displayTriangle();
    myShapes.displayReversedTriangle();
    return 0;
}

