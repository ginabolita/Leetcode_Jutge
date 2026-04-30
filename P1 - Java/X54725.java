import java.util.Scanner;

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