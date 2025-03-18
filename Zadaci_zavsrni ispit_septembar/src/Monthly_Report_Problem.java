import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Monthly_Report_Problem {

    public static void printClients(LinkedHashMap<String, Double> map){

        for(Map.Entry<String, Double> entry: map.entrySet()){

            String client= entry.getKey();
            double moneyEarned= entry.getValue();

            System.out.printf("%s: %.2f\n", client, moneyEarned);


        }
    }

    public static void printDistributors(LinkedHashMap<String, Double> map){

        for(Map.Entry<String, Double> entry: map.entrySet()){

            String distributor= entry.getKey();
            double moneySpent= entry.getValue();

            System.out.printf("%s: %.2f\n", distributor, moneySpent);


        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, Double> distributorMoneySpent=new LinkedHashMap<>();
        LinkedHashMap<String, Double> clientMoneyEarned=new LinkedHashMap<>();

        double totalIncome=0;

        while(true){

            String command=sc.nextLine();

            if(command.equals("End")) break;

            String [] commandParts=command.split(" ");

            String firstPart=commandParts[0];

            if(firstPart.equals("Deliver")){

                String distributorName=commandParts[1];

                double moneySpent=Double.parseDouble(commandParts[2]);

                if(!distributorMoneySpent.containsKey(distributorName)){

                    distributorMoneySpent.put(distributorName, moneySpent);
                }

                else{

                    double currentMoneySpent=distributorMoneySpent.get(distributorName);
                    distributorMoneySpent.put(distributorName, currentMoneySpent+moneySpent);
                }
            }

            if(firstPart.equals("Return")){

                String distributorName=commandParts[1];

                double moneyReturned=Double.parseDouble(commandParts[2]);

                if(distributorMoneySpent.containsKey(distributorName)){

                    double currentMoneySpent=distributorMoneySpent.get(distributorName);
                    distributorMoneySpent.put(distributorName, currentMoneySpent-moneyReturned);

                    double cost=currentMoneySpent-moneyReturned;

                    if(cost<=0){

                        distributorMoneySpent.remove(distributorName);
                    }
                }
            }

            if(firstPart.equals("Sell")){

                String clientName=commandParts[1];

                double moneyEarned=Double.parseDouble(commandParts[2]);

                if(!clientMoneyEarned.containsKey(clientName)){

                    clientMoneyEarned.put(clientName, moneyEarned);


                }

                else{

                    double currentMoneyEarned=clientMoneyEarned.get(clientName);
                    clientMoneyEarned.put(clientName, currentMoneyEarned+moneyEarned);
                }

                totalIncome+=moneyEarned;
            }
        }

        printClients(clientMoneyEarned);
        System.out.println("------------");
        printDistributors(distributorMoneySpent);
        System.out.println("------------");
        System.out.printf("Total Income: %.2f\n", totalIncome);
    }
}
