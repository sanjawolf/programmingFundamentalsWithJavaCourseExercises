import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_02_Lab_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();
        String regex="\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b";

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(text);

        ArrayList<String> list=new ArrayList<>();

        while(matcher.find()){

            list.add(matcher.group());
        }

        System.out.println(String.join(", ", list));
    }
}
