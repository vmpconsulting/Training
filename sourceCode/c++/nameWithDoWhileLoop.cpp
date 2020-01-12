/**
 * @version 2.0
 *      Introducing/using Functions...
 * @concepts
 *      Now, we move the display functionality into a separate functions, since, it gets repeated twice...
 * @question
 *      Is this the implementation of OOPS concepts or is it still Procedural Language Implementation?  Defend...
 * @exercise
 *      Do enter different type of values for the input and observe the behaviour...
 * 
 * @version 1.0
 *      Receiving a string, char and int values and displaying the same on the screen...
 * @concepts
 *      A basic functionality, that gets implemented as a procedural language code...
 *
 * @author 
 *      VMP Consulting
 * @date created
 *      Wed, 01Jan2020 @ 0:05:00 Hrs IST  ;) Happy New Year To All!!!
 */
 
#include <iostream>
//#include <string>
#include <conio.h>
using namespace std;

/**
 * Parameters are passed by value here... Do Check!!!
 */
void doTheDisplay(string pName, int pAge, char pFav) {

    cout << "\n********************************\nYour Name: " << pName << "\nYour Age: " << pAge << "\nAnd Your Favorite Alphabet Is: " << pFav << endl;
}

int main() {
  int myAge = 10;
  string myName = "Saba";
  char myFavAlphabet = 'k';
  char myDecision = 'y';
  
  doTheDisplay(myName, myAge, myFavAlphabet);
  
  do {

    cout << "\n\nEnter Your Name: "; cin >> myName;
    cout << "Enter Your Age : "; cin >> myAge;
    cout << "Enter Your Favourite Alphabet: " ; cin >> myFavAlphabet;
    
    
    //Now, the inputs from the user have been received and let us do the display...
    doTheDisplay(myName, myAge, myFavAlphabet);

    //Let the user decide whether (s)he would like to go for one more iteration...
    cout << "\nContinue (y)es/(n)o) : " ;

    myDecision = getch();
  } while (myDecision == 'y');

  return 0;
}