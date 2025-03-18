import java.util.Scanner;

public class Zadatak_01_02_12 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite pozitivan trocifren broj: ");

        int number=Integer.parseInt(sc.nextLine());

        if(number>=100 && number<=999){

            int hundreads=number/100;

            int tens=number/10%10;

            int ones=number%10;

            if(Math.pow(hundreads,3)+Math.pow(tens, 3)+Math.pow(ones, 3)==number){

                System.out.println("Broj je Armstrongov.");
            }

            else{

                System.out.println("Broj nije Armstrongov.");
            }
        }

        else{

            System.out.println("Greška: niste uneli pozitivan trocifren broj.");
        }
    }
}
