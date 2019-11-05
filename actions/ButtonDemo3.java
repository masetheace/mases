package actions;

import java.awt.*;         // basic awt classes
import java.awt.event.*;   // event classes
import javax.swing.*;      // swing classes
import java.math.BigInteger;

public class ButtonDemo3 extends JFrame {

    private ButtonDemo3(String title) {
        super(title);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Component c = this;

        JButton button = new JButton("Hit me");
        button.setActionCommand("OUCH!");

        // Create and register a new button listener to handle clicks
        button.addActionListener(new ActionListener () {
            int nEvents = 0; // number of events handled
            public void actionPerformed(ActionEvent e) {
                nEvents++;
                JOptionPane.showMessageDialog(ButtonDemo3.this, e.getActionCommand() + " " + nEvents);
            }
        });

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ButtonDemo3 app = new ButtonDemo3("Button Demo");
                app.setVisible(true);
            }
        });
    }
}