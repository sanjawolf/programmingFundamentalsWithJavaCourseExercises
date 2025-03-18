import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Easter_Eggs_Problem {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        Pattern regex=Pattern.compile("[@#]+(?<color>[a-z]{3,})[@#]+[^A-Za-z0-9]*\\/+(?<amount>[0-9]+)\\/+");

        Matcher matcher= regex.matcher(text);

        while(matcher.find()){

            String color= matcher.group("color");

            int amount= Integer.parseInt(matcher.group("amount"));

            System.out.printf("You found %d %s eggs!\n", amount, color);

        }
    }
}
