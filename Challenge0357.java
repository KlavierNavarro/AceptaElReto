import java.util.Scanner;

public class Challenge0357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext())
        {
            int N = sc.nextInt();
            int viajes = CalcularViajes(N);
            System.out.println(viajes);
        }
    }

    public static int CalcularViajes(int N) {
        if(N == 1)
            return 1;
        
        else
            return 1 + CalcularViajes(N / 2);
    }
}
