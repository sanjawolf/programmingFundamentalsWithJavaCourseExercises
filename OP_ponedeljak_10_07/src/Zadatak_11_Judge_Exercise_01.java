import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_11_Judge_Exercise_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String string=sc.nextLine();

        LinkedHashMap<Character, Integer> numberOfCharacters=new LinkedHashMap<>();

        for(int i=0; i<string.length(); i++){

            char character=string.charAt(i);

            if(character!=' '){

                if(!numberOfCharacters.containsKey(character)){

                    numberOfCharacters.put(character, 1);

                }

                else{

                    int currentNumberOfCharacters=numberOfCharacters.get(character);
                    numberOfCharacters.put(character, currentNumberOfCharacters+1);
                }

            }


        }

        for(Map.Entry<Character, Integer> entry: numberOfCharacters.entrySet()){

            System.out.printf("%c -> %d\n", entry.getKey(), entry.getValue());
        }


    }
}
