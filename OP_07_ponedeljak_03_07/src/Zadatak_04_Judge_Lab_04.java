import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Zadatak_04_Judge_Lab_04 {

    static class Song{

        private String typeList;
        private String name;
        private String time;

        public Song(String tl, String n, String t){

            this.typeList=tl;
            this.name=n;
            this.time=t;

        }

        public String getTypeList(){

            return this.typeList;
        }

        public void setTypeList(String givenTypeList){

            this.typeList=givenTypeList;

        }

        public void printName(){

            System.out.println(this.name);
        }

        public void printAll(){

            System.out.println("all");
        }

        public static void returnsType(ArrayList<Song> songs, String givenTypeList){

            for(Song s: songs){

                if(s.getTypeList().equals(givenTypeList)){

                    s.printName();
                }

                }

                if(givenTypeList.equals("all")){

                    for(Song s: songs){

                            s.printName();

                }

            }

            }

        }




    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        ArrayList<Song> songs=new ArrayList<>();

        int N=Integer.parseInt(sc.nextLine());

        for(int i=1; i<=N; i++){

            String values=sc.nextLine();

            String [] parts=values.split("_");

            String typeList=parts[0];
            String name=parts[1];
            String time=parts[2];

            Song song=new Song(typeList, name, time);
            songs.add(song);

        }



        String givenTypeList=sc.nextLine();
        Song.returnsType(songs, givenTypeList);



    }
}
