import java.math.BigInteger;
import java.util.Scanner;

public class Zadatak_03_Judge_Lab_03 {

    public static void nadjiFaktorijel(int n){

        BigInteger proizvod=new BigInteger("1");

        for(int i=1; i<=n; i++){

            proizvod=proizvod.multiply(BigInteger.valueOf(i));
        }

        System.out.println(proizvod);

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int N=Integer.parseInt(sc.nextLine());

        nadjiFaktorijel(N);


    }
}
