/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Pop3Client;
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
import java.util.ArrayList;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author marco.pistollato
 */
public class MailPageController implements Initializable {

    private Pop3Client client;
    private boolean isConnected;

    @FXML
    public TextArea mainArea; //TextArea che funziona come schermo cmd
    @FXML
    public String currentText; //variabile di appoggio per il testo
    @FXML
    private TextField comando; //campo nel quale inserire un comando
    @FXML
    private Button ok;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        isConnected = false;
        try {
            client = new Pop3Client();
            isConnected = client.connect();
            currentText=currentText+client.a;
            mainArea.setText(currentText);
        } catch (UnknownHostException ex) {
            Logger.getLogger(MailPageController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MailPageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void handleExit() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Are you sure to exit?");
        alert.setContentText("Please confirm !");
        alert.showAndWait();

        if (alert.getResult() == ButtonType.OK) {
            System.exit(0);
        } else {
            System.out.println("Operazione annullata");
        }
    }

    public void handleRefresh() {
        int numOfMsg = 0;

        System.out.println("You clicked me!");

        if (isConnected) {
            try {
                numOfMsg = client.getNumOfMessages();
            } catch (IOException ex) {
                Logger.getLogger(MailPageController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (currentText == null) {
            currentText = "<< system <<   " + Integer.toString(numOfMsg) + " Messaggi\n\n";
        } else {
            currentText = currentText + "<< system <<  " + Integer.toString(numOfMsg) + " Messaggi\n\n";
        }

        mainArea.setText(currentText);
    }
    
    public void handleCommand() {
        ArrayList<String> c=new ArrayList<>();
        c=client.inviaComando(comando.getText());
        for(int i=0; i<c.size(); i++){
            currentText=currentText+c.get(i)+"\n";
            mainArea.setText(currentText);
        }
        currentText=currentText+"\n";
    }
}
