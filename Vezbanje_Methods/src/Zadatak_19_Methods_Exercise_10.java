import java.util.Scanner;

public class Zadatak_19_Methods_Exercise_10 {

    public static void containsAtLeastOneOddDigit(String n){

        boolean atLeastOneOddDigit=false;

        int sum=0;

        for(int j=0; j<n.length(); j++){

            char character=n.charAt(j);

            int digit=Integer.parseInt(character+"");

            if(digit%2!=0){

                atLeastOneOddDigit=true;

            }

            sum+=digit;

        }

        if(atLeastOneOddDigit && sum%8==0){

            System.out.println(n);

        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String n=sc.nextLine();

        int N=Integer.parseInt(n);

        for(int i=1; i<=N; i++) containsAtLeastOneOddDigit(i+"");
    }
}
