import java.util.Scanner;

public class Zadatak_01_03_46 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite brojeve x i a: ");

        String text=sc.nextLine();

        String [] numbers=text.split(" ");

        double x=Double.parseDouble(numbers[0]);

        double a=Double.parseDouble(numbers[1]);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0){

            System.out.println("Greska: neispravan unos.");
        }

        else{

            double sum=x;

            for(int i=1; i<=n; i++){

                sum=Math.pow(sum+a, 2);

            }

            System.out.printf("Izraz=%.6f", sum);

        }
    }
}
