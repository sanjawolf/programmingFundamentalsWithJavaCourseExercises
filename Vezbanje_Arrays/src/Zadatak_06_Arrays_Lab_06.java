import java.util.Scanner;

public class Zadatak_06_Arrays_Lab_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text1=sc.nextLine();

        String [] parts1=text1.split(" ");

        int n1= parts1.length;

        int [] array1=new int[n1];

        for(int i=0; i<n1; i++){

            array1[i]=Integer.parseInt(parts1[i]);
        }

        String text2=sc.nextLine();

        String [] parts2=text2.split(" ");

        int n2= parts1.length;

        int [] array2=new int[n2];

        for(int i=0; i<n2; i++){

            array2[i]=Integer.parseInt(parts2[i]);
        }

        if(n1==n2){

            boolean areIdentical=true;

            int sum=0;

            for(int i=0; i<n1; i++){

                    if(array1[i]!=array2[i]){

                        areIdentical=false;
                        System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                        break;

                    }
                }


            if(areIdentical){

                for(int element: array1){

                    sum+=element;

                }


                System.out.printf("Arrays are identical. Sum: %d", sum);

            }

        }


    }
}
