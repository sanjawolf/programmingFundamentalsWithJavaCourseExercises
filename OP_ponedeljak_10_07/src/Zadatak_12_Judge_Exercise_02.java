import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_12_Judge_Exercise_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, Integer> quantities=new LinkedHashMap<>();

        while(true){

            String resource=sc.nextLine();

            if(resource.equals("stop")) break;
            int quantity=Integer.parseInt(sc.nextLine());

                if(!quantities.containsKey(resource)){

                    quantities.put(resource, quantity);
                }

                else{

                    int currentQuantities=quantities.get(resource);
                    quantities.put(resource, currentQuantities+quantity);
                }



        }




        for(Map.Entry<String, Integer> entry: quantities.entrySet()){

            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }


    }
}
