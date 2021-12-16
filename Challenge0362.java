import java.util.Scanner;

public class Challenge0362
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int casos, dia, mes;
		casos = sc.nextInt();
		for(int i = 1; i <= casos; i++)
		{
			dia = sc.nextInt();
			mes = sc.nextInt();			
			if(dia == 25 && mes == 12)
				System.out.println("SI");
			else
				System.out.println("NO");
		}
	}
}
