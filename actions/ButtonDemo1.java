package actions;

import java.awt.*;         // basic awt classes
import java.awt.event.*;   // event classes
import javax.swing.*;      // swing classes
/**
 * Very simple demo of Swing event handling.
 * Create a window with a single button that prints a message when it's clicked.
 * Version 1 with named inner class to handle button events.
 */
public class ButtonDemo1 {

    // inner class to handle button events
    private static class ButtonListener implements ActionListener {
        private int nEvents = 0;

        /**
         * Respond to events generated by the button by printing the
         * command and number of times the event has been triggered.
         * @param e the event created by the button when it was clicked.
         */
        public void actionPerformed(ActionEvent e) {
            nEvents++;
            System.out.println(e.getActionCommand() + " " + nEvents);
        }
    }


    public static void main(String[] args) {
        // Create new window and set it to exit from application when closed
        JFrame frame = new JFrame("Button Demo");
        JPanel panel = new JPanel();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ButtonListener listen = new ButtonListener();

        // create a new button with label "Hit me" and string "OUCH!" to be
        // returned as part of each action event
        JButton button1 = new JButton("Hit me");
        button1.setActionCommand("OUCH!");
        button1.addActionListener(listen);

        // create a new button with label "Hit me2" and string "OUCH2!" to be
        // returned as part of each action event
        JButton button2 = new JButton("Hit me2");
        button2.setActionCommand("OUCH!2");
        button2.addActionListener(listen);

        // Add button to the window and make it visible
        panel.add(button1);
        panel.add(button2);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}