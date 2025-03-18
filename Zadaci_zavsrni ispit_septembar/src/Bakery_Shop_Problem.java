import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Bakery_Shop_Problem {

    public static void print(LinkedHashMap<String, Integer> map){

        for(Map.Entry<String, Integer> entry: map.entrySet()){

            String food=entry.getKey();
            int quantity= entry.getValue();

            System.out.printf("%s: %d\n", food, quantity);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, Integer> foodQuantity=new LinkedHashMap<>();

        int allSold=0;

        while(true){

            String command=sc.nextLine();

            if(command.equals("Complete")) break;

            String [] commandParts=command.split(" ");

            String firstCommand=commandParts[0];

            if(firstCommand.equals("Receive")){

                String food=commandParts[2];

                int quantity=Integer.parseInt(commandParts[1]);

                if(quantity>0){

                    if(!foodQuantity.containsKey(food)){

                        foodQuantity.put(food, quantity);
                    }

                    else{

                        int currentQuantity=foodQuantity.get(food);
                        foodQuantity.put(food, currentQuantity+quantity);
                    }
                }

            }

            if(firstCommand.equals("Sell")){

                String food=commandParts[2];

                int quantity=Integer.parseInt(commandParts[1]);

                if(!foodQuantity.containsKey(food)){

                    System.out.printf("You do not have any %s.\n", food);
                }

                else{

                    if(foodQuantity.get(food)<quantity){

                        int sold=foodQuantity.get(food);
                        foodQuantity.put(food, foodQuantity.get(food)-sold);
                        foodQuantity.remove(food);
                        System.out.printf("There aren't enough %s. You sold the last %d of them.\n", food, sold);
                        allSold+=sold;
                    }

                    else{

                        int currentQuantity=foodQuantity.get(food);
                        foodQuantity.put(food, currentQuantity-quantity);
                        System.out.printf("You sold %d %s.\n", quantity, food);
                        allSold+=quantity;
                        if(foodQuantity.get(food)==0) foodQuantity.remove(food);
                    }
                }
            }
        }

        print(foodQuantity);
        System.out.printf("All sold: %d goods\n", allSold);
    }
}
