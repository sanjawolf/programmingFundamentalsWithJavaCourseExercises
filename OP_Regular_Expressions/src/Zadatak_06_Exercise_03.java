import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_06_Exercise_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Pattern pattern=Pattern.compile("%(?<name>[A-Z][a-z]+)%[^|$%.]*?<(?<product>\\w+)>[^|$%.]*?\\|(?<quantity>[0-9]+)\\|[^|$%.]*?(?<price>[0-9\\.]+)\\$");

        double totalIncome=0;

        while(true){

            String text=sc.nextLine();

            if(text.equals("end of shift")) break;

            Matcher matcher=pattern.matcher(text);

            if(matcher.find()){

                String name= matcher.group("name");
                String product=matcher.group("product");
                int quantity=Integer.parseInt(matcher.group("quantity"));
                double price=Double.parseDouble(matcher.group("price"));
                double productsPrice=quantity*price;
                totalIncome+=productsPrice;
                System.out.printf("%s: %s - %.2f\n", name, product, productsPrice);

            }
        }

        System.out.printf("Total income: %.2f", totalIncome);
    }
}
