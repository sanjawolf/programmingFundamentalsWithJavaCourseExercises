import java.math.BigInteger;
import java.util.Scanner;

public class Zadatak_03_Lab_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        BigInteger number1=new BigInteger(sc.nextLine());
        BigInteger number2=new BigInteger(sc.nextLine());

        BigInteger number=number1.add(number2);

        System.out.println(number);

    }
}
