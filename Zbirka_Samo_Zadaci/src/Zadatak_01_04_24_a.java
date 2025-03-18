import java.util.Scanner;

public class Zadatak_01_04_24_a {

    public static char konverzija(char c){

        if(Character.isUpperCase(c)) return ((c+"").toLowerCase().charAt(0));
        else if(Character.isLowerCase(c)) return ((c+"").toUpperCase().charAt(0));
        else return c;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String tekst=sc.nextLine();

        char konvertovan=' ';

        for(int i=0; i<tekst.length(); i++){

            char karakter=tekst.charAt(i);

            if(karakter=='.') break;

            else{

                konvertovan=konverzija(karakter);
                System.out.printf("%c", konvertovan);
            }
        }
    }
}
