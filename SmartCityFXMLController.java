
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class SmartCityFXMLController implements Initializable {
    
    @FXML
    private Button loginBtn;

    @FXML
    private FontAwesomeIcon closeBtn;

    @FXML
    private AnchorPane main_form;

    @FXML
    private PasswordField passwordBtn;

    @FXML
    private TextField usernameBtn;
    
    public void close(){
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    
    
}
