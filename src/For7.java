import java.util.Scanner;

public class For7 {
    public static void main(String[] args) {
        int[] BeratBadan = {40, 45, 50, 55, 60,};
        
        Scanner sc = new Scanner (System.in);
		System.out.println("Ukuran:");
		int Ukuran = sc.nextInt();
        for (int i = Ukuran; i < BeratBadan.length; i++) {
			
            System.out.println("Ukuran ke-" + (i + 1) + ": " + BeratBadan[i]);
        }
    }
}