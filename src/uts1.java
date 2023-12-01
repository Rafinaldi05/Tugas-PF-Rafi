import java.util.Scanner;

public class uts1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inputkan A: ");
		int A = sc.nextInt();
		System.out.println("Inputkan B: ");
		int B = sc.nextInt();
		System.out.println("Inputkan C: ");
		int C = sc.nextInt();
		System.out.println("Inputkan D: ");
		int D = sc.nextInt();
		
		int x = A+B+C+D;
		
		System.out.println("Ratarata: "+x/4);

	}
}