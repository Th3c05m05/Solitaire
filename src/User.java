import java.util.*;

public class User extends Main {

    public void checkAI() {

        ArrayList<String> reductionAI = new ArrayList<String>();

        Random objGenerator = new Random();
        int randomChose = 0;

        int xx = objGenerator.nextInt(deck.size() - 1);
        for (int x = 0; x < AI.size(); x++) {
            if ((AI.get(x).substring(3, 4).equals(piler.get(piler.size() - 1).substring(3, 4))) && AI.get(x).substring(2, 3).equals(piler.get(x).substring(2, 3))) {

                reductionAI.add(AI.get(x));


            } else if (Integer.parseInt(AI.get(x).substring(0, 2)) == Integer.parseInt(piler.get(piler.size() - 1).substring(0, 2))) {

                reductionAI.add(AI.get(x));


            }


            else{
                AI.add(deck.get(0));
                deck.remove(deck.get(0));
            }


        }

        randomChose = objGenerator.nextInt(reductionAI.size() - 1);

        AI.remove(reductionAI.get(randomChose));
        piler.add(reductionAI.get(randomChose));
        //System.out.println(reductionAI.get(randomChose));
        System.out.println("This is the AI set:"+AI);

    /*static Main main = new Main();
    static Scanner input = new Scanner(System.in);
    static int c1length = 0;
    static int c2length = 0;
    static int c3length = 0;
    static int c4length = 0;
    static int c5length = 0;
    static int c6length = 0;
    static int c7length = 0;

    public static void move(){

        String c0 = Main.deck.get(0);
        String c1 = Main.deck.get(checkLength(1) - 1);
        String c2 = Main.deck.get(checkLength(2) - 1);
        String c3 = Main.deck.get(checkLength(3) - 1);
        String c4 = Main.deck.get(checkLength(4) - 1);
        String c5 = Main.deck.get(checkLength(5) - 1);
        String c6 = Main.deck.get(checkLength(6) - 1);
        String c7 = Main.deck.get(checkLength(7) - 1);

        System.out.println(c0);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);

    }


    public static boolean workTest(String a, String b){

        return Integer.parseInt(a.substring(0, 2)) == Integer.parseInt(b.substring(0, 2)) + 1
                && ((a.substring(3, 4).equals("B") && b.substring(3, 4).equals("R"))
                || (a.substring(3, 4).equals("R") && b.substring(3, 4).equals("B")));

    }

    public static boolean checkNull(int a, int b){

        return Main.field[a][b] != null;

    }

    public static int checkLength(int a){
        switch(a){
            case 1:
                try{
                    while( checkNull(0, c1length) ){
                        c1length ++;
                    }
                }catch(Exception a1){ c1length = 0; }
                return c1length;

            case 2:
                try{
                    while( checkNull(0, c2length) ){
                        c2length ++;
                    }
                }catch(Exception a2){ c2length = 0; }
                return c2length;

            case 3:
                try{
                    while( checkNull(0, c3length) ){
                        c3length ++;
                    }
                }catch(Exception a3){ c3length = 0; }
                return c3length;

            case 4:
                try{
                    while( checkNull(0, c4length) ){
                        c4length ++;
                    }
                }catch(Exception a3){ c4length = 0; }
                return c4length;

            case 5:
                try{
                    while( checkNull(0, c5length) ){
                        c5length ++;
                    }
                }catch(Exception a3){ c5length = 0; }
                return c5length;

            case 6:
                try{
                    while( checkNull(0, c6length) ){
                        c6length ++;
                    }
                }catch(Exception a6){ c6length = 0; }
                return c6length;

            case 7:
                try{
                    while( checkNull(0, c7length) ){
                        c7length ++;
                    }
                }catch(Exception a7){ c7length = 0; }
                return c7length;

            default:
                return 0;
        }
    }*/

    }
}
