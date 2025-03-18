import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak_11_Methods_Lab_11 {

    public static double returnOperationResult(double num1, String operator, double num2){

        double res=-1;

        switch(operator){

            case "+":
                res=num1+num2;
                break;

            case "-":
                res=num1-num2;
                break;

            case "*":
                res=num1*num2;
                break;

            case "/":
                if(num2!=0){

                    res=num1/num2;
                }
                break;

        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int num1=Integer.parseInt(sc.nextLine());

        String operation=sc.nextLine();

        int num2=Integer.parseInt(sc.nextLine());

        double result=returnOperationResult(num1, operation, num2);

        DecimalFormat df=new DecimalFormat("0.##");

        System.out.println(df.format(result));
    }
}
