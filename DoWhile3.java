import java.util.Scanner;

public class DoWhile3 {
    public static void main(String[] args) {
		int i = 1;
		int angka;
		Scanner sc = new Scanner (System.in);
		System.out.println("Inputkan Angka");
		angka = sc.nextInt();
        
        do {
            System.out.println(" " + i);
            i++;
        } while (i <= angka);
    }
}
