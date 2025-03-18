import java.util.Scanner;

public class Zadatak_01_01_08 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite vrednosti x i y: ");
        int x=Integer.parseInt(sc.nextLine());
        int y=Integer.parseInt(sc.nextLine());

        int y_1=x;
        x=y;
        y=y_1;

        System.out.printf("Promenljiva x: %d\n", x);
        System.out.printf("Promenljiva y: %d\n", y);



    }
}
