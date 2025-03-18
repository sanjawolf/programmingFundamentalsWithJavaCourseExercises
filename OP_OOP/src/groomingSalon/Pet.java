package groomingSalon;

public class Pet {

    private String name;
    private int age;
    private String owner;

    public  Pet(String name, int age, String  owner){

        this.name=name;
        this.age=age;
        this.owner=owner;
    }

    public String getName(){

        return this.name;
    }

    public String getОwner(){

        return this.owner;
    }

    public int getAge(){

        return this.age;
    }

    public void setName(String newName){

        this.name=newName;
    }

    public void setОwner(String newOwner){

        this.owner=newOwner;
    }

    public void setAge(int newAge){

        this.age=newAge;
    }

    @Override
    public String toString() {
        return String.format("%s %d - (%s)", this.name, this.age, this.owner);
    }
}
