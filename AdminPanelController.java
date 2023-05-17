
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Optional;
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
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class AdminPanelController implements Initializable{

    @FXML
    private AnchorPane skeleton_page;
    
    @FXML
    private TableView<?> securityGuardsTable;

    @FXML
    private TableView<?> deputiesTable;

    @FXML
    private Button updateBtnEmployees;

    @FXML
    private TextField dateOfHire_field_deputies;

    @FXML
    private AnchorPane deputiesPage;

    @FXML
    private Label welcomeAdmin;

    @FXML
    private TextField row_field_employees;

    @FXML
    private AnchorPane homePage;

    @FXML
    private TableColumn<?, ?> totalSalary_col_deputies;

    @FXML
    private TableColumn<?, ?> shiftWork_col_securityguards;

    @FXML
    private TextField dateOfHire_field_inspectors;

    @FXML
    private TableColumn<?, ?> personnelNo_col_deputies;

    @FXML
    private TableColumn<?, ?> gender_col_deputies;

    @FXML
    private TextField row_field_Mayor;

    @FXML
    private TextField firstname_field_Mayor;

    @FXML
    private TextField phoneNo_field_inspectors;

    @FXML
    private TableColumn<?, ?> lastname_col_employees;

    @FXML
    private Button deputiesBtn;

    @FXML
    private TableColumn<?, ?> gender_col_employees;

    @FXML
    private Button deleteBtnEmployees;

    @FXML
    private TableColumn<?, ?> personnelNo_col_inspectors;

    @FXML
    private TableColumn<?, ?> basicSalary_col_inspectors;

    @FXML
    private TableColumn<?, ?> row_col_inspectors;

    @FXML
    private TextField personnelNo_field_deputies;

    @FXML
    private TableView<?> employeesTable;

    @FXML
    private TableColumn<?, ?> phoneNo_col_inspectors;

    @FXML
    private TableColumn<?, ?> row_col_employees;

    @FXML
    private TableColumn<?, ?> workingHoursPerWeek_col_employees;

    @FXML
    private TableColumn<?, ?> phoneNo_col_deputies;

    @FXML
    private TableColumn<?, ?> row_col_securityguards;

    @FXML
    private TextField phoneNo_field_employees;

    @FXML
    private TextField totalSalary_field_deputies;

    @FXML
    private TextField phoneNo_field_Mayor;

    @FXML
    private ComboBox<?> gender_box_Mayor;

    @FXML
    private TableColumn<?, ?> firstname_col_Mayor;

    @FXML
    private TextField basicSalary_field_inspectors;

    @FXML
    private TextField history_field_deputies;

    @FXML
    private TableColumn<?, ?> basicSalary_col_Mayor;

    @FXML
    private ComboBox<?> gender_box_deputies;

    @FXML
    private TableColumn<?, ?> dateOfHire_col_inspectors;

    @FXML
    private TextField dateOfHire_field_Mayor;

    @FXML
    private Button securityGuardsBtn;

    @FXML
    private Button clearBtndeputies;

    @FXML
    private Button addBtnSecurityguards;

    @FXML
    private Button addBtnEmployees;

    @FXML
    private TableColumn<?, ?> gender_col_securityguards;

    @FXML
    private TextField dateOfHire_field_securityguards;

    @FXML
    private Button inspectorsBtn;

    @FXML
    private Button close;

    @FXML
    private Button addBtnMayor;

    @FXML
    private Button updateBtnSecurityguards;

    @FXML
    private Button minimize;

    @FXML
    private TextField phoneNo_field_securityguards;

    @FXML
    private AnchorPane inspectorsPage;

    @FXML
    private TableView<?> inspectorsTable;

    @FXML
    private TableColumn<?, ?> lastname_col_Mayor;

    @FXML
    private TableColumn<?, ?> lastname_col_inspectors;

    @FXML
    private Button deletebtnInspectors;

    @FXML
    private TextField phoneNo_field_deputies;

    @FXML
    private TableColumn<?, ?> history_col_employees;

    @FXML
    private TextField lastname_field_employees;

    @FXML
    private TextField lastname_field_deputies;

    @FXML
    private TableColumn<?, ?> dateOfHire_col_securityguards;

    @FXML
    private TextField totalSalary_field_Mayor;

    @FXML
    private TextField row_field_securityguards;

    @FXML
    private TableColumn<?, ?> gender_col_inspectors;

    @FXML
    private TableColumn<?, ?> personnelNo_col_employees;

    @FXML
    private TableColumn<?, ?> history_col_securityguards;

    @FXML
    private TableColumn<?, ?> personnelNo_col_Mayor;

    @FXML
    private Button updateBtnMayor;

    @FXML
    private TextField basicSalary_field_Mayor;

    @FXML
    private TextField shiftWork_field_securityguards;

    @FXML
    private TableColumn<?, ?> lastname_col_deputies;

    @FXML
    private TableColumn<?, ?> basicSalary_col_deputies;

    @FXML
    private TableColumn<?, ?> basicSalary_col_securityguards;

    @FXML
    private TableColumn<?, ?> personnelNo_col_securityguards;

    @FXML
    private TextField lastname_field_inspectors;

    @FXML
    private Button deleteBtnDeputies;

    @FXML
    private Button updateBtnInspectors;

    @FXML
    private TableColumn<?, ?> history_col_inspectors;

    @FXML
    private TableColumn<?, ?> history_col_deputies;

    @FXML
    private AnchorPane securityGuardsPage;

    @FXML
    private TableColumn<?, ?> history_col_Mayor;

    @FXML
    private TableColumn<?, ?> lastname_col_securityguards;

    @FXML
    private TableColumn<?, ?> totalSalary_col_inspectors;

    @FXML
    private AnchorPane employeesPage;

    @FXML
    private TableView<?> tableMayor;

    @FXML
    private TextField workingHoursPerWeek_field_employees;

    @FXML
    private TextField basicSalary_field_employees;

    @FXML
    private Button employeesBtn;

    @FXML
    private Button deleteBtnMayor;

    @FXML
    private TextField personnelNo_field_securityguards;

    @FXML
    private TextField lastname_field_Mayor;

    @FXML
    private Button clearBtnEmployees;

    @FXML
    private TextField lastname_field_securityguards;

    @FXML
    private TextField personnelNo_field_employees;

    @FXML
    private Button signOut_admin;

    @FXML
    private AnchorPane mayorPage;

    @FXML
    private Button updateBtnDeputies;

    @FXML
    private TextField totalSalary_field_securityguards;

    @FXML
    private TableColumn<?, ?> firstname_col_securityguards;

    @FXML
    private TextField history_field_securityguards;

    @FXML
    private TableColumn<?, ?> dateOfHire_col_Mayor;


    @FXML
    private TableColumn<?, ?> totalSalary_col_securityguards;

    @FXML
    private Button clearBtnSecurityguards;

    @FXML
    private TableColumn<?, ?> gender_col_Mayor;

    @FXML
    private ComboBox<?> gender_box_inspectors;

    @FXML
    private TextField personnelNo_field_Mayor;

    @FXML
    private TextField history_field_Mayor;

    @FXML
    private Button addBtnInspectors;

    @FXML
    private TableColumn<?, ?> firstname_col_employees;

    @FXML
    private TextField totalSalary_field_employees;

    @FXML
    private TableColumn<?, ?> row_col_deputies;

    @FXML
    private TextField basicSalary_field_securityguards;

    @FXML
    private Button mayorBtn;

    @FXML
    private TableColumn<?, ?> firstname_col_inspectors;

    @FXML
    private TableColumn<?, ?> firstname_col_deputies;

    @FXML
    private TextField row_field_inspectors;

    @FXML
    private Button clearBtnInspectors;

    @FXML
    private Button clearBtnMayor;

    @FXML
    private TableColumn<?, ?> dateOfHire_col_employees;

    @FXML
    private ComboBox<?> gender_box_employees;

    @FXML
    private TableColumn<?, ?> phoneNo_col_employees;

    @FXML
    private TableColumn<?, ?> totalSalary_col_Mayor;

    @FXML
    private TextField totalSalary_field_inspectors;

    @FXML
    private TableColumn<?, ?> dateOfHire_col_deputies;

    @FXML
    private Button addBtnDeputies;

    @FXML
    private TextField history_field_employees;

    @FXML
    private TableColumn<?, ?> basicSalary_col_employees;

    @FXML
    private TextField firstname_field_employees;

    @FXML
    private TextField dateOfHire_field_employees;

    @FXML
    private TableColumn<?, ?> row_col_Mayor;

    @FXML
    private ComboBox<?> gender_box_securityguards;

    @FXML
    private TableColumn<?, ?> phoneNo_col_Mayor;

    @FXML
    private TableColumn<?, ?> totalSalary_col_employees;

    @FXML
    private Button deleteBtnSecurityguards;

    @FXML
    private TextField history_field_inspectors;

    @FXML
    private TextField basicSalary_field_deputies;

    @FXML
    private TextField firstname_field_deputies;

    @FXML
    private TextField personnelNo_field_inspectors;

    @FXML
    private TextField row_field_deputies;

    @FXML
    private TextField firstname_field_inspectors;
    @FXML
    private FontAwesomeIcon clearBtnDeputies;
    @FXML
    private TableColumn<?, ?> phoneNo_col_securityguards;
    @FXML
    private TextField phoneNumber_field_securityguards;
    
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
    }

    @FXML
    private void close(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void minimize(ActionEvent event) {
        
        Stage stage = (Stage) skeleton_page.getScene().getWindow();
        stage.setIconified(true);
    }

    private double x = 0;
    private double y = 0;
    @FXML
    private void signOut_admin() {
        
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to sign out?");
        Optional<ButtonType> option = alert.showAndWait();
        try {
            if (option.get().equals(ButtonType.OK)) {

                signOut_admin.getScene().getWindow().hide();
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

                    stage.setOpacity(.8);
                });

                root.setOnMouseReleased((MouseEvent event) -> {
                    stage.setOpacity(1);
                });

                stage.initStyle(StageStyle.TRANSPARENT);

                stage.setScene(scene);
                stage.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void switchPage(ActionEvent event){
        
        if(event.getSource() == mayorBtn){
            mayorPage.setVisible(true);
            deputiesPage.setVisible(false);
            inspectorsPage.setVisible(false);
            employeesPage.setVisible(false);
            securityGuardsPage.setVisible(false);
        }
        else if(event.getSource() == deputiesBtn){
            mayorPage.setVisible(false);
            deputiesPage.setVisible(true);
            inspectorsPage.setVisible(false);
            employeesPage.setVisible(false);
            securityGuardsPage.setVisible(false);
        }
        else if(event.getSource() == inspectorsBtn){
            mayorPage.setVisible(false);
            deputiesPage.setVisible(false);
            inspectorsPage.setVisible(true);
            employeesPage.setVisible(false);
            securityGuardsPage.setVisible(false);
        }
        else if(event.getSource() == employeesBtn){
            mayorPage.setVisible(false);
            deputiesPage.setVisible(false);
            inspectorsPage.setVisible(false);
            employeesPage.setVisible(true);
            securityGuardsPage.setVisible(false);
        }
        else if(event.getSource() == securityGuardsBtn){
            mayorPage.setVisible(false);
            deputiesPage.setVisible(false);
            inspectorsPage.setVisible(false);
            employeesPage.setVisible(false);
            securityGuardsPage.setVisible(true);
        }
        
    }
    public void displayUsername(){
        
    }
    

}
