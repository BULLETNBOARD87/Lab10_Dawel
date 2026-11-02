/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.lab10menu_dawel;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
/**
 * FXML Controller class
 *
 * @author 2548213
 */
public class MainmenuController implements Initializable {


    @FXML
    private MenuItem newItem;
    @FXML
    private MenuItem openItem;
    @FXML
    private MenuItem closeItem;
    @FXML
    private MenuItem saveItem;
    @FXML
    private MenuItem gridItem;
    @FXML
    private MenuItem copyItem;
    @FXML
    private Menu searchMenu;
    @FXML
    private MenuItem findItem;
    @FXML
    private MenuItem replaceItem;
    @FXML
    private RadioMenuItem smallButton;
    @FXML
    private ToggleGroup radioGroup;
    @FXML
    private RadioMenuItem mediumButton;
    @FXML
    private RadioMenuItem largeButton;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void handleNew(ActionEvent event) {
    }

    @FXML
    private void handleOpen(ActionEvent event) {
    }

    @FXML
    private void handleClose(ActionEvent event) {
    }

    @FXML
    private void handleGrid(ActionEvent event) {
    }

    @FXML
    private void handleCopy(ActionEvent event) {
    }

    @FXML
    private void handleFind(ActionEvent event) {
    }

    @FXML
    private void handleReplace(ActionEvent event) {
    }

    @FXML
    private void handleSizeSmall(ActionEvent event) {
    }

    @FXML
    private void handleSizeMedium(ActionEvent event) {
    }

    @FXML
    private void handleSizeLarge(ActionEvent event) {
    }

}
