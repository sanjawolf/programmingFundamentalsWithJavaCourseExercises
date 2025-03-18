import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak_03_Judge_Lab_11 {

    public static double add(double number1, double number2){

        return number1+number2;
    }

    public static double subtract(double number1, double number2){

        return number1-number2;
    }


    public static double multiply(double number1, double number2){

        return number1*number2;
    }


    public static double divide(double number1, double number2){

        return number1/number2;
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double number1=Double.parseDouble(sc.nextLine());

        char operation=sc.nextLine().charAt(0);

        double number2=Double.parseDouble(sc.nextLine());

        DecimalFormat df=new DecimalFormat("0.##");

        if(operation=='+'){

            System.out.println(df.format(add(number1, number2)));

        }

        if(operation=='-'){

            System.out.println(df.format(subtract(number1, number2)));

        }

        if(operation=='*'){

            System.out.println(df.format(multiply(number1, number2)));

        }

        if(operation=='/'){

            System.out.println(df.format(divide(number1, number2)));

        }


    }
}
