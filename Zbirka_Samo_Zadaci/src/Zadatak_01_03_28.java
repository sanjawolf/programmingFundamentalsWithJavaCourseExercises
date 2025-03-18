import java.util.Scanner;

public class Zadatak_01_03_28 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<0){

            System.out.println("Greska: neispravan unos.");
        }

        else{

            int [] fibonacci=new int [n+1];

            fibonacci[0]=0;

            fibonacci[1]=1;

            for(int i=2; i<=n; i++){

                fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
            }

            System.out.printf("F[%d]=%d", n, fibonacci[n]);
        }
    }
}
