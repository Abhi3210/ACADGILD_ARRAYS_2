import java.util.*;
import java.io.*;
class NegetiveAgeException extends Exception {
	String str1;

	NegetiveAgeException(String str2) {
		str1 = str2;
	}

	public String toString() {
		return ("NegetiveAgeException Occurred: " + str1);
	}
}

public class Assignment2{  
   static void validate(int age){  
	   try{
     if(age<0)  
      throw new NegetiveAgeException("Not valid age");  
     else  
      System.out.println("Valid Age");
	   }
	   catch(NegetiveAgeException e){
		   System.out.println(e);
	   }
   }  
   public static void main(String args[]){ 
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter value for age");
      validate(sc.nextInt());  
      
  }  
}  