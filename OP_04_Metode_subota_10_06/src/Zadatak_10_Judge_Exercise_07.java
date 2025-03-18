import java.util.Scanner;

public class Zadatak_10_Judge_Exercise_07 {

    public static void printsVector(int n){

        for(int j=1; j<=n; j++){

                System.out.printf("%d ", n);
            }

    }

    public static void printsMatrix(int n){

        for(int j=1; j<=n; j++){

            printsVector(n);
            System.out.println();
        }


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        printsMatrix(n);
    }
}
