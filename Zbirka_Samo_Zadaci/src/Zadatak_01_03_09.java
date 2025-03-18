import java.util.Scanner;

public class Zadatak_01_03_09 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj: ");

        int number=Integer.parseInt(sc.nextLine());

        if(number==0){

            System.out.printf("Rezultat: %d", number);
        }

        else{

            while(number%10==0){

                number/=10;
            }

            System.out.printf("Rezultat: %d", number);
        }


    }
}
