##########################################################################################################################################
#   Basically to understand the Class, Inheritance
#   
# @lessons learned: 
#       Python does NOT support method overloading... aka CompileTime Polymorphism...
#       https://www.geeksforgeeks.org/python-method-overloading/
#
# @date Sun, 12Jan2020 @ 01:15 AM IST
# @version 1.0
# @author VMP Consulting
#
##########################################################################################################################################
class Shapes():
    myGreetings = "Hi, Welcome To Coindsyz!!!"
    def describeSelf(self):
        print("\nHi, This is the class Shapes, and I would be the PARENT class for my subclasses, "  +
              "viz., Triangle, ReversedTriangle, Square, Rectangle, Forward and Backward slashes...")
    

    #Note:  A Private method in python gets defined by preceding doubleunderscore to the method name...for instance, __myMethod(self)
    def __describeSelfPrivate(self, pGreetings):
        print ("\n\nHi, I'm an overloaded method (note:  OVERLOADING (of methods) always happens WITHIN THE SAME CLASS) and " +
               "the greeting message I've received is : " +  pGreetings + " and I happen to have a PRIVATE access, which means" +
               "I'm not accessible beyond this boundaries of this class, either by it's child classes or other classes outside of this one...")
    
    def callAllMethodsOfTheClass(self):
        describeSelf()
        __describeSelfPrivate(myGreetings)

#   The overloaded version of the method describeSelf() are commented out, since, we understood now that, Python does not support method overloading...
#    def describeSelf(self, pGreetings, pName):
#        print ("\nHi, I'm one more version of overloaded method but, the difference here is, my access is PROTECTED, which means, I'm available to " +
#                    "all of the child classes, which are getting inherited from me, the parent class, called Shapes...\n" +
#                    "do note that, just because I'm having one more extra parameter from my sibling method, this overloading becomes possible..." +
#                    "Otherwise, If I happen to have a same set of parameters as my sibiling method, you would get an compilation error..." +
#                    "so, do note that, only when the signature of the method happen to be different, the OVERLOADING becomes a possibility..." +
#                    "methods, with same signature, can never be called/make overloading possible...")
                    
class Triangle(Shapes):
    def describeSelf(self):
        print("\nHi, This is the Triangle class, which is the CHILD class of my PARENT class called SHAPES..." +
              "and by RETAINING THE SAME METHOD SIGNATURE as that of my PARENT class, I would be OVERRIDING the implementation of this " +
              "method, which has my own (child) version of the implementation, which is different from the implementation of my PARENT class... ")
              
class Square (Shapes):
    def printYourShape():
        print ("\nHi, I'm A Square!!!")
                    

myGreetings = "Hi, Welcome To Coindsyz!!!"
myName = "M. Nachimuthu"
print ("OOPS Training Version Three");
myShapes = Shapes()
myShapes.describeSelf()
myShapes.callAllMethodsOfTheClass()

myTriangle = Triangle();
myTriangle.describeSelf()

mySquare = Square();
mySquare.describeSelf();
#input();

