import java.util.Scanner;

public class Zadatak_05_02_10 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesi tekst: ");

        String text=sc.nextLine();

        int sumSlova=0;

        int sumBrojevi=0;

        for(int i=0; i<text.length(); i++){

            char karakter=text.charAt(i);

            if(!Character.isSpaceChar(karakter))System.out.println(karakter);

            if(Character.isDigit(karakter)) sumBrojevi+=1;

            if(Character.isUpperCase(karakter) || Character.isLowerCase(karakter)) sumSlova+=1;
        }

        System.out.printf("Broj cifara: %d\n", sumBrojevi);

        System.out.printf("Broj slova: %d", sumSlova);

    }
}
