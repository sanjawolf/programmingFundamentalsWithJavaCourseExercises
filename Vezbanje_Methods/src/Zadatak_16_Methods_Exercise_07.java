import java.util.Scanner;

public class Zadatak_16_Methods_Exercise_07 {

    public static void vector(int n){

        for(int i=1; i<=n; i++){

            System.out.printf("%d ", n);

        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        for(int i=1; i<=n; i++){

            vector(n);
        }



    }
}
