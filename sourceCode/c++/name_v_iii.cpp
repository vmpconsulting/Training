/**
 * @version 3.0
 *      Introducing struct...
 * @concepts
 *      Observe the two different ways in which a struct variable (myDetails) could get defined.
 * @exercise
 *      Give a value other than (y)es/(n)o and observe the bheaviour...
 *      Can you rewrite the do-while loop so that, it evaluates to false (negative) condition ??? Say, as long as user do not say (n)o, let the loop continue...
 *
 * @version 2.0
 *      Introducing/using Functions...
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
 * @exercise
 *      Do enter large values (say for myAge(int) variable) and observe the behaviour
 *       Do enter large values (say for myFavouriteAlphabet(char) variable) and observe the behaviour
 *      Do have two versions of the function and observe the compiler message...
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
  /*
  int myAge = 10;
  string myName = "Saba";
  char myFavAlphabet = 'k';
  */
  char myDecision = 'y';

  
  struct basicDetails {
        int myAge;
        string myName;
        char myFavAlphabet;
  } myDetails;
  
  //basicDetails myDetails;
  
  //doTheDisplay(myName, myAge, myFavAlphabet);
  
  do {

    cout << "\n\nEnter Your Name: "; cin >> myDetails.myName;
    cout << "Enter Your Age : "; cin >> myDetails.myAge;
    cout << "Enter Your Favourite Alphabet: " ; cin >> myDetails.myFavAlphabet;
    
    
    //Now, the inputs from the user have been received and let us do the display...
    doTheDisplay(myDetails.myName, myDetails.myAge, myDetails.myFavAlphabet);

    //Let the user decide whether (s)he would like to go for one more iteration...
    cout << "\nContinue (y)es/(n)o) : " ;

    myDecision = getch();
  } while (myDecision == 'y');

  return 0;
}