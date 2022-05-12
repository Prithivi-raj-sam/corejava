package com.chainsys.test;

import java.util.Scanner;

public class Firsttest {
	public static void fizzbuzz() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzbuzz");
			} else if (i % 3 == 0) {
				System.out.println("fizz");
			} else if (i % 5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}

		}
	}

	public static void evendigit() {
		int givenNumber = 1546903;
		while (givenNumber > 0) {
			int singleDigit = givenNumber % 10;
			if (singleDigit % 2 == 0) {
				System.out.println(singleDigit);
			}
			givenNumber /= 10;
		}
	}

	public static void amstrong() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int givenNumber = sc.nextInt();
		sc.close();
		int temp = givenNumber;
		int sum = 0;
		while (givenNumber > 0) {
			int singleDigit = givenNumber % 10;
			sum += (singleDigit * singleDigit * singleDigit);

			givenNumber /= 10;
		}
		if (sum == temp) {
			System.out.println("Same as input number");
		} else {
			System.out.println("different number");
		}

	}

	public static void countWords() {
		String givenString = "tom and jerry are good friends";
		String trimmedString = givenString.trim();
		String[] words = trimmedString.split(" ");
		int count = words.length;
		System.out.println("Number of Words :" + count);
	}

	public static void reverse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String:");
		String sentence = sc.nextLine();
		sc.close();
		char[] Char = sentence.toCharArray();
		int length = Char.length;
		for (int index = length - 1; index >= 0; index--) {
			System.out.print(Char[index]);
		}

	}

	public static void conversation() {
		System.out.println("is it rains please enter 1");
		System.out.println("if your whether temperature is below 30 degree please enter 2");
		System.out.println("if your whether is between 30-50 please enter 3");
		System.out.println("else press any other key");
		Scanner sc = new Scanner(System.in);
		int confirm = sc.nextInt();
		if (confirm == 1) {
			System.out.println("get an umbrella");
		} else if (confirm == 2) {
			System.out.println("bring heavy jacket");
		} else if (confirm == 3) {
			System.out.println("bring light jacket");
		} else {
			System.out.println("No jacket at all");
		}

		sc.close();
	}

	public static void equation() {
		int total;
		for (int x = 5; x <= 10; x++) {
			total = 2 * (x * x) + x + 5;
			System.out.println("value into equation is:" + x + "\nAfter applying value answer is:" + total);

		}
	}

	public static void checkAlphabet() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String givenName = sc.nextLine();
		sc.close();
		int length = givenName.length();
		if (length < 8) {
			System.out.println("name must have 8 or above 8 character");
		} else {
			String charnameUpper = givenName.toUpperCase();
			charnameUpper = charnameUpper.trim();
			char[] uppercasecharArray = charnameUpper.toCharArray();
			int asciivalue = 0;
			int errorfind = 0;
			for (int index = 0; index < length; index++) {
				asciivalue = (int) uppercasecharArray[index];
				if (asciivalue < 65 || asciivalue > 90) {
					if (asciivalue != 32) {
						System.out.println("IN valid character in Name");
						errorfind++;
						break;
					}
				}
			}
			if (errorfind == 0) {
				System.out.println("name is fully alphabet :" + givenName);
			}
		}
	}

	public static void numberPramid() {
		for (int countA = 1; countA < 10; countA++) {
			for (int countB =9; countB > countA; countB--) {
				System.out.print(" ");
			}
			for (int countC = countA; countC >= 1; countC--) {
				System.out.print(countC);
			}
			for (int countD = 2; countD < countA + 1; countD++) {
				System.out.print(countD);
			}
			System.out.println("");
		}
	}
}
