import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.DoubleFunction;

public class Zadatak_02_Lab_02 {

    public static void printList(ArrayList<String> list){

        for(int i=0; i<list.size(); i++){

            if(i!=list.size()-1) System.out.printf("%s, ", list.get(i));
            else System.out.printf("%s\n", list.get(i));
        }
    }
    public  static void printMap(LinkedHashMap<String, ArrayList<String >> map){

        for(Map.Entry<String, ArrayList<String >> entry: map.entrySet()){

            ArrayList<String> list=entry.getValue();
            System.out.printf("%s - ", entry.getKey());
            printList(list);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        LinkedHashMap<String, ArrayList<String>> wordSynonymsPairs=new LinkedHashMap<>();

        for(int i=1; i<=n; i++){

            String word=sc.nextLine();
            String synonym=sc.nextLine();

            if(!wordSynonymsPairs.containsKey(word)){

                wordSynonymsPairs.put(word, new ArrayList<String>());
                wordSynonymsPairs.get(word).add(synonym);
            }

            else{

                wordSynonymsPairs.get(word).add(synonym);
            }

        }

        printMap(wordSynonymsPairs);
    }
}
