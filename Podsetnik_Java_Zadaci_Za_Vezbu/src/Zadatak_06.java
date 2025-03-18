import java.util.Scanner;

public class Zadatak_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int period=Integer.parseInt(sc.nextLine());
        int treatedPatients=0;
        int untreatedPatients=0;
        int numberOfDoctors=7;

        for (int i=1; i<=period; i++){

            int currentPatients=Integer.parseInt(sc.nextLine());

            if(i%3==0 && treatedPatients<untreatedPatients){

                numberOfDoctors++;
            }

            if(numberOfDoctors<currentPatients){

                treatedPatients+=numberOfDoctors;
                untreatedPatients+=currentPatients-numberOfDoctors;
            }

            else{

                treatedPatients+=currentPatients;

            }
        }

        System.out.printf("Treated patients: %d.\n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);
    }
}
