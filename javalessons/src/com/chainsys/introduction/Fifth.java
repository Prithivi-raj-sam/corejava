package com.chainsys.introduction;

public class Fifth {

	public static void main(String[] args) {
		int x = 1;

		printeven();

	}

	public static void printNumbersOnetoHundred() {
		int count = 0;
		for (count = 0; count <= 100; count++) {
			System.out.println(count);
		}
	}

	public static void printNumbersTentoOne() {
		int count = 0;
		for (count = 10; count >= 1; count--) {
			System.out.println(count);
		}
	}

	public static void printTriangle() {
		int countA = 0;
		for (countA = 1; countA <= 10; countA++) {
			for (int countB = 1; countB <= countA; countB++) {
				System.out.print(countB + " ");
			}
			System.out.println();
		}
	}

	public static void printTriangleB() {
		int countA = 0;
		for (countA = 1; countA <= 10; countA++) {
			for (int countB = 5; countB > countA; countB--) {
				System.out.print(" ");
			}
			if (countA < 6) {
				for (int countC = countA; countC >= 1; countC--) {
					System.out.print(countC);
				}
				for (int countD = 2; countD < countA + 1; countD++) {
					System.out.print(countD);
				}
			} else {
				for (int countE = 1; countE <= countA - 5; countE++) {
					System.out.print(" ");
				}
				for (int countF = 10 - countA; countF >= 1; countF--) {
					System.out.print(countF);
				}
				for (int countG = 2; countG < 11 - countA; countG++) {
					System.out.print(countG);
				}
			}
			System.out.println();
		}
	}
	public static void printeven() {
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}

}
