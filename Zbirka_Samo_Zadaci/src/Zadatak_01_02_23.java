import java.util.Scanner;

public class Zadatak_01_02_23 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite jedan karakter: ");

        char character=sc.nextLine().charAt(0);

        switch(character){

            case 'a': case 'e': case 'i': case 'o': case 'u': case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println("Uneti karakter je samoglasnik.");
                break;

            default:
                System.out.println("Uneti karakter nije samoglasnik.");
        }
    }
}
