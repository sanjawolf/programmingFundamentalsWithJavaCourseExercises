import java.util.Scanner;

public class Zadatak_01_03_11 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj: ");

        int number=Integer.parseInt(sc.nextLine());

        int remain;
        int sum=0;

        int number1=number;

        if(number>0){

            while(number!=0){

                remain=number%10;

                sum+=remain;

                number/=10;
            }

            if(number1%sum==0){

                System.out.printf("Broj %d je deljiv sa %d.", number1, sum);
            }

            else{

                System.out.printf("Broj %d nije deljiv sa %d.", number1, sum);
            }
        }

        else{

            System.out.println("Greska: neispravan ulaz.");
        }
    }
}
