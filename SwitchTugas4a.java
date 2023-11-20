import java.util.Scanner;
public class SwitchTugas4a {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input: ");
		String Input = sc.nextLine();
		
		switch (Input) {
			case "A":
				System.out.println("Indeks = 4.0");
				break;
		    case "B":
				System.out.println("Indeks = 3.0");
				break;
			case "C":
				System.out.println("Indeks = 2.0");
				break;
			case "D":
				System.out.println("Indeks = 1.0");
				break;
			case "E":
				System.out.println("Indeks = 0");
				break;
		}
		
	}
}