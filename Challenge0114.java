import java.util.Scanner;

public class Challenge0114 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		int num = 0;
		int casos = sc.nextInt();
		for(int i = 0;i < casos;i++) {
			num = sc.nextInt();
			fact = 1;
			if(num == 0){
				fact = 1;
				System.out.println(fact);
			}
			else {
				while(num != 0) {
					fact = fact * num;
					num -= 1;
					}
				System.out.println(fact % 10);
				}
			}
		}
	}
