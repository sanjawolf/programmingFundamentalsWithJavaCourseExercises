import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_04_Exercise_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Pattern regex=Pattern.compile(">>(?<furniture>[A-Z]+[a-z]*)<<(?<price>\\d+\\.*\\d*)!(?<quantity>\\d+)");

        double sum=0;

        ArrayList<String > list=new ArrayList<>();

        while(true){

            String text=sc.nextLine();

            if(text.equals("Purchase")) break;

            Matcher matcher= regex.matcher(text);

            if(matcher.find()){

                sum+=Double.parseDouble(matcher.group("price"))*Integer.parseInt(matcher.group("quantity"));

                list.add(matcher.group("furniture"));
            }
        }

        System.out.println("Bought furniture:");

        for(String s: list) System.out.println(s);

        System.out.printf("Total money spend: %.2f", sum);
    }
}
