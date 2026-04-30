import java.util.Scanner;

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