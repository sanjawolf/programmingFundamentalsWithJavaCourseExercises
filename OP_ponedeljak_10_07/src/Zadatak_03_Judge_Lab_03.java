import java.util.Scanner;

public class Zadatak_03_Judge_Lab_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());

        int p=Integer.parseInt(sc.nextLine());

        int rez=(number>>p) & 1;

        System.out.println(rez);
    }
}
