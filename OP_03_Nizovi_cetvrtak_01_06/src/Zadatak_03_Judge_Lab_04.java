import java.util.Scanner;

public class Zadatak_03_Judge_Lab_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String niz=sc.nextLine();

        String clanoviNiza[]=niz.split(" ");

        int n=clanoviNiza.length;

        String clanoviNizaReversed[]=new String[n];

        for(int i=0; i<n; i++){

            clanoviNizaReversed[i]=clanoviNiza[n-i-1];
            System.out.printf("%s ", clanoviNizaReversed[i]);

        }

//        for(int i=0; i<n/2;i++){
//
//            String pomocna=clanoviNiza[i];
//            clanoviNiza[i]=clanoviNiza[n-i-1];
//            clanoviNiza[n-i-1]=pomocna;
//        }
//
//        for(int i=0; i<n; i++){
//
//            System.out.printf("%s ", clanoviNiza[i]);
//
//        }


    }
}
