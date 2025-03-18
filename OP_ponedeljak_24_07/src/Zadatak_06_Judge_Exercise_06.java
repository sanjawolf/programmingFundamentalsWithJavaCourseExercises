import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_06_Judge_Exercise_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        Pattern regex=Pattern.compile("[a-z][a-z\\-\\._]*[a-z]@[a-z][a-z\\-]*[a-z](\\.[a-z][a-z\\-]*[a-z])+\\1*");

        Matcher matcher=regex.matcher(text);

        while(matcher.find()){

            String email= matcher.group();
            System.out.println(email);
        }
    }
}
