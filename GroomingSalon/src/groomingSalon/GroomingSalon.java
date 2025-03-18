package groomingSalon;


import java.util.ArrayList;

public class GroomingSalon {

    private int capacity;
    private ArrayList<Pet> data;

    public GroomingSalon(int capacity){

        this.capacity=capacity;
        data=new ArrayList<>();
    }

    public void add(Pet pet){

        if(this.data.size()<this.capacity){

            this.data.add(pet);
        }
    }

    public boolean remove(String name){

        for(Pet p: this.data){

            if(p.getName().equals(name)){

                this.data.remove(p);
                return true;
            }
        }

        return false;
    }

    public Pet getPet(String name, String owner){

        for(Pet p: this.data){

            if(p.getName().equals(name) && p.getОwner().equals(owner)){

                return p;
            }
        }

        return null;
    }

    public int getCount(){

        return this.data.size();
    }

    public String getStatistics(){

        String rez=String.format("The grooming salon has the following clients:\n");
        for(Pet p: this.data){

            rez+=String.format("%s %s\n", p.getName(), p.getОwner());
        }
        return rez;
    }

}

