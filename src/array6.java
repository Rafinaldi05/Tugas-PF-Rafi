import java.util.Scanner;

public class array6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input size array : ");
		int a = 0;
		a = sc.nextInt();
		int[] arr = new int[a];
		
		for (int i = 0; i < a; i++) {
			System.out.println("Input array : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Hasil");
		for (int i : arr) {
			System.out.println(i);
		}
		
	}
}