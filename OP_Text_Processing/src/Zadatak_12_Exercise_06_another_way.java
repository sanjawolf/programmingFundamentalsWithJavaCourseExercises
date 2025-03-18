import java.util.Scanner;

public class Zadatak_12_Exercise_06_another_way {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        StringBuilder sb=new StringBuilder();

        String before="";

        for(int i=0; i<text.length(); i++){

            String next=text.charAt(i)+"";

            if(!next.equals(before)){

                sb.append(next);
            }

            before=next;

        }

        System.out.println(sb);
    }
}
