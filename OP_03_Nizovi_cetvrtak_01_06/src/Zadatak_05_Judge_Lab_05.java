import java.util.Scanner;

public class Zadatak_05_Judge_Lab_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String numbersText=sc.nextLine();

        String numbersArray []=numbersText.split(" ");

        int n=numbersArray.length;

        int numbers[]=new int[n];

        for (int i=0; i<n; i++){

            numbers[i]=Integer.parseInt(numbersArray[i]);
        }

        int sumEven=0;
        int sumOdd=0;

        for(int number: numbers){

            if(number%2==0){

                sumEven+=number;
            }

            else{

                sumOdd+=number;
            }
        }

//        for(int i=0; i<n; i++){
//
//            if(numbers[i]%2==0){
//
//                sumEven+=numbers[i];
//            }
//
//            else{
//
//                sumOdd+=numbers[i];
//            }
//        }

        System.out.println(sumEven-sumOdd);
    }
}
