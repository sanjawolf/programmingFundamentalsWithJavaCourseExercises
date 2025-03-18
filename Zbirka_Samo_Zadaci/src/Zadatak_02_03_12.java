import java.util.Scanner;

public class Zadatak_02_03_12 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite nisku: ");

        String rec=sc.nextLine();

        System.out.print("Unesite broi n: ");

        int n=Integer.parseInt(sc.nextLine());

        if(rec.length()>20 || n<0 || n>=10) System.out.println("Greska: neispravan unos.");

        else{

            System.out.print("Rezultujuca niska: ");

            for(int i=1; i<n; i++){

                System.out.printf("%s-", rec);
            }

            System.out.print(rec);
        }
    }
}
