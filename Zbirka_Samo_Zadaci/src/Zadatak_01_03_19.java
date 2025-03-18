import java.util.Scanner;

public class Zadatak_01_03_19 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj artikala: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0){

            System.out.println("Greska: neispravan unos.");
            return;
        }

        System.out.println("Unesite cene artikala:");

        String text=sc.nextLine();

        String [] prices=text.split(" ");

        double min=Double.MAX_VALUE;

        for(int i=0; i<=n-1; i++){

            double number=Double.parseDouble(prices[i]);

            if(number<min){

                min=number;
            }

        }

        if(min<0) System.out.println("Greska: neispravan unos cene.");

        else System.out.printf("Najmanja cena: %f", min);
    }
}
