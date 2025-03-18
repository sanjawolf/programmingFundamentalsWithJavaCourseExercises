import java.util.Scanner;

public class Zadatak_09_Judge_Exercise_09 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String arrayText=sc.nextLine();

        String[] arrayParts=arrayText.split(" ");

        int n=arrayParts.length;

        int [] array=new int[n];

        for(int i=0; i<n; i++){

            array[i]=Integer.parseInt(arrayParts[i]);
        }

        while(true){

            String text=sc.nextLine();

            String [] textParts=text.split(" ");

            int m=textParts.length;

            if(textParts[0].equals("swap")){

                int [] newArray=new int[m-1];

                for(int i=0; i<m-1; i++){

                    newArray[i]=Integer.parseInt(textParts[i+1]);

                }

                int swaping=array[newArray[0]];
                array[newArray[0]]=array[newArray[1]];
                array[newArray[1]]=swaping;

            }


                if(textParts[0].equals("multiply")){

                    int [] newArrayMultiply=new int[m-1];

                    for(int i=0; i<m-1; i++){

                        newArrayMultiply[i]=Integer.parseInt(textParts[i+1]);
                    }

                    array[newArrayMultiply[0]]= array[newArrayMultiply[0]]*array[newArrayMultiply[1]];

            }

                if(textParts[0].equals("decrease")){

                    for(int i=0; i<n; i++) {

                        array[i] -= 1;

                    }
            }

            if(textParts[0].equals("end")){

                for(int i=0; i<n; i++){

                    if(i<n-1){

                        System.out.print(array[i]+", ");
                    }

                    else{

                        System.out.print(array[i]);
                    }
                }

                return;
            }

        }




    }
}
