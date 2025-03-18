import java.util.LinkedHashMap;
import java.util.Scanner;

public class Zadatak_06_Exercise_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, Integer> resourceQuantity=new LinkedHashMap<>();

        while(true){

            String resource=sc.nextLine();

            if(resource.equals("stop")) break;

            int quantity=Integer.parseInt(sc.nextLine());

            if(!resourceQuantity.containsKey(resource)){

                resourceQuantity.put(resource, quantity);
            }

            else{

                int currentQuantity=resourceQuantity.get(resource);
                resourceQuantity.put(resource, currentQuantity+quantity);
            }


        }

        resourceQuantity.entrySet()
                .stream()
                .forEach(e -> System.out.printf("%s -> %d\n", e.getKey(), e.getValue()));
    }
}
