import java.util.Scanner;

public class Zadatak_01_04_09_c {

    public static float stepen(float x, int n){

        float proizvod=1;

        if(n>=0){

            for(int i=1; i<=n; i++){

                proizvod*=x;
            }

        }

        else{

            for(int i=1; i<=-n; i++){

                proizvod*=(1/x);
            }

        }

        return proizvod;

    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite redom brojeve x i n: ");

        String text=sc.nextLine();

        String [] numbers=text.split(" ");

        float x=Float.parseFloat(numbers[0]);

        int n=Integer.parseInt(numbers[1]);

        System.out.printf("Rezultat: %.3f", stepen(x, n));


    }
}
