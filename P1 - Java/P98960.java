import java.util.Scanner;
// Write a program that reads a letter and prints it in lowercase if it was uppercase, or prints it in uppercase if it was lowercase.
// Input
// Input consists of a letter.
// Output
// Print a line with the given letter in lowercase if it was uppercase, or in uppercase if it was lowercase.
class Main{
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);

		char c = myObj.next().charAt(0);
		int ascii_c = (int)c;

		int min_a = (int)'a';
		int min_z = (int)'z';
		int may_A = (int)'A';
		int may_Z = (int)'Z';

		if (ascii_c >= 97 && ascii_c <= 122) {		//minuscula -> mayuscula
			int dif = ascii_c - 97;
			int c_may = 65 + dif;
			char nuevo_c = (char)c_may;
			System.out.println(nuevo_c);
		}
		else if (ascii_c >= 65 && ascii_c <= 90) {					//mayuscula -> minuscula
			int dif = ascii_c - 65;
			int c_may = 97 + dif;
			char nuevo_c = (char)c_may;
			System.out.println(nuevo_c);
		}
	}
}