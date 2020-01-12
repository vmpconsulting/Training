/**
 *  @version 3:
 *      Need to get the triangle printed upside down...
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
    int margin = 20;
    int temp;

    for (int i=0; i<numOfLines; i++) {
      //The loop for providing the left margin
      for (int k=0; k < (numOfLines - i + margin); k++) {
          printf(" ");
      }
      for (int j=0; j<numOfStars; j++) {
        printf("*");
      }
      numOfStars += 2;
      printf("\n");
    }
    printf("\n Number Of Stars In The Last Line: %d\n", numOfStars);
    getch();
    

    //Let's try printing the triangle in reverse...
    for (int i=0; i<=numOfLines; i++) {
      for (int k = 0; k < (margin + i); k++) {
        printf(" ");
      }
      for (int j=numOfStars; j >= 1; j--) {
        printf("*");
      }
      numOfStars -= 2;
      printf("\n");
    }
    getch();    //The Inverted Triangle., gets displayed here..
    
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
    getch(); //The Square gets displayed here...
    

    //Let's try a slopping line, rightwards...downwards... well, a backward slash...Strange:)
    for (int i=0; i<numOfLines; i++) {
      for (int j=0; j<(margin + i); j++) {
        printf(" ");
      }
      printf("*");
      printf("\n");
    }
    getch();

    //Let's try a slopping line, rightwards...downwards... well, a backward slash...Strange:)
    for (int i=0; i<numOfLines; i++) {
      for (int j=0; j<(margin - i); j++) {
        printf(" ");
      }
      printf("*");
      printf("\n");
    }
    getch();
    //Let's try out a circle...
    for (int i = 0; i < numOfLines; i++) {
      for (int j = 0; j < (margin - i); j++) {
        printf(" ");
      }
      printf("*");
      for (int j = 0; j <= (i * 2); j++) {
        printf(" ");
      }
      printf("*");
      printf("\n");
    }
    getch();   //The Circle gets displayed here...
    
    //Printing the Triangle just with printf statements...
    printf();
}