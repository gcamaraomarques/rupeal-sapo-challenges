package com.rupeal.gcm.challenge.two;

import java.util.Scanner;

/**
 * Factorial Calculator
 * @author gcamaraomarques
 * @see <a href="http://emprego.sapo.pt/emprego/anuncio/3223151/java-challenge-2.htm">Java Challenge 1</a>
 *
 */
public class Rupeal2 {
	private int count;

	private long fx(int n) throws IllegalArgumentException {
		if (n < 0) {
			throw new IllegalArgumentException("Negative Numbers aren't allowed!");
		}
		if (n == 0) {
			return 1;
		}
		count++;
		return n*fx(--n);
	}

	public static void main(String[] args) {
		try {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Input a number: ");
			int n = keyboard.nextInt();
			Rupeal2 r = new Rupeal2();
			System.out.print("Value: " + r.fx(n) + " ");
			keyboard.close();
			System.out.println();
			System.out.println("Iterations: " + r.getCount());
			System.out.println("Please send the solution, sequence name and your cv to jobs@rupeal.com");
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}