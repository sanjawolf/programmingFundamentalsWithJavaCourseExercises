import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Battle_Manager_Problem {

    public static LinkedHashMap<String, int[]> deleteAllRecords(ArrayList<String> list, LinkedHashMap<String, int[]> map){

        for(String s: list) map.remove(s);

        return map;
    }

    public static void print(LinkedHashMap<String, int[]> map){

        System.out.printf("Person count: %d\n", map.size());

        for(Map.Entry<String, int[]> entry: map.entrySet()){

            String person= entry.getKey();

            int health=entry.getValue()[0];

            int energy=entry.getValue()[1];

            System.out.printf("%s - %d - %d\n", person, health, energy);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, int[]> personHealthEnergy=new LinkedHashMap<>();

        ArrayList<String> list=new ArrayList<>();

        while(true){

            String command=sc.nextLine();

            if(command.equals("Results")) break;

            String [] commandParts=command.split(":");

            String firstPart=commandParts[0];

            if(firstPart.equals("Add")){

                String personName=commandParts[1];

                int health= Integer.parseInt(commandParts[2]);

                int energy= Integer.parseInt(commandParts[3]);

                if(!personHealthEnergy.containsKey(personName)){

                    personHealthEnergy.put(personName, new int[]{health, energy});
                    list.add(personName);
                }

                else{

                    int currentHealth=personHealthEnergy.get(personName)[0];
                    int currentEnergy=personHealthEnergy.get(personName)[1];
                    personHealthEnergy.put(personName, new int[]{currentHealth+health, currentEnergy});
                }


            }

            if(firstPart.equals("Attack")){

                String attacker=commandParts[1];

                String defender=commandParts[2];

                int damage= Integer.parseInt(commandParts[3]);

                if(!personHealthEnergy.containsKey(attacker)){

                    personHealthEnergy.put(attacker, new int[]{0, 0});
                }

                int currentHealthAttacker=personHealthEnergy.get(attacker)[0];
                int currentEnergyAttacker=personHealthEnergy.get(attacker)[1];
                personHealthEnergy.put(attacker, new int[]{currentHealthAttacker, currentEnergyAttacker-1});

                if(!personHealthEnergy.containsKey(defender)){

                    personHealthEnergy.put(defender, new int[]{0, 0});
                }

                int currentHealthDefender=personHealthEnergy.get(defender)[0];
                int currentEnergyDefender=personHealthEnergy.get(defender)[1];
                personHealthEnergy.put(defender, new int[]{currentHealthDefender-damage, currentEnergyDefender});

                if(personHealthEnergy.get(defender)[0]<=0){

                    personHealthEnergy.remove(defender);
                    System.out.printf("%s was disqualified!\n", defender);
                }

                if(personHealthEnergy.get(attacker)[1]<=0){

                    personHealthEnergy.remove(attacker);
                    System.out.printf("%s was disqualified!\n", attacker);
                }

            }

            if(firstPart.equals("Delete")){

                String username=commandParts[1];

                personHealthEnergy.remove(username);

                if(username.equals("All")){

                    deleteAllRecords(list, personHealthEnergy);
                }
            }
        }

        print(personHealthEnergy);
    }
}
