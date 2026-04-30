import java.util.Scanner;

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