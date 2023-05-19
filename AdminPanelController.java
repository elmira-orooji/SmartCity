
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.sql.Connection;
import java.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class AdminPanelController implements Initializable{
    public static String username;
    public static String path;

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
    private TableColumn<Mayor, String> lastname_col_Mayor;

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
    private TableColumn<Mayor, Integer> personnelNo_col_Mayor;

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
    private TableColumn<Mayor, Double> history_col_Mayor;

    @FXML
    private TableColumn<?, ?> lastname_col_securityguards;

    @FXML
    private TableColumn<?, ?> totalSalary_col_inspectors;

    @FXML
    private AnchorPane employeesPage;

    @FXML
    private TableView<Mayor> tableMayor;

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
    private TableColumn<Mayor, Date> dateOfHire_col_Mayor;


    @FXML
    private TableColumn<?, ?> totalSalary_col_securityguards;

    @FXML
    private Button clearBtnSecurityguards;

    @FXML
    private TableColumn<Mayor, String> gender_col_Mayor;

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
    private TableColumn<Mayor, Double> totalSalary_col_Mayor;

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
    private TableColumn<Mayor, Integer> row_col_Mayor;

    @FXML
    private ComboBox<?> gender_box_securityguards;

    @FXML
    private TableColumn<Mayor, Integer> phoneNo_col_Mayor;

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
        GenderList();
        ShowMayorListData();
        
       
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
            GenderList();
           
        }
        else if(event.getSource() == deputiesBtn){
            mayorPage.setVisible(false);
            deputiesPage.setVisible(true);
            inspectorsPage.setVisible(false);
            employeesPage.setVisible(false);
            securityGuardsPage.setVisible(false);
             GenderList();
        }
        else if(event.getSource() == inspectorsBtn){
            mayorPage.setVisible(false);
            deputiesPage.setVisible(false);
            inspectorsPage.setVisible(true);
            employeesPage.setVisible(false);
            securityGuardsPage.setVisible(false);
            GenderList();
        }
        else if(event.getSource() == employeesBtn){
            mayorPage.setVisible(false);
            deputiesPage.setVisible(false);
            inspectorsPage.setVisible(false);
            employeesPage.setVisible(true);
            securityGuardsPage.setVisible(false);
            GenderList();
          
        }
        else if(event.getSource() == securityGuardsBtn){
            mayorPage.setVisible(false);
            deputiesPage.setVisible(false);
            inspectorsPage.setVisible(false);
            employeesPage.setVisible(false);
            securityGuardsPage.setVisible(true);
            GenderList();
            
        }
        
    }
    
    private Connection connect;
    private Statement statement;
    private PreparedStatement prepare;
    private ResultSet result;
    
    public ObservableList<Mayor> mayorListData(){
        
        ObservableList<Mayor> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM mayor";
        
        connect = Database.connectDb();
        
        try{
            
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            Mayor MayorD;
            
            while(result.next()){
                MayorD = new Mayor(result.getInt("Row"), 
                         result.getString("First_name"),
                         result.getString("Last_name"),
                         result.getInt("Personnel_No"),
                         result.getDate("Date_of_hire"),
                         result.getString("Gender"),
                         result.getInt("Phone_No"),
                         result.getDouble("History"),
                         result.getDouble("Basic_salary"),
                         result.getDouble("Total_salary"));
                
                listData.add(MayorD);
            }
            
        }catch(Exception e){ e.printStackTrace();}
        
        return listData;
    }
    
    private ObservableList<Mayor> MayorList;
    
    public void ShowMayorListData(){
        
        MayorList = mayorListData();
        row_col_Mayor.setCellValueFactory(new PropertyValueFactory<>("row"));
        firstname_col_Mayor.setCellValueFactory(new PropertyValueFactory<>("firstname"));
        lastname_col_Mayor.setCellValueFactory(new PropertyValueFactory<>("lastname"));
        personnelNo_col_Mayor.setCellValueFactory(new PropertyValueFactory<>("personnelNo"));
        dateOfHire_col_Mayor.setCellValueFactory(new PropertyValueFactory<>("hireDate"));
        gender_col_Mayor.setCellValueFactory(new PropertyValueFactory<>("gender"));
        phoneNo_col_Mayor.setCellValueFactory(new PropertyValueFactory<>("phoneNo"));
        history_col_Mayor.setCellValueFactory(new PropertyValueFactory<>("history"));
        basicSalary_col_Mayor.setCellValueFactory(new PropertyValueFactory<>("basicSalary"));
        totalSalary_col_Mayor.setCellValueFactory(new PropertyValueFactory<>("totalSalary"));
        
        tableMayor.setItems(MayorList);


    }
    
    public void MayorSelect(){
        
        Mayor mayor = tableMayor.getSelectionModel().getSelectedItem();
        int n = tableMayor.getSelectionModel().getSelectedIndex();
        
        if((n -1)< -1){return;}
        
        row_field_Mayor.setText(String.valueOf(mayor.getRow()));
        firstname_field_Mayor.setText(mayor.getFirstname());
        lastname_field_Mayor.setText(mayor.getLastname());
        personnelNo_field_Mayor.setText(String.valueOf(mayor.getPersonnelNo()));
        dateOfHire_field_Mayor.setText(String.valueOf(mayor.getHireDate()));
        phoneNo_field_Mayor.setText(String.valueOf(mayor.getPhoneNo()));
        history_field_Mayor.setText(String.valueOf(mayor.getHistory()));
        basicSalary_field_Mayor.setText(String.valueOf(mayor.getBasicSalary()));
        totalSalary_field_Mayor.setText(String.valueOf(mayor.getTotalSalary()));

    }
    
    public void MayorAdd(){
        
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        
        String sql  = "INSERT INTO mayor "
                + "(Row,First_name,Last_name,Personnel_No,Date_of_hire,Gender,Phone_No,History,Basic_salary,Total_salary)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?)";
        
        connect = Database.connectDb();
        
        try{
            
            if(row_field_Mayor.getText().isEmpty()||firstname_field_Mayor.getText().isEmpty()
                    ||lastname_field_Mayor.getText().isEmpty()||personnelNo_field_Mayor.getText().isEmpty()
                    ||dateOfHire_field_Mayor.getText().isEmpty()
                    ||gender_box_Mayor.getSelectionModel().getSelectedItem()== null 
                    ||phoneNo_field_Mayor.getText().isEmpty()||history_field_Mayor.getText().isEmpty()
                    ||basicSalary_field_Mayor.getText().isEmpty()){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            
            }else{
                
            
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, row_field_Mayor.getText());
            prepare.setString(2, firstname_field_Mayor.getText());
            prepare.setString(3, lastname_field_Mayor.getText());
            prepare.setString(4, personnelNo_field_Mayor.getText());
            prepare.setString(5, String.valueOf(sqlDate));
            prepare.setString(6,(String) gender_box_Mayor.getSelectionModel().getSelectedItem());
            prepare.setString(7, phoneNo_field_Mayor.getText());
            prepare.setString(8, history_field_Mayor.getText());
            prepare.setString(9, basicSalary_field_Mayor.getText());
            prepare.setString(10, totalSalary_field_Mayor.getText());
            
            

             
             
            prepare.executeUpdate();
            Alert alert1 = new Alert(AlertType.INFORMATION);
            alert1.setTitle("Information");
            alert1.setHeaderText("");
            alert1.setContentText("Added successfully");
            alert1.showAndWait();
            
            ShowMayorListData();
            MayorClear();
            }
        }catch(Exception e){e.printStackTrace();}
    }
    public void DisplayUsername(){
        
        
    }
    
    private String[] genderList = {"Female","Male"};
    public void GenderList(){
        
        List<String> glist = new ArrayList<>();
        
        for(String data : genderList){
            glist.add(data);
        }
        
        ObservableList listData = FXCollections.observableArrayList(glist);
        gender_box_Mayor.setItems(listData);
    }
    
    public void MayorUpdate(){
        
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        
        String sql = "UPDATE mayor SET Row = '"+row_field_Mayor.getText()+"' ,First_name = '"
                +firstname_field_Mayor.getText()+"' , Last_name = '"+lastname_field_Mayor.getText()
                +"' ,Personnel_No = '"+personnelNo_field_Mayor.getText()+"' ,Gender = '"+
                gender_box_Mayor.getSelectionModel().getSelectedItem()+"' ,Phone_NO = '"+
                phoneNo_field_Mayor.getText()+"' ,History = '"+history_field_Mayor.getText()
                +"' ,Basic_salary = '"+basicSalary_field_Mayor.getText()+"' ,Total_salary = '"
                +totalSalary_field_Mayor.getText()
                +"' ,Date_of_hire = '"+dateOfHire_field_Mayor.getText()+"',Date_of_hire = '"+
                sqlDate; 
        
        connect = Database.connectDb();
        
        try{
            if(row_field_Mayor.getText().isEmpty()||firstname_field_Mayor.getText().isEmpty()
                    ||lastname_field_Mayor.getText().isEmpty()||personnelNo_field_Mayor.getText().isEmpty()
                    ||dateOfHire_field_Mayor.getText().isEmpty()
                    ||gender_box_Mayor.getSelectionModel().getSelectedItem()== null 
                    ||phoneNo_field_Mayor.getText().isEmpty()||history_field_Mayor.getText().isEmpty()
                    ||basicSalary_field_Mayor.getText().isEmpty()){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            }else{
                Alert alert = new Alert(AlertType.CONFIRMATION); 
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want delete mayor "+
                                      firstname_field_Mayor.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();
                
                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);
                    
                    Alert alert1 = new Alert(AlertType.INFORMATION); 
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Deleted Successfully ^.^");
                    alert1.showAndWait();
                    ShowMayorListData();
                    MayorClear();
                }
                
                
            }
        }catch(Exception e){e.printStackTrace();}
             
                
    }
    
    public void MayorDelete(){
        
        String sql = "DELETE FROM mayor WHERE Row = '"
                +row_field_Mayor.getText()+"'";
        
        connect = Database.connectDb();
        
        try{
            
             if(row_field_Mayor.getText().isEmpty()||firstname_field_Mayor.getText().isEmpty()
                    ||lastname_field_Mayor.getText().isEmpty()||personnelNo_field_Mayor.getText().isEmpty()
                    ||dateOfHire_field_Mayor.getText().isEmpty()
                    ||gender_box_Mayor.getSelectionModel().getSelectedItem()== null 
                    ||phoneNo_field_Mayor.getText().isEmpty()||history_field_Mayor.getText().isEmpty()
                    ||basicSalary_field_Mayor.getText().isEmpty()){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            }else{
                Alert alert = new Alert(AlertType.CONFIRMATION); 
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want update mayor "+
                                      firstname_field_Mayor.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();
                
                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);
                    
                    Alert alert1 = new Alert(AlertType.INFORMATION); 
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Updated Successfully ^.^");
                    alert1.showAndWait();
                    ShowMayorListData();
                    MayorClear();
                }
             }
        }catch(Exception e){e.printStackTrace();}
    }
    
    
    public void MayorClear(){
        
        row_field_Mayor.setText("");
        firstname_field_Mayor.setText("");
        lastname_field_Mayor.setText("");
        personnelNo_field_Mayor.setText("");
        gender_box_Mayor.getSelectionModel().getSelectedItem();
        phoneNo_field_Mayor.setText("");  
        history_field_Mayor.setText("");
        basicSalary_field_Mayor.setText("");
        totalSalary_field_Mayor.setText("");
        dateOfHire_field_Mayor.setText("");
        path = "";
        
    }

    
     
   

}
