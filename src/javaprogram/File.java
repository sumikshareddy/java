package javaprogram;

public class File {
	
	
	public void add(int a) {
	loop:for(int i=1;i<3;i++) {
	for(int j=1;j<3;j++){
	if(a==5){
	break loop;
	}
	System.out.println(i*j);
	}
	}
	}
	  
	  public static void main(String [] args)
	  {
	    File t;
	    t= new File();
	    t.add(5);
	  }
	  
	}