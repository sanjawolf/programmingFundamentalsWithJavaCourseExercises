import java.util.Scanner;

public class Zadatak_09_Judge_Exercise_06 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());
        char firstCharacter='a';

//        for(int i=97; i<=97+n-1; i++){
//
//            for(int j=97; j<=97+n-1; j++){
//
//                for(int k=97; k<=97+n-1; k++){
//
//                    char character1=(char)i;
//                    char character2=(char)j;
//                    char character3=(char)k;
//
//                    System.out.printf("%c%c%c\n", character1, character2, character3);
//
//                }
//            }
//        }

        for(int i=1; i<=n; i++){

            char character1=(char)((int)firstCharacter+i-1);

            for(int j=1; j<=n; j++){

                char character2=(char)((int)firstCharacter+j-1);

                for(int k=1; k<=n; k++){

                    char character3=(char)((int)firstCharacter+k-1);

                    System.out.printf("%c%c%c\n", character1, character2, character3);

                }
            }

        }
    }
}
