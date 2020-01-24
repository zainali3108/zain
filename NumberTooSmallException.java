package Javatest2;

public class NumberTooSmallException extends Exception {
	public NumberTooSmallException () {
		super ("Number is less than 1000");
	}

}
