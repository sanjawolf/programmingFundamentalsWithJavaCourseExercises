import java.util.Scanner;

public class Zadatak_01_Judge_Lab_01 {

    public static void isPositiveZeroOrNegative(int number){

        if(number>0){

            System.out.printf("The number %d is positive.\n", number);
        }

        else if(number==0){

            System.out.println("The number 0 is zero.");
        }

        else{

            System.out.printf("The number %d is negative.", number);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());

        isPositiveZeroOrNegative(number);


    }
}
