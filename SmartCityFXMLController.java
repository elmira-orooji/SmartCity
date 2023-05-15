
import com.mysql.jdbc.Connection;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
    
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    
    public void adminLogin(){
        
        String sql = "SELECT * FROM admin WHERE username = ? and password = ?";
        connect = (Connection) Database.connectDb();
        
        try{
            
            prepare = connect.prepareStatement(sql);
            prepare.setString(1,usernameBtn.getText());
            prepare.setString(2,passwordBtn.getText());
            
            result = prepare.executeQuery();
            
            
            if(usernameBtn.getText().isEmpty() || passwordBtn.getText().isEmpty())
            {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill the blanks");
                
            }else{
                if(result.next()){
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("");
                alert.setHeaderText(null);
                alert.setContentText("You entered successfully ^-^ "); 
                
                loginBtn.getScene().getWindow().hide();
                Parent root = FXMLLoader.load(getClass().getResource(""));
                Stage stage = new Stage();
                Scene scene = new Scene(root);
                
                stage.setScene(scene);
                stage.show();
                
                }else{
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Your username or password is not correct");
                alert.setHeaderText(null);
                alert.setContentText("Incorrect Username or Password");
                }
            }
        }catch(Exception e) {e.printStackTrace();}
    }
    public void close(){
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    
    
}
