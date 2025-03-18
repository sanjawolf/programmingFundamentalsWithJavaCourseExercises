import java.util.Scanner;

public class Zadatak_06_02_01 {

    public static int NZD(int num1, int num2){

        int r=num1%num2;

        int kol=num2;

        int r1=-1;

        while(r!=0){

            r1=r;

            r=kol%r1;

            kol=r1;

        }

        return r1;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite prvi broj: ");

        int num1=Integer.parseInt(sc.nextLine());

        System.out.print("Unesite drugi broj: ");

        int num2=Integer.parseInt(sc.nextLine());

        System.out.printf("NZD za brojeve %d i %d je %d.", num1, num2, NZD(num1, num2));
    }
}
