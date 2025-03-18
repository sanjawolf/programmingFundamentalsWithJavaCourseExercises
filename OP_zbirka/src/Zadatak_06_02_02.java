import java.util.Scanner;

public class Zadatak_06_02_02 {

    public static void triN1(int n){

        System.out.print(n+" ");

        while(n!=1){

            if(n%2==0) n=n/2;
            else n=3*n+1;

            System.out.printf("%d ", n);
        }



    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        triN1(n);
    }
}
