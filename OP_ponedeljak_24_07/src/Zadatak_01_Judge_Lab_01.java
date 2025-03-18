import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_01_Judge_Lab_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String unos=sc.nextLine();

        Pattern regex=Pattern.compile("\\b[A-Z][a-z]+ [A-Z][a-z]+\\b");
        Matcher matcher=regex.matcher(unos);

        while(matcher.find()){

            String rez=matcher.group();
            System.out.printf("%s ", rez);
        }
    }
}
