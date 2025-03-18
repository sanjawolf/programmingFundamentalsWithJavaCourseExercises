import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_06_Judge_Exercise_01 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split(", ");

        int n=parts.length;

        for(int i=0; i<n; i++){

            boolean containingCharacters=true;

            if(parts[i].length()>=3 && parts[i].length()<=16){

                for(int j=0; j<parts[i].length(); j++){

                    char character=parts[i].charAt(j);

                    if(!Character.isLetter(character) && !Character.isDigit(character) && !(character+"").equals("-") && !(character+"").equals("_")){

                        containingCharacters=false;
                        break;

                    }
                }

                if(containingCharacters){

                    System.out.println(parts[i]);
                }


            }






        }

    }
}
