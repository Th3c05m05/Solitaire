import java.util.*;

public class User{

    //static Main main = new Main();
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
                    while( checkNull(c1length, 0) ){
                        c1length ++;
                    }
                }catch(Exception a1){ c1length = 0; }
                return c1length;

            case 2:
                try{
                    while( checkNull(c2length, 0) ){
                        c2length ++;
                    }
                }catch(Exception a2){ c2length = 0; }
                return c2length;

            case 3:
                try{
                    while( checkNull(c3length, 0) ){
                        c3length ++;
                    }
                }catch(Exception a3){ c3length = 0; }
                return c3length;

            case 4:
                try{
                    while( checkNull(c4length, 0) ){
                        c4length ++;
                    }
                }catch(Exception a3){ c4length = 0; }
                return c4length;

            case 5:
                try{
                    while( checkNull(c5length, 0) ){
                        c5length ++;
                    }
                }catch(Exception a3){ c5length = 0; }
                return c5length;

            case 6:
                try{
                    while( checkNull(c6length, 0) ){
                        c6length ++;
                    }
                }catch(Exception a6){ c6length = 0; }
                return c6length;

            case 7:
                try{
                    while( checkNull(c7length, 0) ){
                        c7length ++;
                    }
                }catch(Exception a7){ c7length = 0; }
                return c7length;

            default:
                return 0;
        }
    }
}
