/**
 *  @version 2:
 *      Needs to get modified, to work on a normal console (without Context's Capture Output option checked...)
 *  @version 1:
 *      Looks like works only in Context, Capture output scenario...
 *   @dateCreated:  Tue, 07Jan2020 @ Coindsyz OOPS Concepts One Week Session...
 *   @author Coindsyz
 */
#include <stdio.h>
#include <conio.h>

int main() {
    //printf("This is Triangle");
    int numOfLines = 10;
    int numOfStars = 1;
    int leftMargin = 20;
    int temp;

    for (int i=0; i<numOfLines; i++) {
      //The loop for providing the left margin
      for (int k=0; k < (numOfLines - i + leftMargin); k++) {
          printf(" ");
      }
      for (int j=0; j<numOfStars; j++) {
        printf("*");
      }
      numOfStars += 2;
      printf("\n");
    }
    getch();
}