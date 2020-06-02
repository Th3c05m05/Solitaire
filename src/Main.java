import java.util.*;

public class Main extends Start {
    public ArrayList<String> piler = new ArrayList<String>();


    public void checkInt() {
        piler.add(deck.get(0));//this indicates the beginning of the game. Once card of the deck is turned over and placed into the pile
        deck.remove(deck.get(0));


        int x = 0;

        Main obj = new Main();
        while (hand.size() >= 0) {

            Scanner input = new Scanner(System.in);

            System.out.println("It is your turn");
            System.out.println("This is the pile: " + piler);
            System.out.println("This is your hand" + hand);
            System.out.println("Select an index number. If you are out of option press type -1. If you want to quit the game press -5");
            int index = input.nextInt();

            if (index == -1) {
                hand.add(deck.get(0));
                deck.remove(deck.get(0));
                //obj.checkAI();
            } else if (index == -5) {
                System.out.println("Your final score was: " + x);
            } else if ((hand.get(index).substring(3, 4).equals(piler.get(piler.size() - 1).substring(3, 4))) && hand.get(index).substring(2, 3).equals(piler.get(piler.size() - 1).substring(2, 3))) {
                piler.add(hand.get(index));
                hand.remove(hand.get(index));
                x++;

                //obj.checkAI();
            } else if (Integer.parseInt(hand.get(index).substring(0, 2)) == Integer.parseInt(piler.get(piler.size() - 1).substring(0, 2))) {


                piler.add(hand.get(index));
                hand.remove(hand.get(index));
                x++;

                //obj.checkAI();


            } else {
                hand.add(deck.get(0));
                deck.remove(deck.get(0));
                //obj.checkAI();
            }


        }

        if (hand.size() == 0) {

            System.out.println("Congrats, you have won against the AI");
            System.exit(0);
        }


    }

    public void checkAI() {//checkAI has been having some minor issues...will try to see tm
       if(piler.size()==0){
           piler.add(hand.get(0));
           hand.remove(hand.get(0));
       }
       Start obj = new Start();

        ArrayList<String> reductionAI = new ArrayList<String>();

        Random objGenerator = new Random();
        int randomChose = 0;


        for (int x = 0; x < AI.size(); x++) {
            if ((AI.get(x).substring(3, 4).equals(piler.get(piler.size() - 1).substring(3, 4))) && (AI.get(x).substring(2, 3).equals(piler.get(piler.size()-1).substring(2, 3)))) {

                reductionAI.add(AI.get(x));


            } else if (Integer.parseInt(AI.get(x).substring(0, 2)) == Integer.parseInt(piler.get(piler.size() - 1).substring(0, 2))) {

                reductionAI.add(AI.get(x));


            } else {
                AI.add(deck.get(0));
                deck.remove(deck.get(0));
            }


        }

        randomChose = objGenerator.nextInt(reductionAI.size() - 1);

        AI.remove(reductionAI.get(randomChose));
        piler.add(reductionAI.get(randomChose));
        //System.out.println(reductionAI.get(randomChose));
        System.out.println("This is the AI set:" + AI);
        if(AI.size()==1){
            System.out.println("UNO FOR AI");
        }
        if(AI.size()==0) {
            System.out.println("THE AI HAS WON");
            System.exit(0);
        }

    }



}






