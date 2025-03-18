import java.util.Scanner;

public class Zadatak_04_Judge_Lab_03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String numbersText=sc.nextLine();

        String numbersArray []=numbersText.split(" ");

        int n=numbersArray.length;

        int numbers[]=new int [n];

        for(int i=0; i<n; i++){

            numbers[i]=Integer.parseInt(numbersArray[i]);

        }

        int sum=0;

        for(int i=0; i<n; i++){

            if(numbers[i]%2==0){

                sum+=numbers[i];
            }
        }

//        for(int number: numbers){
//
//            if(number%2==0){
//
//                sum+=number;
//            }
//        }

        System.out.println(sum);
    }
}
