import java.util.*;

public class Main {

    static ArrayList<String> deck = new ArrayList<String>();

    public static void makeDeck(){

        //Adds all the Spades
        deck.add("SK");
        deck.add("SQ");
        deck.add("SJ");
        deck.add("S10");
        deck.add("S9");
        deck.add("S8");
        deck.add("S7");
        deck.add("S6");
        deck.add("S5");
        deck.add("S4");
        deck.add("S3");
        deck.add("S2");
        deck.add("S1");

        //Adds all the Clubs
        deck.add("CK");
        deck.add("CQ");
        deck.add("CJ");
        deck.add("C10");
        deck.add("C9");
        deck.add("C8");
        deck.add("C7");
        deck.add("C6");
        deck.add("C5");
        deck.add("C4");
        deck.add("C3");
        deck.add("C2");
        deck.add("C1");

        //Adds all the Diamonds
        deck.add("DK");
        deck.add("DQ");
        deck.add("DJ");
        deck.add("D10");
        deck.add("D9");
        deck.add("D8");
        deck.add("D7");
        deck.add("D6");
        deck.add("D5");
        deck.add("D4");
        deck.add("D3");
        deck.add("D2");
        deck.add("D1");

        //Adds all the Hearts
        deck.add("HK");
        deck.add("HQ");
        deck.add("HJ");
        deck.add("H10");
        deck.add("H9");
        deck.add("H8");
        deck.add("H7");
        deck.add("H6");
        deck.add("H5");
        deck.add("H4");
        deck.add("H3");
        deck.add("H2");
        deck.add("H1");

        //Shuffles Deck
        Collections.shuffle(deck);
    }

    public static void placeCards(){

        for(int a = 0; a < 7; a++){
            for (int b = 7; b > a; b--){
                System.out.print(deck.get(0) + " ");
                deck.remove(0);
            }
            System.out.println("");
        }

    }
}
