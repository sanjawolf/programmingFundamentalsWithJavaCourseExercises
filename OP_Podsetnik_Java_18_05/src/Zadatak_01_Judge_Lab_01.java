import java.util.Scanner;

public class Zadatak_01_Judge_Lab_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String studentName=sc.nextLine();
        int age=Integer.parseInt(sc.nextLine());
        double averageGrade=Double.parseDouble(sc.nextLine());

//        System.out.printf("Name: %s, Age: %d, Grade: %.2f", studentName, age, averageGrade);

        String string=String.format("Name: %s, Age: %d, Grade: %.2f", studentName, age, averageGrade);
        System.out.println(string);

    }
}
