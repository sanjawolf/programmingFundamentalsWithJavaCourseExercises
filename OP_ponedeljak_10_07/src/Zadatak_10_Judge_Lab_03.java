import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_10_Judge_Lab_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String [] parts=sc.nextLine().split(" ");

        LinkedHashMap<String, Integer> countOfRepeating=new LinkedHashMap<>();

        for(String p: parts){

            String word=p.toLowerCase();

            if(!countOfRepeating.containsKey(word)){

                countOfRepeating.put(word, 1);

            }

            else{

                int currentNumberOfRepeatings=countOfRepeating.get(word);
                countOfRepeating.put(word, currentNumberOfRepeatings+1);
            }


        }

        ArrayList<String> repeatings=new ArrayList<>();

        for(Map.Entry<String, Integer> entry: countOfRepeating.entrySet()){

            if(entry.getValue()%2==1){

                repeatings.add(entry.getKey());

            }




            }

        for(int i=0; i<repeatings.size(); i++) {

            if (i != repeatings.size() - 1) {

                System.out.printf("%s, ", repeatings.get(i));
            } else {

                System.out.printf("%s", repeatings.get(i));
            }
        }




    }
}
