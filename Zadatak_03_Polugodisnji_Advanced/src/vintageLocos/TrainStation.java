package vintageLocos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainStation {

    //•	name: String
    //•	capacity: int
    //•	railGauge: int
    //•	locomotives: List<Locomotive>

    private String name;
    private int capacity;
    private int railGauge;
    private List<Locomotive> locomotives;

    public TrainStation(String name, int capacity, int railGauge) {
        this.name = name;
        this.capacity = capacity;
        this.railGauge = railGauge;
        this.locomotives=new ArrayList<>();
    }

    public void addLocomotive(Locomotive locomotive){

        if(locomotives.size()<capacity && railGauge==locomotive.getGauge()){

            locomotives.add(locomotive);
        }

        else if(railGauge!=locomotive.getGauge()){

            System.out.printf("The rail gauge of this station does not match the locomotive gauge! Difference: %d mm.\n", Math.abs(railGauge-locomotive.getGauge()));
        }

        else{

            System.out.println("This train station is full!");
        }
    }

    public boolean removeLocomotive(String name){

        for(Locomotive locomotive: locomotives){

            if(locomotive.getName().equals(name)){

                locomotives.remove(locomotive);
                return true;
            }
        }

        return false;
    }

    public String getFastestLocomotive(){

        Locomotive fastestLocomotive=locomotives.stream().max(Comparator.comparingInt(Locomotive::getMaxSpeed)).orElse(null);

        if(fastestLocomotive==null){

            return "There are no locomotives.";
        }

        else{

            return String.format("%s is the fastest locomotive with a maximum speed of %d km/h.", fastestLocomotive.getName(), fastestLocomotive.getMaxSpeed());
        }
    }

    public Locomotive getLocomotive(String name){

        for(Locomotive locomotive: locomotives){

            if(locomotive.getName().equals(name)){

                return locomotive;
            }
        }

        return null;
    }

    public int getCount(){

        return locomotives.size();
    }

    public String getOldestLocomotive(){

        Locomotive locomotive=locomotives.stream().min(Comparator.comparing(l->l.getBuildDate().getYear())).orElse(null);

        if(locomotive==null){

            return "There are no locomotives.";
        }

        else{

            return locomotive.getName();
        }
    }

    public String getStatistics(){

        StringBuilder sb=new StringBuilder();

        if(!locomotives.isEmpty()){

            sb.append("Locomotives departed from ").append(name).append(":\n");

            for(int i=0; i<locomotives.size(); i++){

                sb.append(i+1).append(". ").append(locomotives.get(i).getName()).append("\n");
            }

        }

        else{

            sb.append("There are no locomotives departing from ").append(name).append(" station.");
        }

        return sb.toString();
    }
}
