import java.util.Scanner;

public class Zadatak_01_03_52_e {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        for(int i=0; i<n; i++){

            for(int j=0; j<n-i-1; j++) System.out.print(" ");

            if(i==0){

                for(int j=0; j<2*i+1; j++) System.out.print("*");
            }

            else if(i==n-1){

                for(int j=0; j<n; j++){

                    System.out.print("*");
                    System.out.print(" ");
                }
            }

            else{

                System.out.print("*");
                for(int j=0; j<2*i-1; j++) System.out.print(" ");
                System.out.print("*");
            }

            System.out.println();


        }

        for(int i=n-2; i>=0; i--){

            for(int j=0; j<n-i-1; j++) System.out.print(" ");

            if(i==0) for(int j=0; j<2*i+1; j++) System.out.print("*");

            else{

                System.out.print("*");
                for(int j=0; j<2*i-1; j++) System.out.print(" ");
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
