package lab3;

import java.util.Scanner;

public class lab3 {
	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	
	System.out.println("What is your name?");
	String userName = scnr.next();
	
	System.out.println("Hi " + userName + ", enter an integer between 1 and 100:");
	int userInteger = scnr.nextInt();
	
	if (userInteger % 2 != 0 && userInteger < 60) 
		System.out.println(userInteger + " is odd");
	else if (userInteger >=2 && userInteger < 25)
		System.out.println("Even and less than 25");
	else if (userInteger <= 60 && userInteger % 2 == 0)
		System.out.println(userInteger + " is even");
	else if (userInteger > 60 && userInteger % 2 != 0 && userInteger <= 100)
		System.out.println(userInteger + " is odd and over 60");
	else System.out.println("Integer is invalid. Please enter an integer between 1 and 100");
	
	
	}

}



