import java.util.Scanner;
public class HW_Q4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		char s = scanner.next().charAt(0);
		char tmp = s;
		
		for (int i = 0; i <= tmp - 'a'; i++, s--) {
			for (int j = 0; j <= s - 'a'; j++)
				System.out.print((char)('a' + j));
			System.out.println();
		}
		
		scanner.close();
	}
}
