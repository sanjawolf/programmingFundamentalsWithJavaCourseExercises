import java.util.Random;
import java.util.Scanner;

public class Zadatak_06_Exercise_01 {

    public static void generateMessage(){

        String [] phrases={"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};

        String [] events={"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};

        String [] authors={"Diana", "Mary", "Linda", "Susan", "Sarah", "Lisa", "Annie", "Emily"};

        String [] cities={"London", "Rome", "New York", "Paris", "Berlin"};

        Random rand=new Random();

        String phrase=phrases[rand.nextInt(phrases.length)];
        String event=events[rand.nextInt(events.length)];
        String author=authors[rand.nextInt(authors.length)];
        String city=cities[rand.nextInt(cities.length)];

        System.out.printf("%s %s %s - %s\n", phrase, event, author, city);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int numberOfMessages=Integer.parseInt(sc.nextLine());

        for(int i=1; i<=numberOfMessages; i++){

            generateMessage();
        }

    }
}
