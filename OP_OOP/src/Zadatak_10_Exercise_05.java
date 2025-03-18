import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_10_Exercise_05 {

    static class Vehicle{

            private String typeOfVehicle;
            private String model;
            private String color;
            private int horsepower;

        public Vehicle(String typeOfVehicle, String model, String color, int horsepower){

            this.typeOfVehicle=typeOfVehicle;
            this.model=model;
            this.color=color;
            this.horsepower=horsepower;

        }

        public Vehicle(String  text){

            String [] parts=text.split(" ");
            this.typeOfVehicle=parts[0];
            this.model=parts[1];
            this.color=parts[2];
            this.horsepower=Integer.parseInt(parts[3]);
        }

        @Override
        public String toString() {
            return String.format("Type: %s\n" +
                    "Model: %s\n" +
                    "Color: %s\n" +
                    "Horsepower: %d\n", this.typeOfVehicle, this.model, this.color, this.horsepower);
        }
    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        ArrayList<Vehicle> vehicles=new ArrayList<>();

        while(true){

            String text=sc.nextLine();

            if(text.equals("End")) break;

            Vehicle vehicle=new Vehicle(text);

            if(vehicle.typeOfVehicle.equals("car")) vehicle.typeOfVehicle="Car";
            if(vehicle.typeOfVehicle.equals("truck")) vehicle.typeOfVehicle="Truck";

            vehicles.add(vehicle);

        }

        while(true){

            String modelOfVehicle=sc.nextLine();

            if(modelOfVehicle.equals("Close the Catalogue")) break;

            for(Vehicle v: vehicles){

                if(v.model.equals(modelOfVehicle)){

                    System.out.printf("%s", v);

                }

            }

        }

        int horsepowerSum=0;

        int counter=0;

        for(Vehicle v: vehicles){

            if(v.typeOfVehicle.equals("Car")){

                horsepowerSum+=v.horsepower;
                counter++;
            }

        }

        double avg;

        if(horsepowerSum==0) avg=0;
        else avg=(double)horsepowerSum/counter;

        System.out.printf("Cars have average horsepower of: %.2f.\n", avg);

        int horsepowerSumTruck=0;

        int counterTruck=0;

        for(Vehicle v: vehicles){

            if(v.typeOfVehicle.equals("Truck")){

                horsepowerSumTruck+=v.horsepower;
                counterTruck++;
            }

        }

        double avgTruck;

        if(horsepowerSumTruck==0) avgTruck=0;
        else avgTruck=(double)horsepowerSumTruck/counterTruck;

        System.out.printf("Trucks have average horsepower of: %.2f.", avgTruck);
    }
}
