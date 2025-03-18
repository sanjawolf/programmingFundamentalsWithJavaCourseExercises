import java.util.Scanner;

public class Zadatak_10_Exercise_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        StringBuilder sb=new StringBuilder();

        String before="";

        for(int i=0; i<text.length(); i++){

            String current=text.charAt(i)+"";

            if(!current.equals(before)) sb.append(current);

            before=current;

//            String doublet=String.format("%s%s", character, character);
//
//            while(text.contains(doublet)){
//
//                text=text.replace(doublet, character);
//            }
        }

        System.out.println(sb);

//        System.out.println(text);
    }
}
