import java.util.Scanner;

public class Zadatak_04_02_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite pocetni depozit: ");

        int pocetniDepozit=Integer.parseInt(sc.nextLine());

        System.out.print("Unesite godisnju kamatnu stopu: ");

        double godisnjaKamatnaStopa=Double.parseDouble(sc.nextLine());

        double iznosKamate=godisnjaKamatnaStopa*(double)pocetniDepozit/100;

        System.out.printf("Vasa kamata iznosi %.2f.\n", iznosKamate);

        double uvecanDepozit=pocetniDepozit+iznosKamate;

        System.out.printf("Vas depozit iznosi %.2f.\n", uvecanDepozit);


    }
}
