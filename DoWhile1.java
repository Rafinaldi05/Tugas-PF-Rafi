public class DoWhile1 {
    public static void main(String[] args) {
        String[] menu = {"Milo", "Kopi", "Teh", "Susu", "Jus"};
        
        System.out.println("Jadwal minum:");
        int i = 0;
        do {
            System.out.println("Hari ke-" + (i + 1) + ": " + menu[i]);
            i++;
        } while (i < menu.length);
    }
}