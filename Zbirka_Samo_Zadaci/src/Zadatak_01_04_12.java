import java.util.Scanner;

public class Zadatak_01_04_12 {

    public static int broj_neparnih_cifara(int x){

        String xTekst=x+"";

        int sum=0;

        for(int i=0; i<xTekst.length(); i++){

            char karakter=xTekst.charAt(i);

            int cifra=Integer.parseInt(karakter+"");

            if(cifra%2!=0){

                sum+=1;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite cele brojeve:");

        int broj=Integer.parseInt(sc.nextLine());

        while(broj!=0){

            if(broj>0) System.out.printf("Broj neparnih cifara: %d\n", broj_neparnih_cifara(broj));
            else System.out.printf("Broj neparnih cifara: %d\n", broj_neparnih_cifara(-broj));

            broj=Integer.parseInt(sc.nextLine());
        }


    }
}
