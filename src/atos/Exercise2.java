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
		System.out.println("########## Exercice 2 ###########");
		try (Scanner scanner = new Scanner(System.in)) {
			double log = 1;
			System.out.println("Please enter a number : ");
			int userInput = scanner.nextInt();
			System.out.println("nbre log :");
			int logNumber = scanner.nextInt();
			double i = 1;
			while (i < logNumber) {
				if (i % 2 == 0) {
					log = log - (1 / i);
				} else {
					log = log + (1 / i);
				}
				i++;
			}
			System.out.println("le logarithme de " + userInput + " est : " + log);
		}

	}

}
