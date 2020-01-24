package com.exam.encapsulation;

import java.util.Scanner;

public class MultiCatchExceptionHandling {
	 public static void main(String args[]){
	
				try{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number");
				int num1 = sc.nextInt();
				System.out.println("Divided by");
				int num2 = sc.nextInt();
				
				int total= num1/num2;
				System.out.println(total);
				}
				catch (ArithmeticException e) {
					System.out.println("CAnt be divided by 0");
				}
				catch (Exception e){
					System.out.println("Exception occured");
				}
				finally {
					System.out.println("I am out of the try block");
				}
				
				


	}


}