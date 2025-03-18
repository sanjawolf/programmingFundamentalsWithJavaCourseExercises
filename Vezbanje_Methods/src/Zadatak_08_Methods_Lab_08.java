import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak_08_Methods_Lab_08 {

    public static double raiseToPower(double number, int power){

        double starting=1;

        for(int i=1; i<=power; i++){

            starting*=number;
        }

        return starting;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double number=Double.parseDouble(sc.nextLine());

        int power=Integer.parseInt(sc.nextLine());

        double raisedNumber=raiseToPower(number, power);

        DecimalFormat df=new DecimalFormat();

        System.out.println(df.format(raisedNumber));

    }
}
