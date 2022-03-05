import java.util.Scanner;

public class Challenge0114b
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = 0, casos = sc.nextInt();

		for(int i = 0; i < casos; i++)
		{
			num = sc.nextInt();
            switch(num)
            {
			    case 0:
                case 1:
                    System.out.println(1);
                    break;

			    case 2:
                    System.out.println(2);
                    break;

			    case 3:
				    System.out.println(6);
                    break;

			    case 4:
				    System.out.println(4);
                    break;

                default:
				    System.out.println(0);
                    break;
            }
		}
	}
}
