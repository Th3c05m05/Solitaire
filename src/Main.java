import java.util.*;

public class Main extends User{

    static ArrayList<String> deck = new ArrayList<String>();
    static String [][] field = new String[13][7];
    static String [][] finals = new String[13][4];

    public static void makeDeck(){

        //Adds all the Spades
        deck.add("13SB.png"); //king
        deck.add("12SB.png"); //queen
        deck.add("11SB.png"); //jack
        deck.add("10SB.png");
        deck.add("09SB.png");
        deck.add("08SB.png");
        deck.add("07SB.png");
        deck.add("06SB.png");
        deck.add("05SB.png");
        deck.add("04SB.png");
        deck.add("03SB.png");
        deck.add("02SB.png");
        deck.add("01SB.png"); //ace

        System.out.println("test");

        //Adds all the Clubs
        deck.add("13CB.png"); //king
        deck.add("12CB.png"); //queen
        deck.add("11CB.png"); //jack
        deck.add("10CB.png");
        deck.add("09CB.png");
        deck.add("08CB.png");
        deck.add("07CB.png");
        deck.add("06CB.png");
        deck.add("05CB.png");
        deck.add("04CB.png");
        deck.add("03CB.png");
        deck.add("02CB.png");
        deck.add("01CB.png"); //ace

        //Adds all the Diamonds
        deck.add("13DR.png"); //king
        deck.add("12DR.png"); //queen
        deck.add("11DR.png"); //jack
        deck.add("10DR.png");
        deck.add("09DR.png");
        deck.add("08DR.png");
        deck.add("07DR.png");
        deck.add("06DR.png");
        deck.add("05DR.png");
        deck.add("04DR.png");
        deck.add("03DR.png");
        deck.add("02DR.png");
        deck.add("01DR.png"); //ace

        //Adds all the Hearts
        deck.add("13HR.png"); //king
        deck.add("12HR.png"); //queen
        deck.add("11HR.png"); //jack
        deck.add("10HR.png");
        deck.add("09HR.png");
        deck.add("08HR.png");
        deck.add("07HR.png");
        deck.add("06HR.png");
        deck.add("05HR.png");
        deck.add("04HR.png");
        deck.add("03HR.png");
        deck.add("02HR.png");
        deck.add("01HR.png"); //ace

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

    public static ArrayList<String> deckOut(){

        deck.add("13HR.png");
        return deck;
    }
}
