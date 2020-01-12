#include <stdio.h>
#include <conio.h>

int numOfLines = 10;
int margin = 20;

void drawTheSlope(); //2nd way of making the forward declaration of functions...

void drawTheSquare() {

   //Let's try a square...
    for (int i = 0; i< numOfLines; i++) {
      //the below loop is just for the margin...
      for (int k = 0; k <margin; k++) {
        printf(" ");
      }
      for (int j=0; j < numOfLines * 2; j++) {
        printf("*");
      }
      printf("\n");
    }
    getch();
    //drawTheSlope();
  //drawTheSquare();
}

void main() {
  printf("hello all, welcome to C functions!!!");
  drawTheSquare();
  drawTheSlope();
  getch();
}

void drawTheSlope() {
  
  

  for (int i=0; i<numOfLines; i++) {
      for (int j=0; j<(margin + i); j++) {
        printf(" ");
      }
      printf("*");
      printf("\n");
    }
    getch();
}

