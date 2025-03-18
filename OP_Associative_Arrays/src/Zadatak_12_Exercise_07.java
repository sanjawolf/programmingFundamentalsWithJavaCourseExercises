import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_12_Exercise_07 {

    public static void print(LinkedHashMap<String, Integer> keyValuePairs){

        for(Map.Entry<String, Integer> entry: keyValuePairs.entrySet()){

            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        LinkedHashMap<String, Integer> keyMaterials=new LinkedHashMap<>();

        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        LinkedHashMap<String, Integer> junkMaterials=new LinkedHashMap<>();

        boolean isGreaterThan250=false;

        while(true){

            if(isGreaterThan250) break;

            String text=sc.nextLine();

            String [] parts=text.split(" ");

            for(int i=0; i<parts.length; i+=2){

                int quantity=Integer.parseInt(parts[i]);
                String material=parts[i+1].toLowerCase();

                if(keyMaterials.containsKey(material)){

                    int currentQuantity=keyMaterials.get(material);
                    int newValue=currentQuantity+quantity;

                    if(newValue>=250){

                        if(material.equals("shards")){

                            System.out.println("Shadowmourne obtained!");
                        }

                        else if(material.equals("fragments")){

                            System.out.println("Valanyr obtained!");
                        }

                        else{

                            System.out.println("Dragonwrath obtained!");
                        }

                        keyMaterials.put(material, newValue-250);
                        isGreaterThan250=true;
                        break;
                    }

                    else{

                        keyMaterials.put(material, newValue);

                    }
                }

                else{

                    if(!junkMaterials.containsKey(material)){

                        junkMaterials.put(material, 0);
                    }

                    int currentQuantity=junkMaterials.get(material);
                    int newValue=currentQuantity+quantity;
                    junkMaterials.put(material, newValue);

                }
            }
        }

        print(keyMaterials);
        print(junkMaterials);
    }
}
