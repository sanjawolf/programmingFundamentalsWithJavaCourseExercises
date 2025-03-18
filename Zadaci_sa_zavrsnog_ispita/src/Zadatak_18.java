import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_18 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, Double> distributorMoney=new LinkedHashMap<>();
        LinkedHashMap<String, Double> clientMoney=new LinkedHashMap<>();

        while(true){

            String command=sc.nextLine();

            if(command.equals("End")) break;

            String [] parts=command.split(" ");

            String firstPart=parts[0];

            if(firstPart.equals("Deliver")){

                String distributorName=parts[1];
                double moneySpent= Double.parseDouble(parts[2]);

                if(!distributorMoney.containsKey(distributorName)){

                    distributorMoney.put(distributorName, 0.0);
                }

                double currentMoney=distributorMoney.get(distributorName);
                distributorMoney.put(distributorName, currentMoney+moneySpent);
            }

            if(firstPart.equals("Return")){

                String distributorName=parts[1];
                double moneyReturned= Double.parseDouble(parts[2]);

                if(distributorMoney.containsKey(distributorName)){

                    double currentMoney=distributorMoney.get(distributorName);

                    double difference=currentMoney-moneyReturned;

                    if(difference!=currentMoney)//                       moneyReturned!=0//
                         {

                        if(currentMoney>=moneyReturned){

                            distributorMoney.put(distributorName, difference);
                        }

                    }

                    else{

                        distributorMoney.remove(distributorName);
                    }


                }
            }

            if(firstPart.equals("Sell")){

                String clientName=parts[1];
                double moneyEarned= Double.parseDouble(parts[2]);

                if(!clientMoney.containsKey(clientName)){

                    clientMoney.put(clientName, 0.0);
                }

                double currentMoney=clientMoney.get(clientName);
                clientMoney.put(clientName, moneyEarned+currentMoney);
            }
        }

        double sum=0;

        for(Map.Entry<String, Double> entry: clientMoney.entrySet()){

            String clientName= entry.getKey();
            double moneyEarned= entry.getValue();

            sum+=moneyEarned;

            System.out.printf("%s: %.2f\n", clientName, moneyEarned);

        }

        System.out.println("-----------");

        for (Map.Entry<String, Double> entry1: distributorMoney.entrySet()){

            String distributorName= entry1.getKey();
            double moneySpent= entry1.getValue();

            System.out.printf("%s: %.2f\n", distributorName, moneySpent);
            System.out.println("-----------");
        }

        System.out.printf("Total Income: %.2f\n", sum);
    }
}
