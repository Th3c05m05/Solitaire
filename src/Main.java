import java.util.*;

public class Main {

    static ArrayList<String> deck = new ArrayList<String>();
    static String [][] field = new String[13][7];

    public static void makeDeck(){

        //Adds all the Spades
        deck.add("13S");
        deck.add("12S");
        deck.add("11S");
        deck.add("10S");
        deck.add("9S");
        deck.add("8S");
        deck.add("7S");
        deck.add("6S");
        deck.add("5S");
        deck.add("4S");
        deck.add("3S");
        deck.add("2S");
        deck.add("1S");

        //Adds all the Clubs
        deck.add("13C");
        deck.add("12C");
        deck.add("11C");
        deck.add("10C");
        deck.add("9C");
        deck.add("8C");
        deck.add("7C");
        deck.add("6C");
        deck.add("5C");
        deck.add("4C");
        deck.add("3C");
        deck.add("2C");
        deck.add("1C");

        //Adds all the Diamonds
        deck.add("13D");
        deck.add("12D");
        deck.add("11D");
        deck.add("10D");
        deck.add("9D");
        deck.add("8D");
        deck.add("7D");
        deck.add("6D");
        deck.add("5D");
        deck.add("4D");
        deck.add("3D");
        deck.add("2D");
        deck.add("1D");

        //Adds all the Hearts
        deck.add("13H");
        deck.add("12H");
        deck.add("11H");
        deck.add("10H");
        deck.add("9H");
        deck.add("8H");
        deck.add("7H");
        deck.add("6H");
        deck.add("5H");
        deck.add("4H");
        deck.add("3H");
        deck.add("2H");
        deck.add("1H");

        //Shuffles Deck
        Collections.shuffle(deck);
    }

    public static void setField(){

        for(int a = 0; a < 7; a++){
            for(int b = 0; b <= a; b++){

                field[b][a] = deck.get(0);

                deck.remove(0);
            }

        }

        for (String[] strings : field) {
            for (int d = 0; d < field[0].length; d++) {
                System.out.print(strings[d] + " ");
            }
            System.out.println("");
        }

    }
}
