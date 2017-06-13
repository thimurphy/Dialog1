/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialog1;

/**
 *
 * @author thiagomurphy
 */

import javax.swing.JOptionPane;

public class Dialog1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Simple pop up
        JOptionPane.showMessageDialog(null, "Welcome\nto\nJava");
        
        //Pop up that takes a variable
        String name = 
                JOptionPane.showInputDialog("What is your name?");
        
        //Formats the variable taken from the pop up above.
        String message = 
                String.format("Welcome back, %s, to Java Programming.", name);
        
        //Add message to a pop up - dialog
        JOptionPane.showMessageDialog(null, message);
        
    }//end of main method
    
    
}//end of class
