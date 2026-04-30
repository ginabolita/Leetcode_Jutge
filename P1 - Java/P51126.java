import java.util.Scanner;

/*
Write a program that, given two intervals, computes the interval corresponding to their intersection, or tells that it is empty.
Input
Input consists of four integer numbers a1, b1, a2, b2 that represent the intervals [a1,b1] and [a2,b2]. Assume a1≤b1 and a2≤b2.
Output
Print “[]” if their intersection is empty, or “[x,y]” if this is their non-empty intersection.
*/
class Main{
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);

		int a1 = myObj.nextInt();
		int b1 = myObj.nextInt();
		int a2 = myObj.nextInt();
		int b2 = myObj.nextInt();

		if (b1 < a2 | b2 < a1) {
			System.out.println("[]");
		}
		else {
			int[] intersection;
			if (a1 <= a2) {
				if (b1 <= b2) {
					System.out.println("[" + a2 + "," + b1 + "]");
				}
				else if (b1 > b2) {
					System.out.println("[" + a2 + "," + b2 + "]");
				}
			}
			else {
				if (b1 <= b2) {
					System.out.println("[" + a1 + "," + b1 + "]");
				}
				else {
					System.out.println("[" + a1 + "," + b2 + "]");
				}
			}
		}


	}
}