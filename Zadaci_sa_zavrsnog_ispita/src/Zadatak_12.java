import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_12 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        LinkedHashMap<String, int[]> heroesPoints=new LinkedHashMap<>();

        for(int i=1; i<=n; i++) {

            String hitManaPoints = sc.nextLine();

            String[] parts = hitManaPoints.split(" ");

            String heroName = parts[0];

            int HP = Integer.parseInt(parts[1]);

            int MP = Integer.parseInt(parts[2]);

            if(!heroesPoints.containsKey((heroName))){

                heroesPoints.put(heroName, new int[]{HP, MP});
            }

        }

        while(true){

            String command=sc.nextLine();

            if(command.equals("End")) break;

            String [] commandParts=command.split(" - ");

            String firstCommandPart=commandParts[0];

            if(firstCommandPart.equals("CastSpell")){

                String hero_name=commandParts[1];

                int MP_needed= Integer.parseInt(commandParts[2]);

                String spellName=commandParts[3];

                if(heroesPoints.get(hero_name)[1]>=MP_needed){

                    int newMP=heroesPoints.get(hero_name)[1]-MP_needed;
                    heroesPoints.put(hero_name, new int[]{heroesPoints.get(hero_name)[0], newMP});
                    System.out.printf("%s has successfully cast %s and now has %d MP!\n", hero_name, spellName, newMP);
                }

                else{

                    System.out.printf("%s does not have enough MP to cast %s!\n", hero_name, spellName);
                }
            }

            if(firstCommandPart.equals("TakeDamage")){

                String hero_name=commandParts[1];

                int damage= Integer.parseInt(commandParts[2]);

                String attacker=commandParts[3];

                heroesPoints.get(hero_name)[0]-=damage;

                if(heroesPoints.get(hero_name)[0]>0){

                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n", hero_name, damage, attacker, heroesPoints.get(hero_name)[0]);
                }

                else{

                    heroesPoints.remove(hero_name);
                    System.out.printf("%s has been killed by %s!\n", hero_name, attacker);
                }
            }

            if(firstCommandPart.equals("Recharge")){

                String hero_name=commandParts[1];

                int amount= Integer.parseInt(commandParts[2]);

                int currentHP=heroesPoints.get(hero_name)[0];

                int currentMP=heroesPoints.get(hero_name)[1]+amount;

                if(currentMP>200){

                    currentMP=200;
                    System.out.printf("%s recharged for %d MP!\n", hero_name, 200-heroesPoints.get(hero_name)[1]);

                }

                else{

                    System.out.printf("%s recharged for %d MP!\n", hero_name, amount);
                }

                heroesPoints.put(hero_name, new int[]{currentHP, currentMP});



            }

            if(firstCommandPart.equals("Heal")){

                String hero_name=commandParts[1];

                int amount= Integer.parseInt(commandParts[2]);

                int currentHP=heroesPoints.get(hero_name)[0]+amount;

                int currentMP=heroesPoints.get(hero_name)[1];

                if(currentHP>100){

                    currentHP=100;
                    System.out.printf("%s healed for %d HP!\n", hero_name, 100-heroesPoints.get(hero_name)[0]);

                }

                else{

                    System.out.printf("%s healed for %d HP!\n", hero_name, amount);
                }

                heroesPoints.put(hero_name, new int[]{currentHP, currentMP});

            }


        }

        for(Map.Entry<String, int[]> entry: heroesPoints.entrySet()){

            String heroName= entry.getKey();
            int HP=entry.getValue()[0];
            int MP=entry.getValue()[1];

            System.out.println(heroName);
            System.out.printf("  HP : %d\n", HP);
            System.out.printf("  MP : %d\n", MP);
        }

    }
}
