import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Zadatak_11_Exercise_06 {

    static class Person{

        private String name;
        private String ID;
        private int age;

        public Person(String name, String ID, int age){

            this.name=name;
            this.ID=ID;
            this.age=age;
        }

        public Person(String text){

            String [] parts=text.split(" ");

            this.name=parts[0];
            this.ID=parts[1];
            this.age=Integer.parseInt(parts[2]);
        }

        public int getAge(){

            return this.age;
        }

        public void setAge(int newAge){

            this.age=newAge;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", this.name, this.ID, this.age);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        ArrayList<Person> persons=new ArrayList<>();

        while(true){

            String text=sc.nextLine();

            if(text.equals("End")) break;

            Person person=new Person(text);

            persons.add(person);
        }

        persons.sort(Comparator.comparingInt(Person::getAge));

        for(Person p: persons) System.out.println(p);
    }
}
