import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_11_Judge_Exercise_05 {

    static class Vehicle{

        private String type;
        private String model;
        private String color;
        private double horsepower;

        public Vehicle(String type, String model, String color, double horsepower){

            this.type=type;
            this.model=model;
            this.color=color;
            this.horsepower=horsepower;
        }

        public String getModel(){

            return this.model;
        }

        public void setModel(String model){

            this.model=model;
        }

        public String getType(){

            return this.type;
        }

        public void setType(String type){

            this.type=type;
        }

        public static void writeVehicleOfGivenModel(ArrayList<Vehicle> vehicles, String vehicleModel){

            for (Vehicle v : vehicles) {

                if (vehicleModel.equals(v.getModel())) {

                    System.out.println(v);

                }
            }
        }

        public static double takeAverage(ArrayList<Vehicle> vehicles, String type){

            double addition=0;
            double counter=0;

            for (Vehicle v : vehicles) {

                if (type.equals(v.getType())) {

                    addition+= v.horsepower;
                    counter++;

                }
            }

            double avg;
            if(addition==0){
                avg=0;
            }

            else{

                avg=addition/counter;
            }

            return avg;

        }

        @Override
        public String toString() {
            return String.format("Type: %s\n" +
                    "Model: %s\n" +
                    "Color: %s\n" +
                    "Horsepower: %.0f", this.type, this.model, this.color, this.horsepower);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        ArrayList<Vehicle> vehicles=new ArrayList<>();

        while(true) {

            String text = sc.nextLine();

            if (text.equals("End")) break;

            String[] parts = text.split(" ");

            String type = parts[0];
            String model = parts[1];
            String color = parts[2];
            double horsepower = Double.parseDouble(parts[3]);

            if(type.equals("car")) type="Car";
            if(type.equals("truck")) type="Truck";


            Vehicle vehicle = new Vehicle(type, model, color, horsepower);

            vehicles.add(vehicle);

            }

            while(true) {

                String vehicleModel = sc.nextLine();

                if (vehicleModel.equals("Close the Catalogue")) break;

                Vehicle.writeVehicleOfGivenModel(vehicles, vehicleModel);


            }

            double avg=Vehicle.takeAverage(vehicles, "Car");
            System.out.printf("Cars have average horsepower of: %.2f.\n", avg);
            avg=Vehicle.takeAverage(vehicles, "Truck");
            System.out.printf("Trucks have average horsepower of: %.2f.", avg);
    }
}
