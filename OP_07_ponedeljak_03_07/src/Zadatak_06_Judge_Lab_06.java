import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_06_Judge_Lab_06 {

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

      public String getFirstname(){

            return this.firstName;
      }

      public void setFirstName(String firstName){

            this.firstName=firstName;
      }

        public String getLastname(){

            return this.lastName;
        }

        public void setLastName(String lastName){

            this.lastName=lastName;
        }

        public int getAge() {

            return this.age;
        }

        public void setAge(int age){

            this.age=age;
        }

        public String getCity() {

            return this.hometown;
        }

        public void setCity(String givenCity) {

            this.hometown = givenCity;
        }

        public void introduceYourself(){

            System.out.printf("%s %s is %d years old\n", this.firstName, this.lastName, this.age);
        }

        public static void changeAge(ArrayList<Student> students, String city, int age, String name){

            for(int i=0; i<students.size(); i++){

                if(students.get(i).getCity().equals(city) && students.get(i).getFirstname().equals(name)){

                        students.get(i).setAge(age);
                    students.get(i).introduceYourself();


                }

            }
        }

    }

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

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
//            Student.changeAge(students, city, age, name);

        }


}
