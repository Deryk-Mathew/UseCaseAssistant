/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecaseassistant;

import javax.swing.JFrame;

/**
 *
 * @author Deryk Mathew
 */
public class UseCaseAssistantMainClass {
    
        /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Use Case Assistant");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        NewSystemCreation nsc = new NewSystemCreation();
        frame.getContentPane().add(nsc);
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
}
