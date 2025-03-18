import java.util.Scanner;

public class Zadatak_07_Exercise_02 {


    public static int countUnicode(String string1, String string2){

        int n=string1.length();
        int m=string2.length();

        int sum=0;

        if(n>m){

            for(int i=0; i<m; i++){

                char character1=string1.charAt(i);
                char character2=string2.charAt(i);

                sum+=(int) character1*(int) character2;
            }

            for(int i=m; i<n; i++){

                char character1=string1.charAt(i);

                sum=sum+(int)character1;
            }
        }

        else{

            for(int i=0; i<n; i++){

                char character1=string1.charAt(i);
                char character2=string2.charAt(i);

                sum+=(int) character1*(int) character2;
            }

            for(int i=n; i<m; i++){

                char character2=string2.charAt(i);

                sum=sum+(int)character2;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String string=sc.nextLine();

        String [] parts=string.split(" ");

        System.out.println(countUnicode(parts[0], parts[1]));


    }
}
