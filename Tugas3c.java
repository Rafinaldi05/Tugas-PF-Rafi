import java.util.Scanner;

public class Tugas3c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inputkan panjang sisi atas: ");
        double a = sc.nextDouble();
        System.out.print("Inputkan panjang sisi bawah: ");
        double b = sc.nextDouble();
        System.out.print("Inputkan tinggi trapesium: ");
        double h = sc.nextDouble();

        double luas = 0.5 * (a + b) * h;
        System.out.println("Luas trapesium: " + luas);
    }
}
