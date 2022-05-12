package homelessons;
import java.util.Scanner;
public class Carstart {
	public static int cons=1;
	public static void carstrat() {
		System.out.println("to start the car enter :1");
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		sc.close();
	}
}
