import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Message_Decrypter_Problem {

//    public static String filterNumbers(String s){
//
//        StringBuilder sb=new StringBuilder();
//
//        for(int i=0; i<s.length(); i++){
//
//            int character=s.charAt(i);
//
//            if(Character.isDigit(character)){
//
//                char ascii=(char)character;
//                sb.append(ascii);
//            }
//        }
//
//        System.out.printf("%s", sb.toString());
//        System.out.println();
//
//        return "";
//    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        Pattern regex=Pattern.compile("^([$%])(?<tag>[A-Z][a-z]{2,})\\1: (?<number>\\[[0-9]+\\]\\|\\[[0-9]+\\]\\|\\[[0-9]+\\]\\|)$");

        for(int i=1; i<=n; i++){

            String input=sc.nextLine();

            Matcher matcher=regex.matcher(input);

            if(matcher.find()){

                String tag= matcher.group("tag");
                String number=matcher.group("number");

                String [] parts=number.split("[\\]\\|\\[]+");

                System.out.printf("%s: ", tag);

                for(int j=1; j<parts.length; j++){

                   if(j!=parts.length-1) System.out.printf("%s", (char)Integer.parseInt(parts[j]));
                   else System.out.printf("%s\n", (char)Integer.parseInt(parts[j]));
                }



            }

            else{

                System.out.println("Valid message not found!");
            }

        }
    }
}
