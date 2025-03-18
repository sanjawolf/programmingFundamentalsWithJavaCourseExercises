import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class Zadatak_05_02_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        final int PISMO = 0;
        int brojBacanja, ishodBacanja;
        int brojPisma, brojGlava;
        while(true) {
            System.out.print("Unesite broj bacanja novčića: ");
            brojBacanja = Integer.parseInt(sc.nextLine());
            if (brojBacanja == 0) break;
            brojPisma = 0;
            brojGlava = 0;
            for (int i = 0; i < brojBacanja; i++) {
                ishodBacanja = (int)(Math.random()*2);
                if (ishodBacanja == PISMO)
                    brojPisma++;
                else
                    brojGlava++;
            }
            System.out.print("Broj pisma Broj glava ");
            System.out.print("Broj pisma/Broj bacanja ");
            System.out.println("Broj glava/Broj bacanja ");
            System.out.printf("%d %d %.2f %.2f\n",
                    brojPisma, brojGlava,
                    (double)brojPisma/brojBacanja,
                    (double)brojGlava/brojBacanja);
        }
    }
}
