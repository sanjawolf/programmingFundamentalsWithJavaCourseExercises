import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Message_Decrypter_Problem {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        Pattern regex=Pattern.compile("^([$%])(?<tag>[A-Z][a-z]{2,})\\1: (?<numbers>\\[[0-9]+\\]\\|\\[[0-9]+\\]\\|\\[[0-9]+\\]\\|)$");

        for(int i=1; i<=n; i++){

            String input=sc.nextLine();

//            for(String part: parts) System.out.println(part);

            Matcher matcher= regex.matcher(input);

            if(matcher.find()){

                String tag= matcher.group("tag");

                String numbers= matcher.group("numbers");

                String [] parts=numbers.split("[\\]\\|\\[]+");

                System.out.printf("%s: ", tag);

                for(int j=1; j< parts.length; j++){

                    if(j!=parts.length-1) System.out.printf("%c", (char)Integer.parseInt(parts[j]));
                    else System.out.printf("%c\n", (char)Integer.parseInt(parts[j]));
                }
            }

            else{

                System.out.println("Valid message not found!");
            }
        }
    }
}
