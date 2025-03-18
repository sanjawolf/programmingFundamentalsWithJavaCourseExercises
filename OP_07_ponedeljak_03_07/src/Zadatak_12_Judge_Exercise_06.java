import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Zadatak_12_Judge_Exercise_06 {

    static class Person{

        private String name;
        private String ID;
        private int age;

        public Person(String name, String ID, int age){

            this.name=name;
            this.ID=ID;
            this.age=age;
        }

        public int getAge(){

            return this.age;
        }

        public void setAge(int age){

           this.age=age;
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

            String [] textParts=text.split(" ");

            String name=textParts[0];
            String ID=textParts[1];
            int age=Integer.parseInt(textParts[2]);

            Person person=new Person(name, ID, age);

            persons.add(person);

        }

        persons.sort(Comparator.comparingInt(Person::getAge));

        for(Person p: persons){

            System.out.println(p);
        }
    }
}
