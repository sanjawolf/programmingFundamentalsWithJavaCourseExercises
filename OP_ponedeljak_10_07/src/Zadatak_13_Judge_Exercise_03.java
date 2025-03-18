import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_13_Judge_Exercise_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, Double[]> quantities=new LinkedHashMap<>();

        while(true){

            String line=sc.nextLine();

            if(line.equals("buy")) break;

            String [] parts=line.split(" ");

            double price=Double.parseDouble(parts[1]);

            double quantity=Double.parseDouble(parts[2]);

            if(!quantities.containsKey(parts[0])){

                quantities.put(parts[0], new Double[]{price, quantity});
            }

            else{

                double currentQuantity=quantities.get(parts[0])[1];
                quantities.put(parts[0], new Double[]{price, currentQuantity+quantity});
            }


        }

        for(Map.Entry<String,Double[]> entry: quantities.entrySet()){

            System.out.printf("%s -> %.2f\n", entry.getKey(), entry.getValue()[0]*entry.getValue()[1]);
        }


    }
}
