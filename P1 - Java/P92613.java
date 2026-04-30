import java.util.Scanner;
// Write a program that reads a real number x≥0 and prints ⌊x⌋ (the floor of x), ⌈x⌉ (the ceiling of x), and the rounding of x.
// Input
// Input consists of a real number x≥0.
// Output
// Print the floor of x, the ceiling of x, and the integer number closer to x (⌈x⌉ if there is a tie).
class Main{
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		double x = myObj.nextDouble();
		
		int floor = (int)x;
		System.out.print(floor + " ");
		if (floor == x) {
			System.out.print(floor + " ");
		}
		else {
			System.out.print(floor + 1 + " ");
		}
		double dif = x - floor;
		if (dif < 0.5) {
			System.out.println(floor);
		}
		else {
			System.out.println(floor+1);
		}
	}
}