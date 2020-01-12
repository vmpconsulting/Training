##########################################################################################################
# A Simple program, to display the triangle both in straightup and upsidedown way, as a way of teaching the
# freshers about the power of Python code...
# @version 1.0
# @author Coindsyz, SaibabaColonly, Coimbatore
# @date Thu, 09Jan2020
##########################################################################################################
numOfLines = 5;
numOfStars = 1;
for i in range(numOfLines):
    for k in range (numOfLines - i):
        print (" ", end = " ")
    for j in range(numOfStars):
        print ("*", end = " ")
    numOfStars += 2
    print()
input()
numOfStars-=2;
for i in range(numOfLines):
    print(" ", end=" ");
    for k in range (i):
        print(" ", end = " ");
    for j in range(numOfStars):
        print ("*", end = " ");
    numOfStars -=2;
    print();
input();