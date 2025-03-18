import java.util.Scanner;

public class Zadatak_01_03_31 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        StringBuilder sb=new StringBuilder();

        String charact="";

        for(int i=0; i<text.length(); i++){

            char character=text.charAt(i);

            if(character!='.'){

                if(character>='a' && character<='z'){

                    charact=(character+"").toUpperCase();
                    sb.append(charact);
                }

                else if(character>='A' && character<='Z'){

                    charact=(character+"").toLowerCase();
                    sb.append(charact);
                }

                else{

                    sb.append(character);
                }
            }
        }


        System.out.println(sb);





    }
}
