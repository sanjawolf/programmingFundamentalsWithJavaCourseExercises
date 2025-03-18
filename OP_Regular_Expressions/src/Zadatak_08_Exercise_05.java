import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_08_Exercise_05 {

    public static void takeNeeded(String s){

        Pattern pattern1=Pattern.compile("[^\\d\\+\\*\\/\\.-]");
        Matcher matcher= pattern1.matcher(s);

        int health=0;

        while(matcher.find()){

            String match= matcher.group();

            char character=match.charAt(0);
            int charValue=(int) character;

            health+=charValue;

        }

        Pattern pattern2=Pattern.compile("[\\+-]*\\d+\\.*\\d*");
        Matcher matcher2= pattern2.matcher(s);

        double damage=0;

        while (matcher2.find()){

            damage+=Double.parseDouble(matcher2.group());
        }

        int asterixNumber=0;
        int hiffenNumber=0;

        for(char c: s.toCharArray()){

            if(c=='*') asterixNumber++;
            if(c=='/') hiffenNumber++;
        }

        double asterix=Math.pow(2, asterixNumber);
        double hiffen=1/Math.pow(2, hiffenNumber);

        damage*=asterix*hiffen;

        System.out.printf("%s - %d health, %.2f damage\n", s, health, damage);

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split("\\s*,\\s*");

        for(String s: parts){

            takeNeeded(s);
        }
    }
}
