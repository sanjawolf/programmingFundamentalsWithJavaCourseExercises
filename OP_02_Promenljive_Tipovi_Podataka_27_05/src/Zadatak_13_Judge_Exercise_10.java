import java.util.Scanner;

public class Zadatak_13_Judge_Exercise_10 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int N=Integer.parseInt(sc.nextLine());
        int distanceBetweenPokeTargets=Integer.parseInt(sc.nextLine());
        int exhaustionFactor=Integer.parseInt(sc.nextLine());

        int pokePower=N;
        int counter=0;

        while(true){

            if(pokePower<distanceBetweenPokeTargets){

                break;
            }

            pokePower=pokePower-distanceBetweenPokeTargets;

            counter++;

            if(N*0.5==pokePower){

                if(exhaustionFactor!=0){

                    pokePower=pokePower/exhaustionFactor;
                }
            }



        }

        System.out.println(pokePower);
        System.out.println(counter);

    }
}
