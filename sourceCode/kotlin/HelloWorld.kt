/**************************************************************************************************************
 * Printing the triangle both straightup and in the reverse directions...
 * @version 1.0
 * @author Coindsys
 * @date Thu, 09Jan2020
 **************************************************************************************************************
 */

 fun main(args : Array<String>) {
    //println("Hello Kotlin!!!");
    val numOfLines = 5;
    var numOfStars = 1;

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
    readLine();
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
    readLine();
 }