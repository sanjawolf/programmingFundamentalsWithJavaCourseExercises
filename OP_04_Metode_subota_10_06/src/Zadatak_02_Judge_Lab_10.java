import java.util.Scanner;

public class Zadatak_02_Judge_Lab_10 {

    public static int getTheProductOfSums(String numberText) {

        int sumEven = 0;
        int sumOdd = 0;

        if (numberText.charAt(0) == '-'){

            for (int i = 1; i <= numberText.length() - 1; i++) {

                int digit = Integer.parseInt(numberText.charAt(i) + "");

                if (digit % 2 == 0) {

                    sumEven += digit;
                } else {

                    sumOdd += digit;

                }



            }
        }

        else{

            for (int i = 0; i < numberText.length(); i++) {

                int digit = Integer.parseInt(numberText.charAt(i) + "");

                if (digit % 2 == 0) {

                    sumEven += digit;
                } else {

                    sumOdd += digit;

                }

            }

        }

        return sumEven*sumOdd;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String textNumber=sc.nextLine();

        int rez=getTheProductOfSums(textNumber);

        System.out.println(rez);
    }
}
