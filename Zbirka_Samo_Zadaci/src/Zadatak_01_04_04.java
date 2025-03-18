import java.util.Scanner;

public class Zadatak_01_04_04 {

    public static int je_stepen(int x, int n){

        if(x==Math.pow(n, Math.log(x)/Math.log(n))){

            return (int)Math.log(x);
        }

        else {

            return -1;

        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite dva broja: ");

        String text=sc.nextLine();

        String [] numbers=text.split(" ");

        int number1=Integer.parseInt(numbers[0]);

        int number2=Integer.parseInt(numbers[1]);

        int izlozilac=je_stepen(number1, number2);

        if(izlozilac!=-1) System.out.printf("Jeste: %d=%d^%d", number1, number2, izlozilac);

        else System.out.printf("Broj %d nije stepen broja %d.", number1, number2);

    }
}
