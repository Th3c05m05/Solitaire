import java.util.*;

public class Main extends Start {
    public ArrayList<String> piler = new ArrayList<String>();
    public ArrayList<String> reductionAI = new ArrayList<String>();
    public Random objGenerator = new Random();
    public int randomChose = 0;


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
            if (index > hand.size() - 1) {
                System.out.println("Please try again");
            } else if (index == -1) {
                hand.add(deck.get(0));
                deck.remove(deck.get(0));
                for (int r = 0; r < AI.size(); r++) {
                    if ((AI.get(r).substring(3, 4).equals(piler.get(piler.size() - 1).substring(3, 4))) && (AI.get(r).substring(2, 3).equals(piler.get(piler.size() - 1).substring(2, 3)))) {

                        reductionAI.add(AI.get(r));


                    }
                    if (Integer.parseInt(AI.get(r).substring(0, 2)) == Integer.parseInt(piler.get(piler.size() - 1).substring(0, 2))) {

                        reductionAI.add(AI.get(r));


                    }


                }
                if (reductionAI.size() == 0) {
                    AI.add(deck.get(0));
                    deck.remove(deck.get(0));
                    System.out.println("This is the AI set:" + AI);
                } else if (reductionAI.size() >= 1) {
                    if (reductionAI.size() == 1) {
                        randomChose = 0;
                        AI.remove(reductionAI.get(randomChose));
                        piler.add(reductionAI.get(randomChose));
                        System.out.println("This is the AI set: " + AI);
                        reductionAI.clear();
                    } else {
                        randomChose = objGenerator.nextInt(reductionAI.size() - 1);

                        AI.remove(reductionAI.get(randomChose));
                        piler.add(reductionAI.get(randomChose));
                        //System.out.println(reductionAI.get(randomChose));
                        System.out.println("This is the AI set:" + AI);
                        reductionAI.clear();
                    }
                }
                if (AI.size() == 1) {
                    System.out.println("UNO FOR AI");
                }
                if (AI.size() == 0) {
                    System.out.println("THE AI HAS WON");
                    System.exit(0);
                }

            }

            //obj.checkAI();
            else if (index == -5) {
                System.out.println("Your final score was: " + x);
                System.exit(0);
            } else if ((hand.get(index).substring(3, 4).equals(piler.get(piler.size() - 1).substring(3, 4))) && hand.get(index).substring(2, 3).equals(piler.get(piler.size() - 1).substring(2, 3))) {
                piler.add(hand.get(index));
                hand.remove(hand.get(index));
                x++;
                for (int r = 0; r < AI.size(); r++) {
                    if ((AI.get(r).substring(3, 4).equals(piler.get(piler.size() - 1).substring(3, 4))) && (AI.get(r).substring(2, 3).equals(piler.get(piler.size() - 1).substring(2, 3)))) {

                        reductionAI.add(AI.get(r));


                    }
                    if (Integer.parseInt(AI.get(r).substring(0, 2)) == Integer.parseInt(piler.get(piler.size() - 1).substring(0, 2))) {

                        reductionAI.add(AI.get(r));


                    }


                }
                if (reductionAI.size() == 0) {
                    AI.add(deck.get(0));
                    deck.remove(deck.get(0));
                    System.out.println("This is the AI set:" + AI);
                    reductionAI.clear();
                } else if (reductionAI.size() >= 1) {
                    if (reductionAI.size() == 1) {
                        randomChose = 0;
                        AI.remove(reductionAI.get(randomChose));
                        piler.add(reductionAI.get(randomChose));
                        System.out.println("This is the AI set: " + AI);
                        reductionAI.clear();
                    } else {
                        randomChose = objGenerator.nextInt(reductionAI.size() - 1);

                        AI.remove(reductionAI.get(randomChose));
                        piler.add(reductionAI.get(randomChose));
                        //System.out.println(reductionAI.get(randomChose));
                        System.out.println("This is the AI set:" + AI);
                        reductionAI.clear();
                    }
                }
                if (AI.size() == 1) {
                    System.out.println("UNO FOR AI");
                }
                if (AI.size() == 0) {
                    System.out.println("THE AI HAS WON");
                    System.exit(0);
                }

                //obj.checkAI();
            } else if (Integer.parseInt(hand.get(index).substring(0, 2)) == Integer.parseInt(piler.get(piler.size() - 1).substring(0, 2))) {


                piler.add(hand.get(index));
                hand.remove(hand.get(index));
                x++;
                for (int r = 0; r < AI.size(); r++) {
                    if ((AI.get(r).substring(3, 4).equals(piler.get(piler.size() - 1).substring(3, 4))) && (AI.get(r).substring(2, 3).equals(piler.get(piler.size() - 1).substring(2, 3)))) {

                        reductionAI.add(AI.get(r));


                    }
                    if (Integer.parseInt(AI.get(r).substring(0, 2)) == Integer.parseInt(piler.get(piler.size() - 1).substring(0, 2))) {

                        reductionAI.add(AI.get(r));


                    }


                }
                if (reductionAI.size() == 0) {
                    AI.add(deck.get(0));
                    deck.remove(deck.get(0));
                    System.out.println("This is the AI set:" + AI);
                }

                if (reductionAI.size() >= 1) {
                    if (reductionAI.size() == 1) {
                        randomChose = 0;
                        AI.remove(reductionAI.get(randomChose));
                        piler.add(reductionAI.get(randomChose));
                        System.out.println("This is the AI set: " + AI);
                        reductionAI.clear();
                    } else {
                        randomChose = objGenerator.nextInt(reductionAI.size() - 1);

                        AI.remove(reductionAI.get(randomChose));
                        piler.add(reductionAI.get(randomChose));
                        //System.out.println(reductionAI.get(randomChose));
                        System.out.println("This is the AI set:" + AI);
                        reductionAI.clear();

                    }
                }
                if (AI.size() == 1) {
                    System.out.println("UNO FOR AI");
                }
                if (AI.size() == 0) {
                    System.out.println("THE AI HAS WON");
                    System.exit(0);
                }

                //obj.checkAI();


            } else {
                System.out.println("Please try again");
                //hand.add(deck.get(0));
                //deck.remove(deck.get(0));
                //obj.checkAI();
                /*for (int r = 0; r < AI.size(); r++) {
                    if ((AI.get(r).substring(3, 4).equals(piler.get(piler.size() - 1).substring(3, 4))) && (AI.get(r).substring(2, 3).equals(piler.get(piler.size() - 1).substring(2, 3)))) {

                        reductionAI.add(AI.get(r));


                    } if (Integer.parseInt(AI.get(r).substring(0, 2)) == Integer.parseInt(piler.get(piler.size() - 1).substring(0, 2))) {

                        reductionAI.add(AI.get(r));


                    }


                }
                if(reductionAI.size()==0){
                    AI.add(deck.get(0));
                    deck.remove(deck.get(0));
                    System.out.println("This is the AI set:"+AI);
                }

                if(reductionAI.size()>=1){
                    if(reductionAI.size()==1){
                        randomChose=0;
                        AI.remove(reductionAI.get(randomChose));
                        piler.add(reductionAI.get(randomChose));
                        System.out.println("This is the AI set: "+AI);
                    }else {
                        randomChose = objGenerator.nextInt(reductionAI.size() - 1);

                        AI.remove(reductionAI.get(randomChose));
                        piler.add(reductionAI.get(randomChose));
                        //System.out.println(reductionAI.get(randomChose));
                        System.out.println("This is the AI set:" + AI);
                    }
                }
                if (AI.size() == 1) {
                    System.out.println("UNO FOR AI");
                }
                if (AI.size() == 0) {
                    System.out.println("THE AI HAS WON");
                    System.exit(0);
                }
            }

            if (hand.size() == 1) {

                System.out.println("You are at UNO!");

            }
            if (hand.size() == 0) {
                System.out.println("Congratulations, you have won against the AI");
                System.exit(0);
            }*/


                // }
            }


        }
    }
}












