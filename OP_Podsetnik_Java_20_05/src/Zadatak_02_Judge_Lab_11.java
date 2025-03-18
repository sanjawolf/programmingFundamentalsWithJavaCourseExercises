import java.util.Scanner;

public class Zadatak_02_Judge_Lab_11 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());
        int multiplier=Integer.parseInt(sc.nextLine());

        if(multiplier>10){

            System.out.printf("%d X %d = %d\n", number, multiplier, number*multiplier);

        }

        for(int j=multiplier; j<=10; j++){

            int product=number*j;
            System.out.printf("%d X %d = %d\n", number, j, product);
        }
    }
}
