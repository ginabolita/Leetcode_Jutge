import java.util.Scanner;
// Write a program that reads an integer number that represents a temperature given in degree Celsius, and that tells if the weather is hot, if it’s cold, or if it’s ok. Suppose that it’s hot if the temperature is higher than 30 degrees, that it’s cold if the temperature is lower than 10 degrees, and that it’s ok otherwise. Moreover, warn if with the given temperature water would boil, or if water would freeze. Assume that water boils at 100 or more degrees, and that water freezes at 0 or less degrees.
// Input
// Input consists of an integer number.
// Output
// Print a line telling if it’s hot, if it’s cold, or if it’s ok. Additionally, print another line if water would boild or if water would freeze.
class Main{
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int t = myObj.nextInt();

		if (t > 30) {
			System.out.println("it's hot");
			if (t >= 100) {
				System.out.println("water would boil");
			}
		}
		else if (t < 10) {
			System.out.println("it's cold");
			if (t <= 0) {
				System.out.println("water would freeze");
			}
		}
		else {
			System.out.println("it's ok");
		}
	}

}