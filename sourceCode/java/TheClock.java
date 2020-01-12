//Resolving the clock problem...

package com.vmpconsulting.training.demo;

public class TheClock {

    public static void main(String args[]) {
        int clocks[4][100];
        //  bool isCommonValue = false;
        int intervel[4] = {6, 8, 12, 18};
        int maxLimit = 20;
        //int intervel[4] = {6, 12, 18, 24};


        for (int i=0; i < 4; i++) {
          //first, let us fill the possible intervels
            for (int j=0; j < maxLimit; j++) {
              clocks[i][j] = (j + 1) * intervel[i];
              //printf("\n%d * %d = %d", j + 1, intervel[i], clocks[i][j]);
            }
            //printf("\nEnd Of Table!!!");
        }
    //Check if there is a common value and if yes, then print it out..
    //for (int i=0; i < 4; i++) {
        //isCommonValue = false;
        for (int j=0; j < maxLimit; j++) {
            for (int k=0; k < maxLimit; k++) {
                //cout << "\nComparing: " << clocks[0][j] << ", " << clocks[1][k] << endl;
                if (clocks[0][j] == clocks[1][k]) {
                    for (int l=0; l < maxLimit; l++) {
                        if (clocks[0][j] == clocks[2][l]) {
                            for (int m=0; m < maxLimit; m++) {
                                if (clocks[0][j] == clocks[3][m]) {
                                    System.out.println("The Common Value Is:" + clocks[0][j]);
                                }
                            }
                            //cout << "\nThe Common Value Is:" << clocks[0][j];
                        }
                    }
                    //cout << "\nThe Common Value Is:" << clocks[0][j];
                }

            }
        }
    //}
    printf("\nHello There!!!");

}