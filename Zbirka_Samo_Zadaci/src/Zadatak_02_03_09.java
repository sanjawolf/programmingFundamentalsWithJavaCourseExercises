import java.util.Scanner;

public class Zadatak_02_03_09 {

    /*?????????????????????????????????????????????????????*/
    public static void ukloni_slova(String s){

        for(int i=0; i<s.length(); i++){

            char karakter=s.charAt(i);

            if(karakter>='a' && karakter<='z' || karakter>='A' && karakter<='Z'){

                s=s.substring(0, i)+s.substring(i+1);
            }
        }

        System.out.printf("Rezultat: %s", s);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite nisku: ");

        String niska=sc.nextLine();

        ukloni_slova(niska);
    }
}
