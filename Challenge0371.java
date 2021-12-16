import java.util.Scanner;

public class Challenge0371 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entr = sc.nextInt();
		while(entr != 0) {
			int cerillas = 0;
			for(int i = 0;i <= entr;i++) {
				cerillas += 3 * i;
			}
			System.out.println(cerillas);
			entr = sc.nextInt();
		}
	}
}
