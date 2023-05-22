
import com.mysql.jdbc.Connection;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import javafx.beans.binding.Bindings;
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
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class SmartCityFXMLController implements Initializable {
    
    @FXML
    private Button loginBtn;
    
    @FXML
    private ToggleButton toggleButton;
    
    @FXML
    private Label shownPassword;

    @FXML
    private FontAwesomeIcon closeBtn;

    @FXML
    private AnchorPane main_form;

    @FXML
    private PasswordField passwordBtn;

    @FXML
    private TextField usernameBtn;
    
     FileHandler handler;

    
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
   
    
    private double x = 0;
    private double y = 0;
    
    public void adminLogin(){
        
        String sql = "SELECT * FROM admin WHERE username = ? and password = ?";
        
        
        connect = (Connection) Database.connectDb();
        
        try{
            
            handler = new FileHandler("logger.log", true);

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
                alert.showAndWait();
                
            }else{
                if(result.next()){
                    
                getData.username = usernameBtn.getText();
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("");
                alert.setHeaderText(null);
                alert.setContentText("You entered successfully ^-^ "); 
                alert.showAndWait();
                
                loginBtn.getScene().getWindow().hide();
                Parent root = FXMLLoader.load(getClass().getResource("/View/AdminPanel.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(root);
                
                root.setOnMousePressed((MouseEvent event) ->{
                    x = event.getSceneX();
                    y = event.getSceneY();
                });
                
                root.setOnMouseDragged((MouseEvent event) ->{
                    stage.setX(event.getScreenX() - x);
                    stage.setY(event.getScreenY() - y);
                });
                stage.initStyle(StageStyle.TRANSPARENT);
                stage.setScene(scene);
                stage.show();
                }
            
                else{
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Your username or password is not correct");
                alert.setHeaderText(null);
                alert.setContentText("Incorrect Username or Password");
                alert.showAndWait();
                }
            
                
            }
             
          
        }catch(Exception e) {
            
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
            e.printStackTrace();
        }
    }
    
    private Connection connectMayor;
    private PreparedStatement prepareMayor;
    private ResultSet resultMayor;
    
    public void loginMayor(){
        
       
        String sqlMayor = "SELECT * FROM mayor WHERE First_name = ? and Last_name = ?";
        
        connectMayor = (Connection) Database.connectDb();
        
        try{
            
            handler = new FileHandler("logger.log", true);

            prepareMayor = connectMayor.prepareStatement(sqlMayor);
            
            
            prepareMayor.setString(1,usernameBtn.getText());
            prepareMayor.setString(2,passwordBtn.getText());
            
            resultMayor = prepareMayor.executeQuery();
            
            
            if(usernameBtn.getText().isEmpty() || passwordBtn.getText().isEmpty())
            {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill the blanks");
                alert.showAndWait();
                
            }else{
                if(resultMayor.next()){
                    
                getData.username = usernameBtn.getText();
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("");
                alert.setHeaderText(null);
                alert.setContentText("You entered successfully ^-^ "); 
                alert.showAndWait();
                
                loginBtn.getScene().getWindow().hide();
                Parent root = FXMLLoader.load(getClass().getResource("/View/MayorPannel.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(root);
                
                root.setOnMousePressed((MouseEvent event) ->{
                    x = event.getSceneX();
                    y = event.getSceneY();
                });
                
                root.setOnMouseDragged((MouseEvent event) ->{
                    stage.setX(event.getScreenX() - x);
                    stage.setY(event.getScreenY() - y);
                });
                stage.initStyle(StageStyle.TRANSPARENT);
                stage.setScene(scene);
                stage.show();
                }
            
                else{
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Your username or password is not correct");
                alert.setHeaderText(null);
                alert.setContentText("Incorrect Username or Password");
                alert.showAndWait();
                }
            
                
            }
             
          
        }catch(Exception e) {
            
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
            e.printStackTrace();
        }
        
    }
    public void close(){
        System.exit(0);
    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
        
    }    
    
}
