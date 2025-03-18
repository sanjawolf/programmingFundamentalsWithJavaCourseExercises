import java.util.Scanner;

public class Zadatak_09_Judge_Exercise_06 {

public static void printsMiddleCharacter(String string){

    if(string.length()%2==0){

        System.out.printf("%c%c", string.charAt(string.length()/2-1), string.charAt(string.length()/2));
    }

    else{

        System.out.printf("%c", string.charAt(string.length()/2));
    }
}

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String string=sc.nextLine();

        printsMiddleCharacter(string);
    }
}
