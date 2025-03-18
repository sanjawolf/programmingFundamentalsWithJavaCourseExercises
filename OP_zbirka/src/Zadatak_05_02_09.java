import java.util.Scanner;

public class Zadatak_05_02_09 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n%2==0){

            double n1=Math.ceil(n);

            n=(int)n1;
        }

        for(int i=1; i<=n/2+1; i++){

            for(int j=1; j<=(n-2*(i-1))/2; j++) System.out.print(" ");

            for(int j=1; j<=2*(i-1)+1; j++) System.out.print("*");

            for(int j=1; j<=(n-2*(i-1))/2; j++) System.out.print(" ");

            System.out.println();
        }

        for(int i=n/2; i>=1; i--){

            for(int j=1; j<=(n-2*(i-1))/2; j++) System.out.print(" ");

            for(int j=1; j<=2*(i-1)+1; j++) System.out.print("*");

            for(int j=1; j<=(n-2*(i-1))/2; j++) System.out.print(" ");

            System.out.println();
        }

    }
}
