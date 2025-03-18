import java.util.Scanner;

public class Zadatak_04_Judge_Exercise_01 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int personAge=Integer.parseInt(sc.nextLine());

        if(personAge<=2 && personAge>=0){

            System.out.println("baby");
        }

        else if(personAge<=13){

            System.out.println("child");
        }

        else if(personAge<=19){

            System.out.println("teenager");
        }

        else if(personAge<=65){

            System.out.println("adult");
        }

        else{

            System.out.println("elder");
        }
    }
}
