import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_04_Judge_Exercise_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Pattern regex=Pattern.compile("[\\>]{2}([A-Z]*[a-z]*)[\\<]{2}(\\d+\\.*\\d*)!(\\d+)");

        double totalPrice=0;

        ArrayList<String> furnitures=new ArrayList<>();

        while(true){

            String text=sc.nextLine();

            if(text.equals("Purchase")) break;
            Matcher matcher=regex.matcher(text);

            while(matcher.find()){

                String furniture=matcher.group(1);
                String price=matcher.group(2);
                String quantity=matcher.group(3);

                double priceNumber=Double.parseDouble(price);
                int quantityNumber=Integer.parseInt(quantity);

                double totalPriceCount=priceNumber*quantityNumber;

                totalPrice+=totalPriceCount;

                furnitures.add(furniture);
            }
        }

        System.out.println("Bought furniture:");

        for(String s: furnitures){

            System.out.printf("%s\n", s);
        }

        System.out.printf("Total money spend: %.2f", totalPrice);




    }
}
