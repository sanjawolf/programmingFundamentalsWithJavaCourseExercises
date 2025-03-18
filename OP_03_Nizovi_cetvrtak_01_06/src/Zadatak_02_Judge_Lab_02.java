import java.util.Scanner;

public class Zadatak_02_Judge_Lab_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        int niz []=new int[n];

        for(int i=0; i<n; i++){

            niz[i]=Integer.parseInt(sc.nextLine());
        }

        for(int i=n-1; i>=0; i--){

            System.out.printf("%d ", niz[i]);
        }

    }
}
