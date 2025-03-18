import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_02_Lab_02 {

    public static void write(LinkedHashMap<String , ArrayList<String>> synonyms){

        for(Map.Entry<String, ArrayList<String>> entry: synonyms.entrySet()){

            String word= entry.getKey();
            ArrayList<String> synonym=entry.getValue();
            System.out.printf("%s - ", word);

            for(int i=0; i<synonym.size(); i++){

                if(i!=synonym.size()-1) System.out.printf("%s, ", synonym.get(i));
                else System.out.printf("%s", synonym.get(i));
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        LinkedHashMap<String, ArrayList<String>> synonyms=new LinkedHashMap<>();

        for(int i=1; i<=n; i++){

            String word=sc.nextLine();

            String synonym=sc.nextLine();

            if(!synonyms.containsKey(word)){

                synonyms.put(word, new ArrayList<>());
            }

            ArrayList<String> currentSynonym=synonyms.get(word);
            currentSynonym.add(synonym);


        }

        write(synonyms);
    }
}
