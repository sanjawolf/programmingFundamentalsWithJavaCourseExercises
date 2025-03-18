import java.util.*;

public class Zadatak_03 {

    public static void print(LinkedHashMap<String, ArrayList<String>> map){

        System.out.println("Heroes:");

        for(Map.Entry<String, ArrayList<String>> entry: map.entrySet()){

            String hero= entry.getKey();
            ArrayList<String> spells=entry.getValue();

            System.out.printf("== %s: ", hero);

            if (spells.size()==0) System.out.println();

            for(String spell: spells){

                if(spells.indexOf(spell)!=spells.size()-1) System.out.printf("%s, ", spell);
                else System.out.printf("%s\n", spell);
            }

        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> heroSpells=new LinkedHashMap<>();

        while(true){

            String command=sc.nextLine();

            if(command.equals("End")) break;

            String [] commandParts=command.split(" ");

            String firstPart=commandParts[0];

            if(firstPart.equals("Enroll")){

                String heroName=commandParts[1];

                if(!heroSpells.containsKey(heroName)){

                    heroSpells.put(heroName, new ArrayList<>());
                }

                else{

                    System.out.printf("%s is already enrolled.\n", heroName);
                }
            }

            if(firstPart.equals("Learn")){

                String heroName=commandParts[1];

                String spellName=commandParts[2];

                if(!heroSpells.containsKey(heroName)){


                    System.out.printf("%s doesn't exist.\n", heroName);
                }

                else{

                    if(heroSpells.get(heroName).contains(spellName)){

                        System.out.printf("%s has already learnt %s.\n", heroName, spellName);
                    }

                    else{

//                        heroSpells.put(heroName, new ArrayList<>());
                        heroSpells.get(heroName).add(spellName);
                    }
                }


            }

            if(firstPart.equals("Unlearn")){

                String heroName=commandParts[1];

                String spellName=commandParts[2];

                if(!heroSpells.containsKey(heroName)){

                    System.out.printf("%s doesn't exist.\n", heroName);
                }

                else if(!heroSpells.get(heroName).contains(spellName)){

                    System.out.printf("%s doesn't know %s.\n", heroName, spellName);
                }

                else{

                    heroSpells.get(heroName).remove(spellName);
                }
            }
        }

        print(heroSpells);
    }
}
