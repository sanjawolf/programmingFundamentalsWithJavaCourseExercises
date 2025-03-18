import java.util.Scanner;

public class Zadatak_09_Judge_Lab_10 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());

       for(int i=1; i<=n; i++){

            String numberText=i+ "";

            int length=numberText.length();

            int sum=0;

            for(int j=0; j<length; j++){

                char character=numberText.charAt(j);

                int number=Integer.parseInt(character+"");

                sum+=number;
            }

            boolean special=(sum==5 || sum==7 || sum==11);

            if(special){

                System.out.printf("%s -> True\n", numberText);

            }

            else{

                System.out.printf("%s -> False\n", numberText);
            }

        }
    }
}
