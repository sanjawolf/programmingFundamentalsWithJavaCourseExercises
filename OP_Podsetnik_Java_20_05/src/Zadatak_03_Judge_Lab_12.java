import java.util.Scanner;

public class Zadatak_03_Judge_Lab_12 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        while(true){

            int number=Integer.parseInt(sc.nextLine());

            if(number%2==0){

                int absolute=Math.abs(number);
                System.out.printf("The number is: %d", absolute);
                return;
            }

            else{

                System.out.println("Please write an even number.");

            }
        }


    }
}
