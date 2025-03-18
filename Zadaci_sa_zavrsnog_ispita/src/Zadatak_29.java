import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_29 {

//    public static void add(LinkedHashMap<String, Integer> animals, LinkedHashMap<String, Integer> areas, String dodajZivotinju) {
//
//        String[] delovi = dodajZivotinju.split("-");
//        String imeZivotinje = delovi[0];
//        int potrebnaHrana = Integer.parseInt(delovi[1]);
//        String oblast = delovi[2];
//
//        if (animals.containsKey(imeZivotinje)) {
//            int novaPotrebnaHrana = potrebnaHrana + animals.get(imeZivotinje);
//            animals.put(imeZivotinje, novaPotrebnaHrana);
//
//        } else {
//            animals.put(imeZivotinje, potrebnaHrana);
//
//            if (areas.containsKey(oblast)) {
//                int noviBrojZivotinja = areas.get(oblast) + 1;
//                areas.put(oblast, noviBrojZivotinja);
//            } else {
//                int brojZivotinja = 1;
//                areas.put(oblast, brojZivotinja);
//            }
//        }
//
//    }
//
//    public static void feed(LinkedHashMap<String, Integer> animals, LinkedHashMap<String, Integer> areas, String nahraniZivotinju) {
//
//        String[] delovi = nahraniZivotinju.split("-");
//        String imeZivotinje = delovi[0];
//        int hranaZaHranjenje = Integer.parseInt(delovi[1]);
//
//        if (animals.containsKey(imeZivotinje)) {
//            int ukupnaHrana = animals.get(imeZivotinje) - hranaZaHranjenje;
//            animals.put(imeZivotinje, ukupnaHrana);
//
//
//            if (animals.get(imeZivotinje) <= 0) {
//                System.out.printf("%s was successfully fed\n", imeZivotinje);
//                animals.remove(imeZivotinje);
//
//
//            }
//        }
//
//    }


        public static void main (String [] args){

            Scanner sc = new Scanner(System.in);

//            int brojacZivotinja = 0;
//            LinkedHashMap<String, Integer> animals = new LinkedHashMap<>();
//            LinkedHashMap<String, Integer> areas = new LinkedHashMap<>();
//            while (true){
//
//                String unos = sc.nextLine();
//
//                if(unos.equals("EndDay")) break;
//
//                String[] deloviKomande = unos.split(":");
//                String komanda = deloviKomande[0];
//
//                if(komanda.equals("Add")){
//
//                    String dodajZivotinju = deloviKomande[1];
//                    add(animals, areas, dodajZivotinju);
//
//                } else if(komanda.equals("Feed")){
//                    String nahraniZivotinju = deloviKomande[1];
//                    feed(animals, areas, nahraniZivotinju);
//                }
//
//            }
//
//            System.out.println("Animals:");
//            for (Map.Entry<String, Integer> kljucVrednost : animals.entrySet()) {
//
//                String imeZivotinje = kljucVrednost.getKey();
//                Integer hrana = kljucVrednost.getValue();
//                System.out.printf("  %s -> %dg\n",imeZivotinje, hrana);
//
//            }
//
//            System.out.println("Areas with hungry animals:");
//            for (Map.Entry<String, Integer> kljucVrednost : areas.entrySet()) {
//
//                String areaName = kljucVrednost.getKey();
//                int numOfHungrryAnimals = kljucVrednost.getValue();
//                //nteger numOfHungrryAnimals =  0;
//                System.out.printf("  %s: %d\n",areaName, numOfHungrryAnimals);
//
//            }
//        }

            LinkedHashMap<String, Integer> animalNeededFood = new LinkedHashMap<>();

            LinkedHashMap<String, Integer> areaNumberOfHungryAnimals = new LinkedHashMap<>();

//        int numberOfHungryAnimals=0;

            while (true) {

                String command = sc.nextLine();

                if (command.equals("EndDay")) break;

                String[] commandParts = command.split(": ");

                String firstPart = commandParts[0];

                if (firstPart.equals("Add")) {

                    String nameFoodArea = commandParts[1];

//                for(String p: commandParts) System.out.println(p);

                    String[] parts = nameFoodArea.split("-");

                    String animalName = parts[0];

                    int neededFoodQuantity = Integer.parseInt(parts[1]);

                    String area = parts[2];

//                for (String s: parts) System.out.println(s);

                    if (!animalNeededFood.containsKey(animalName)) {

                        animalNeededFood.put(animalName, neededFoodQuantity);

                        if (!areaNumberOfHungryAnimals.containsKey(area)) {

                            areaNumberOfHungryAnimals.put(area, 1);

                        } else {

                            int nOfHungryAnimals = areaNumberOfHungryAnimals.get(area);
                            areaNumberOfHungryAnimals.put(area, nOfHungryAnimals + 1);

                        }

                    } else {

                        int currentFood = animalNeededFood.get(animalName);
                        animalNeededFood.put(animalName, currentFood + neededFoodQuantity);
                    }


                }


                if (firstPart.equals("Feed")) {

                    String animalFood = commandParts[1];

                    String[] parts = animalFood.split("-");

                    String animalName = parts[0];

                    int food = Integer.parseInt(parts[1]);

                    if (animalNeededFood.containsKey(animalName)) {

                        int currentFood = animalNeededFood.get(animalName);
                        animalNeededFood.put(animalName, currentFood - food);

                        if (animalNeededFood.get(animalName) <= 0) {

                            animalNeededFood.remove(animalName);
                            System.out.printf("%s was successfully fed\n", animalName);
                        }

//                    else{
//
//                        numberOfHungryAnimals++;
//                    }
                    }


                }


            }

            System.out.println("Animals:");

            for (Map.Entry<String, Integer> entry : animalNeededFood.entrySet()) {

                String animalName = entry.getKey();

                int neededFood = entry.getValue();

                System.out.printf(" %s -> %dg\n", animalName, neededFood);
            }

            System.out.println("Areas with hungry animals:");

            for (Map.Entry<String, Integer> entry : areaNumberOfHungryAnimals.entrySet()) {

                String area = entry.getKey();

                int hungryAnimals = entry.getValue();

                System.out.printf(" %s: %d\n", area, hungryAnimals);
            }
        }
    }


