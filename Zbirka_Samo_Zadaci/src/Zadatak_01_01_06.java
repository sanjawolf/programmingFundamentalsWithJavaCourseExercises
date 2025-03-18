import java.util.Scanner;

public class Zadatak_01_01_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite cenu, kolicinu i iznos: ");
        int cena=Integer.parseInt(sc.nextLine());
        int kolicina=Integer.parseInt(sc.nextLine());
        int iznos=Integer.parseInt(sc.nextLine());

        int kusur=iznos-cena*kolicina;

        System.out.printf("Kusur: %d", kusur);

    }
}
