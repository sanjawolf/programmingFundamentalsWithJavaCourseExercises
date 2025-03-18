import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Encrypting_Password_Problem {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Pattern regex=Pattern.compile("(.+)>(?<numbers>[0-9]{3})\\|(?<lowercase>[a-z]{3})\\|(?<uppercase>[A-Z]{3})\\|(?<symbols>[^<>]{3})<\\1");

        int n=Integer.parseInt(sc.nextLine());

        for(int i=1; i<=n; i++){

            String password=sc.nextLine();

            Matcher matcher=regex.matcher(password);

            if(matcher.find()){

                String numbers=matcher.group("numbers");
                String lowercase=matcher.group("lowercase");
                String uppercase=matcher.group("uppercase");
                String symbols=matcher.group("symbols");

                System.out.printf("Password: %s\n", numbers+lowercase+uppercase+symbols);
            }

            else{

                System.out.println("Try another password!");
            }


        }
    }
}
