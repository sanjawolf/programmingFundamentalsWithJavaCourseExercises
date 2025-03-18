import java.util.Scanner;

public class Zadatak_20_Methods_Exercise_09 {

    public static boolean isPalindrome(String string){

        int n=string.length();

        for(int i=0; i<n; i++){

            char first=string.charAt(i);

            char last=string.charAt(n-i-1);

            if(first!=last){

                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        while(true){

            String string=sc.nextLine();

            if(string.equals("END")) break;

            boolean isPalindrome=isPalindrome(string);

            System.out.println(isPalindrome);

        }




    }
}
