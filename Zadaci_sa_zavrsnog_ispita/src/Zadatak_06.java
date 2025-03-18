import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, int[]> healthEnergy=new LinkedHashMap<>();

        ArrayList<String> list=new ArrayList<>();

        while(true){

            String command=sc.nextLine();

            if(command.equals("Results")) break;

            String [] parts=command.split(":");

            String partOne=parts[0];

            if(partOne.equals("Add")){

                String personName=parts[1];

                int health=Integer.parseInt(parts[2]);

                int energy=Integer.parseInt(parts[3]);

                if(!healthEnergy.containsKey(personName)){

                    healthEnergy.put(personName, new int[]{health, energy});
                    list.add(personName);
                }

                else{

                    int currentHealth=healthEnergy.get(personName)[0];
                    int currentEnergy=healthEnergy.get(personName)[1];
                    healthEnergy.put(personName, new int[]{health+currentHealth, currentEnergy});
                }


            }

            if(partOne.equals("Attack")){

                String attacker=parts[1];
                String defender=parts[2];
                int damage=Integer.parseInt(parts[3]);

                if(healthEnergy.containsKey(attacker) && healthEnergy.containsKey(defender)){

                    int currentHealthD=healthEnergy.get(defender)[0];
                    int currentEnergyD=healthEnergy.get(defender)[1];
                    int reducedHealth=currentHealthD-damage;
                    healthEnergy.put(defender, new int[]{reducedHealth, currentEnergyD});
                    int currentHealthA=healthEnergy.get(attacker)[0];
                    int currentEnergyA=healthEnergy.get(attacker)[1];
                    int reducedEnergy=currentEnergyA-1;
                    healthEnergy.put(attacker, new int[]{currentHealthA, reducedEnergy});

                    if(reducedHealth<=0){

                        healthEnergy.remove(defender);
                        System.out.printf("%s was disqualified!\n", defender);
                    }

                    if(reducedEnergy<=0){

                        healthEnergy.remove(attacker);
                        System.out.printf("%s was disqualified!\n", attacker);

                    }
                }


            }

            if(partOne.equals("Delete")){

                String secondPart=parts[1];

                if(secondPart.equals("All")){

                    for(String s: list) healthEnergy.remove(s);
                }

                else{

                    if(healthEnergy.containsKey(secondPart)) healthEnergy.remove(secondPart);
                }
            }


        }

        System.out.printf("People count: %d\n", healthEnergy.size());

        for(Map.Entry<String, int[]> entry: healthEnergy.entrySet()){

            String personName=entry.getKey();
            int health=entry.getValue()[0];
            int energy=entry.getValue()[1];

            System.out.printf("%s - %d - %d\n", personName, health, energy);
        }
    }
}
