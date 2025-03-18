import java.util.Scanner;

public class Zadatak_18_Methods_Exercise_06 {

    public static void printMiddleCharacter(String string){

        int n=string.length();

        if(n%2==0){

            System.out.printf("%c%c", string.charAt(n/2-1), string.charAt(n/2));
        }

        else{

            System.out.printf("%c", string.charAt(n/2));
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String string=sc.nextLine();

        printMiddleCharacter(string);
    }
}
