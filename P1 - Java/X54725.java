import java.util.Scanner;
// Write a program that reads two numbers and prints their minimum.
// Input:
// Input consists of two integer numbers.
// Output:
// Print a line with the minimum of the two numbers.
class Main {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int x = myObj.nextInt();
		int y = myObj.nextInt();

		if (x <= y) {
			System.out.println(x);
		}
		else {
			System.out.println(y);
		}
	}
}