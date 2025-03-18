import java.util.ArrayList;
import java.util.Scanner;


public class Zadatak_05_Judge_Lab_05 {

    static class Student {

        private String firstName;
        private String lastName;
        private int age;
        private String hometown;

        public Student(String fn, String ln, int age, String ht) {

            this.firstName = fn;
            this.lastName = ln;
            this.age = age;
            this.hometown = ht;

        }

        public void introduceYourself() {

            System.out.printf("%s %s is %d years old\n", this.firstName, this.lastName, this.age);
        }

        public String getCity() {

            return this.hometown;
        }

        public void setCity(String givenCity) {

            this.hometown = givenCity;
        }

        public static void findTheStudentFromTheCity(ArrayList<Student> students, String city) {

            for (Student s : students) {

                if (s.getCity().equals(city)) {

                    s.introduceYourself();

                }

            }

        }

    }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            ArrayList<Student> students = new ArrayList<>();

            while (true) {

                String values = sc.nextLine();

                if (values.equals("end")) break;

                String [] parts= values.split(" ");

                String firstName = parts[0];
                String lastName = parts[1];
                int age = Integer.parseInt(parts[2]);
                String hometown = "";

                for (int i = 3; i < parts.length; i++) {

                    hometown += parts[i]+" ";

                }

                hometown = hometown.trim();

                Student student = new Student(firstName, lastName, age, hometown);
                students.add(student);
            }

            String city = sc.nextLine();

            Student.findTheStudentFromTheCity(students, city);

        }
    }

