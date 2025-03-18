import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_04_Lab_05 {

    static class Student{

        private String firstname;
        private String lastname;
        private int age;
        private String hometown;

        public Student(String ime, String prezime, int godine, String grad){

            this.firstname=ime;
            this.lastname=prezime;
            this.age=godine;
            this.hometown=grad;
        }

        public String getHometown(){

            return this.hometown;
        }

        public void setHometown(String noviGrad){

            this.hometown=noviGrad;
        }

        public void introduceStudent(){

            System.out.printf("%s %s is %d years old\n", this.firstname, this.lastname, this.age);
        }


    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        ArrayList<Student> students=new ArrayList<>();

        while(true){

            String text=sc.nextLine();

            if(text.equals("end")) break;

            String [] parts= text.split(" ");

            String firstname=parts[0];

            String lastname=parts[1];

            int age=Integer.parseInt(parts[2]);

            String hometown=parts[3];

            Student student=new Student(firstname, lastname, age, hometown);

            students.add(student);

        }

        String city=sc.nextLine();

        for(Student s: students){

            if(s.getHometown().equals(city)){

                s.introduceStudent();

            }
        }

    }
}
