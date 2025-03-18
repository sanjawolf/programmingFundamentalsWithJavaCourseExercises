import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Pattern regex= Pattern.compile("^(?<peak>[a-zA-Z0-9!@#$?]+)=(?<length>[0-9]+)<<(?<geohashcode>[^.,:]+)$");

        while(true){

            String message=sc.nextLine();

            if(message.equals("Last note")) break;

            Matcher matcher= regex.matcher(message);

            if(matcher.find()){

                String peak=matcher.group("peak");

                int length= Integer.parseInt(matcher.group("length"));

                String geohashcode=matcher.group("geohashcode");

                if(length==geohashcode.length()){

                    StringBuilder sb=new StringBuilder();

                    for(int i=0; i<peak.length(); i++){

                        char character=peak.charAt(i);

                        if(character>='a' && character<='z' || character>='A' && character<='Z' || character>='0' && character<='9'){

                            sb.append(character);
                        }
                    }

                    System.out.printf("Coordinates found! %s -> %s\n", sb.toString(), geohashcode);

                }

                else{

                    System.out.println("Nothing found!");
                }
            }

            else{

                System.out.println("Nothing found!");
            }


        }

//        while (true){
//            String text = sc.nextLine();
//            if (text.equals("Last note")) break;
//
//            Pattern pattern = Pattern.compile("\\b(?<name>[A-Za-z0-9!$#?@]+)=(?<lengthOfCode>[0-9]+)" +
//                    "<<(?<geohashcode>[^.,:]+)\\b");
//            Matcher matcher = pattern.matcher(text);
//
//            if (matcher.find()){
//                if (matcher.group("geohashcode").length() == Integer.parseInt(matcher.group("lengthOfCode"))){
//                    String nameAll = matcher.group("name");
//                    StringBuilder sb = new StringBuilder();
//
//                    for (int i = 0; i < nameAll.length(); i++) {
//                        char ch = nameAll.charAt(i);
//                        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9'){
//                            sb.append(ch);
//                        }
//                    }
//                    String name = sb.toString();
//                    System.out.printf("Coordinates found! %s -> %s\n", name, matcher.group("geohashcode"));
//                }
//                else {
//                    System.out.println("Nothing found!");
//                }
//            }else {
//                System.out.println("Nothing found!");
//            }
//        }
    }
}
