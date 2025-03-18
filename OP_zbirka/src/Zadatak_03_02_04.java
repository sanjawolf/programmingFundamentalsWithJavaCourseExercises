import java.util.Scanner;

public class Zadatak_03_02_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj stepeni Celzijusa: ");

        int c=Integer.parseInt(sc.nextLine());

        System.out.printf("%d stepeni Celzijusa=%d stepeni Farenhajta", c, 9*c/5+32);
    }
}
