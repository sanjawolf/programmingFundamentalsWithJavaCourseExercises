import java.util.Scanner;

public class Zadatak_01_03_36 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0){

            System.out.println("Greska: neispravan unos.");
        }

        else{



            for(int i=1; i<=n; i++){

                int sum=0;

                for(int j=1; j<=i; j++) sum+=Math.pow(j, 3);

                System.out.printf("[k=%d] Suma kubova: %d\n", i, sum);
            }



        }
    }
}
