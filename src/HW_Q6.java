import java.util.Scanner;
public class HW_Q6 {

	public static void main(String[] args) {
		int unit[] = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		Scanner scanner = new Scanner(System.in);
		int calc, money;
		
		System.out.print("금액을 입력하시오>>");
		money = scanner.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			calc = money / unit[i];
			if (calc == 0)
				continue;
			System.out.println(unit[i] + "원 짜리 : " + calc + "개");
			money %= unit[i];
		}
		scanner.close();
	}

}
