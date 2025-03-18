import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        Pattern regex=Pattern.compile("\\|(?<boss>[A-Z]{4,})\\|:#(?<title>[a-zA-z]+ [a-zA-z]+)#");

        for(int i=1; i<=n; i++){

            String line=sc.nextLine();

            Matcher matcher= regex.matcher(line);

            if(matcher.find()){

                String boss= matcher.group("boss");
                String title= matcher.group("title");

                System.out.printf("%s, The %s\n", boss, title);
                System.out.printf(">> Strength: %d\n", boss.length());
                System.out.printf(">> Armor: %d\n", title.length());

            }

            else{

                System.out.println("Access denied!");
            }

        }
    }
}
