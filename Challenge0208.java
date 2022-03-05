import java.util.Scanner;

public class Challenge0208
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long f, b, totalBolos = 0, bolosDerribados;

        do
        {
            f = sc.nextLong();
            b = sc.nextLong();

            if(f > 0)
            {
                totalBolos = f * (f+1) / 2;
                bolosDerribados = (f - b + 1) * (f - b + 2) / 2;
                System.out.println(totalBolos -  bolosDerribados);
            }
        }
        while(f > 0);
    }
}
