import java.util.Scanner;

public class Tugas1IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Inputkan nilai huruf (A/B/C/D/E): ");
        char nilaiHuruf = sc.next().charAt(0);
        
        double nilaiIndeks;
        
        if (nilaiHuruf == 'A') {
            nilaiIndeks = 4.0;
        } else if (nilaiHuruf == 'B') {
            nilaiIndeks = 3.0;
        } else if (nilaiHuruf == 'C') {
            nilaiIndeks = 2.0;
        } else if (nilaiHuruf == 'D') {
            nilaiIndeks = 1.0;
        } else if (nilaiHuruf == 'E') {
            nilaiIndeks = 0.0;
        } else {
            System.out.println("Input tidak valid");
            return;
        }
        
        System.out.println("Nilai indeks dari " + nilaiHuruf + " adalah " + nilaiIndeks);
    }
}