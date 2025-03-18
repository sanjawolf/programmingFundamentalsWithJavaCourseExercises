import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_26 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n= Integer.parseInt(sc.nextLine());

        Pattern regex=Pattern.compile("U\\$(?<username>[A-Z][a-z]{2,})U\\$P@\\$(?<password>[a-z]{5,}[0-9]+)P@\\$");

        int count=0;

        for(int i=1; i<=n; i++){

            String input=sc.nextLine();

            Matcher matcher=regex.matcher(input);

            if(matcher.find()){

                String username= matcher.group("username");
                String password=matcher.group("password");

                System.out.println("Registration was successful");
                System.out.printf("Username: %s, Password: %s\n", username, password);

                count++;
            }

            else{

                System.out.println("Invalid username or password");
            }
        }

        System.out.printf("Successful registrations: %d\n", count);
    }
}
