//Resolving the clock problem...

#include <stdio.h>

int main() {
    int clocks[4][1000];
  //  bool isCommonValue = false;
    //int intervel[4] = {6, 12, 8, 18};
    int intervel[4] = {2, 28, 35, 47};
    int maxSeconds = 1000;
    int numOfTimesClocksRangTogether = 0;
    int numOfComparisions = 0;


    for (int i=0; i < 4; i++) {
      //first, let us fill the possible intervels
        for (int j=0; j < maxSeconds; j++) {
          clocks[i][j] = (j + 1) * intervel[i];
          //printf("\n%d * %d = %d", j + 1, intervel[i], clocks[i][j]);
        }
        //printf("\nEnd Of Table!!!");
    }
    //Check if there is a common value and if yes, then print it out..
    //for (int i=0; i < 4; i++) {
        //isCommonValue = false;
        for (int j=0; j < maxSeconds; j++) {
            numOfComparisions += 1;
            for (int k=0; k < maxSeconds; k++) {
                numOfComparisions += 1;
                //printf("\nComparing: %d, %d", clocks[0][j], clocks[1][k]);
                if (clocks[0][j] == clocks[1][k]) {
                    for (int l=0; l < maxSeconds; l++) {
                        numOfComparisions += 1;
                        if (clocks[0][j] == clocks[2][l]) {
                            for (int m=0; m < maxSeconds; m++) {
                                numOfComparisions += 1;
                                if (clocks[0][j] == clocks[3][m]) {
                                    numOfTimesClocksRangTogether++;
                                    printf("\n%d: The Common Value Is: %d", numOfTimesClocksRangTogether, clocks[0][j]);
                                }
                            }
                        }
                    }
                    //printf("\nThe Common Value Is: %d", clocks[0][j]);
                }

            }
        }
    //}
    printf("\nNumber of Comparisions made: %d", numOfComparisions);

}