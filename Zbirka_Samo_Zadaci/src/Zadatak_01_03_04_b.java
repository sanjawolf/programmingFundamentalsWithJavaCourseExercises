import java.util.Scanner;

public class Zadatak_01_03_04_b {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite granice intervala: ");

        String text=sc.nextLine();

        String [] numbers=text.split(" ");

        int n=Integer.parseInt(numbers[0]);

        int m=Integer.parseInt(numbers[1]);

        if(n>m) System.out.println("Greska: pogresan unos granica.");

        for(int i=n; i<=m; i++){

            System.out.printf("%d ", i);
        }
    }
}
