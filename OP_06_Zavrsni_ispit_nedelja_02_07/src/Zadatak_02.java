import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        String [] parts=text.split(" ");

        ArrayList <Integer> list=new ArrayList<>();

        for(int i=0; i<parts.length; i++){

            list.add(Integer.parseInt(parts[i]));
        }

        while(true){

            String command=sc.nextLine();

            if(command.equals("END")) break;

            String [] commandParts=command.split(" ");

            if(commandParts[0].equals("add")){

                for(int i=3; i<commandParts.length; i++){

                    int number=Integer.parseInt(commandParts[i]);
                    list.add(i-3, number);
                }

//                for(int element: list) System.out.printf("%d ", element);
//                System.out.println();

            }

            if(commandParts[1].equals("greater")){

                int number=Integer.parseInt(commandParts[3]);

                for(int i=list.size()-1; i>=0; i--){

                    int listNumber=list.get(i);

                    if(listNumber>number){

                        list.remove(i);
                    }
                }

//                for(int element: list) System.out.printf("%d ", element);
//                System.out.println();

            }

            if(commandParts[0].equals("replace")){

                int value=Integer.parseInt(commandParts[1]);

                int replacement=Integer.parseInt(commandParts[2]);

                int n=list.size();

                for(int i=0; i<n; i++){

                    if(list.get(i)==value){

                        list.set(i, replacement);
                        break;
                    }
                }

//                for(int element: list) System.out.printf("%d ", element);
//                System.out.println();

            }

            if(commandParts[1].equals("at")){

                int index=Integer.parseInt(commandParts[3]);

                if(index>=0 && index<list.size()) list.remove(index);

//                for(int element: list) System.out.printf("%d ", element);
//                System.out.println();

            }

            if(commandParts[1].equals("even")){

                for(int i=0; i<list.size(); i++){

                    if(list.get(i)%2==0){

                        System.out.printf("%d ", list.get(i));
                    }
                }


                System.out.println();
            }

            if(commandParts[1].equals("odd")){

                for(int i=0; i<list.size(); i++){

                    if(list.get(i)%2!=0) {
                        System.out.printf("%d ", list.get(i));
                    }
                }

                System.out.println();
            }


        }

        for(int i=0; i<list.size(); i++){

            if(i!=list.size()-1) System.out.printf("%d, ", list.get(i));
            else System.out.printf("%d", list.get(i));
        }

    }
}
