import java.util.Scanner;

public class Zadatak_04_02_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite duzinu prve katete: ");

        double kateta1=Double.parseDouble(sc.nextLine());

        System.out.print("Unesite duzinu druge katete: ");

        double kateta2=Double.parseDouble(sc.nextLine());

        System.out.printf("Duzina hipotenuze pravouglog trougla je: %.2f", Math.sqrt(kateta1*kateta1+kateta2*kateta2));
    }
}
