import java.util.Random;
import java.util.Scanner;

public class Zadatak_07_Judge_Exercise_01 {

    public static void generateMessage(){

        String [] phrases={"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};

        String [] events={"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};

        String [] authors={"Diana", "Mary", "Linda", "Susan", "Sarah", "Lisa", "Annie", "Emily"};

        String [] cities={"London", "Rome", "New York", "Paris", "Berlin"};

        Random rand=new Random();
        int randPositionPhrase=rand.nextInt(phrases.length);
        int randPositionEvent=rand.nextInt(events.length);
        int randPositionAuthor=rand.nextInt(authors.length);
        int randPositionCity=rand.nextInt(cities.length);

        String phrase=phrases[randPositionPhrase];
        String event=events[randPositionEvent];
        String author=authors[randPositionAuthor];
        String city=cities[randPositionCity];

        //{phrase} {event} {author} – {city}.

        System.out.printf("%s %s %s - %s\n", phrase, event, author, city);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int N=Integer.parseInt(sc.nextLine());

        for(int i=1; i<=N; i++){

            generateMessage();

        }


    }
}
