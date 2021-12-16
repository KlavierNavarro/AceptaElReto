import java.util.Scanner;

public class Challenge0117
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long casos = sc.nextLong();
        sc.nextLine();
        String nombre;

        for(int i = 0; i < casos; i++)
        {
            nombre = sc.nextLine();
            System.out.println(nombre.replace("Soy", "Hola,") + ".");
        }
    }
}
