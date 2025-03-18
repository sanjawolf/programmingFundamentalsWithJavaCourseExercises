import java.util.Scanner;

public class Zadatak_06_Judge_Lab_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());

        int p=Integer.parseInt(sc.nextLine());

        int rez=((1<<p)|(1<<(p+1))|(1<<(p+2)))^number;

        System.out.println(rez);
    }
}
