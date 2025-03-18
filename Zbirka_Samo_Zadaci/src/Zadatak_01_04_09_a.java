import java.util.Scanner;

public class Zadatak_01_04_09_a {

    public static int kvadrat(int x){

        return x*x;
    }

    public  static int kub(int x){

        return kvadrat(x)*x;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite ceo broj: ");

        int x=Integer.parseInt(sc.nextLine());

        System.out.printf("Kvadrat: %d\n", kvadrat(x));

        System.out.printf("Kub: %d\n", kub(x));
    }
}
