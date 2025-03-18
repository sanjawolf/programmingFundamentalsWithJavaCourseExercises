import java.util.Scanner;

public class Zadatak_01_03_15 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj: ");

        int number=Integer.parseInt(sc.nextLine());

        int remain;

        int number1=number;

        if(number>0){

            while(number!=0){

                remain=number%10;

                if(remain==5){

                    System.out.printf("Broj %d sadrzi cifru 5.", number1);
                    return;
                }

                number/=10;
            }

            System.out.printf("Broj %d ne sadrzi cifru 5.", number1);
        }

        else{

            while(number!=0){

                remain=number%10;

                if(remain==-5){

                    System.out.printf("Broj %d sadrzi cifru 5.", number1);
                    return;
                }

                number/=10;
            }

            System.out.printf("Broj %d ne sadrzi cifru 5.", number1);
        }


    }
}
