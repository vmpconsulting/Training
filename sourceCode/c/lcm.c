//Finding out the LCM...
#include <stdio.h>

void main() {
    int theNumbers[4] = {6, 8, 12, 18};
    int theMaxMultiple = 1;
    int theModReminder = 0;

    printf("Finding the LCM!!!");

    for (int i=0; i< 4; i++) {
      theMaxMultiple *= theNumbers[i];
      printf("\nIteration: %d : The MaxMultiple: %d", i + 1, theMaxMultiple);
    }
    
    do {
      for (int i=0; i<4; i++) {
          theModReminder = theMaxMultiple%theNumbers[i];
          printf("\n\ni: %d, The Number:: %d, The MaxMultiple::: %d and the ModRemider:::: %d", i, theNumbers[i], theMaxMultiple, theModReminder);
          if (theModReminder > 0) {
            break;
          }
      }
      if (theModReminder == 0) {
        theMaxMultiple = theMaxMultiple / 2;
      }
    } while (theModReminder == 0);
}