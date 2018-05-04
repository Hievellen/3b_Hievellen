
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;



public class MenuPrincipalController implements Initializable {
    
    @FXML
    private TextField txtNum1, txtNum2, txtResultado;
    
    @FXML
    private Button btnSoma; 
            
    @FXML
    private void soma(ActionEvent event) {
        double num1 = Double.parseDouble(txtNum1.getText());
        double num2 = Double.parseDouble(txtNum2.getText());
        double resultado = (num1 + num2);
        
        txtResultado.setText(resultado.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
