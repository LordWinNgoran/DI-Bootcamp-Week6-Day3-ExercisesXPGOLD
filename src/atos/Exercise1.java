package atos;
//Exercise 1: Fibonacci Series
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Write a program to print Fibonacci series of n terms where n is input by user :
* 0 1 1 2 3 5 8 13 24 .....
* date: 02/02/2023
*/
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		System.out.println("########## Exercice 1 ######### ");

		System.out.println("Please enter a number : ");
		try (Scanner scanner = new Scanner(System.in)) {
			int userInput = scanner.nextInt();

			int nbre1 = 0;
			int nbre2 = 1;
			int fib;
			System.out.println(nbre1);
			System.out.println(nbre2);
			for (int i = 1; i < userInput; i++) {
				fib = nbre1 + nbre2;
				nbre1 = nbre2;
				nbre2 = i;
				System.out.println(fib);

			}
		}

	}
}
