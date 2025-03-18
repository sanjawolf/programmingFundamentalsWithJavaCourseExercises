import java.util.Scanner;

public class Zadatak_02_03_05 {

    public static int sadrzi_veliko(String s){

        for(int i=0; i<s.length(); i++){

            char karakter=s.charAt(i);

            if(karakter>='A' && karakter<='Z') return 1;
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite nisku: ");

        String niska=sc.nextLine();

        if(sadrzi_veliko(niska)==1) System.out.println("Sadrzi veliko slovo.");
        else System.out.println("Ne sadrzi veliko slovo.");
    }
}
