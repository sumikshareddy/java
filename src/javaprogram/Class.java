package javaprogram;

public class Class {
	
	static int total=10;
	public static void main(String args[]) {
	new Class();
	}
	public Class() {
	System.out.println("in Test");
	System.out.println(this);
	int Temp=this.total;
	if(Temp>5) {
	System.out.println(Temp);
	}
	}
	}


