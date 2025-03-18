import java.util.Scanner;

public class Zadatak_12_Judge_Exercise_09 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int N=Integer.parseInt(sc.nextLine());

        double totalPrice=0;

        for(int i=1; i<=N; i++){

            double pricePerCapsule=Double.parseDouble(sc.nextLine());
            int days=Integer.parseInt(sc.nextLine());
            int capsulesCount=Integer.parseInt(sc.nextLine());

            double price=((days * capsulesCount) * pricePerCapsule);

            System.out.printf("The price for the coffee is: $%.2f\n", price);

            totalPrice+=price;

        }

        System.out.printf("Total: $%.2f", totalPrice);


    }
}
