import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_18_Judge_Exercise_07 {

    public static void writeMap(LinkedHashMap<String , Integer> materials){

        for(Map.Entry <String, Integer> entry: materials.entrySet()){

            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, Integer> keyMaterials = new LinkedHashMap<>();

        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        LinkedHashMap<String, Integer> junkMaterials = new LinkedHashMap<>();

         boolean interruptLoop=false;

        while (true) {

            if(interruptLoop) break;

            String text = sc.nextLine();

            String[] parts = text.split(" ");

            for (int i = 0; i < parts.length / 2; i++) {

                int quantity = Integer.parseInt(parts[2 * i]);
                String keyMaterial = parts[2 * i + 1].toLowerCase();

                if (keyMaterials.containsKey(keyMaterial)) {

                    int currentValue = keyMaterials.get(keyMaterial);

                    if (quantity + currentValue >= 250) {

                        if (keyMaterial.equals("shards")) {

                            System.out.println("Shadowmourne obtained!");
                        } else if (keyMaterial.equals("fragments")) {

                            System.out.println("Valanyr obtained!");
                        } else {

                            System.out.println("Dragonwrath obtained!");
                        }

                        keyMaterials.put(keyMaterial, quantity + currentValue - 250);
                        interruptLoop=true;
                        break;
                    } else {

                        keyMaterials.put(keyMaterial, quantity + currentValue);
                    }
                } else {

                    if (!junkMaterials.containsKey(keyMaterial)) {

                        junkMaterials.put(keyMaterial, 0);
                    }

                    int currentValue = junkMaterials.get(keyMaterial);
                    junkMaterials.put(keyMaterial, currentValue + quantity);
                }
            }

        }


        writeMap(keyMaterials);
        writeMap(junkMaterials);

    }
}
