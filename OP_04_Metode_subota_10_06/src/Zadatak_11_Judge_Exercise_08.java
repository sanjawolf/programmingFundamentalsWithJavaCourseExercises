import java.util.Scanner;

public class Zadatak_11_Judge_Exercise_08 {

    public static double countTheFactorial(int n){

        double factorial=1;

        for(int i=n; i>=1; i--){

            factorial*=i;
        }

        return factorial;
    }

    public static double divideTwoFactorials(int a, int b){

        double division=countTheFactorial(a)/countTheFactorial(b);
        return division;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int a=Integer.parseInt(sc.nextLine());

        int b=Integer.parseInt(sc.nextLine());

        System.out.printf("%.2f", divideTwoFactorials(a, b));

    }
}
