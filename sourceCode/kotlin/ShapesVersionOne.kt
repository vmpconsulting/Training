/**************************************************************************************************************
 * Printing the triangle both straightup and in the reverse directions...
 * @version 1.0
 * @author Coindsys
 * @date Thu, 09Jan2020
 **************************************************************************************************************
 */

 class Shapes {
 
    val numOfLines = 5;
    var numOfStars = 1;
    var margin = 10;
    //no constructor here as well, to keep things simple...
    
    /** Function to display a triangle...
     */
    fun displayTriangle() {

        for (i in 1..numOfLines) {
            for (k in 1..(numOfLines - i)) {
                print(" ");
            }
            for (j in 1..numOfStars) {
                print("*");
            }
            numOfStars += 2;
            println();
        }
    }
    
    fun displayInvertedTriangle() {
        numOfStars -= 2;
        for (i in 1..numOfLines) {
            for (k in 1..i) {
                print(" ");
            }
            for (j in 1..numOfStars) {
                print("*");
            }
            numOfStars -= 2;
            println();
        }
    }
 }

 fun main(args : Array<String>) {
    println("Hello Kotlin!!!");

    val myShapes = Shapes();
    myShapes.displayTriangle();
    myShapes.displayInvertedTriangle();
    readLine();

 }
 
