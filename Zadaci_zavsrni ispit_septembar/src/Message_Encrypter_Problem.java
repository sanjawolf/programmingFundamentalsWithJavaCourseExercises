import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Message_Encrypter_Problem {

    public static void filterASCII(String s){

        for(int i=0; i<s.length(); i++){

            char character=s.charAt(i);

            if(Character.isLetter(character)){

                System.out.printf("%d ", (int) character);

            }
        }

        System.out.println();

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        Pattern regex=Pattern.compile("([*@])(?<tag>[A-Z][a-z]{2,})\\1: (?<letters>\\[[a-zA-Z]\\]\\|\\[[a-zA-Z]\\]\\|\\[[a-zA-Z]\\]\\|)$");

        for(int i=1; i<=n; i++){

            String input=sc.nextLine();

            Matcher matcher= regex.matcher(input);

            if(matcher.find()){

                String tag= matcher.group("tag");
                String letters= matcher.group("letters");

                System.out.printf("%s: ", tag);
                filterASCII(letters);
            }

            else{

                System.out.println("Valid message not found!");
            }

        }

    }
}
