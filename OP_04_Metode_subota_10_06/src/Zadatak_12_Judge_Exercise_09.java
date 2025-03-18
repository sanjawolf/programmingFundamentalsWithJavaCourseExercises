import java.util.Scanner;

public class Zadatak_12_Judge_Exercise_09 {

    public static boolean isNumberPalindrome(String n){

        boolean isPalindrome=true;

        for(int i=0; i<n.length(); i++){

            int digitStart=Integer.parseInt(n.charAt(i)+"");
            int digitEnd=Integer.parseInt(n.charAt(n.length()-i-1)+"");

            if(digitStart!=digitEnd){

                isPalindrome=false;
                break;
            }
        }

        return isPalindrome;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        while(true){

            String number=sc.nextLine();

            if(number.equals("END")){

                break;
            }

            System.out.println(isNumberPalindrome(number));
        }

    }
}
