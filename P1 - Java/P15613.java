import java.util.Scanner;
// comment
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