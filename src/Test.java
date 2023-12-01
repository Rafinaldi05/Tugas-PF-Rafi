import java.util.Scanner;
public class IP {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (input >= 0 && input <= 20) {
			System.out.println("Indeks = 0");
			System.out.println("Huruf = E");
		} else if (input > 20 && input < 40) {
			System.out.println("Indeks = 1");
			System.out.println("Huruf = D");
		}
	}
}
