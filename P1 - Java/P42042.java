import java.util.Scanner;

/*
Write a program that reads a letter, and that tells if it is an uppercase letter or a lowercase letter, and that also tells if it is a vowel or a consonant. Here, assume that the vowels are ‘a’, ‘e’, ‘i’, ‘o’ and ‘u’, and their corresponding uppercase letters.
Input
Input consists of a letter.
Output
Tell if the letter is uppercase or lowercase, and also tell if it is a vowel or a consonant. Follow the format of the examples.
*/

class Main{
	private static char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

	private static boolean isVowel(char c) {
		for(char v: vowels) {
			if (v == c) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);

		char c = myObj.next().charAt(0);

		if (c >= 97 && c <= 122) {
			System.out.println("lowercase");
		}
		else if (c >= 65 && c <= 90) {
			System.out.println("uppercase");
		}

		if (isVowel(c)) {
			System.out.println("vowel");
		}
		else {
			System.out.println("consonant");
		}
	}
}