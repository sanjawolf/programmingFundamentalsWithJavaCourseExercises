import java.util.Scanner;

public class Zadatak_01_03_51_f {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        System.out.print("Unesite karakter c: ");

        char c=sc.nextLine().charAt(0);

        for(int i=1; i<=n-1; i++){

            System.out.print(c);

            for(int j=2; j<=i-1; j++){

                System.out.print(" ");

            }

            if(i>1) System.out.print(c);

            System.out.println();

        }

        for(int i=1; i<=n; i++) System.out.print(c);


    }
}
