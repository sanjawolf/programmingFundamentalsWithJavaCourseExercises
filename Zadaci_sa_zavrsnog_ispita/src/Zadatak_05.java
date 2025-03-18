import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        Pattern regex=Pattern.compile("[@#]+(?<color>[a-z]{3,})[@#]+[^\\w\\d]*[\\/]+(?<amount>\\d+)[\\/]+");

        Matcher matcher=regex.matcher(text);

        while(matcher.find()){

            String color= matcher.group("color");
            int amount=Integer.parseInt(matcher.group("amount"));
            System.out.printf("You found %d %s eggs!\n", amount, color);
        }

    }
}
