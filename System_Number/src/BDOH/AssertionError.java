package BDOH;

import java.util.Scanner;

public class AssertionError {
	
	public static void main(String[] args) {
		int a = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number less than 100 : ");
		a = s.nextInt();
		assert (a>100):"U crossed the rule ...";
		System.out.println("Welcome After assert");
	}

}
