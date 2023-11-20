import java.util.Scanner;
public class Tugas3b {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input nilai: ");
		int nilai = sc.nextInt();
		System.out.println("Input nilai minimum: ");
		int nilaiMinimum = sc.nextInt();
		System.out.println("Input nilai maksimum: ");
		int nilaiMaksimum = sc.nextInt();
		System.out.println("Input Interval: ");
		int Interval = sc.nextInt();
		if (nilaiMaksimum - nilaiMinimum < Interval) {
			System.out.println("Interval tidak valid");
		} else {
			int jumlah = 0;
			for (int i = 1; i <= nilai; i++) {
				jumlah += nilaiMinimum;
				nilaiMinimum += Interval;
			}
			System.out.println("jumlah: "+jumlah);
		}
	}
}