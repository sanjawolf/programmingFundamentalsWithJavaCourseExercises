import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Arriving_In_Kathmandu_Problem {

    public static String filterLetters(String peak){

        StringBuilder sb=new StringBuilder();

        for(int i=0; i<peak.length(); i++){

            char character=peak.charAt(i);

            if(Character.isLetter(character)){

                sb.append(character);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Pattern regex= Pattern.compile("^(?<peak>[A-Za-z0-9!?@#$]+)=(?<geohashcodelength>[0-9]+)<<(?<geohashcode>.+)$");

        while(true){

            String message=sc.nextLine();

            if(message.equals("Last note")) break;

            Matcher matcher= regex.matcher(message);

            if(matcher.find()){

                String peak=matcher.group("peak");

                int length=Integer.parseInt(matcher.group("geohashcodelength"));

                String geohashcode=matcher.group("geohashcode");

                if(length==geohashcode.length()){

                    String letters=filterLetters(peak);
                    System.out.printf("Coordinates found! %s -> %s\n", letters, geohashcode);
                }

                else{

                    System.out.println("Nothing found!" );
                }
            }

            else{

                System.out.println("Nothing found!" );
            }
        }
    }
}
