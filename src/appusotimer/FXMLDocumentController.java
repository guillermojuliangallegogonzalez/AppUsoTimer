package appusotimer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import timer.Timer;

/**
 *
 * @author guillermogallegogonzalez
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Timer temporizador;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        temporizador.setTime(10);
    }    
    
}
