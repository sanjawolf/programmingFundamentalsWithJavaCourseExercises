import java.util.Scanner;

public class Zadatak_04_Judge_Exercise_01 {

    public static void findMinimum(int a, int b, int c) {

        if (a < b) {

            if (a < c) {

                int min = a;
                System.out.println(a);

            } else {

                int min = c;
                System.out.println(c);

            }

        } else {

            if (c < b) {

                int max = c;
                System.out.println(c);

            } else {

                int max = b;
                System.out.println(b);

            }


        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int a=Integer.parseInt(sc.nextLine());

        int b=Integer.parseInt(sc.nextLine());

        int c=Integer.parseInt(sc.nextLine());

        findMinimum(a, b, c);

    }
}
