import java.util.Scanner;

public class Zadatak_01_03_10 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite ceo broj: ");

        int number=Integer.parseInt(sc.nextLine());

        System.out.print("Rezultat: ");

        int remain;

        if(number>0){

            while(number!=0){

                remain=number%10;
                System.out.printf("%d ", remain);
                number/=10;
            }

        }

        else{

            while(number!=0){

                remain=number%10;
                System.out.printf("%d ", -remain);
                number/=10;
            }
        }


    }
}
