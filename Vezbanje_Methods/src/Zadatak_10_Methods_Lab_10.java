import java.util.Scanner;

public class Zadatak_10_Methods_Lab_10 {

    public static int getProduct(String numberText){

        int n=numberText.length();

        int sumEven=0;

        int sumOdd=0;

        if(numberText.charAt(0)=='-'){

            for(int i=1; i<n; i++){

                int character=Integer.parseInt(numberText.charAt(i)+"");

                if(character%2==0) sumEven+=character;
                else sumOdd+=character;
            }

            return sumEven*sumOdd;
        }

        else{

            for(int i=0; i<n; i++){

                int character=Integer.parseInt(numberText.charAt(i)+"");

                if(character%2==0) sumEven+=character;
                else sumOdd+=character;
            }

            return sumEven*sumOdd;
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String numberText=sc.nextLine();

        int product=getProduct(numberText);

        System.out.println(product);

    }
}
