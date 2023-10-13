package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Locale;

public class CalculatorController {
    @FXML
    private TextField txtNumber1;
    @FXML
    private TextField txtNumber2;
    @FXML
    private Button sum;
    @FXML
    private Label labelResult;

    @FXML
    public void onSumBottomClick() {

        Locale.setDefault(Locale.US);
        Double sum = Double.parseDouble(txtNumber1.getText().replace(",", ".")) + Double.parseDouble(txtNumber2.getText().replace(",", "."));
        labelResult.setText(String.format("%.2f", sum));

    }
}