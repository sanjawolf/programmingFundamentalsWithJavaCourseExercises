import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Zadatak_01_Lab_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split(" ");

        ArrayList<Integer> numbers=new ArrayList<>();

        int n= parts.length;;

        for(int i=0; i<n; i++){

            numbers.add(Integer.parseInt(parts[i]));
//            System.out.printf("%d ", numbers.get(i));
        }

        TreeMap<Integer, Integer> numbersOccurences=new TreeMap<>();

        for(int i=0; i<numbers.size(); i++){

            if(!numbersOccurences.containsKey(numbers.get(i))){

                numbersOccurences.put(numbers.get(i), 1);
            }

            else{

                int occurences=numbersOccurences.get(numbers.get(i));

                numbersOccurences.put(numbers.get(i), occurences+1);
            }
        }

       for(Map.Entry<Integer, Integer> entry: numbersOccurences.entrySet()){

           int number= entry.getKey();
           int occurence= entry.getValue();

           System.out.printf("%d -> %d\n", number, occurence);

       }
    }
}
