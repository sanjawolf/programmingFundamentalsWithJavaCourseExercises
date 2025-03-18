import java.math.BigDecimal;
import java.util.Scanner;

public class Zadatak_02_01_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite dimenziju vektora: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0 || n>100) System.out.println("Greska: neispravan unos.");

        else{

            System.out.println("Unesite koordinate vektora a: ");

            String tekstA=sc.nextLine();

            String [] brojeviA=tekstA.split(" ");

            int[] a=new int[n];

            for(int i=0; i<n; i++){

                a[i]=Integer.parseInt(brojeviA[i]);
            }

            System.out.println("Unesite koordinate vektora b: ");

            String tekstB=sc.nextLine();

            String [] brojeviB=tekstB.split(" ");

            int[] b=new int[n];

            for(int i=0; i<n; i++){

                b[i]=Integer.parseInt(brojeviB[i]);
            }

            int ab=0;

            for(int i=0; i<n; i++){

                ab+=a[i]*b[i];
            }

            System.out.printf("Skalarni proizvod: %d", ab);
        }
    }
}
