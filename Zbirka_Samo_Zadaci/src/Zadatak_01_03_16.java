import java.util.Scanner;

public class Zadatak_01_03_16 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite brojeve: ");

        String text=sc.nextLine();

        String [] numbers=text.split(" ");

        if(numbers.length==1){

            System.out.println("Nisu uneti brojevi.");
        }

        else{

            int sum=0;

            for(int i=0; i<=numbers.length-1; i++){

                int number=Integer.parseInt(numbers[i]);

                if(number==0) break;

                sum+=number;
            }

            double am=(double)sum/(numbers.length-1);

            System.out.printf("Aritmeticka sredina: %.4f", am);
        }


    }
}
