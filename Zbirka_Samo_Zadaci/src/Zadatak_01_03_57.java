import java.util.Scanner;

public class Zadatak_01_03_57 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        for(int i=0; i<n; i++){

            for(int j=0; j<n-i-1; j++) System.out.print(" ");

            if(i==0) for(int j=0; j<2*i+1; j++) System.out.print("*");

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

        for(int i=0; i<n-1; i++) {

            if (i != n - 2) {

                for (int j = 0; j < n; j++) {

                    if (j == 0 || j == n - 1) {

                        System.out.print("*");
                        System.out.print(" ");
                    } else {

                        System.out.print("  ");

                    }
                }
            } else {

                for (int j = 0; j < n; j++) {

                    System.out.print("*");
                    System.out.print(" ");

                }
            }



            System.out.println();

        }
    }
}
