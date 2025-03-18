import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Zadatak_09_Exercise_04 {

    static class Student{

        private String firstname;
        private String lastname;
        private double grade;

        public Student(String ime, String prezime, double prosek){

            this.firstname=ime;
            this.lastname=prezime;
            this.grade=prosek;
        }

        public Student(String text){

            String [] parts=text.split(" ");
            this.firstname=parts[0];
            this.lastname=parts[1];
            this.grade=Double.parseDouble(parts[2]);

        }

        public double getGrade(){

            return this.grade;
        }

        public void setGrade(double noviProsek){

            this.grade=noviProsek;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", this.firstname, this.lastname, this.grade);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        ArrayList <Student> students=new ArrayList<>();

        for(int i=1; i<=n; i++){

            String text=sc.nextLine();

            Student student=new Student(text);

            students.add(student);
        }

        students.sort(Comparator.comparingDouble(Student::getGrade).reversed());

        for(Student s: students){

            System.out.println(s);
        }
    }
}
