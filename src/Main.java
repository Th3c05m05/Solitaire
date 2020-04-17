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
        deck.add("9SB");
        deck.add("8SB");
        deck.add("7SB");
        deck.add("6SB");
        deck.add("5SB");
        deck.add("4SB");
        deck.add("3SB");
        deck.add("2SB");
        deck.add("1SB"); //ace

        //Adds all the Clubs
        deck.add("13CB"); //king
        deck.add("12CB"); //queen
        deck.add("11CB"); //jack
        deck.add("10CB");
        deck.add("9CB");
        deck.add("8CB");
        deck.add("7CB");
        deck.add("6CB");
        deck.add("5CB");
        deck.add("4CB");
        deck.add("3CB");
        deck.add("2CB");
        deck.add("1CB"); //ace

        //Adds all the Diamonds
        deck.add("13DR"); //king
        deck.add("12DR"); //queen
        deck.add("11DR"); //jack
        deck.add("10DR");
        deck.add("9DR");
        deck.add("8DR");
        deck.add("7DR");
        deck.add("6DR");
        deck.add("5DR");
        deck.add("4DR");
        deck.add("3DR");
        deck.add("2DR");
        deck.add("1DR"); //ace

        //Adds all the Hearts
        deck.add("13HR"); //king
        deck.add("12HR"); //queen
        deck.add("11HR"); //jack
        deck.add("10HR");
        deck.add("9HR");
        deck.add("8HR");
        deck.add("7HR");
        deck.add("6HR");
        deck.add("5HR");
        deck.add("4HR");
        deck.add("3HR");
        deck.add("2HR");
        deck.add("1HR"); //jack

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
            for (int d = 0; d < field[0].length; d++) { System.out.print(strings[d] + " "); }
            System.out.println("");
        }

    }
}
