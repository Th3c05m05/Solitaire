import java.util.*;

public class Main extends User{

    static ArrayList<String> deck = new ArrayList<String>();
    static String [][] field = new String[13][7];
    static String [][] finals = new String[13][4];

    public static void makeDeck(){

        //Adds all the Spades
        deck.add("13SB"); //king
        deck.add("12SB"); //queen
        deck.add("11SB"); //jack
        deck.add("10SB");
        deck.add("09SB");
        deck.add("08SB");
        deck.add("07SB");
        deck.add("06SB");
        deck.add("05SB");
        deck.add("04SB");
        deck.add("03SB");
        deck.add("02SB");
        deck.add("01SB"); //ace

        //Adds all the Clubs
        deck.add("13CB"); //king
        deck.add("12CB"); //queen
        deck.add("11CB"); //jack
        deck.add("10CB");
        deck.add("09CB");
        deck.add("08CB");
        deck.add("07CB");
        deck.add("06CB");
        deck.add("05CB");
        deck.add("04CB");
        deck.add("03CB");
        deck.add("02CB");
        deck.add("01CB"); //ace

        //Adds all the Diamonds
        deck.add("13DR"); //king
        deck.add("12DR"); //queen
        deck.add("11DR"); //jack
        deck.add("10DR");
        deck.add("09DR");
        deck.add("08DR");
        deck.add("07DR");
        deck.add("06DR");
        deck.add("05DR");
        deck.add("04DR");
        deck.add("03DR");
        deck.add("02DR");
        deck.add("01DR"); //ace

        //Adds all the Hearts
        deck.add("13HR"); //king
        deck.add("12HR"); //queen
        deck.add("11HR"); //jack
        deck.add("10HR");
        deck.add("09HR");
        deck.add("08HR");
        deck.add("07HR");
        deck.add("06HR");
        deck.add("05HR");
        deck.add("04HR");
        deck.add("03HR");
        deck.add("02HR");
        deck.add("01HR"); //ace

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
