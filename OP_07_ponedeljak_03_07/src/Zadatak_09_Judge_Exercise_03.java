import java.util.Scanner;

public class Zadatak_09_Judge_Exercise_03 {

    static class Person{

        private String firstName;
        private int age;

        public Person(String n, int a){

            this.firstName=n;
            this.age=a;
        }

        @Override
        public String toString() {
            return String.format("%s - %d", this.firstName, this.age);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int N=Integer.parseInt(sc.nextLine());

        for(int i=1; i<=N; i++) {

            String text = sc.nextLine();

            String[] parts = text.split(" ");

            String firstName = parts[0];
            int age = Integer.parseInt(parts[1]);

            Person person=new Person(firstName, age);

            if(age>30){

                String rez=person.toString();
                System.out.println(rez);

            }
        }
    }
}
