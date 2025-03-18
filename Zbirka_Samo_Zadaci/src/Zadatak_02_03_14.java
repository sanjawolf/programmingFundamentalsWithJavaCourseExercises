import java.util.Scanner;

public class Zadatak_02_03_14 {


    public static void dupliranje(String s){

        String t="";

        for(int i=0; i<s.length(); i++){

            char karakter=s.charAt(i);

            t=t.concat(karakter+"");

            t=t.concat(karakter+"");
        }

        System.out.print(t);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite nisku: ");

        String s=sc.nextLine();

        if(s.length()>20) System.out.println("Greska: neispravan unos.");

        else{

            System.out.print("Rezultujuca niska: ");

            dupliranje(s);
        }

    }
}
