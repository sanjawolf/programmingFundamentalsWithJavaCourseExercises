import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_05_Exercise_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Pattern regex= Pattern.compile("%(?<name>[A-Z][a-z]+)%[^\\|\\$%\\.]*<(?<product>\\w+)>[^\\|\\$%\\.]*\\|(?<quantity>\\d+)\\|[^\\|\\$%\\.]*?(?<price>\\d+\\.*\\d*)\\$");

        double sum=0;

        while(true){

            String text=sc.nextLine();

            if(text.equals("end of shift")) break;

            Matcher matcher= regex.matcher(text);

            if(matcher.find()){

                String name= matcher.group("name");
                String product=matcher.group("product");
                int quantity=Integer.parseInt(matcher.group("quantity"));
                double price=Double.parseDouble(matcher.group("price"));

                double totalPrice=quantity*price;

                System.out.printf("%s: %s - %.2f\n", name, product, totalPrice);

                sum+=totalPrice;
            }

        }

        System.out.printf("Total income: %.2f", sum);

    }
}
