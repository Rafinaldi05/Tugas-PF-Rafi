import java.util.Scanner;

public class uts2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] data = {'a', 'b', 'c', 'd', 'e', 'f',};
		
		System.out.print("Inputkan data ke-0: ");
		int a = sc.nextInt();
		System.out.print("Inputkan data ke-1: ");
		int b = sc.nextInt();
		System.out.print("Inputkan data ke-2: ");
		int c = sc.nextInt();
		System.out.print("Inputkan data ke-3: ");
		int d = sc.nextInt();
		System.out.print("Inputkan data ke-4: ");
		int e = sc.nextInt();
		System.out.print("Inputkan data ke-5: ");
		int f = sc.nextInt();
		
		System.out.println("Menampilkan Data");
		System.out.println("data ke-0: "+a+" - " + (a % 2 == 0 ? "Genap" : "Ganjil"));
		System.out.println("data ke-1: "+b+" - " + (b % 2 == 0 ? "Genap" : "Ganjil"));
		System.out.println("data ke-2: "+c+" - " + (c % 2 == 0 ? "Genap" : "Ganjil"));
		System.out.println("data ke-3: "+d+" - " + (d % 2 == 0 ? "Genap" : "Ganjil"));
		System.out.println("data ke-4: "+e+" - " + (e % 2 == 0 ? "Genap" : "Ganjil"));
		System.out.println("data ke-5: "+f+" - " + (f % 2 == 0 ? "Genap" : "Ganjil"));
			
			
		int x = a+b+c+d+e+f;
		double Ratarata = x/data.length;
		System.out.println("Total penjumlahan: "+x);
		System.out.println("Ratarata: "+Ratarata);
		
	}
}