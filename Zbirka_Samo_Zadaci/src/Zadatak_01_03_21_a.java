import java.util.Scanner;

public class Zadatak_01_03_21_a {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0){

            System.out.println("Greska: neispravan unos.");
            return;
        }

        System.out.println("Unesite brojeve:");

        String text=sc.nextLine();

        String [] prices=text.split(" ");

        int max=Integer.MIN_VALUE;

        int number1=-1;

        for(int i=0; i<=n-1; i++){

            int number=Integer.parseInt(prices[i]);

            int tens=number/10%10;

            if(tens>=0){

                if(tens>max){

                    max=tens;
                    number1=number;
                }
            }

            else{

                if(-tens>max){

                    max=-tens;
                    number1=number;
                }
            }



        }

        System.out.printf("Broj sa najvecom cifrom desetica: %d.", number1);
    }
}
