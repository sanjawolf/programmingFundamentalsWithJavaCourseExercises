import java.util.Scanner;

public class Zadatak_01_01_27 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite dimenzije sobe: ");

        int length=Integer.parseInt(sc.nextLine());

        int weight=Integer.parseInt(sc.nextLine());

        int height=Integer.parseInt(sc.nextLine());

        System.out.println("Unesite cenu po m2: ");

        int pricePerSquaredMeter=Integer.parseInt(sc.nextLine());

        double space=0.8*(length*weight+2*length*height+2*weight*height);

        System.out.printf("Moler treba da okreci %.2f m2\n", space);

        double price=space*pricePerSquaredMeter;

        System.out.printf("Cena krecenja: %.2f", price);
    }
}
