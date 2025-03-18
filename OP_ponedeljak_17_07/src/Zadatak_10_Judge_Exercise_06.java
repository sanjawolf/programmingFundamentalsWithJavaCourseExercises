import java.util.Scanner;

public class Zadatak_10_Judge_Exercise_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        StringBuilder sb=new StringBuilder();

        String following="";

        for(int i=0; i<text.length(); i++){

            String current=text.charAt(i)+"";

            if(!current.equals(following)){

                sb.append(current);

            }

            following=current;
        }

        System.out.println(sb);
    }
}
