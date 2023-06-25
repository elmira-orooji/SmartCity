
package Controller;

import Model.Database;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class SignUpPassengerController implements Initializable {

    @FXML
    private TextField signup_idtextfield;
    
    @FXML
    private CheckBox signup_checkbox;

    @FXML
    private TextField signup_passwordtextfield;

    @FXML
    private TextField signup_usernametextfield;

    @FXML
    private Button signup_backBtn;

    @FXML
    private Button signup_registerBtn;

    @FXML
    private TextField signup_lastnametextfield;

    @FXML
    private TextField signup_emailtextfield;

    @FXML
    private TextField signup_wallettextfield;

    @FXML
    private TextField signup_firstnametextfield;

    @FXML
    private TextField signup_phonetextfield;

    @FXML
    private CheckBox signup_rulecheck;

    @FXML
    private Button signup_closeBtn;
    
    @FXML
    private ComboBox<?> signup_questionCombobox;
    
    @FXML
    private TextField signup_answer_textfield;

    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    private Statement statement;
    
    public void close(){
        System.exit(0);
    }
    
    private double x = 0;
    private double y = 0;
    public void back(){
        
        try{
        signup_backBtn.getScene().getWindow().hide();
                                Parent root = FXMLLoader.load(getClass().getResource("/View/LoginPage.fxml"));
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
    public void signUp(){
        
        if(signup_idtextfield.getText().isEmpty() || signup_firstnametextfield.getText().isEmpty()
                || signup_lastnametextfield.getText().isEmpty() || signup_usernametextfield.getText().isEmpty()
                || signup_passwordtextfield.getText().isEmpty() || signup_phonetextfield.getText().isEmpty()
                || signup_emailtextfield.getText().isEmpty() || signup_wallettextfield.getText().isEmpty()
                || signup_questionCombobox.getSelectionModel().getSelectedItem() == null ||
                signup_answer_textfield.getText().isEmpty()){
            
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blanks");
                alert.showAndWait();
            
        
        }
        else if(signup_checkbox.isSelected() == false){
                
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("please accept the rules");
                alert.showAndWait();
                }
        
        else if(signup_passwordtextfield.getText().length() < 5){
                
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("5 or more characters for password needed");
                alert.showAndWait();
                }
        else if(signup_phonetextfield.getText().length() > 11){
                
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Invalid phone number length !");
                alert.showAndWait();
                }
        else{
            
            String Check = "SELECT * FROM signup WHERE Username = '"
                    +signup_usernametextfield.getText() + "'";
            connect = Database.connectDb();
        
            try{
                
            statement = connect.createStatement();
            result = statement.executeQuery(Check);
            
            if(result.next()){
                
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText(signup_usernametextfield+"is already exist");
                alert.showAndWait();
                
            }else{
                String insertPassenger = "INSERT INTO signup"+
                        "(ID,Firstname,Lastname,Username,Password,Phone,Email,Wallet,Questions,Answer)"+
                        "VALUE(?,?,?,?,?,?,?,?,?,?)";
                
                prepare = connect.prepareStatement(insertPassenger);
                prepare.setString(1, signup_idtextfield.getText());
                prepare.setString(2, signup_firstnametextfield.getText());
                prepare.setString(3, signup_lastnametextfield.getText());
                prepare.setString(4, signup_usernametextfield.getText());
                prepare.setString(5, signup_passwordtextfield.getText());
                prepare.setString(6, signup_phonetextfield.getText());
                prepare.setString(7, signup_emailtextfield.getText());
                prepare.setString(8, signup_wallettextfield.getText());
                prepare.setString(9, (String)signup_questionCombobox.getSelectionModel().getSelectedItem());
                prepare.setString(10, signup_answer_textfield.getText());
                
                prepare.executeUpdate();
                
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information");
                alert.setHeaderText(null);
                alert.setContentText("Successfully signed up");
                alert.showAndWait();
                
                signUpClear();
                
            }
            }catch(Exception e){e.printStackTrace();}
        }
        
    }
    
    
    
    private String[] questionList = {"What's your favourite food?","What's your favourite color?", "What's your father name?"};
    
    public void questions(){
        
        List<String> listQ = new ArrayList<>();
        
        for(String data : questionList){
            
            listQ.add(data);
        }
        
        ObservableList listData = FXCollections.observableArrayList(listQ);
        signup_questionCombobox.setItems(listData);
        
    }
    
    public void signUpClear(){
        
        signup_idtextfield.setText("");
        signup_firstnametextfield.setText("");
        signup_lastnametextfield.setText("");
        signup_lastnametextfield.setText("");
        signup_usernametextfield.setText("");
        signup_passwordtextfield.setText("");
        signup_phonetextfield.setText("");
        signup_emailtextfield.setText("");
        signup_wallettextfield.setText("");
        signup_questionCombobox.getSelectionModel().getSelectedItem();
        signup_answer_textfield.setText("");

    }
        
       
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
        questions();
        
        
    }    
    
}
    
