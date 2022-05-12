package com.chainsys.entrypoint;


public class Random {

	public static void bating() {
		int total = 0;
		while (true) {
			
			int randomVariable = (int) ((Math.random() * 10));
			total = total + randomVariable;
			System.out.println("currentScore=" + randomVariable);
			System.out.println("total=" + total);
			System.out.flush();
			System.out.print("enter the openent number:");
			java.util.Scanner sc = new java.util.Scanner(System.in);
			int openent = sc.nextInt();
			if (openent == randomVariable) {
				total=total-randomVariable;
				System.out.println("total="+total);
				sc.close();
				break;
			}

		}

	}
	public static void bowling() {
		int randomVariable = (int) ((Math.random() * 10));
		System.out.println("boeled Score:" + randomVariable);
		
	}
}
