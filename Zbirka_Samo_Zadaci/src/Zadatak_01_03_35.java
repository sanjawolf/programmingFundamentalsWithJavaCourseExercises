import java.util.Scanner;

public class Zadatak_01_03_35 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0){

            System.out.println("Greska: neispravan unos.");
        }

        else{

            int sum=0;

            for(int i=1; i<=n; i++) sum+=Math.pow(i, 3);

            System.out.printf("Suma kubova: %d", sum);

        }
    }
}
