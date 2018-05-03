
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
        firstName = fN;
        lastName = lN;
        fullName = fullN;
        logonName = logonN;
        password = pass;
        confirmPassword = confPass;
    }

    public void checkForTypedData() {
        if (!firstName.equals("") || !lastName.equals("") || !fullName.equals("") || !logonName.equals("") || !password.equals("") || !confirmPassword.equals("")) {

        } else {
            JOptionPane.showMessageDialog(gui, "Please fill up all the fields", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

}
