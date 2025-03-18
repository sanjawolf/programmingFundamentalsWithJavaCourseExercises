import java.util.Scanner;

public class Zadatak_01_Judge_Lab_10 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());

        for(int j=1; j<=10; j++){

            int product=number*j;
            System.out.printf("%d X %d = %d\n", number, j, product);
        }
    }
}
