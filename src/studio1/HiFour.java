package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What is your name?");
		String name0 = in.nextLine();
		System.out.print("What is your name?");
		String name1 = in.nextLine();
		System.out.print("What is your name?");
		String name2 = in.nextLine();
		System.out.print("What is your name?");
		String name3 = in.nextLine();
	System.out.println	("Hi " + name0 + "," + name1 + "," + name2 + ", and" + name3);

	}
}
