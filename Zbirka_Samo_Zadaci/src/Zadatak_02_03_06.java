import java.util.Scanner;

public class Zadatak_02_03_06 {

    public static void sadrzi_karakter(String s, char c){

        boolean daLiSePojavljuje=false;

        for(int i=0; i<s.length(); i++){

            char karakter=s.charAt(i);

            if(karakter==c){

                System.out.printf("Pozicija: %d", i);
                daLiSePojavljuje=true;
                break;
            }
        }

        if(!daLiSePojavljuje) System.out.println("Pozicija: -1");



    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite nisku: ");

        String niska=sc.nextLine();

        System.out.print("Unesite karakter: ");

        char karakter=sc.nextLine().charAt(0);

        sadrzi_karakter(niska, karakter);
    }
}
