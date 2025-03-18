import java.util.Scanner;

public class Zadatak_13_Judge_Exercise_10 {

    public static void sumOfDigitsIsDivisibleBy8AndConsistsAtLeastOneOddDigit(String n) {

        int sum = 0;

        boolean notConsistsAtLeastOneOddDigit=false;

        for (int i = 0; i<n.length(); i++) {

            int digit=Integer.parseInt(n.charAt(i)+"");

            if(digit%2==1){

                notConsistsAtLeastOneOddDigit=true;
            }

            sum+=digit;

        }

        if(sum%8==0 && notConsistsAtLeastOneOddDigit) System.out.println(n);

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());

        for(int j=1; j<=number; j++){

            sumOfDigitsIsDivisibleBy8AndConsistsAtLeastOneOddDigit(j+"");

        }

    }
}
