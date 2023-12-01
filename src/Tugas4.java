import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inputkan panjang: ");
        double a = sc.nextDouble();
        System.out.print("Inputkan lebar: ");
        double b = sc.nextDouble();

        double luas = (a * b);
        System.out.println("Luas: " + luas);
    }
}
