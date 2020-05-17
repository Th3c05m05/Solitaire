import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class Start {
    public static void main(String args[]){
        //SOS (Solitaire on Steriods)

        String musicLocation = "/Desktop/Music/Scary.wav";

        //musicStuff musicObject = new musicStuff();
        loopMusic(musicLocation);

   /*SETUP
   Seven piles...First rotation lays card to the very left up and the rest of the six down.
   Next place a card upright on the second pile and then the rest down
   Continue this until every pile has one face up card on the top
   */


   /*OBJECT:
   The object of the game is to place cards on the ACE of a different suit
   THE GAME is won by transferring all remaining cards to the ACE pile
   */


   /*GAMEPLAY
   Cards can be transferred to other piles in the foundation if the card being transferred is one lower AND has a different color than the card that is placed on
   Cards can also be moved around from the pile...each card is placed on at at time and can either be placed onto the foundation or onto the ACE pile directly if possible.
   Cards put on the ACE pile must be one greater than the card before it and have the same suit
   */


   /*RULES
   When one of the piles is gone, only a king can be moved to that open space
   All piles must have one FACE UP card
   */

     JFrame frame = new JFrame("Solitaire on Steroids ");
     JLabel label = new JLabel("Welcome to Asim and Avi's SOS");
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
                                         String input = textField.getText();
                                         textAdder.setText(input);

                                     }
                                 }


     );














            instruct.addActionListener(e->{



            JFrame instructor = new JFrame();


             JPanel panel2 = new JPanel();

             JLabel setup = new JLabel("/*SETUP\n" +
                     "   Seven piles...First rotation lays card to the very left up and the rest of the six down.\n" +
                     "   Next place a card upright on the second pile and then the rest down\n" +
                     "   Continue this until every pile has one face up card on the top\n" +
                     "   ");

            JLabel object = new JLabel("/*OBJECT:\n" +
                    "   The object of the game is to place cards on the ACE of a different suit\n" +
                    "   THE GAME is won by transferring all remaining cards to the ACE pile\n" +
                    "   ");

            JLabel gameplay = new JLabel("/*GAMEPLAY\n" +
                    "   Cards can be transferred to other piles in the foundation if the card being transferred is one lower AND has a different color than the card that is placed on\n" +
                    "   Cards can also be moved around from the pile...each card is placed on at at time and can either be placed onto the foundation or onto the ACE pile directly if possible.\n" +
                    "   Cards");


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
            instructor.setSize(500,500);

            instructor.pack();
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

    public static void loopMusic(String musicLocation){

        try{


          File musicPath= new File(musicLocation);
            if(musicPath.exists()){

                AudioInputStream audioinput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioinput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);


            }
          //else if (musicPath.exists()==false){

              //System.out.println("This was an absolute fail");

            //}



        }

        catch(Exception ex){

            ex.printStackTrace();
        }



    }

}
