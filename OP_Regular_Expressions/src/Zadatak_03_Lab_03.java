import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_03_Lab_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();
        String regex="(?<day>\\d{2})([\\.\\/-])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})";

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(text);

        while(matcher.find()) System.out.printf("Day: %s, Month: %s, Year: %s\n", matcher.group("day"), matcher.group("month"), matcher.group("year"));
    }
}
