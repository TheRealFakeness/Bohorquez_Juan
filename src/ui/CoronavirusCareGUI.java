package ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import model.PreventionCare;

public class CoronavirusCareGUI {

    @FXML
    private TextField txtCareNum;

    @FXML
    private Label labCareText;
    
    @FXML
    private ImageView imgCare;
    
    private PreventionCare pc = new PreventionCare();
    
    @FXML
    public void showCareRecommendation(ActionEvent event) throws FileNotFoundException {
    	pc.setCareNumber(txtCareNum.getText());
    	labCareText.setText(pc.getTextCare());
    	imgCare.setImage(new Image(new FileInputStream(pc.getImgCare())));
    }

    
}