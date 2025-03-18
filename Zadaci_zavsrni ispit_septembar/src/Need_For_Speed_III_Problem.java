import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Need_For_Speed_III_Problem {

    public static void print(LinkedHashMap<String, int[]> map){

        for(Map.Entry<String , int[]> entry: map.entrySet()){

            String car= entry.getKey();
            int mileage=entry.getValue()[0];
            int fuel=entry.getValue()[1];

            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n", car, mileage, fuel);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        LinkedHashMap<String, int[]> carMileageFuel=new LinkedHashMap<>();

        for(int i=1; i<=n; i++){

            String carMileageFuelText=sc.nextLine();

            String [] parts=carMileageFuelText.split("\\|");

            String car=parts[0];

            int mileage=Integer.parseInt(parts[1]);

            int fuel=Integer.parseInt(parts[2]);

            if(!carMileageFuel.containsKey(car)){

                carMileageFuel.put(car, new int[]{mileage, fuel});
            }

            else{

                int currentMileage=carMileageFuel.get(car)[0];
                int currentFuel=carMileageFuel.get(car)[1];

                carMileageFuel.put(car, new int[]{currentMileage+mileage, currentFuel+fuel});
            }
        }

        while(true){

            String command=sc.nextLine();

            if(command.equals("Stop")) break;

            String [] commandParts=command.split(" : ");

            String firstPart=commandParts[0];

            if(firstPart.equals("Drive")){

                String car=commandParts[1];

                int distance=Integer.parseInt(commandParts[2]);

                int fuel=Integer.parseInt(commandParts[3]);

                if(carMileageFuel.get(car)[1]<fuel){

                    System.out.println("Not enough fuel to make that ride");
                }

                else{

                    int currentMileage=carMileageFuel.get(car)[0];
                    int currentFuel=carMileageFuel.get(car)[1];

                    carMileageFuel.put(car, new int[]{currentMileage+distance, currentFuel-fuel});

                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n", car, distance, fuel);

                }

                if(carMileageFuel.get(car)[0]>=100000){

                    carMileageFuel.remove(car);

                    System.out.printf("Time to sell the %s!\n", car);
                }

            }

            if(firstPart.equals("Refuel")){

                String car=commandParts[1];

                int fuel=Integer.parseInt(commandParts[2]);

                int currentMileage=carMileageFuel.get(car)[0];
                int currentFuel=carMileageFuel.get(car)[1];

                int refilled=currentFuel+fuel;

                if(refilled<=75){

                    carMileageFuel.put(car, new int[]{currentMileage, refilled});
                    System.out.printf("%s refueled with %d liters\n", car, fuel);
                }

                else{

                    carMileageFuel.put(car, new int[]{currentMileage, 75});
                    System.out.printf("%s refueled with %d liters\n", car, 75-currentFuel);
                }
            }

            if(firstPart.equals("Revert")){

                String car=commandParts[1];

                int kilometers=Integer.parseInt(commandParts[2]);

                int currentMileage=carMileageFuel.get(car)[0];
                int currentFuel=carMileageFuel.get(car)[1];

                carMileageFuel.put(car, new int[]{currentMileage-kilometers, currentFuel});
                System.out.printf("%s mileage decreased by %d kilometers\n", car, kilometers);

                if(carMileageFuel.get(car)[0]<10000){

                    carMileageFuel.get(car)[0]=10000;
                }
            }
        }

        print(carMileageFuel);
    }
}
