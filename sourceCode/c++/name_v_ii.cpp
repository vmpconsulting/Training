/**
 * @version 2.0
 *      Introducing/using Functions...
 *      Introducing the do-while loop...
 * @concepts
 *      Now, we move the display functionality into a separate functions, since, it gets repeated twice, in the previous versions
 *      Also, we are actually separating some of the business logic inside the function for now... Later we would be moving some 
 *          more business logic into the same function, a concept known as separation of concerns...
 * @standards
 *      Instead of writing a lengthy line of code, spread your code into more lines and that way, the readability of your code would
 *      be better, which would be definietly apprecited by others, when they do a code-review, walk-through and during the maintenance
 *      phase of the application, in real life scenario...
 * @question
 *      Is this the implementation of OOPS concepts or is it still Procedural Language Implementation?  Defend...
 *      Can we reduce the call to doTheDisplayFunctionality() to just once instead of twice?  Why and Why Not?
 * @exercise
 *      Do enter large values (say for myAge(int) variable) and observe the behaviour
 *      Do enter large values (say for myFavouriteAlphabet(char) variable) and observe the behaviour
 *      Do have two versions of the function and observe the compiler message...
 *      If you do a code-cleanup exercise, what would you do here??
 *
 * 
 * @version 1.0
 *      Receiving a string, char and int values and displaying the same on the screen...
 * @concepts
 *      A basic functionality, that gets implemented as a procedural language code...
 * @standards
 *      Do observe that the variable names have been given a descriptive names, which means, to an extend self-documentation is achieved...
 *      Well documented code is very important while doing the maintenance work in large/real life projects, since, the code keeps changing hands...
 *      ...and also, when you happen to revisit your code...:) So, help yourself..:) Happy Coding!!!
 * @exercise
 *      Do enter blank values and observe the behaviour
 *      Do enter large values (say for myAge(int) variable) and observe the behaviour
 *      Do enter large values (say for myName(string) variable) and observe the behaviour
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

    cout << "\n********************************" 
         << "\nYour Name: " << pName
         << "\nYour Age: " << pAge 
         << "\nAnd Your Favorite Alphabet Is: " << pFav << endl;
}

/*
void doTheDisplay(string pName, int pAge, char pFav) {

    cout << "********************************" << endl;
    cout << "Your Name: " << pName << endl;
    cout << "Your Age: " << pAge << endl;
    cout << "And Your Favorite Alphabet Is: " << pFav 
         << endl;
}
*/

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
  } while (myDecision == 'y' || myDecision == 'Y');

  return 0;
}