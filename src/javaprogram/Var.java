package javaprogram;

public class Var {
	public static void display(String...values)//...*
	{
	System.out.println("Display method invoked for first time");
	for(String s:values)
	{
	System.out.println(s);
	}
	}
	public static void main(String [] a)
	{
	//display( new String[] {"this", "is", " a", " demo"}); //*
	display();// without any arguments
	display("Hello Students");
	display("this"," is"," a"," varargs"," example");
	}
	}


