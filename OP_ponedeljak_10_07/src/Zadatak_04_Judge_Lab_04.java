import java.util.Scanner;

public class Zadatak_04_Judge_Lab_04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());

        int p=Integer.parseInt(sc.nextLine());

        int rez=number & ~(1<<p);

        System.out.println(rez);
    }
}
