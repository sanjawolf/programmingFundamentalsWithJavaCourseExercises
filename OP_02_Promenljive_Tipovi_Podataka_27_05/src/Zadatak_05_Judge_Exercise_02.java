import java.util.Scanner;

public class Zadatak_05_Judge_Exercise_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());

        String numberText=number+"";

        int length=numberText.length();

        int sumOfDigits=0;

        for(int i=0; i<length; i++){

            char character=numberText.charAt(i);

            int digit=Integer.parseInt(character+"");

            sumOfDigits+=digit;
        }

        System.out.println(sumOfDigits);
    }
}
