import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mirror_Words_Problem {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String input=sc.nextLine();

        String[] parts=input.split("\\s+");

        Pattern regex=Pattern.compile("([@#])(?<word1>[A-Za-z]{3,})\\1\\1(?<word2>[A-Za-z]{3,})\\1");

        ArrayList<StringBuilder> list=new ArrayList<>();

        int numberOfWordsPairs=0;

        for(String part: parts){

            Matcher matcher= regex.matcher(part);

            while(matcher.find()){

                String word1= matcher.group("word1");

                String word2= matcher.group("word2");

                StringBuilder sb=new StringBuilder(word2);

                sb.reverse();

                word2=sb.toString();

                if(word1.equals(word2)){

                    list.add(sb);
                }

                numberOfWordsPairs++;
            }

        }
        if(numberOfWordsPairs!=0) System.out.printf("%d word pairs found!\n", numberOfWordsPairs);
        else System.out.println("No word pairs found!");



        if(list.size()!=0) {

            System.out.println("The mirror words are:");

            for (StringBuilder sb : list) {

                if (list.indexOf(sb) != list.size() - 1)
                    System.out.printf("%s <=> %s, ", sb.toString(), sb.reverse().toString());
                else System.out.printf("%s <=> %s\n", sb.toString(), sb.reverse().toString());
            }

        }

        else{

            System.out.println("No mirror words!");
        }


    }
}
