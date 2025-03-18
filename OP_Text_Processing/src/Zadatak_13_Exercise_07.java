import java.util.Scanner;

public class Zadatak_13_Exercise_07 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        StringBuilder sb=new StringBuilder();

        for(int i=0; i<text.length(); i++){

            char character=text.charAt(i);

            sb.append(character);

            if(character=='>'){

                int charFromWhichWeDelete=i+1;

                int howMuchCharactersWeDelete=Integer.parseInt(text.charAt(charFromWhichWeDelete)+"");

                int j;

                for(j=charFromWhichWeDelete; j<charFromWhichWeDelete+howMuchCharactersWeDelete; j++){

                    if(j>=text.length()) break;

                    char character1=text.charAt(j);

                    if(character1=='>'){

                        sb.append('>');
                        j++;
                        howMuchCharactersWeDelete+=Integer.parseInt(text.charAt(j)+"")+1;
                    }
                }

                i=j-1;
            }
        }

        System.out.println(sb);
    }
}
