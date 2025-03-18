import java.util.Scanner;

public class Zadatak_01_03_47_b {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        for(int i=1; i<=n*n; i++) {

            if (i % n != 0) {

                System.out.print(i + " ");
                String number = i + "";
                if (number.length() == 1) System.out.print(" ");
            } else{

                System.out.print(i + " ");
                String number = i + "";
                if (number.length() == 1) System.out.print(" ");
                System.out.println();
            }

        }
    }
}
