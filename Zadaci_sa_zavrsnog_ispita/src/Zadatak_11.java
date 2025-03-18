import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_11 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        Pattern regex=Pattern.compile("(.+)>(?<numbers>\\d{3})\\|(?<lower>[a-z]{3})\\|(?<upper>[A-Z]{3})\\|(?<symbols>[^><]{3})<\\1");

        for(int i=1; i<=n; i++){

            String input=sc.nextLine();

            Matcher matcher= regex.matcher(input);

            String encrypted="";

            if(matcher.find()){

                String numbers= matcher.group("numbers");
                String lower=matcher.group("lower");
                String upper=matcher.group("upper");
                String symbols=matcher.group("symbols");

                encrypted+=numbers+lower+upper+symbols;

                System.out.printf("Password: %s\n", encrypted);


            }

            else{

                System.out.println("Try another password!");
            }
        }


    }
}
