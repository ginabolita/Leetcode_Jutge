import java.util.Scanner;

/*
Write a program that reads two words and tells their lexicographic order.
Input
Input consists of two words a and b, made up of only lowercase letters.
Output
Print a line telling if a<b, a>b or a=b, following the format of the examples exactly.
Observation
If you use a modern programming language, this exercise should be trivial.
*/
class Main{
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);

		String a = myObj.next();
		String b = myObj.next();

		int compare = a.compareTo(b);
		if (compare == 0) {
			System.out.println(a + " = " + b);
		}
		else if (compare < 0) {
			System.out.println(a + " < " + b);
		}
		else {
			System.out.println(a + " > " + b);
		}
	}
}