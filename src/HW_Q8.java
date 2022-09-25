import java.util.Scanner;
import java.util.Random;
public class HW_Q8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("정수 몇 개?");
		int num = scanner.nextInt();
		int integer[] = new int[num];
		
		for (int i = 0; i < num; i++) {
			integer[i] = r.nextInt(100) + 1;
			
			for (int j = 0; j < i; j++) {
				if (integer[i] == integer[j]) {
					i--;
					break;
				}
			}
		}
		
		for (int i = 0; i < num; i++) {
			System.out.print(integer[i] + " ");
			if ((i + 1) % 10 == 0)
				System.out.println();
		}
		scanner.close();
	}
}
