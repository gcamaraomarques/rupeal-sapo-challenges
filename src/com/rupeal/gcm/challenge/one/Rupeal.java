package com.rupeal.gcm.challenge.one;

import java.util.Scanner;

/**
 * Find the Fibonacci equivalent.
 * @author gcamaraomarques
 * @see <a href="http://emprego.sapo.pt/emprego/anuncio/3223056/java-challenge-1.htm">Java Challenge 1</a>
 * 
 */
public class Rupeal {


	private long fx(int n) {
		if (n == 0) {
			return 0;
		}
		if(n==1){
			return 1;
		}

		return fx(n-1)+fx(n-2);
	}

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Input a number: ");

		int n = keyboard.nextInt();

		Rupeal r = new Rupeal();

		System.out.print("F("+n+") " + r.fx(n) + " ");

		keyboard.close();

		System.out.println();

		System.out.println("Please send the solution, sequence name and your cv to jobsatrupeal.com");

	}
}