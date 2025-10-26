Singleton Design Pattern – Employee Example

**Project Overview**
---------------------
--> This project demonstrates the Singleton Design Pattern using the Emp class.
--> The Singleton pattern ensures that only one instance of a class is created and provides a global point of access to that instance.

In this example, multiple calls to Emp.getTest() always return the same Employee object.

Emp Class
---------
--> Private constructor to prevent creating multiple objects.
--> Static variable (obj) holds the single instance.
--> Static method (getTest()) returns the single instance.

EmpDriver Class
---------------
--> Demonstrates that multiple calls to getTest() return the same object:

How to Run
-----------
--> Compile the classes: javac Emp.java EmpDriver.java
--> Run the program: java EmpDriver
