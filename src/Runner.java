import java.util.*;

public class Runner extends Main{
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to Solitaire 2.0");
        System.out.print("If you want to play type the number 0:  ");
        int z = input.nextInt();

        if(z==0) {

            makeDeck();
            setField();
            test();
            Main obj = new Runner();
            obj.compareToCards(deck,field,finals);
            System.out.println("fuck avi");
        }
}
}
