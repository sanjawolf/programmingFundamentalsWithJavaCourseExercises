import java.util.Scanner;

public class Zadatak_01_04_08_a {

    public static int prost(int x){

        for(int i=2; i<=x-1; i++){

            if(x%i==0){

                return 0;

            }


        }


        return 1;

    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int x=Integer.parseInt(sc.nextLine());

        int prostBroj=prost(x);

        System.out.println(prostBroj);

    }
}
