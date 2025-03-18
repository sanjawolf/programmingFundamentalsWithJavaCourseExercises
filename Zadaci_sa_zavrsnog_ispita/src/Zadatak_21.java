import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak_21 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n= Integer.parseInt(sc.nextLine());

        LinkedHashMap<String, int[]> carsMileageFuel=new LinkedHashMap<>();

        for(int i=1; i<=n; i++){

            String input=sc.nextLine();

            String [] parts=input.split("\\|");

            String car=parts[0];

            int mileage= Integer.parseInt(parts[1]);

            int fuel= Integer.parseInt(parts[2]);

            if(!carsMileageFuel.containsKey(car)){

                carsMileageFuel.put(car, new int[]{mileage, fuel});
            }

        }

        while(true){

            String command=sc.nextLine();

            if(command.equals("Stop")) break;

            String [] commandParts=command.split(" : ");

            String firstPart=commandParts[0];

            if(firstPart.equals("Drive")){

                String car=commandParts[1];

                int distance= Integer.parseInt(commandParts[2]);

                int fuel= Integer.parseInt(commandParts[3]);

                if(carsMileageFuel.get(car)[1]<fuel){

                    System.out.println("Not enough fuel to make that ride");
                }

                else{

                    int currentMileage=carsMileageFuel.get(car)[0];
                    int currentFuel=carsMileageFuel.get(car)[1];

                    carsMileageFuel.put(car, new int[]{currentMileage+distance, currentFuel-fuel});

                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n", car, distance, fuel);
                }

                if(carsMileageFuel.get(car)[0]>=100000){

                    carsMileageFuel.remove(car);
                    System.out.printf("Time to sell the %s!\n", car);
                }

            }

            if(firstPart.equals("Refuel")){

                String car=commandParts[1];

                int fuel= Integer.parseInt(commandParts[2]);

                int currentMileage=carsMileageFuel.get(car)[0];
                int currentFuel=carsMileageFuel.get(car)[1];

                int refilled=currentFuel+fuel;

                if(refilled>75){

                    carsMileageFuel.put(car, new int[]{currentMileage, 75});
//                    75-currentFuel
                    System.out.printf("%s refueled with %d liters\n", car, 75-currentFuel);
                }

                else{

                    carsMileageFuel.put(car, new int[]{currentMileage, currentFuel+fuel});

                    System.out.printf("%s refueled with %d liters\n", car, fuel);
                }


            }

            if(firstPart.equals("Revert")){

                String car=commandParts[1];

                int kilometers= Integer.parseInt(commandParts[2]);

                int currentMileage=carsMileageFuel.get(car)[0];
                int currentFuel=carsMileageFuel.get(car)[1];

                carsMileageFuel.put(car, new int[]{currentMileage-kilometers, currentFuel});

                if(carsMileageFuel.get(car)[0]<10000){

                    carsMileageFuel.get(car)[0]=10000;
                }

                else{

                    System.out.printf("%s mileage decreased by %d kilometers\n", car, kilometers);
                }

            }
        }

        for(Map.Entry<String , int[]> entry: carsMileageFuel.entrySet()){

            String car= entry.getKey();

            int mileage=entry.getValue()[0];

            int fuel=entry.getValue()[1];

            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n", car, mileage, fuel);
        }
    }
}
