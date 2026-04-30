import java.util.Scanner;

// Write a program that reads three numbers and prints their maximum. 
// Input:
// Input consists of three integer numbers.
// Output:
// Print a line with the maximum of the three numbers.

class Main {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int x = myObj.nextInt();
		int y = myObj.nextInt();
		int z = myObj.nextInt();

		if (x >= y) {
			if (x >= z) {
				System.out.println(x);
			}
			else {
				System.out.println(z);
			}
		}
		else {
			if (y >= z) {
				System.out.println(y);
			}
			else {
				System.out.println(z);
			}
		}
	}
}