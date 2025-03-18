import java.util.Scanner;

public class Zadatak_02_03_11 {

    public static void nadovezi_trostruko(String s){

        String pocetni="";

        for(int i=1; i<=3; i++){

            pocetni+=s;
        }

        System.out.printf("Rezultujuca niska:\n");
        System.out.printf("%s", pocetni);

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite nisku: ");

        String niska=sc.nextLine();

        nadovezi_trostruko(niska);
    }
}
