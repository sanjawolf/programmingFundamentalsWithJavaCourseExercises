import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Arriving_In_Kathmandu_Problem {

    public static String filterPeak(String s){

        StringBuilder sb=new StringBuilder();

        for(int i=0; i<s.length(); i++){

            char character=s.charAt(i);

            if(Character.isLetter(character)){

                sb.append(character);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Pattern regex=Pattern.compile("^(?<peak>[A-Za-z0-9!?@#$]+)=(?<length>[0-9]+)<<(?<geohashcode>.+)$");

        while(true){

            String line=sc.nextLine();

            if(line.equals("Last note")) break;

            Matcher matcher= regex.matcher(line);

            if(matcher.find()){

                String peak= matcher.group("peak");
                int length=Integer.parseInt(matcher.group("length"));
                String geohashcode= matcher.group("geohashcode");

                if(length==geohashcode.length()){

                    peak=filterPeak(peak);
                    System.out.printf("Coordinates found! %s -> %s\n", peak, geohashcode);
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
