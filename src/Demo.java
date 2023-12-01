import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Inputkan angka: ");
		int N = sc.nextInt();
		int sum = 0;
		int num = 0;
		
		while (num <= N) {
			sum += num;
			num++;
		}
		System.out.println(sum);
    }
}