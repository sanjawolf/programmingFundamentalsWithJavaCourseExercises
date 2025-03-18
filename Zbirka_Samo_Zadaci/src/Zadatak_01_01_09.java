import java.util.Scanner;

public class Zadatak_01_01_09 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite vrednosti a i b: ");
        int a=Integer.parseInt(sc.nextLine());
        int b=Integer.parseInt(sc.nextLine());

        a=a+b;
        b=a-2*b;

        System.out.printf("Nove vrednosti su: a=%d, b=%d", a, b);
    }
}
