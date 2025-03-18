import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_20 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n= Integer.parseInt(sc.nextLine());

        Pattern regex=Pattern.compile("!(?<command>[A-Z][a-z]{2,})!:\\[[A-Za-z]{8,}\\]");

        for(int i=1; i<=n; i++){

            String input=sc.nextLine();

            Matcher matcher=regex.matcher(input);

            if(matcher.find()){

                String [] parts=matcher.group().split("[\\[\\]]");

                System.out.printf("%s: ", matcher.group("command"));

                for(int j=0; j<parts[1].length(); j++){

                    System.out.printf("%d ", (int)parts[1].charAt(j));
                }

                System.out.println();

            }

            else{

                System.out.println("The message is invalid");
            }

        }
    }
}
