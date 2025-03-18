import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_02_01_07 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite karakter: ");

        char c=sc.nextLine().charAt(0);

        int sum=0;

        ArrayList<Character> lista=new ArrayList<>();

        while(c!='*'){

            sum+=1;

            lista.add(c);

            System.out.print("Unesite karakter: ");

            c=sc.nextLine().charAt(0);
        }

        for(int i=sum-1; i>=0; i--){

            System.out.print(lista.get(i)+" ");
        }
    }
}
