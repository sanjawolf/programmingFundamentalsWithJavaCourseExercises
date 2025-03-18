import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Heroes_of_Code_and_Logic_VII_Problem {

    public static void print(LinkedHashMap<String, int[]> map){

        for(Map.Entry<String, int[]> entry: map.entrySet()){

            String heroName= entry.getKey();

            int HP=entry.getValue()[0];

            int MP=entry.getValue()[1];

            System.out.printf("%s\n", heroName);

            System.out.printf("  HP: %d\n", HP);

            System.out.printf("  MP: %d\n", MP);
        }


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        LinkedHashMap<String, int[]> heroHPMP=new LinkedHashMap<>();

        for(int i=1; i<=n; i++){

            String heroesHitMana=sc.nextLine();

            String [] parts=heroesHitMana.split(" ");

            String heroName=parts[0];

            int hitPoints=Integer.parseInt(parts[1]);

            int manaPoints=Integer.parseInt(parts[2]);

            if(!heroHPMP.containsKey(heroName)){

                heroHPMP.put(heroName, new int[]{hitPoints, manaPoints});
            }

        }

        while(true){

            String command=sc.nextLine();

            if(command.equals("End")) break;

            String [] commandParts=command.split(" - ");

            String firstPart=commandParts[0];

            if(firstPart.equals("CastSpell")){

                String heroName=commandParts[1];

                int MPNeeded=Integer.parseInt(commandParts[2]);

                String spellName=commandParts[3];

                if(heroHPMP.get(heroName)[1]>MPNeeded){
//
//                    if(!heroHPMP.containsKey(heroName)){
                    int currentHitPoints=heroHPMP.get(heroName)[0];
                    int currentManaPoints=heroHPMP.get(heroName)[1];

                    heroHPMP.put(heroName, new int[]{currentHitPoints, currentManaPoints-MPNeeded});
                    System.out.printf("%s has successfully cast %s and now has %d MP!\n", heroName, spellName, heroHPMP.get(heroName)[1]);

                    }

                    else{

                    System.out.printf("%s does not have enough MP to cast %s!\n", heroName, spellName);
                    }
//                }


            }

            if(firstPart.equals("TakeDamage")){

                String heroName=commandParts[1];

                int damage=Integer.parseInt(commandParts[2]);

                String attacker=commandParts[3];

                int currentHitPoints=heroHPMP.get(heroName)[0];
                int currentManaPoints=heroHPMP.get(heroName)[1];

                heroHPMP.put(heroName, new int[]{currentHitPoints-damage, currentManaPoints});

                if(heroHPMP.get(heroName)[0]>0) System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n", heroName, damage, attacker, heroHPMP.get(heroName)[0]);
                else{

                    heroHPMP.remove(heroName);
                    System.out.printf("%s has been killed by %s!\n", heroName, attacker);
                }

            }

            if(firstPart.equals("Recharge")){

                String heroName=commandParts[1];

                int amount=Integer.parseInt(commandParts[2]);

                int currentHitPoints=heroHPMP.get(heroName)[0];
                int currentManaPoints=heroHPMP.get(heroName)[1];

                heroHPMP.put(heroName, new int[]{currentHitPoints, currentManaPoints+amount});

                if(heroHPMP.get(heroName)[1]>200){

                    heroHPMP.get(heroName)[1]=200;

                    System.out.printf("%s recharged for %d MP!\n", heroName, heroHPMP.get(heroName)[1]-currentManaPoints);
                }

                else{

                    System.out.printf("%s recharged for %d MP!\n", heroName, heroHPMP.get(heroName)[1]-currentManaPoints);
                }
            }

            if(firstPart.equals("Heal")){

                String heroName=commandParts[1];

                int amount=Integer.parseInt(commandParts[2]);

                int currentHitPoints=heroHPMP.get(heroName)[0];
                int currentManaPoints=heroHPMP.get(heroName)[1];

                heroHPMP.put(heroName, new int[]{currentHitPoints+amount, currentManaPoints});

                if(heroHPMP.get(heroName)[0]>100){

                    heroHPMP.get(heroName)[0]=100;

                    System.out.printf("%s healed for %d HP!\n", heroName, heroHPMP.get(heroName)[0]-currentHitPoints);
                }

                else{

                    System.out.printf("%s healed for %d HP!\n", heroName, heroHPMP.get(heroName)[0]-currentHitPoints);
                }
            }

        }

        print(heroHPMP);
    }
}
