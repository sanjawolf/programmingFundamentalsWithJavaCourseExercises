import java.util.Scanner;

public class Zadatak_05_02_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite godinu u periodu između 1982. i 2048. godine: ");

        int godina = Integer.parseInt(sc.nextLine());

        if (godina > 1982 && godina < 2048){

            int A=godina%19;
            int B=godina%4;
            int C=godina%7;
            int D=(19*A+24)%30;
            int E=(2*B+4*C+6*D+5)%7;

            if(22+D+E>31){

                System.out.printf("Katolicki Uskrs %d. godine je bio %d.4.", godina, 22+D+E-31);
            }

            else System.out.printf("Katolicki Uskrs %d. godine je bio %d.3.", godina, 22+D+E);
        }

        else System.out.println("Greska: neispravan unos.");
    }
}
