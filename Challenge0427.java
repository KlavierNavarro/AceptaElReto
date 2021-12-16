import java.util.Scanner;

public class Challenge0427
{
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		long casos = sc.nextLong();
		sc.nextLine();
		String personaje, parentesco;
		
		for(int i = 0; i < casos; i++)
		{
			personaje = sc.nextLine();
			parentesco = sc.nextLine();

			if(personaje.equals("Luke") && parentesco.equals("padre"))
			    System.out.println("TOP SECRET");

			else
				System.out.println(personaje + ", yo soy tu " + parentesco);
		}
	}
}
