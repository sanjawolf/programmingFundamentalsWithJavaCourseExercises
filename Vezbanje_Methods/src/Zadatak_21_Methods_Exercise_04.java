import java.util.Scanner;

public class Zadatak_21_Methods_Exercise_04 {

    public static boolean is610CharactersLength(String string){

        int n=string.length();

        if(n>=6 && n<=10) return true;
        else return false;
    }

    public static boolean consistsOnlyLettersDigits(String string){

        int n=string.length();

        boolean consistsOnlyLettersDigits=true;

        for(int i=0; i<n; i++){

            char character=string.charAt(i);

            if(!((character>='a' && character<='z') || (character>='A' && character<='Z') || (character>='0' && character<='9'))){

                consistsOnlyLettersDigits=false;
                break;
            }
        }

        if(consistsOnlyLettersDigits) return true;
        else return false;
    }

    public static boolean consistsLeast2Digits(String string){

        int n=string.length();

        int counter=0;

        for(int i=0; i<n; i++){

            char character=string.charAt(i);

            if(character>='0' && character<='9') counter++;
        }

        if(counter>=2) return true;
        else return false;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String string=sc.nextLine();

        if(!is610CharactersLength(string)) System.out.println("Password must be between 6 and 10 characters");

        if(!consistsOnlyLettersDigits(string)) System.out.println("Password must consist only of letters and digits");

        if(!consistsLeast2Digits(string)) System.out.println("Password must have at least 2 digits");

        if(is610CharactersLength(string) && consistsOnlyLettersDigits(string) && consistsLeast2Digits(string))
            System.out.println("Password is valid");
    }
}
