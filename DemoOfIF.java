//Program to determine the highest of three numbers.
package ACD_JavaB_Session2_Assignment1;

import java.util.Scanner;

public class DemoOfIF {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Input the three numbers:");

		int First = input.nextInt();

		int Second = input.nextInt();

		int Third= input.nextInt();

		int Large = 0;

		if (First >Second)

		{ 
			Large =First;
		}
		else { 
			Large =Second;
		}
		if (Large < Third){

			Large=Third;

		}

		System.out.println("Highest of three numbers is " + Large);


	}

}
