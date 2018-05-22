/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import util.Pop3Client;
import java.io.IOException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Marco
 */
public class MailPageController implements Initializable {

    private Pop3Client p;
    private boolean isConnected;

    @FXML
    private TextArea mainArea; //questo funziona come schermo cmd
    @FXML
    private TextField command;
    public String currentText; //variabile di appoggio per il testo

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        isConnected = false;
        try {

            p = new Pop3Client();
            isConnected = p.connect();
            System.out.println("Connessione eseguita con successo");

        } catch (UnknownHostException ex) {
            Logger.getLogger(MailPageController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MailPageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void handleExit() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("are u sure to exit??");
        alert.setContentText("please confirm !!");
        alert.showAndWait();

        if (alert.getResult() == ButtonType.OK) {
            System.exit(0);
        } else {
            System.out.println("operazione annullata");
        }
    }

    public void handleRefresh() {
        int numOfMsg = 0;

        System.out.println("You clicked me!");

        if (isConnected) {
            try {
                numOfMsg = p.getNumOfMessages();
            } catch (IOException ex) {
                Logger.getLogger(MailPageController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (currentText == null) {
            currentText = "<< system <<   " + Integer.toString(numOfMsg) + " Messaggi\n";
        } else {
            currentText = currentText + "<< system <<  " + Integer.toString(numOfMsg) + " Messaggi\n";
        }

        mainArea.setText(currentText);
    }

    public void handleSend() throws IOException {

        String commandText = "";
        commandText = command.getText();

        if (commandText.equals("clear")) {
            currentText = "";         //inserito comando interno per pulizia dello schermo
        } else {
            String risposta = p.sendCommand(commandText);

            if (currentText == null) {
                currentText = "<<system<<  " + risposta + "\n";

            } else {
                currentText = currentText + "<<system<<  " + risposta + "\n";
            }
        }
        mainArea.setText(currentText);
        command.setText("");
    }
}
