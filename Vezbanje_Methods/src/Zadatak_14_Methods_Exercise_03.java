import java.util.Scanner;

public class Zadatak_14_Methods_Exercise_03 {

    public static void printCharacterBetween(char one, char two){

        if(two<one){

            char help=two;
            two=one;
            one=help;
        }

        for(char i=(char)((int)one+1); i<two; i++) System.out.printf("%c ", i);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        char a=sc.nextLine().charAt(0);
        char b=sc.nextLine().charAt(0);

        printCharacterBetween(a, b);
    }
}
