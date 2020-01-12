/**
 *   Looks like works only in Context, Capture output scenario...
 */
#include <stdio.h>

int main() {
    //printf("This is Triangle");
    int numOfLines = 10;
    int numOfStars = 1;
    int leftMargin = 20;
    int temp;

    for (int i=0; i<numOfLines; i++) {
      //The loop for providing the left margin
      for (int k=0; k < ((numOfLines - numOfStars) + leftMargin); k++) {
          printf(" ");
      }
      for (int j=0; j<numOfStars; j++) {
        printf("*");
      }
      numOfStars += 2;
      printf("\n");
    }
    //scanf("%d", temp);
}