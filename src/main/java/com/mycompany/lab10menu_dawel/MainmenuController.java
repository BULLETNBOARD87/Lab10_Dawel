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

import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Window;
import javafx.stage.PopupWindow;
import javafx.scene.control.PopupControl;
import javafx.scene.layout.Pane;
import javafx.scene.control.ContextMenu;
import javafx.scene.input.MouseButton;
/**
 * FXML Controller class
 *
 * @author 2548213
 */
public class MainmenuController implements Initializable {


    @FXML
    private Pane mainPane;
    @FXML
    private MenuItem newItem;
    @FXML
    private MenuItem openItem;
    @FXML
    private MenuItem closeItem;
    @FXML
    private MenuItem saveItem;
    @FXML
    private CheckMenuItem gridItem;
    @FXML
    private MenuItem copyItem;
    @FXML
    private Menu searchMenu;
    @FXML
    private MenuItem findItem;
    @FXML
    private MenuItem replaceItem;
    @FXML
    private RadioMenuItem smallItem;
    @FXML
    private ToggleGroup radioGroup;
    @FXML
    private RadioMenuItem mediumItem;
    @FXML
    private RadioMenuItem largeItem;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ToggleGroup tg = new ToggleGroup();
        smallItem.setToggleGroup(tg);
        mediumItem.setToggleGroup(tg);
        largeItem.setToggleGroup(tg);
        closeItem.setDisable(true); // disabled until a file is "opened"
        
        ContextMenu popup = new ContextMenu();
        MenuItem help = new MenuItem("Help");
        MenuItem inspect = new MenuItem("Inspect");
        popup.getItems().addAll(help, inspect);

        mainPane.setOnMouseClicked(e -> {
        if (e.getButton() == MouseButton.SECONDARY) {
            popup.show(mainPane, e.getScreenX() - 50, e.getScreenY() - 25);
            }
        });


    }     
    
    @FXML
    private void handleNew() {
        System.out.println("NEW has been pressed");
        newItem.setDisable(true);
        openItem.setDisable(true);
        closeItem.setDisable(false);
    }

    @FXML
    private void handleOpen(ActionEvent event) {
    }

    @FXML
    private void handleClose(ActionEvent event) {
    }

    @FXML
    private void handleGrid() {
        if (gridItem.isSelected()) {
           System.out.println("USE GRIDLINES selected"); 
        } else {
            System.out.println("USE GRIDLINES unselected");
        }
        
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
