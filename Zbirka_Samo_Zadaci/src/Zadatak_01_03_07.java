import java.util.Scanner;

public class Zadatak_01_03_07 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite redom brojeve x i n: ");

        String text=sc.nextLine();

        String [] numbers=text.split(" ");

        double x=Double.parseDouble(numbers[0]);

        int n=Integer.parseInt(numbers[1]);

        double product=1;

        if(n<0){

            for (int i = 1; i <= -n; i++) {

                product*=x;
            }

            product=1/product;
        }

        else{

            for (int i = 1; i <= n; i++) {

                product *= x;
            }



        }

        System.out.printf("Rezultat: %.3f", product);
    }
}
