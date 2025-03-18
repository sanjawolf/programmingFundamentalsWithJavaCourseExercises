import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_08_Judge_Lab_02 {

    public static void writeSynonyms(ArrayList<String> listOfSynonyms){

        for(int i=0; i<listOfSynonyms.size(); i++){

            if(i!=listOfSynonyms.size()-1){

                System.out.printf("%s, ", listOfSynonyms.get(i));
            }

            else{

                System.out.printf("%s\n", listOfSynonyms.get(i));
            }
        }
    }

    public static void writeListOfSynonyms(LinkedHashMap<String, ArrayList<String>> listOfSynonyms){

        for(Map.Entry<String, ArrayList<String>> entry: listOfSynonyms.entrySet()){

            String word=entry.getKey();
            ArrayList<String> synonym=entry.getValue();
            System.out.printf("%s - ", word);
            writeSynonyms(synonym);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        LinkedHashMap<String, ArrayList<String>> listOfSynonyms=new LinkedHashMap<>();

        for(int i=1; i<=n; i++){

            String word=sc.nextLine();
            String synonym=sc.nextLine();

                if(!listOfSynonyms.containsKey(word)){

                    listOfSynonyms.put(word, new ArrayList<>());
                    listOfSynonyms.get(word).add(synonym);
                }

                else{

                    listOfSynonyms.get(word).add(synonym);
                }

        }

        writeListOfSynonyms(listOfSynonyms);
    }
}
