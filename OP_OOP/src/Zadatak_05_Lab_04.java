import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_05_Lab_04 {

    static class Song{

        public String typelist;
        private String name;
        private String time;

        public Song(String lista, String ime, String vreme){

            this.typelist=lista;
            this.name=ime;
            this.time=vreme;
        }

        public String getTypelist(){

            return this.typelist;
        }

        public void setTypelist(String novaLista){

            this.typelist=novaLista;
        }

        public String getName(){

            return  this.name;
        }

        public void setName(String novoIme){

            this.name=novoIme;
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        ArrayList<Song> songs=new ArrayList<>();

        int N=Integer.parseInt(sc.nextLine());

        for(int i=1; i<=N; i++){

            String text=sc.nextLine();

            String [] parts=text.split("_");

            String typelist=parts[0];

            String name=parts[1];

            String time=parts[2];

            Song song=new Song(typelist, name, time);

            songs.add(song);
        }

        String typeListOrAll=sc.nextLine();

        for(Song s: songs){

            if(s.getTypelist().equals(typeListOrAll) || typeListOrAll.equals("all")){

                System.out.println(s.getName());
            }
        }
    }
}
