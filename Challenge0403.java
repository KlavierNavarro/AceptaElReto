import java.util.Scanner;

public class Challenge0403
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int casos, superficie, campos, max_sup, min_sup;

        max_sup = 120 * 90;
        min_sup = 90 * 45;
        casos = sc.nextInt();

        for (int i = 0; i < casos; i++)
        {
            superficie = sc.nextInt();
            campos = sc.nextInt();

            if(superficie >= min_sup * campos && superficie <= max_sup * campos)
                System.out.println("SI");

            else
                System.out.println("NO");
        }
    }
}
