import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race_Problem {

    public static String increase(String s, int ascii){

        StringBuilder sb=new StringBuilder();

        for(int i=0; i<s.length(); i++){

            char character=s.charAt(i);

            char character1=(char)((int)character+ascii);

            sb.append(character1);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Pattern regex=Pattern.compile("([#$%*&])(?<name>[A-Za-z]+)\\1=(?<length>[0-9]+)!!(?<geohashcode>.+)");

        while(true){

            String input=sc.nextLine();

            Matcher matcher= regex.matcher(input);

            if(matcher.find()){

                String name= matcher.group("name");
                int length=Integer.parseInt(matcher.group("length"));
                String geohashcode=matcher.group("geohashcode");

                if(length==geohashcode.length()){

                    geohashcode=increase(geohashcode, length);
                    System.out.printf("Coordinates found! %s -> %s\n", name, geohashcode);
                    return;
                }

                else{

                    System.out.println("Nothing found!");
                }
            }

            else{

                System.out.println("Nothing found!");
            }
        }
    }
}
