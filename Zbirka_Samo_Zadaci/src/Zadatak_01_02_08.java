import java.util.Scanner;

public class Zadatak_01_02_08 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite karakter: ");

        String character=sc.nextLine();

        System.out.printf("Uneti karakter: %c\n", character.charAt(0));

        System.out.printf("ASCII kod: %d\n", (int)character.charAt(0));

        if(Character.isUpperCase(character.charAt(0)) && Character.isLetter(character.charAt(0))){

            System.out.printf("Odgovarajuce malo slovo: %s\n", character.toLowerCase());

            System.out.printf("ASCII kod: %d\n", (int) character.toLowerCase().charAt(0));
        }

        else if(Character.isLowerCase(character.charAt(0)) && Character.isLetter(character.charAt(0))){

            System.out.printf("Odgovarajuce veliko slovo: %s\n", character.toUpperCase());

            System.out.printf("ASCII kod: %d\n", (int) character.toUpperCase().charAt(0));
        }
    }
}
