import java.util.Scanner;

public class Zadatak_07_Methods_Lab_07 {

    public static String repeatString(String text, int n){

        String empty="";

        for(int i=1; i<=n; i++){

            empty+=text;
        }

        return empty;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String string=sc.nextLine();

        int n=Integer.parseInt(sc.nextLine());

        String repeatedString=repeatString(string, n);

        System.out.println(repeatedString);
    }
}
