import java.util.Scanner;

public class pemula {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukkan Alas Segitiga");
		int alas = sc.nextInt();
		System.out.println("Masukkan Tinggi Segitiga");
		int tinggi = sc.nextInt();
		
		int LuasSegitiga = alas*tinggi/2;
		
		System.out.println("Masukkan jari-jari lingkaran");
		int Jarijari = sc.nextInt();
		double LuasLingkaran = 3.14 * Jarijari;
		
		if(LuasSegitiga < LuasLingkaran) {
			System.out.println("Luas lingkaran lebih besar dari Luas Segitiga");
		}else {
			System.out.println("Luas Segitiga lebih besar dari Luas lingkaran");
		}
	}
}