import java.util.Scanner;

public class Zadatak_08_Judge_Exercise_05 {

    public static int add(int a, int b){

        return a+b;
    }
    public static int subtract(int a, int b, int c){

        int d= add(a, b);

        return d-c;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int a=Integer.parseInt(sc.nextLine());

         int b=Integer.parseInt(sc.nextLine());

         int c=Integer.parseInt(sc.nextLine());

        System.out.println(subtract(a, b, c));
    }
}
