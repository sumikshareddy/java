package javaprogram;

class Animal // parent class
{
}  
class Dog1 extends Animal // child class
{
//Dog inherits Animal  
}  
public class Iinstanceofoperator {
                 
    public static void main(String args[]){  
 Dog1 d=new Dog1();  // child class object is actually coming from instance of parent
 System.out.println(d instanceof Animal);  
 }  
    
}
