import java.util.Scanner;

public class Zadatak_07 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int N=Integer.parseInt(sc.nextLine());
        int M=Integer.parseInt(sc.nextLine());
        int S=Integer.parseInt(sc.nextLine());

        for(int i=M; i>=N; i--){

            if(i%2==0 && i%3==0){

                if(i==S){

                    return;

                }

                else{

                    System.out.print(i+ " ");

                }

            }
        }
    }
}
