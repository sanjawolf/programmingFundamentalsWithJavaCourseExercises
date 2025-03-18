import java.util.Scanner;

public class Zadatak_01_03_18 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Unesite broj n: ");

        int n=Integer.parseInt(sc.nextLine());

        if(n<=0){

            System.out.println("Greska: neispravan unos.");
            return;
        }

        System.out.println("Unesite brojeve:");

        String text=sc.nextLine();

        String [] numbers=text.split(" ");

        int pointer=-1;

        int sum=0;

        for(int i=0; i<=n-1; i++){

            double number=Double.parseDouble(numbers[i]);

            if(i==0){

                if(number>=0){

                    pointer=1;

                }

                else{

                    pointer=0;
                }
            }

            else{

                if(number>=0){

                    if(pointer==0){

                        sum+=1;
                        pointer=1;
                    }

                }

                else{

                    if(pointer==1){

                        sum+=1;
                        pointer=0;
                    }
                }
            }




        }

        System.out.printf("Broj promena je %d.", sum);


    }
}
