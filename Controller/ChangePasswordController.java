
package Controller;

import Model.Database;
import Controller.ForgetPasswordController;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ChangePasswordController implements Initializable {

    
    @FXML
    private Button changepassword_changeBtn;

    @FXML
    private Button changepassword_backBtn;

    @FXML
    private Button changepassword_close;
    
    @FXML
    private PasswordField changepassword_password;

    @FXML
    private PasswordField changepassword_Confirmpassword;

    @FXML
    private Button forgetpassword_backBtn;

    @FXML
    private PasswordField changepassword_Confirmpassword_textfield;

    @FXML
    private Button forgetpassword_closeBtn;

    @FXML
    private TextField forgetpassword_answer_textfield;

    @FXML
    private Button forgetpassword_resetpasswordBtn;

    @FXML
    private AnchorPane main_page;

    @FXML
    private ComboBox<?> forgetpassword_questionCombobox;

    @FXML
    private AnchorPane Reset_password_picture;

    @FXML
    private TextField forgetpassword_username_textfield;

    @FXML
    private Button changepassword_closeBtn;

    @FXML
    private AnchorPane Reset_password_page;

    @FXML
    private PasswordField changepassword_password_textfield;


     @FXML
    private TextField signup_idtextfield;

    @FXML
    private TextField signup_usernametextfield;

    @FXML
    private TextField signup_emailtextfield;

    @FXML
    private TextField signup_wallettextfield;

    @FXML
    private TextField signup_firstnametextfield;

    @FXML
    private TextField signup_phonetextfield;

    @FXML
    private TextField signup_answer_textfield;

    @FXML
    private Button signup_closeBtn;

    @FXML
    private TextField signup_passwordtextfield;

    @FXML
    private TextField ChangePassword_username;
    
    @FXML
    private Button signup_backBtn;

    @FXML
    private Button signup_registerBtn;

    @FXML
    private TextField signup_lastnametextfield;

    @FXML
    private ComboBox<?> signup_questionCombobox;
    
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    private Statement statement;
    private double x = 0;
    private double y = 0;
    
    public void close(){
        System.exit(0);
    }
    
    public void back(){
        
        try{
        changepassword_backBtn.getScene().getWindow().hide();
                                Parent root = FXMLLoader.load(getClass().getResource("/View/ForgetPassword.fxml"));
                                Stage stage = new Stage();
                                Scene scene = new Scene(root);

                                root.setOnMousePressed((MouseEvent event) -> {
                                    x = event.getSceneX();
                                    y = event.getSceneY();
                                });

                                root.setOnMouseDragged((MouseEvent event) -> {
                                    stage.setX(event.getScreenX() - x);
                                    stage.setY(event.getScreenY() - y);
                                });
                                stage.initStyle(StageStyle.TRANSPARENT);
                                stage.setScene(scene);
                                stage.show();
        }catch(Exception e){e.printStackTrace();}
        
        
        
    }
    
    public void changePassword(){
        
        if(changepassword_password.getText().isEmpty() || 
           changepassword_Confirmpassword.getText().isEmpty()){
                
            
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blanks");
                alert.showAndWait();
                
        }else if(!changepassword_password.getText().equals(changepassword_Confirmpassword.getText())){
            
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Confirm password is not match");
                alert.showAndWait();
            
        }else if( changepassword_password.getText().length()<5){
            
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("5 or more characters for password needed");
                alert.showAndWait();
            
        }else{
            
            
            String UpdateData = "UPDATE signup SET Password = ? "
                    + "WHERE Username = '" + ChangePassword_username.getText() + "'";
            
            connect = Database.connectDb();
            
            try{
                
               prepare = connect.prepareStatement(UpdateData);
               prepare.setString(1, changepassword_password.getText());
               
               
        
               prepare.executeUpdate();
               
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information");
                alert.setHeaderText(null);
                alert.setContentText("Your password updated successfully");
                alert.showAndWait();
                    
                    changepassword_password.setText("");
                    changepassword_Confirmpassword.setText("");
                
            }catch(Exception e){e.printStackTrace();}
            
           
        }
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
