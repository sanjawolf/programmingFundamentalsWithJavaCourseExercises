import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadatak_05_Judge_Exercise_02 {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String names=sc.nextLine();

        while(true){

            String alphanumericCharacters=sc.nextLine();

            if(alphanumericCharacters.equals("end of race")) break;

            String [] parts=names.split(", ");

            Pattern regex=Pattern.compile("\\w+");

            Matcher matcher=regex.matcher(alphanumericCharacters);

            while(matcher.find()){

                String name=matcher.group();

                System.out.printf("%s\n", name);
            }


            Pattern regex1=Pattern.compile("[0-9]+");

            Matcher matcher1=regex1.matcher(alphanumericCharacters);

            while(matcher1.find()){

                String numbers=matcher1.group();

                System.out.printf("%s", numbers);
            }

//            for(int i=0; i<parts.length; i++){
//
//                Matcher matcher1=regex1.matcher(parts[i]);
//
//                if(matcher1.find()){
//
//                    String name=matcher1.group();
//                }
//
//                Matcher matcher2=regex1.matcher(parts[i]);
//
//                if(matcher2.find()){
//
//                    String numbers=matcher2.group();
//                }
//            }
        }
    }
}
