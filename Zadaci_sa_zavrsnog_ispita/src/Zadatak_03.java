import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, Integer> foodQuantity=new LinkedHashMap<>();

        int sum=0;

        while(true){

            String command=sc.nextLine();

            if(command.equals("Complete")) break;

            String [] parts=command.split(" ");

            int quantity=Integer.parseInt(parts[1]);

            String food=parts[2];

            if(parts[0].equals("Receive")){

                if(quantity>0){

                    if(!foodQuantity.containsKey(food)){

                        foodQuantity.put(food, quantity);
                    }

                    else{

                        int currentQuantity=foodQuantity.get(food);

                        foodQuantity.put(food, quantity+currentQuantity);
                    }
                }
            }

            if(parts[0].equals("Sell")){

                if(!foodQuantity.containsKey(food)){

                    System.out.printf("You do not have any %s.\n", food);
                }

                else{

                    int currentQuantity=foodQuantity.get(food);

                   if(currentQuantity<quantity){

                       System.out.printf("There aren't enough %s. You sold the last %d of them.\n", food, currentQuantity);

                       sum+=currentQuantity;

                       currentQuantity=0;

                       foodQuantity.put(food, currentQuantity);

                       foodQuantity.remove(food);
                   }

                   else{

                       currentQuantity-=quantity;

                       System.out.printf("You sold %d %s.\n", quantity, food);

                       foodQuantity.put(food, currentQuantity);

                       sum+=quantity;

                       if(currentQuantity==0) foodQuantity.remove(food);
                   }


                }
            }


        }


        for(Map.Entry<String, Integer> entry: foodQuantity.entrySet()){

            String food=entry.getKey();
            int quantity=entry.getValue();

            System.out.printf("%s: %d\n", food, quantity);
        }

        System.out.printf("All sold: %d goods\n", sum);
    }
}
