import java.util.Scanner;

public class Zadatak_01_03_22 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite brojeve:");

        String text=sc.nextLine();

        String [] prices=text.split(" ");

        if(prices.length==1){

            System.out.println("Nisu unete nadmorske visine.");
            return;
        }

        int max=Integer.MIN_VALUE;

        int min=Integer.MAX_VALUE;

        for(int i=0; i<= prices.length-1; i++){

            int number=Integer.parseInt(prices[i]);

            if(number==0) break;

            if(number>max){

                max=number;
            }

            if(number<min){

                min=number;
            }
        }










        System.out.printf("Razlika: %d", max-min);
    }
}
