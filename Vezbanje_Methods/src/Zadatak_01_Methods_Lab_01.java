import java.util.Scanner;

public class Zadatak_01_Methods_Lab_01 {

    public static void printIntegerSign(int number){

        if(number>0) System.out.printf("The number %d is positive.", number);
        else if(number==0) System.out.printf("The number %d is zero.", number);
        else System.out.printf("The number %d is negative.", number);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());

        printIntegerSign(number);
    }
}
