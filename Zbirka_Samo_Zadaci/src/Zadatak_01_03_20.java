import java.util.Scanner;

public class Zadatak_01_03_20 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Nikolin budzet: ");

        double budget=Double.parseDouble(sc.nextLine());

        System.out.print("Unesite broj artikala: ");

        int n=Integer.parseInt(sc.nextLine());

        System.out.println("Unesite cene artikala:");

        String text=sc.nextLine();

        String [] prices=text.split(" ");

        int sum=0;

        for(int i=0; i<=n-1; i++){

            double price=Double.parseDouble(prices[i]);

            if(price<=budget){

                sum+=1;
            }

        }

        System.out.printf("Ukupno artikala: %d", sum);

    }
}
