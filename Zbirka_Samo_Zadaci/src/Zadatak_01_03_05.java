import java.util.Scanner;

public class Zadatak_01_03_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<0) System.out.println("Greska: neispravan unos");

        else if(n<=20){

            long product=1;

            for(int i=1; i<=n; i++){

                product*=i;
            }

            System.out.printf("%d!=%d", n, product);
        }

        else System.out.printf("Pri racunanju %d! ce doci do prekoracenja.", n);


    }
}
