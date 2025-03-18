import java.util.LinkedHashMap;
import java.util.Scanner;

public class Zadatak_07_Exercise_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, double[]> productDescription=new LinkedHashMap<>();

        while (true){

            String text=sc.nextLine();

            if(text.equals("buy")) break;

            String [] parts=text.split(" ");

            double price=Double.parseDouble(parts[1]);

            double quantity=Double.parseDouble(parts[2]);

            if(!productDescription.containsKey(parts[0])){

                productDescription.put(parts[0], new double[]{0, 0});
            }

            double currentQuantity=productDescription.get(parts[0])[1];
            productDescription.put(parts[0], new double[]{price, quantity + currentQuantity});
        }

        productDescription.entrySet()
                .stream()
                .forEach(e -> System.out.printf("%s -> %.2f\n", e.getKey(), e.getValue()[0]*e.getValue()[1]));

    }
}
