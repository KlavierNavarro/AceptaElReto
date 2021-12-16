import java.util.Scanner;

public class Challenge0114
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = 0, casos = sc.nextInt();

		for(int i = 0; i < casos; i++)
		{
			num = sc.nextInt();
			if(num == 0 || num == 1)
				System.out.println(1);
			else if(num == 2)
				System.out.println(2);
			else if(num == 3)
				System.out.println(6);
			else if(num == 4)
				System.out.println(4);
			else
				System.out.println(0);
		}
	}
}
