/*
Inheritance in Java

Inheritance in Java is a mechanism in which one object acquires all the properties and
behaviors of a parent object. It is an important part of OOPs (Object Oriented programming system).

The idea behind inheritance in Java is that you can create new classes that are built upon
existing classes. When you inherit from an existing class, you can reuse methods and fields of
 the parent class. Moreover, you can add new methods and fields in your current class also.

Inheritance represents the IS-A relationship which is also known as a parent-child relationship.


The syntax of Java Inheritance

class Subclass-name extends Superclass-name
{
}
Types of inheritance in java
On the basis of class, there can be three types of inheritance in java: single, multilevel and hierarchical.
https://static.javatpoint.com/images/core/typesofinheritance.jpg

 */





package Inheritance;

public class IheritanceDemoRunner {
}
class Employee{
    int salary = 50000;
}
class programmer extends Employee{
    int bonus ;
    void display(){
     System.out.println("salary = "+" "+salary+"    " +"Bonus   = "+bonus ) ;
    }
}


