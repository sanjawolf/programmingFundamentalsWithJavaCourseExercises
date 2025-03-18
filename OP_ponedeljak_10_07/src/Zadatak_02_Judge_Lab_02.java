import java.util.Scanner;

public class Zadatak_02_Judge_Lab_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());

        int rez=(number>>1)&1;
        System.out.println(rez);
    }
}
