import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
		int angka;
		Scanner sc = new Scanner(System.in);
		System.out.println("Inputkan angka");
		angka = sc.nextInt();
        int i = 1;
        while (i <= angka) {
            System.out.println(" " + i);
            i++;
        }
    }
}
