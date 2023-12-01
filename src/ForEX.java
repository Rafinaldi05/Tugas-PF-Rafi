import java.util.Scanner;

public class ForEX {
    public static void main(String[] args) {
        String[] menu = {"Milo", "Kopi", "Teh", "Susu", "Jus"};
        
        System.out.println("Menu minuman:");
		Scanner sc = new Scanner(System.in);
		menu = sc.nextLine();
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Hari ke-" + (i + 1) + ": " + menu[i]);
        }
    }
}