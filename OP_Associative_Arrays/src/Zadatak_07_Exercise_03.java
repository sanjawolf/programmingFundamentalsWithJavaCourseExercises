import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_07_Exercise_03 {

    public static void printPrices(LinkedHashMap<String, double[]> keyValuePairs){

        for(Map.Entry<String, double[]> entry: keyValuePairs.entrySet()){

            System.out.printf("%s -> %.2f\n", entry.getKey(), entry.getValue()[0]*entry.getValue()[1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, double[]> productsPrices=new LinkedHashMap<>();

        while(true){

            String text=sc.nextLine();

            if(text.equals("buy")) break;

            String [] parts=text.split(" ");

            String product=parts[0];

            double price=Double.parseDouble(parts[1]);

            double quantity=Double.parseDouble(parts[2]);

            if(!productsPrices.containsKey(product)){

                productsPrices.put(product, new double[]{price, quantity});
            }

            else{

                double currentQuantity=productsPrices.get(product)[1];
                productsPrices.put(product, new double[]{price, quantity+currentQuantity});
            }

        }

        printPrices(productsPrices);
    }
}
