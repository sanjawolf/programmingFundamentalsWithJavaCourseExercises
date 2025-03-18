import java.util.Scanner;

public class Zadatak_07_Judge_Lab_07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String numbersText = sc.nextLine();

        String numbers[] = numbersText.split(" ");

        int n = numbers.length;

        int numbersInt[] = new int[n];

        for (int i = 0; i < n; i++) {

            numbersInt[i] = Integer.parseInt(numbers[i]);
        }

        while(numbersInt.length!=1){

            int condensed[] = new int[numbersInt.length - 1];

            for (int i = 0; i < numbersInt.length - 1; i++) {

                condensed[i] = numbersInt[i] + numbersInt[i + 1];

            }

            numbersInt=condensed;

        }

        System.out.println(numbersInt[0]);
    }
}
