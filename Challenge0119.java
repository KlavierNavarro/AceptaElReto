import java.util.Scanner;

public class Challenge0119
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long legionarios, legionariosRestantes, escudos;
        int lado;

        do
        {
            legionarios = sc.nextLong();
            if(legionarios != 0)
            {
                legionariosRestantes = legionarios;
                escudos = 0;
                while(legionariosRestantes > 0)
                {
                    lado = (int)Math.sqrt(legionariosRestantes);
                    escudos += lado * lado + lado * 4;
                    legionariosRestantes -= lado * lado;
                }

                System.out.println(escudos);
            }
        }
        while(legionarios != 0);
    }
}