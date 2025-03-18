import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_08_Exercise_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        Pattern regex=Pattern.compile("[a-z0-9-_\\.]+@[a-z-]+\\.[a-z-]+\\.*?[a-z-]+");

        Matcher matcher= regex.matcher(text);

        while(matcher.find()){

            System.out.println(matcher.group());
        }
    }
}
