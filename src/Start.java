import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Start {
    static String input;
    static ArrayList<String> deck = new ArrayList<String>();
    static ArrayList<String> hand = new ArrayList<>();
    static ArrayList<String> AI = new ArrayList<>();

    public static void main(String args[]){

       Start obj = new Start();
       obj.setUp();

        //System.out.println(GUIDeck);
        String musicLocation = "/Desktop/Music/Scary.wav";

        //musicStuff musicObject = new musicStuff();
        loopMusic(musicLocation);



     JFrame frame = new JFrame("UNO Remake ");
     JLabel label = new JLabel("UNO Remake");
     JPanel panel = new JPanel();
     JButton button = new JButton("Click for Computer against AI");
     JButton instruct = new JButton(" Click for Instructions");
     JLabel textAdder = new JLabel();


     JTextField textField = new JTextField("Enter your name here!", 30);//the input
     textField.setSize(7,7);
     textField.setAlignmentX(0);
     textField.setAlignmentY(0);



     textField.addActionListener(new ActionListener() {
                                     @Override
                                     public void actionPerformed(ActionEvent e) {
                                         input = textField.getText();
                                         textAdder.setText(input);

                                     }
                                 }


     );






           button.addActionListener(e->{



               JFrame opener = new JFrame(input+" vs"+" AI");
               JPanel panelC = new JPanel();
               //ImageIcon deckCards;

               for(int x=0;x<hand.size();x++){
                   ImageIcon decker = new ImageIcon(Start.class.getResource("Solitaire//src//"+hand.get(x)+".png"));
                   JLabel labeler=new JLabel(decker);
                   panelC.add(labeler);


               }

                opener.add(panelC);

                opener.setSize(300,300);
                opener.setLocation(0,0);
                opener.setVisible(true);


                   });



            instruct.addActionListener(e->{



            JFrame instructor = new JFrame();


             JPanel panel2 = new JPanel();

             JLabel setup = new JLabel("/*SETUP\n" +
                     "   Seven piles...First rotation lays card to the " +
                     "very left up and the rest of the six down." +
                     "   Next place a card upright on the second pile " +
                     "and then the rest down" +
                     "   Continue this until every pile has one face up card on the top" +
                     "   ");

            JLabel object = new JLabel("/*OBJECT:\n" +
                    "   The object of the game is to place cards on the ACE of a different suit\n" +
                    "   THE GAME is won by transferring all remaining cards to the ACE pile\n" +
                    "   ");

            JLabel gameplay = new JLabel("/*GAMEPLAY\n" +
                    "   Cards can be transferred to other piles in the foundation if the card being transferred is one\n " +
                    "lower AND has a different color than the card that is placed on\n" +
                    "   Cards can also be moved around from the pile "

                   );


            JLabel rules = new JLabel("/*RULES\n" +
                    "   When one of the piles is gone, only a king can be moved to that open space\n" +
                    "   All piles must have one FACE UP card\n" +
                    "   ");





            panel2.add(setup);
            panel2.add(object);
            panel2.add(gameplay);
            panel2.add(rules);
            panel2.setBackground(Color.PINK);
            instructor.add(panel2);
            instructor.setSize(1500,300);
            instructor.setLocation(500,-500);


            instructor.setVisible(true);







        });



        //frame.setBackground(new Color(148,250,255,50));
        frame.setVisible(true);
        frame.setLocation(500,-500);
        //frame.pack();
        frame.setSize(400,400);
            panel.setBackground(Color.PINK);
        frame.add(panel);

     panel.add(label);
        panel.add(button);
     panel.add(instruct);
        panel.add(textField);
        panel.add(textAdder);








    }

    public static void setUp(){


        Scanner input = new Scanner(System.in);
        System.out.println("How many cards do you want dealt? ");
        int amount = input.nextInt();


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

        System.out.println("test");

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

        for (int x = 0; x < amount; x++) {//for loop that removes elements from deck and adds them to the hand
            //user for loop
            Random objGenerator = new Random();
            int xx = objGenerator.nextInt(deck.size() - 1);
            //int yy =5;
            //put if and else statements


            //System.out.print(" " + pile.get(xx));

            deck.remove(deck.get(xx));

            hand.add(deck.get(xx));
            //hand.remove(hand.get(xx));


        }


        for (int y = 0;  y < amount; y++) {
            Random objGenerator2 = new Random();

            int yy = objGenerator2.nextInt(deck.size() - 1);


            deck.remove(deck.get(yy));

            AI.add(deck.get(yy));
        }


        System.out.println("This the hand deck: " + hand);
        System.out.println("This is the AI deck: " + AI);
        System.out.println("This is the deck: " + deck);








    }

    public static  void loopMusic(String musicLocation){

        try{


          File musicPath= new File(musicLocation);
            if(musicPath.exists()){

                AudioInputStream audioinput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioinput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);


            }

        }

        catch(Exception ex){

            ex.printStackTrace();
        }



    }

}
