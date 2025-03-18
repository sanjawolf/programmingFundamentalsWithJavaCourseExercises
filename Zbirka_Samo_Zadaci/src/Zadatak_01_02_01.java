import java.util.Scanner;

public class Zadatak_01_02_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite tri cela broja: ");
        int num1=Integer.parseInt(sc.nextLine());
        int num2=Integer.parseInt(sc.nextLine());
        int num3=Integer.parseInt(sc.nextLine());

        if (num1<=num2){

            if(num1<=num3){

                int min=num1;
                System.out.printf("Najmanji: %d", min);
            }

            else{

                int min=num3;
                System.out.printf("Najmanji: %d", min);
            }

        }

        else if(num2<=num3){

            int min=num2;
            System.out.printf("Najmanji: %d", min);
        }

    }
}
