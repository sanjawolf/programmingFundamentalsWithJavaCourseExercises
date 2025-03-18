import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pattern regex = Pattern.compile("([#$%&*])(?<name>[a-zA-Z]+)\\1=(?<length>[0-9]+)!!(?<geohashcode>.+)");

        while (true) {

            String input = sc.nextLine();

            Matcher matcher = regex.matcher(input);

            if (matcher.find()) {

                String name = matcher.group("name");

                int length = Integer.parseInt(matcher.group("length"));

                String geohashcode= matcher.group("geohashcode");

                if (geohashcode.length() == length) {

                    StringBuilder sb=new StringBuilder();

                    for(int i=0; i<geohashcode.length(); i++){

                        char character=geohashcode.charAt(i);

                        int ascii=(int)character+length;

                        sb.append((char) ascii);
                    }

                    System.out.printf("Coordinates found! %s -> %s\n", name, sb.toString());
                    return;
                }

                else{

                    System.out.println("Nothing found!");

                }

            } else {

                System.out.println("Nothing found!");

            }


        }


    }

}

