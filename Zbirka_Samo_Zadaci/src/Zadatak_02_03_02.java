import java.util.Scanner;

public class Zadatak_02_03_02 {

    public static void ubaci_zvezdice(String s){

        for(int i=0; i<s.length(); i++){

            char karakter=s.charAt(i);

            if(i%2!=0) s=s.replace(karakter, '*');
        }

        System.out.printf("Izmenjena niska: %s", s);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite nisku: ");

        String niska=sc.nextLine();

        ubaci_zvezdice(niska);
    }
}
