import java.util.Scanner;

public class Zadatak_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numberOfStudents=Integer.parseInt(sc.nextLine());

        int totalNumberOfLectures=Integer.parseInt(sc.nextLine());

        int additionalBonus=Integer.parseInt(sc.nextLine());

        double max=0;

        int studentAttendances=0;

        for(int i=1; i<=numberOfStudents; i++){

            int countOfAttendances=Integer.parseInt(sc.nextLine());

            double totalBonus=(double)countOfAttendances/totalNumberOfLectures*(5 + additionalBonus);

            if(totalBonus>max){

                max=totalBonus;
                studentAttendances=countOfAttendances;
            }
        }

        System.out.printf("Max Bonus: %d.\n", (int)Math.ceil(max));

        System.out.printf("The student has attended %d lectures.", studentAttendances);
    }
}
