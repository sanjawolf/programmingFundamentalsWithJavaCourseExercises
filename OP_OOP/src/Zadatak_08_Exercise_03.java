import java.util.Scanner;

public class Zadatak_08_Exercise_03 {

    static class Person{

        private String name;
        private int age;

        public Person(String ime, int godine){

            this.name=ime;
            this.age=godine;
        }

        @Override
        public String toString() {
            return String.format("%s - %d", this.name, this.age);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        for(int i=1; i<=n; i++){

            String text=sc.nextLine();

            String [] parts=text.split(" ");

            int age=Integer.parseInt(parts[1]);

            Person person=new Person(parts[0], age);

            if(person.age>30){

                System.out.println(person);
            }

        }




    }
}
