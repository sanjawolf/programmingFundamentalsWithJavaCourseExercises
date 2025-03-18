import java.util.Scanner;

public class Zadatak_01_03_41 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite redom brojeve x i n: ");

        String text=sc.nextLine();

        String [] numbers=text.split(" ");

        double x=Double.parseDouble(numbers[0]);

        int n=Integer.parseInt(numbers[1]);

        if(n<=0 || x<0){

            System.out.println("Greska: neispravan unos.");
        }

        else{

            double product=1;

            for(int i=1; i<=n; i++){

                product*=(1+Math.cos(Math.pow(x, i)));

            }

            System.out.printf("P=%.6f", product);

        }
    }
}
