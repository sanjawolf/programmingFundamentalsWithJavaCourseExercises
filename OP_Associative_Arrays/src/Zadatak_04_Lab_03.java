import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_04_Lab_03 {


    public static void addOdd(LinkedHashMap<String, Integer> keyValuePairs, ArrayList<String> list){

        for(Map.Entry<String, Integer> entry: keyValuePairs.entrySet()){

                if(entry.getValue()%2==1){

                    list.add(entry.getKey());
                }
        }
    }

    public static void printOdd(ArrayList<String> list){

        for(int i=0; i<list.size(); i++){

            if(i!=list.size()-1) System.out.printf("%s, ", list.get(i));
            else System.out.printf("%s", list.get(i));
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String  text=sc.nextLine();

        String [] parts=text.split(" ");

        ArrayList<String> list=new ArrayList<>();

        for(int i=0; i< parts.length; i++){

            list.add(parts[i]);
        }

        LinkedHashMap<String, Integer> keyValuePairs=new LinkedHashMap<>();

        for(String s: list){

            String lowerCase=s.toLowerCase();

            if(!keyValuePairs.containsKey(lowerCase)){

                keyValuePairs.put(lowerCase, 1);
            }

            else{

                int currentNumberOfRepeating=keyValuePairs.get(lowerCase);
                keyValuePairs.put(lowerCase,currentNumberOfRepeating+1);
            }
        }

        ArrayList<String> odd=new ArrayList<>();

        addOdd(keyValuePairs, odd);

        printOdd(odd);
    }
}
