package atos;

//Exercise 2: Natural Logarithm
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Compute the natural logarithm of 2, by adding up to n terms in the series
* 1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
* where n is a positive integer and input by user.
* date: 02/02/2023
*/
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			//Declaration part
			double log = 1;
			int userEntry;
			double i = 1;
			System.out.println("Enter your number  :");
			userEntry = scanner.nextInt();
			
			while (i < userEntry) {
				if (i % 2 == 0) {
					log = log - (1 / i);
				} else {
					log = log + (1 / i);
				}
				i++;
			}
			System.out.println("The natural logarithm of 2 " + userEntry + " is : " + log);
		}

	}

}
