/*
 * https://www.aceptaelreto.com/problem/statement.php?id=416
 * 
 * El ejercicio ya subido y aceptado:
 * https://www.aceptaelreto.com/problem/submission.php?id=592011
 * 
 * Klavier Navarro
 */

import java.util.Scanner;
public class Challenge0416 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int personas = 1;
        do
        {
            personas = sc.nextInt();
            
            if (personas > 0)
            {
                boolean repetido = false;
                String[] fechas = new String[personas];

                for (int i = 0; i < personas; i++)
                {
                    fechas[i] = sc.next();
                    fechas[i] = fechas[i].substring(0, fechas[i].length()-4);
                }

                for (int i = 0; i < personas; i++)
                {
                    for (int j = i+1; j < personas; j++)
                    {
                        if (fechas[i].equals(fechas[j]))
                            repetido = true;
                    }
                }

                if(repetido)
                    System.out.println("SI");

                else
                    System.out.println("NO");
            }
        }
        while(personas != 0);
    }
}