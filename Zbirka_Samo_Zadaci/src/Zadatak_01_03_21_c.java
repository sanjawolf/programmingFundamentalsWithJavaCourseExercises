import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_01_03_21_c {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<0){

            System.out.println("Greska: neispravan unos.");
            return;
        }

        else if(n==0){

            System.out.println("Nisu uneti brojevi.");
            return;
        }

        System.out.println("Unesite brojeve:");

        String text=sc.nextLine();

        String [] prices=text.split(" ");

        int max=Integer.MIN_VALUE;

        ArrayList<Integer> maxNumbers=new ArrayList<>();

        int number2=-1;

        for(int i=0; i<=n-1; i++){

            int number=Integer.parseInt(prices[i]);

            int number1=number;

            while(true){

                if(number%10==0) break;

                number2=number;

                number/=10;
            }

            if(number2>max){

                max=number2;
                maxNumbers.clear();
                maxNumbers.add(number1);
            }



        }

        for(int number: maxNumbers) System.out.printf("Broj sa najvećom vodećom cifrom je %d.", number);


    }
}
