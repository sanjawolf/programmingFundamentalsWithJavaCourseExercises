import java.util.Scanner;

public class Zadatak_06_Judge_Exercise_03 {

    public static void printInBetween(char a, char b){

        if(b<a){

            char pomocna=a;
            a=b;
            b=pomocna;
        }

        for(char i=(char)((int)a+1); i<b; i++){

            System.out.print(i+" ");
        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        char a=sc.nextLine().charAt(0);

        char b=sc.nextLine().charAt(0);

        printInBetween(a, b);



    }
}
