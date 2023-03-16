package com.example.ejercicio1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Button btnSumar;
    @FXML
    private TextField txtOp1;
    @FXML
    private TextField txtOp2;
    @FXML
    private TextField txtResultado;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void sumar(ActionEvent event) {

        try {
            // Obtengo los parametros
            int op1 = Integer.parseInt(this.txtOp1.getText());
            int op2 = Integer.parseInt(this.txtOp2.getText());

            // Creo una instancia del modelo
            Suma s = new Suma(op1, op2);

            // Realizo la suma
            int resultado = s.suma();

            // Muestro el resultado
            this.txtResultado.setText(resultado + "");

        } catch (NumberFormatException e) {
            // Alerta de error
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Formato incorrecto");
            alert.showAndWait();
        }

    }
}