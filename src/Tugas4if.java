import java.util.Scanner;
public class Tugas4if {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input(A,B,C,D,E): ");
		char Input = sc.next().charAt(0);
		
		if (Input == "A") {
			System.out.println("Indeks = 4.0");
		} else if (Input == "B") {
			System.out.println("Indeks = 3.0");
		} else if (Input == "C") {
			System.out.println("Indeks = 2.0");
		} else if (Input == "D") {
			System.out.println("Indeks = 1.0");
		} else if (Input == "E") {
			System.out.println("Indeks = 0");
		} else {
			System.out.println("Input tidak valid");
		}
	}
}