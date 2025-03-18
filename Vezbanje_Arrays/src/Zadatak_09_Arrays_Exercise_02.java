import java.util.Scanner;

public class Zadatak_09_Arrays_Exercise_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text1=sc.nextLine();

        String [] parts1=text1.split(" ");

        int n1=parts1.length;

        String [] array1=new String[n1];

        for(int i=0; i<n1; i++){

            array1[i]=parts1[i];
        }

        String text2=sc.nextLine();

        String [] parts2=text2.split(" ");

        int n2=parts2.length;

        String [] array2=new String[n2];

        for(int i=0; i<n2; i++){

            array2[i]=parts2[i];
        }

        for(int i=0; i<n2; i++){

            for(int j=0; j<n1; j++){

                if(array2[i].equals(array1[j])){

                    System.out.printf("%s ", array2[i]);
                }
            }
        }

//        for(String element: array){
//
//
//        }

    }
}
