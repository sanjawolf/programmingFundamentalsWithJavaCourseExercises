import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak_08_Judge_Lab_08 {

    public static double powerTheNumber(double number, int degree){

        double power=1;

        for(int i=1; i<=degree; i++){

            power*=number;
        }

        return power;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double number=Double.parseDouble(sc.nextLine());

        int degree=Integer.parseInt(sc.nextLine());

        double power=powerTheNumber(number, degree);

        DecimalFormat df=new DecimalFormat("0.####");

        System.out.println(df.format(power));

    }
}
