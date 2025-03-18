import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Zadatak_02_Lab_03 {

    public static BigInteger factoriel(int number){

        BigInteger product=new BigInteger("1");

        for(int i=1; i<=number; i++){

            product=product.multiply(new BigInteger(String.valueOf(i)));
        }

        return product;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());

        System.out.println(factoriel(number));
    }
}
