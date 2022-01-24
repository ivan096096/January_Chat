package ru.geek.Chat_Client;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

public class MainChatController  implements Initializable {
    @FXML
    public VBox mainChatPanel;
    @FXML
    public ListView contactList;
    @FXML
    public TextArea mainChatArea;
    @FXML
    public TextField inputField;
    @FXML
    public Button btnSend;

    public void connectToServer(ActionEvent actionEvent) {

    }

    public void disconnectFromServer(ActionEvent actionEvent) {
    }

    public void mockAction(ActionEvent actionEvent) {
    }

    public void exit(ActionEvent actionEvent) {
        System.exit(1);
    }

    public void showAbout(ActionEvent actionEvent) {
    }

    public void showHelp(ActionEvent actionEvent) {
    }

    public void sendMessage(ActionEvent actionEvent) {
        var message = inputField.getText();
        if (message.isBlank()) {
            return;
        }
        var contact = contactList.getSelectionModel().getSelectedItem();
        mainChatArea.appendText(contact+ ":"+message + System.lineSeparator());
        inputField.clear();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        var contacts = new ArrayList<String>();
        contacts.add("All : ");
        for (int i = 0; i < 10; i++) {
            contacts.add("Contact#" + (i + 1));

        }
        contactList.setItems(FXCollections.observableList(contacts));







        }


    }


