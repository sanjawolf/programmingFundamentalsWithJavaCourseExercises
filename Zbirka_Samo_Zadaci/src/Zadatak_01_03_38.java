import java.util.Scanner;

public class Zadatak_01_03_38 {

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

            double sum=0;

            for(int i=0; i<=n; i++){

                sum+=1/(Math.pow(x, i));

            }

            System.out.printf("P=%.6f", sum);

        }
    }
}
