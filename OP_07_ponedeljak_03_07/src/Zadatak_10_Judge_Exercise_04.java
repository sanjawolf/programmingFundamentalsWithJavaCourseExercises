import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Zadatak_10_Judge_Exercise_04 {

    static class Student{

        private String firstName;
        private String lastName;
        private double grade;

        public Student(String fn, String ln, double g){

            this.firstName=fn;
            this.lastName=ln;
            this.grade=g;
        }

        public double getGrade(){

            return this.grade;
        }

        public void setGrade(double grade){

            this.grade=grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

        ArrayList<Student> students=new ArrayList<>();

        for(int i=1; i<=n; i++){

            String text=sc.nextLine();

            String [] textParts=text.split(" ");

            String firstName=textParts[0];
            String lastName=textParts[1];
            double grade=Double.parseDouble(textParts[2]);

            Student student=new Student(firstName, lastName, grade);
            students.add(student);

        }

        students.sort(Comparator.comparingDouble(Student::getGrade).reversed());

      for(Student s: students){

          System.out.println(s);
      }


    }
}
