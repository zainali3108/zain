package Javatest2;

import java.util.Scanner;

public class ExceptionExample {
public ExceptionExample(String string) {
		// TODO Auto-generated constructor stub
	
}
public static void main(String[] args){
	Scanner sc= new Scanner (System.in);
	try {
		int number = sc.nextInt();
		if  (number<=10000)
			throw new NumberTooSmallException();
		if (number>10000)
			throw new NumberTooLargeException();
		if (number==0)
			throw new ZeroNumberException();
		
		System.out.println("Allocated Memory");
	}
catch (Exception ex){
		System.err.println(ex.getMessage());
	}


}
}
