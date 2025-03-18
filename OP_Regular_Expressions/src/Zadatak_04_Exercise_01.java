import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_04_Exercise_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String regex=">>(?<furniture>[A-Z][A-Z]?[a-z]*)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)";

        Pattern pattern=Pattern.compile(regex);

        ArrayList<String> list=new ArrayList<>();

        double sum=0;

        while(true){

            String text=sc.nextLine();

            if(text.equals("Purchase")) break;

            Matcher matcher= pattern.matcher(text);

            if(matcher.find()){

                list.add(matcher.group("furniture"));
                String priceText=matcher.group("price");
                String quantityText=matcher.group("quantity");

                double price=Double.parseDouble(priceText);
                int quantity=Integer.parseInt(quantityText);

                sum+=quantity*price;
            }

        }

        System.out.println("Bought furniture:");

        for(String s: list) System.out.printf("%s\n", s);
        System.out.printf("Total money spend: %.2f", sum);

    }
}
