import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_05_Exercise_01 {

    public static void printRepeatings(LinkedHashMap<Character, Integer> keyValuePairs){

        for(Map.Entry<Character, Integer> entry: keyValuePairs.entrySet()){

            System.out.printf("%c -> %d\n", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        LinkedHashMap<Character, Integer> characterRepeatings=new LinkedHashMap<>();

        for(int i=0; i<text.length(); i++){

            if(text.charAt(i)!=' '){

                if(!characterRepeatings.containsKey(text.charAt(i))){

                    characterRepeatings.put(text.charAt(i), 1);
                }

                else{

                    int currentRepeatings=characterRepeatings.get(text.charAt(i));
                    characterRepeatings.put(text.charAt(i), currentRepeatings+1);
                }
            }


        }

        printRepeatings(characterRepeatings);
    }
}
