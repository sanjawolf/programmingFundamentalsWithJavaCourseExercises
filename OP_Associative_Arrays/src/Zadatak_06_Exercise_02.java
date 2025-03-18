import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_06_Exercise_02 {

    public static void printQuantities(LinkedHashMap<String, Integer> keyValuePairs){

        for(Map.Entry<String, Integer> entry: keyValuePairs.entrySet()){

            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, Integer> resourceQuantity=new LinkedHashMap<>();

        ArrayList<String> list=new ArrayList<>();

        while(true){

            String text=sc.nextLine();

            if(text.equals("stop")) break;

            list.add(text);

        }

        for(int i=0; i<list.size(); i=i+2){

            int quantity=Integer.parseInt(list.get(i+1));

            if(!resourceQuantity.containsKey(list.get(i))){

                resourceQuantity.put(list.get(i), quantity);
            }

            else{

                int currentQuantity=resourceQuantity.get(list.get(i));
                resourceQuantity.put(list.get(i), currentQuantity+quantity);
            }
        }

        printQuantities(resourceQuantity);
    }
}
