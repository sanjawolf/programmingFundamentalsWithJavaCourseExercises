import java.util.Scanner;

public class Zadatak_05_Methods_Lab_05 {

    public static void calculatePrice(String product, int quantity){

        double price=-1;

        switch(product){

            case "coffee":
                double coffee=1.50;
                price=coffee*quantity;
                break;

            case "water":
                double water=1.00;
                price=water*quantity;
                break;

            case "coke":
                double coke=1.40;
                price=coke*quantity;
                break;

            case "snacks":
                double snacks=2.00;
                price=snacks*quantity;
                break;

            default:
        }

        System.out.printf("%.2f", price);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String product=sc.nextLine();

        int quantity=Integer.parseInt(sc.nextLine());

        calculatePrice(product, quantity);
    }
}
