package vintageLocos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Locomotive {

    //•	name: String
    //•	builder: String
    //•	buildDate: LocalDate
    //•	gauge: int
    //•	weight: int
    //•	maxSpeed: int

    private String name;
    private String builder;

    public Locomotive(String name, String builder, LocalDate buildDate, int gauge, int weight, int maxSpeed) {
        this.name = name;
        this.builder = builder;
        this.buildDate = buildDate;
        this.gauge = gauge;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    private LocalDate buildDate;
    private int gauge;
    private int weight;
    private int maxSpeed;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public LocalDate getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(LocalDate buildDate) {
        this.buildDate = buildDate;
    }

    public int getGauge() {
        return gauge;
    }

    public void setGauge(int gauge) {
        this.gauge = gauge;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return String.format("This %s is made by %s at %s.", name, builder, LocalDate.from(getBuildDate()).format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
    }
}
