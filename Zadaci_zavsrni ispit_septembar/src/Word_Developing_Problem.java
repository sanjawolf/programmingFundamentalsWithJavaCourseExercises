import java.util.Scanner;

public class Word_Developing_Problem {

    public static String add(String s, String substring){

        s=s.concat(substring);
        return s;
    }

    public static String upgrade(String s, String character){

        s=s.replace(character, (char)((int)(character.charAt(0))+1)+"");

        return s;
    }

    public static void print(String s){

        System.out.println(s);
    }

    public static void index(String s, String character){

        boolean contains=false;

        for(int i=0; i<s.length(); i++){

            if((s.charAt(i)+"").equals(character)){

                System.out.printf("%d ", i);
                contains=true;
            }
        }

        if(!contains) System.out.println("None");
        else System.out.println();
    }

    public static String remove(String s, String substring){

        s=s.replace(substring, "");
        return s;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String string="";

        while(true){

            String command=sc.nextLine();

            if(command.equals("End")) break;

            String [] commandParts=command.split(" ");

            String firstPart=commandParts[0];

            if(firstPart.equals("Add")){

                String substring=commandParts[1];

                string=add(string, substring);
            }

            if(firstPart.equals("Upgrade")){

                String character=commandParts[1];

                string=upgrade(string, character);
            }

            if(firstPart.equals("Print")){

                print(string);
            }

            if(firstPart.equals("Index")){

                String character=commandParts[1];

                index(string, character);
            }

            if(firstPart.equals("Remove")){

                String substring=commandParts[1];

                string=remove(string, substring);
            }
        }
    }
}
