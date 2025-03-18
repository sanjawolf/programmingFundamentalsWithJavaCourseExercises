import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_02_Judge_Lab_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String unos=sc.nextLine();

        Pattern regex=Pattern.compile("\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b");
        Matcher matcher= regex.matcher(unos);

        ArrayList<String> phonenumbers=new ArrayList<>();

        while(matcher.find()){

            String rez=matcher.group();
            phonenumbers.add(rez);
        }

        String join=String.join(", ", phonenumbers);
        System.out.println(join);
    }
}
