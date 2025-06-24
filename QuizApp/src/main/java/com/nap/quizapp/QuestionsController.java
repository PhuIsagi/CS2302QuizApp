/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.nap.quizapp;

import com.nap.pojo.Category;
import com.nap.pojo.Level;
import com.nap.services.CategoryServices;
import com.nap.services.LevelServices;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author anphu
 */
public class QuestionsController implements Initializable {

    @FXML
    private ComboBox<Category> cbCates;
    @FXML
    private ComboBox<Level> cbLevels;
    @FXML
    private VBox vboxChoices;
    
    private static final CategoryServices cateService = new CategoryServices();
    private static final LevelServices levelService = new LevelServices();


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {
            this.cbCates.setItems(FXCollections.observableList(cateService.getCates()));
            this.cbLevels.setItems(FXCollections.observableList(levelService.getLevels()));

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void handleMoreChoice(ActionEvent event){
        HBox h = new HBox();
        h.getStyleClass().add("Main");
        RadioButton r = new RadioButton();
        TextField txt = new TextField();
        txt.getStyleClass();
        h.getChildren().addAll(r, txt);
        this.vboxChoices.getChildren().add(h);
    }

}
