package atos;

//Exercise 3 : Count Numbers
/*
* @author: N'goran Kouadio Jean Cyrille
* @description:Write a program to enter the numbers till the user wants 
* and at the end it should display the count of positive, negative and zeros entered.
* date: 02/02/2023
*/
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		System.out.println(
				"vous allez entrer un suite de nombre selon votre choix, si vous en avez marre appuyer sur entrer");
		try (Scanner scanner = new Scanner(System.in)) {
			int userNbre = scanner.nextInt();
			int nbrePos = 0;
			int nbreNeg = 0;
			int nbreZero = 0;

			while (String.valueOf(userNbre).length() != 0) {
				if (userNbre > 0) {
					nbrePos++;
				} else if (userNbre < 0) {
					nbreNeg++;
				} else {
					nbreZero++;
				}
				System.out.println("saisissez un nombre : ");
				userNbre = scanner.nextInt();
			}
			System.out.println("le nombre de nombre positive est : " + nbrePos + "le nombre de nombre négative est : "
					+ nbreNeg + "le nombre de zero rentré est : " + nbreZero);
		}

	}

}
