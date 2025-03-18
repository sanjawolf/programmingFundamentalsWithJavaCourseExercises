import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_03_Lab_03 {

    public static void write(LinkedHashMap<String, Integer> oddOccurences){

        ArrayList<String> odd=new ArrayList<>();

        for(Map.Entry<String, Integer> entry: oddOccurences.entrySet()){

            String word= entry.getKey();
            int occurence= entry.getValue();

            if(occurence%2!=0){

                odd.add(word);
            }

        }

        for(int i=0; i<odd.size(); i++){

            if(i!=odd.size()-1) System.out.printf("%s, ", odd.get(i));
            else System.out.printf("%s", odd.get(i));
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split(" ");

        LinkedHashMap<String, Integer> oddOccurences=new LinkedHashMap<>();

        for(int i=0; i<parts.length; i++){

            String lowercase=parts[i].toLowerCase();

            if(!oddOccurences.containsKey(lowercase)){

                oddOccurences.put(lowercase, 1);
            }

            else{

                int currentOccurence= oddOccurences.get(lowercase);
                oddOccurences.put(lowercase, currentOccurence+1);
            }
        }

        write(oddOccurences);
    }
}
