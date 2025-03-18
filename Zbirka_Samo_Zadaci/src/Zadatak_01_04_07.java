import java.util.Scanner;

public class Zadatak_01_04_07 {

    public static int prebrojavanje(float x){

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite brojeve: ");

        String text=sc.nextLine();

        String [] numbers=text.split(" ");

        int sum=0;

        for(int i=0; i<numbers.length-1; i++){

            float number=Float.parseFloat(numbers[i]);

            if(number==x){

                sum+=1;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj x: ");

        float x=Float.parseFloat(sc.nextLine());

        int brojPoj=prebrojavanje(x);

        System.out.printf("Broj pojavljivanja broja %.2f: %d", x, brojPoj);
    }
}
