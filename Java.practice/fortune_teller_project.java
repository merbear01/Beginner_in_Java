import java.util.Scanner;
import java.util.Random;
public class fortune_teller_project {
    public static void main(String[]args){
        System.out.println("This is a fortune teller");
        Scanner Nausicaa = new Scanner(System.in);
        System.out.println("Pick a number:");
        int a = Nausicaa.nextInt();
        System.out.println("Pick a letter from the alphabet:");
        Nausicaa.next();
        String b = Nausicaa.nextLine();
        String[] luck = {"You will find your true love tomorrow",
                "your grandma is very old",
                "tomorrow is the queens birthday",
                "no bitches?",
                "i love you",
                "i forsee diabetes if you don't stop drinking boba",
                "The one you love is closer than you think",
                "Your soulmate is next to you",
                "Your birthday is coming up very soon",
                "Your birthday passed some time ago",
                "You will have something sweet soon",
                "You will have something spicy soon",
                "Something you lost will turn up soon",
                "Everything is going to be alright",
                "A tall dark handsome stranger in your future, it may be a man or a woman who knows =)",
                "A secret admirer will soon send you a sign of affection",
                "You wear red nail polish cause you were a hooker in your life"};
        Random Dido = new Random();
        int x = Dido.nextInt(luck.length);
        System.out.println("your fortune for today is: "+ luck[x] );

    }
}
