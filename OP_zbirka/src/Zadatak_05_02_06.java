import java.util.Scanner;

public class Zadatak_05_02_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        while(n<=0){

            System.out.println("Greska: pogresan unos. Unesite broj veci od nule!");

            n=Integer.parseInt(sc.nextLine());

        }

        while(true){

            System.out.printf("%d ", n);

            if(n==1) break;

            if(n%2==0) n=n/2;
            else n=3*n+1;

        }



    }
}
