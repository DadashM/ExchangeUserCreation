
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author r00t
 */
public class SaveTypedData {
    
    ExchangeUserCreation gui;
    
    static String firstName;
    static String lastName;
    static String fullName;
    static String logonName;
    static String password;
    static String confirmPassword;

    public SaveTypedData(String fN, String lN, String fullN, String logonN, String pass, String confPass) {
        gui = new ExchangeUserCreation();
        
        fN = gui.firstNameField.getText();
        lN = gui.lastNameField.getText();
        fullN = gui.fullNameField.getText();
        logonN = gui.logonNameField.getText();
        pass = String.valueOf(gui.passwordField.getPassword());
        pass = String.valueOf(gui.confirmPasswordField.getPassword());
        
    }
    
    
    public void checkForTypedData(){
        if (!firstName.equals("") || !lastName.equals("") || !fullName.equals("") || !logonName.equals("") || !password.equals("") || !confirmPassword.equals("")) {
            
        } else {
            JOptionPane.showMessageDialog(gui, "Please fill up all fields", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
