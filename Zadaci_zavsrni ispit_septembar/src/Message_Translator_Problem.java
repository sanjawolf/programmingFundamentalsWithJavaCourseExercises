import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Message_Translator_Problem {

    public static void filterASCII(String s){

        for(int i=0; i<s.length(); i++){

            char character=s.charAt(i);

            if(Character.isLetter(character)){

                if (i!=s.length()-1) System.out.printf("%d ", (int) character);
                else System.out.printf("%d\n", (int) character);
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        Pattern regex=Pattern.compile("!(?<command>[A-Z][a-z]{2,})!:\\[(?<letters>[a-zA-Z]{8,})\\]");

        for(int i=1; i<=n; i++){

            String input=sc.nextLine();

            Matcher matcher= regex.matcher(input);

            if(matcher.find()){

                String command= matcher.group("command");

                String letters=matcher.group("letters");

                System.out.printf("%s:", command);

                filterASCII(letters);
            }

            else {

                System.out.println("The message is invalid");

            }
        }
    }
}
