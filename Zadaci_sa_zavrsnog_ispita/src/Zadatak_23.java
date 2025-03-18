import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.SimpleTimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_23 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String [] parts=sc.nextLine().split("\\s+");

        Pattern regex=Pattern.compile("([@#])(?<prvarec>[a-zA-Z]{3,})\\1\\1(?<drugarec>[a-zA-Z]{3,})\\1");

        ArrayList<StringBuilder> list=new ArrayList<>();

        int counter=0;

        for(String part: parts){

            Matcher matcher= regex.matcher(part);

            while(matcher.find()){

                counter++;
                String prva= matcher.group("prvarec");
                String druga= matcher.group("drugarec");

                StringBuilder sb=new StringBuilder(prva);

                if(sb.reverse().toString().equals(druga)){

                    list.add(sb.reverse());
                }
            }
        }

        if(counter!=0) System.out.printf("%d word pairs found!\n", counter);
        else System.out.println("No word pairs found!");

        if(list.size()!=0){

            System.out.println("The mirror words are:");

            for(StringBuilder el: list){

                if(list.indexOf(el)!=list.size()-1) System.out.printf("%s <=> %s, ", el.toString(), el.reverse().toString());
                else System.out.printf("%s <=> %s\n", el.toString(), el.reverse().toString());
            }
        }

        else System.out.println("No mirror words!");




    }
}
