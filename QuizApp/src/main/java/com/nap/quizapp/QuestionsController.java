/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.nap.quizapp;

import com.nap.pojo.Category;
import com.nap.services.CategoryServices;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author anphu
 */
public class QuestionsController implements Initializable {
    @FXML private ComboBox<Category> cbCates;
    
    private static final CategoryServices cateService = new CategoryServices();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {
            this.cbCates.setItems(FXCollections.observableList(cateService.getCates()));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }    
    
}
