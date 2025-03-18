import java.util.Scanner;

public class Zadatak_06_Judge_Lab_04 {

    public static void Add(int number1, int number2){

        int addition=number1+number2;

        System.out.println(addition);
    }
    public static void Subtract(int number1, int number2){

        int subtraction=number1-number2;

        System.out.println(subtraction);
    }
    public static void Multiply(int number1, int number2){

        int multiplication=number1*number2;

        System.out.println(multiplication);
    }
    public static void Divide(int number1, int number2){

        int division=number1/number2;

        System.out.println(division);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String operation=sc.nextLine();

        int number1=Integer.parseInt(sc.nextLine());
        int number2=Integer.parseInt(sc.nextLine());

        if(operation.equals("add")){

            Add(number1, number2);

        }

        if(operation.equals("subtract")){

            Subtract(number1, number2);

        }

        if(operation.equals("multiply")){

            Multiply(number1, number2);

        }

        if(operation.equals("divide")){

            Divide(number1, number2);

        }

    }
}
