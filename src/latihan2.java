import java.util.Scanner;

public class latihan2 {
	public static void main(String[] args) {
		
		 long gaji;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Masukkan nama kalian: ");
		 String nama = sc.nextLine();
		 System.out.println("Masukkan jabatan kalian: ");
		 String jabatan = sc.nextLine();
		 System.out.println("Masukkan jamkerja kalian: ");
		 int jamkerja = sc.nextInt();
		 
		 switch(jabatan){
			 case "Direktur":
			 System.out.print(nama+" Gaji = Rp"+jamkerja*50000);
			 case "Pegawai":
			 System.out.print(nama+" Gaji = Rp"+jamkerja*35000);
			 
			 default :
			 System.out.print(nama+" Gaji = Rp"+jamkerja*0);


		 }
	}
}