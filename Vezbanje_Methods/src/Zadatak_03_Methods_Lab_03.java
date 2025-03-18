import java.util.Scanner;

public class Zadatak_03_Methods_Lab_03 {

    public static void printUpTriangle(int number){

        for(int i=1; i<=number; i++){

            for(int j=1; j<=i; j++) System.out.print(j+" ");

            System.out.println();
        }
    }

    public static void printDownTriangle(int number){

        for(int i=number-1; i>=1; i--){

            for(int j=1; j<=i; j++) System.out.print(j+" ");

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());

        printUpTriangle(number);
        printDownTriangle(number);
    }
}
