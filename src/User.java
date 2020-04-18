import java.util.*;

public class User{

    static Scanner input = new Scanner(System.in);

    public static void move(){

        System.out.println("it worked");

    }


    public static boolean workTest(String a, String b){
        return Integer.parseInt(a.substring(0, 2)) == Integer.parseInt(b.substring(0, 2)) + 1 && ((a.substring(3, 4).equals("B") && b.substring(3, 4).equals("R")) || (a.substring(3, 4).equals("R") && b.substring(3, 4).equals("B")));
    }

}
