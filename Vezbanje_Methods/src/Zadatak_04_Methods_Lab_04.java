import java.util.Scanner;

public class Zadatak_04_Methods_Lab_04 {

    public static void add(int number1, int number2){

        System.out.printf("%d", number1+number2);
    }

    public static void subtract(int number1, int number2){

        System.out.printf("%d", number1-number2);
    }

    public static void multiply(int number1, int number2){

        System.out.printf("%d", number1*number2);
    }

    public static void divide(int number1, int number2){

        if(number2!=0) System.out.printf("%d", number1/number2);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String operation=sc.nextLine();

        int number1=Integer.parseInt(sc.nextLine());

        int number2=Integer.parseInt(sc.nextLine());

        if(operation.equals("add")){

            add(number1, number2);
        }

        if(operation.equals("subtract")){

            subtract(number1, number2);
        }

        if(operation.equals("multiply")){

            multiply(number1, number2);
        }

        if(operation.equals("divide")){

            divide(number1, number2);
        }



    }
}
