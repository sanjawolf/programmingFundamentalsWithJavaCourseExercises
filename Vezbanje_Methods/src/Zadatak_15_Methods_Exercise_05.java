import java.util.Scanner;

public class Zadatak_15_Methods_Exercise_05 {

    public static int sum(int a, int b){

        return a+b;
    }

     public  static int subtract(int a, int b, int c){

        int d=sum(a, b);

        return d-c;
     }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int a=Integer.parseInt(sc.nextLine());

        int b=Integer.parseInt(sc.nextLine());

        int c=Integer.parseInt(sc.nextLine());

        int d=subtract(a, b, c);

        System.out.println(d);
    }
}
