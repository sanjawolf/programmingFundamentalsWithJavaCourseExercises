import java.util.Scanner;

public class Zadatak_08_Judge_Exercise_05 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int starting=Integer.parseInt(sc.nextLine());
        int last=Integer.parseInt(sc.nextLine());

        for(int i=starting; i<=last; i++){

            char character=(char)i;
            System.out.print(character+" ");
        }
    }
}
