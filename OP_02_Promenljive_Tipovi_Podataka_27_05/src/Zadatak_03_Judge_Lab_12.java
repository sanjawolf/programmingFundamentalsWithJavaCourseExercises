import java.util.Scanner;

public class Zadatak_03_Judge_Lab_12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int copy=0;

        for (int number = 1; number <= n; number++) {

            int sumOfDigits = 0;
            copy=number;

            while (number > 0) {
                sumOfDigits += number % 10;
                number = number / 10;
            }
            boolean special = (sumOfDigits == 5) || (sumOfDigits == 7) || (sumOfDigits == 11);
            if(special){

                System.out.printf("%d -> True\n", copy);

            }

            else{

                System.out.printf("%d -> False\n", copy);
            }

            number=copy;
        }

    }
}
