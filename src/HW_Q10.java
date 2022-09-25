import java.util.Random;
public class HW_Q10 {

	public static void main(String[] args) {
		int array[][] = new int[4][4];
		int rand[][] = new int[10][2];
		boolean check;
		Random r = new Random();
		
		for (int i = 0; i < rand.length; i++) {
			check = false;
			rand[i][0] = r.nextInt(4);
			rand[i][1] = r.nextInt(4);
			
			for (int j = 0; j < i; j++) {
				if (rand[i][0] == rand[j][0] && rand[i][1] == rand[j][1]) {
					check = true;
					break;
				}
			}
			if (check) {
				i--;
				continue;
			}
			array[rand[i][0]][rand[i][1]] = r.nextInt(10) + 1;
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++)
				System.out.print(array[i][j] + "\t");
			System.out.println();
		}
	}

}
