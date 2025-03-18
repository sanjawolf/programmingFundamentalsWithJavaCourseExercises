import java.util.Scanner;

public class Zadatak_01_03_14 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite brojeve: ");

        String text=sc.nextLine();

        String [] numbers=text.split(" ");

        if(numbers.length==1) System.out.println("Nije unet nijedan broj.");

        else{

            int product=1;

            int pointer=-1;

            for(int i=0; i<=numbers.length-1; i++){

                int number=Integer.parseInt(numbers[i]);

                if(number==0){

                    break;
                }

                else if(number>0){

                    pointer=-1;
                    product*=number;
                }

                else{

                    pointer=1;
                }
            }

            if(pointer==1){

                System.out.println("Medju unetim brojevima nema pozitivnih.");
            }

            else{

                System.out.printf("Proizvod pozitivnih brojeva je %d.", product);
            }


        }











    }
}
