/**
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

int main() {
  int myAge = 10;
  string myName = "Saba";
  char myFavAlphabet = 'k';
  
  cout << "Your Name: " << myName << endl << "Your Age: " << myAge << "\nAnd your favorite alphabet is: " << myFavAlphabet;
  
  cout << endl << "Enter Your Name: "; cin >> myName;
  cout << "\nEnter Your Age : "; cin >> myAge;
  cout << "\Enter Your Favourite Alphabet: " ; cin >> myFavAlphabet;  

  cout << "\nYour Name: " << myName << endl << "Your Age: " << myAge << "\nYour Favourite Alphabet Is: " << myFavAlphabet << endl;
  
  getch();

  return 0;
}