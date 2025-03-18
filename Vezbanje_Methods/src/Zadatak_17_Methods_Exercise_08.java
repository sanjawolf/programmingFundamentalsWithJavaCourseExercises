import java.util.Scanner;

public class Zadatak_17_Methods_Exercise_08 {

    public static long factorial(int n){

        long product=1;

        for(int i=1; i<=n; i++){

            product*=i;
        }

        return product;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int num1=Integer.parseInt(sc.nextLine());

        int num2=Integer.parseInt(sc.nextLine());

        long f1=factorial(num1);

        long f2=factorial(num2);

        double division=(double)f1/f2;

        System.out.printf("%.2f", division);
    }
}
