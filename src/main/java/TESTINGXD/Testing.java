package TESTINGXD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String text = "we party all night night night";
		String[] textSplit = text.split(" ");
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(textSplit));
		String input;


		System.out.println("Whole sentence: " + text);
		for (int i = 0; i < arrayList.size(); i++) {
			// Highlight text here
			System.out.println("write1: " + arrayList.get(i));
			do {
				input = scanner.next();
				if (input.equals(arrayList.get(i))) {
					System.out.println("correct");
				} else {
					System.out.println("Wrong try again! Write: " + arrayList.get(i));
				}
			} while (!(input.equals(arrayList.get(i))));
		
		}
		System.out.println("Done!");
		
	}

}