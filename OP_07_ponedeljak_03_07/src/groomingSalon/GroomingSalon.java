package groomingSalon;

import java.util.ArrayList;

public class GroomingSalon {
    private int capacity;
    private ArrayList<Pet> pets;

    public GroomingSalon(int capacity) {

        this.capacity = capacity;
        pets = new ArrayList<>();
    }

    public void add(Pet pet) {

        if (this.capacity > pets.size()) {

            pets.add(pet);
        }
    }

    public boolean remove(String givenName) {

        for (int i = 0; i < pets.size(); i++) {

            if (pets.get(i).getName().equals(givenName)) {

                pets.remove(i);
                return true;
            }
        }

            return false;

        }





        public Pet getPet(String name, String owner) {

            for (Pet p : pets) {

                if (p.getName().equals(name) && p.getOwner().equals(owner)) {

                    return p;

                }

            }

            return null;

        }





        public int getCount(){

            return pets.size();
        }

        public String getStatistics(){

        String rez=String.format("The grooming salon has the following clients:\n");

            for(Pet p: pets){

                rez+=String.format("%s %s\n", p.getName(), p.getOwner());
            }

            return rez;
        }
}


