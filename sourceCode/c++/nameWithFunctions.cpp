/**
 * Receiving the String...
 *
 * Now, we move the display functionality into a separate functions, since, it gets repeated twice...
 * Question:  Is this the implementation of OOPS concepts or is it still Procedural Language Implementation?  Defend...
 * 
 * version 2.0  - Introducing Functions...
 */
 
#include <iostream>
//#include <string>
#include <conio.h>
using namespace std;

/**
 * Parameters are passed by value here... Do Check!!!
 */
void doTheDisplay(string pName, int pAge, char pFav) {

    cout << "\nYour Name: " << pName << "\nYour Age: " << pAge << "\nAnd Your Favorite Alphabet Is: " << pFav;
}

int main() {
  int myAge = 10;
  string myName = "Saba";
  char myFavAlphabet = 'k';
  
  doTheDisplay(myName, myAge, myFavAlphabet);
  
  cout << "\nEnter Your Name: "; cin >> myName;
  cout << "\nEnter Your Age : "; cin >> myAge;
  cout << "\Enter Your Favourite Alphabet: " ; cin >> myFavAlphabet;  

  doTheDisplay(myName, myAge, myFavAlphabet);

  
  getch();

  return 0;
}