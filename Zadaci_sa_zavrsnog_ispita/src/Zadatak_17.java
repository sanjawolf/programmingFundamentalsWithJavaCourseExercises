import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_17 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n= Integer.parseInt(sc.nextLine());

        Pattern regex=Pattern.compile("([@*])(?<tag>[A-Z][a-z]{2,})\\1: \\[(?<number1>[a-zA-Z])\\]\\|\\[(?<number2>[a-zA-Z])\\]\\|\\[(?<number3>[a-zA-Z])\\]\\|$");

        for(int i=1; i<=n; i++){

            String input=sc.nextLine();

            Matcher matcher= regex.matcher(input);

            if(matcher.find()){

                String tag= matcher.group("tag");
                String number1= matcher.group("number1");
                String number2=matcher.group("number2");
                String number3=matcher.group("number3");

                System.out.printf("%s: %d %d %d\n", tag, (int) number1.charAt(0), (int) number2.charAt(0), (int) number3.charAt(0));
            }

            else{

                System.out.println("Valid message not found!");
            }
        }
    }
}
