import java.util.Scanner;

public class Zadatak_02_Judge_Lab_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        float britishPounds=Float.parseFloat(sc.nextLine());

        float BRITISH_POUND=1.36f;

        float USDolars=britishPounds*BRITISH_POUND;

        System.out.printf("%.3f", USDolars);
    }
}
