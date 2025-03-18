import java.util.Scanner;

public class Zadatak_14_Arrays_Exercise_09 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts= text.split(" ");

        int n= parts.length;

        int [] array=new int[n];

        for(int i=0; i<n; i++){

            array[i]=Integer.parseInt(parts[i]);
        }

        while(true){

            String command=sc.nextLine();

            if(command.equals("end")) break;

            String [] commandParts=command.split(" ");

            if(commandParts[0].equals("swap")){

                int index1=Integer.parseInt(commandParts[1]);
                int index2=Integer.parseInt(commandParts[2]);

                int help=array[index1];
                array[index1]=array[index2];
                array[index2]=help;

            }

            if(commandParts[0].equals("multiply")){

                int index1=Integer.parseInt(commandParts[1]);
                int index2=Integer.parseInt(commandParts[2]);

                array[index1]=array[index1]*array[index2];
            }

            if(commandParts[0].equals("decrease")){

                for(int i=0; i<n; i++) array[i]-=1;
            }
        }

        for(int i=0; i<n; i++){

            if(i!=array.length-1) System.out.printf("%d, ", array[i]);
            else System.out.printf("%d", array[i]);
        }

    }
}
