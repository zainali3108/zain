package Javatest2;

public class NumberTooLargeException extends Exception{
	public NumberTooLargeException (){
		super ("Number is bigger than 10000");
	}

}
