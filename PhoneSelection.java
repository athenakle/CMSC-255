/*
*Phone Selections
*
*Athena Le
*2/8/23
*CMSC255, 901
*/

import java.util.Scanner;

public class PhoneSelection {
	public static void main(String[] args){

		Scanner Input = new Scanner(System.in);
		System.out.println("Enter a single letter, and I will tell you what the corresponding digit is on the telephone");

		char alphabet = Input.next().charAt(0);
		alphabet = Character.toUpperCase(alphabet);
		int num = 0;

		
		switch(alphabet) {
			case 'A':
			case 'B':
			case 'C':	
				 num = 2;
				System.out.println("The digit " + num + " corresponds to the alphabet " + alphabet + " on the telephone.");
				break;

			case 'D':
			case 'E':
			case 'F':
				num = 3;
				System.out.println("The digit " + num + " corresponds to the alphabet " + alphabet + " on the telephone.");
				break;

			case 'G':
			case 'H':
			case 'I':
				num = 4;
				System.out.println("The digit " + num + " corresponds to the alphabet " + alphabet + " on the telephone.");
				break;

			case 'J':
			case 'K':
			case 'L':
				num = 5;
				System.out.println("The digit " + num + " corresponds to the alphabet " + alphabet + " on the telephone.");
				break;

			case 'M':
			case 'N':
			case 'O':
				num = 6;
				System.out.println("The digit " + num + " corresponds to the alphabet " + alphabet + " on the telephone.");
				break;

			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				num = 7;
				System.out.println("The digit " + num + " corresponds to the alphabet " + alphabet + " on the telephone.");
				break;

			case 'T':
			case 'U':
			case 'V':
				num = 8;
				System.out.println("The digit " + num + " corresponds to the alphabet " + alphabet + " on the telephone.");
				break;

			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				anumber = 9;
				System.out.println("The digit " + num + " corresponds to the alphabet " + alphabet + " on the telephone.");
				break;

			default: System.out.println("Error: invalid");
				

		}

	}
}