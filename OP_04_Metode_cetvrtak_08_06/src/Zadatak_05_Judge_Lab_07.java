import java.util.Scanner;

public class Zadatak_05_Judge_Lab_07 {

    public static String  repeatStringNTimes(String repeatedString, int n){

        String string= "";

        for(int i=1; i<=n; i++){

            string+=repeatedString;
        }

        return string;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String string=sc.nextLine();

        int n=Integer.parseInt(sc.nextLine());

        String wholeString=repeatStringNTimes(string, n);

        System.out.printf("%s", wholeString);

    }
}
