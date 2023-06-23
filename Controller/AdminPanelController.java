package Controller;


import Model.Database;
import Model.Deputies;
import Model.Employees;
import Model.Inspectors;
import Model.Mayor;
import Model.Securityguards;
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
import java.util.logging.FileHandler;
import java.util.logging.Logger;
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
    

    @FXML
    private AnchorPane skeleton_page;
    
    @FXML
    private ComboBox<Securityguards> gender_box_timework;
    
    @FXML
    private TableView<Securityguards> securityGuardsTable;

    @FXML
    private TableView<Deputies> deputiesTable;

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
    private TableColumn<Deputies, Double> totalSalary_col_deputies;

    @FXML
    private TableColumn<Securityguards, Integer> shiftWork_col_securityguards;

    @FXML
    private TextField dateOfHire_field_inspectors;

    @FXML
    private TableColumn<Deputies, Integer> personnelNo_col_deputies;

    @FXML
    private TableColumn<Deputies, String> gender_col_deputies;

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
    private TableColumn<Employees, String> gender_col_employees;

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
    private TableView<Employees> employeesTable;

    @FXML
    private TableColumn<?, ?> phoneNo_col_inspectors;

    @FXML
    private TableColumn<?, ?> row_col_employees;

    @FXML
    private TableColumn<Employees,Double > workingHoursPerWeek_col_employees;

    @FXML
    private TableColumn<Deputies, Integer> phoneNo_col_deputies;

    @FXML
    private TableColumn<?, ?> row_col_securityguards;

    @FXML
    private TextField phoneNo_field_employees;
    
    @FXML
    private TextField firstname_field_securityguards;

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
    private TableColumn<Securityguards, String> gender_col_securityguards;

    @FXML
    private TextField dateOfHire_field_securityguards;
    
    @FXML
    private TextField phoneNumber_field_securityguards;

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
    private TableView<Inspectors> inspectorsTable;

   @FXML
    private TableColumn<Mayor, String> lastname_col_Mayor;

    @FXML
    private TableColumn<Inspectors, String> lastname_col_inspectors;

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
    private TableColumn<Securityguards, String> timework_col_securityguards;

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
    private TableColumn<Deputies, String> lastname_col_deputies;

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
    private TableColumn<Deputies, Double> history_col_deputies;

    @FXML
    private AnchorPane securityGuardsPage;

    @FXML
    private TableColumn<Mayor, Double> history_col_Mayor;

    @FXML
    private TableColumn<Securityguards, String> lastname_col_securityguards;

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
    private ComboBox<?> timework_box_securityguards;
   
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
    private TableColumn<Securityguards, String> firstname_col_securityguards;

    @FXML
    private TextField history_field_securityguards;

    @FXML
    private TableColumn<Mayor, Date> dateOfHire_col_Mayor;


    @FXML
    private TableColumn<Securityguards, Double> totalSalary_col_securityguards;

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
    private TableColumn<Employees, String> firstname_col_employees;

    @FXML
    private TextField totalSalary_field_employees;

    @FXML
    private TableColumn<Deputies, Integer> row_col_deputies;

    @FXML
    private TextField basicSalary_field_securityguards;

    @FXML
    private Button mayorBtn;

    @FXML
    private TableColumn<Inspectors, String> firstname_col_inspectors;

    @FXML
    private TableColumn<Deputies, String> firstname_col_deputies;

    @FXML
    private TextField row_field_inspectors;

    @FXML
    private Button clearBtnInspectors;

    @FXML
    private Button clearBtnMayor;

    @FXML
    private TableColumn<Employees, Date> dateOfHire_col_employees;

    @FXML
    private ComboBox<?> gender_box_employees;

    @FXML
    private TableColumn<Employees, Integer> phoneNo_col_employees;

    @FXML
    private TableColumn<Mayor, Double> totalSalary_col_Mayor;

    @FXML
    private TextField totalSalary_field_inspectors;

    @FXML
    private TableColumn<Deputies, Date> dateOfHire_col_deputies;

    @FXML
    private Button addBtnDeputies;

    @FXML
    private TextField history_field_employees;

    @FXML
    private TableColumn<Employees, Double> basicSalary_col_employees;

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
    private TableColumn<Employees, Double> totalSalary_col_employees;

    @FXML
    private Button deleteBtnSecurityguards;

    @FXML
    private TextField history_field_inspectors;
    
    @FXML
    private TextField Mayor_username_field;
    
     @FXML
    private TextField Mayor_password_field;
    

    @FXML
    private TextField basicSalary_field_deputies;

    @FXML
    private TextField firstname_field_deputies;

    @FXML
    private TextField personnelNo_field_inspectors;
    
    @FXML
    private TextField Mayor_username;
    
    @FXML
    private TextField Mayor_password;

    @FXML
    private TextField row_field_deputies;

    @FXML
    private TextField firstname_field_inspectors;
    @FXML
    private FontAwesomeIcon clearBtnDeputies;
    @FXML
    private TableColumn<Securityguards, Integer> phoneNo_col_securityguards;
    

    FileHandler handler;
    
    static ArrayList<String> mayor = new ArrayList<String>();
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        GenderListMayor();

        GenderListDeputies();
        ShowDeputiesListData();
        GenderListInspectors();
        ShowInspectorsListData();
        GenderListEmployees();
        ShowEmployeesListData();
        GenderListSecurity();
        TimeworkListSecurity();
        ShowSecurityListData();
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
            
             handler = new FileHandler("logger.log", true);
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
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }
    }
    
    public void switchPage(ActionEvent event){
        
        if(event.getSource() == mayorBtn){
            mayorPage.setVisible(true);
            deputiesPage.setVisible(false);
            inspectorsPage.setVisible(false);
            employeesPage.setVisible(false);
            securityGuardsPage.setVisible(false);
            GenderListMayor();
           
        }
        else if(event.getSource() == deputiesBtn){
            mayorPage.setVisible(false);
            deputiesPage.setVisible(true);
            inspectorsPage.setVisible(false);
            employeesPage.setVisible(false);
            securityGuardsPage.setVisible(false);
             GenderListDeputies();
        }
        else if(event.getSource() == inspectorsBtn){
            mayorPage.setVisible(false);
            deputiesPage.setVisible(false);
            inspectorsPage.setVisible(true);
            employeesPage.setVisible(false);
            securityGuardsPage.setVisible(false);
            GenderListInspectors();
        }
        else if(event.getSource() == employeesBtn){
            mayorPage.setVisible(false);
            deputiesPage.setVisible(false);
            inspectorsPage.setVisible(false);
            employeesPage.setVisible(true);
            securityGuardsPage.setVisible(false);
            GenderListEmployees();
          
        }
        else if(event.getSource() == securityGuardsBtn){
            mayorPage.setVisible(false);
            deputiesPage.setVisible(false);
            inspectorsPage.setVisible(false);
            employeesPage.setVisible(false);
            securityGuardsPage.setVisible(true);
            GenderListSecurity();
            TimeworkListSecurity();
            
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
            
            handler = new FileHandler("logger.log", true);
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
            
        }catch(Exception e){ 
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }
        
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
            
            handler = new FileHandler("logger.log", true);
            
            if(row_field_Mayor.getText().isEmpty()||firstname_field_Mayor.getText().isEmpty()
                    ||lastname_field_Mayor.getText().isEmpty()||personnelNo_field_Mayor.getText().isEmpty()
                    ||dateOfHire_field_Mayor.getText().isEmpty()
                    ||gender_box_Mayor.getSelectionModel().getSelectedItem()== null 
                    ||phoneNo_field_Mayor.getText().isEmpty()||history_field_Mayor.getText().isEmpty()
                    ||basicSalary_field_Mayor.getText().isEmpty()
                    
                    ){
                
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
        }catch(Exception e){
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }
    }
   
    private String[] genderList = {"Female","Male"};
    
    public void GenderListMayor(){
        
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
        
        String sql = "UPDATE mayor SET First_name = '"
                +firstname_field_Mayor.getText()+"' , Last_name = '"+lastname_field_Mayor.getText()
                +"' ,Personnel_No = '"+personnelNo_field_Mayor.getText()+"' ,Gender = '"+
                gender_box_Mayor.getSelectionModel().getSelectedItem()+"' ,Phone_NO = '"+
                phoneNo_field_Mayor.getText()+"' ,History = '"+history_field_Mayor.getText()
                +"' ,Basic_salary = '"+basicSalary_field_Mayor.getText()+"' ,Total_salary = '"
                +totalSalary_field_Mayor.getText()
                +"' ,Date_of_hire = '"+dateOfHire_field_Mayor.getText()+"',Date_of_hire = '"+
                sqlDate+"' WHERE Row = '"+row_field_Mayor.getText()+"'"; 
        
        connect = Database.connectDb();
        
        try{
            
            
            handler = new FileHandler("logger.log", true);
            
            if(row_field_Mayor.getText().isEmpty()||firstname_field_Mayor.getText().isEmpty()
                    ||lastname_field_Mayor.getText().isEmpty()||personnelNo_field_Mayor.getText().isEmpty()
                    ||dateOfHire_field_Mayor.getText().isEmpty()
                    ||gender_box_Mayor.getSelectionModel().getSelectedItem()== null 
                    ||phoneNo_field_Mayor.getText().isEmpty()||history_field_Mayor.getText().isEmpty()
                    ||basicSalary_field_Mayor.getText().isEmpty()
                    

                    ){
                
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
        }catch(Exception e){e.printStackTrace();
        Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
        logger.addHandler(handler);
        logger.warning("warning message"+e);
        
        }
              
    }
    
    public void MayorDelete(){
        
        String sql = "DELETE FROM mayor WHERE Row = '"
                +row_field_Mayor.getText()+"'";
        
        connect = Database.connectDb();
        
        try{
            
            handler = new FileHandler("logger.log", true);
            
             if(row_field_Mayor.getText().isEmpty()||firstname_field_Mayor.getText().isEmpty()
                    ||lastname_field_Mayor.getText().isEmpty()||personnelNo_field_Mayor.getText().isEmpty()
                    ||dateOfHire_field_Mayor.getText().isEmpty()
                    ||gender_box_Mayor.getSelectionModel().getSelectedItem()== null 
                    ||phoneNo_field_Mayor.getText().isEmpty()||history_field_Mayor.getText().isEmpty()
                    ||basicSalary_field_Mayor.getText().isEmpty()
                    

                    ){
                
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
        }catch(Exception e){
            
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
                   
            
        }
    }
    
    
    public void MayorClear(){
        
        row_field_Mayor.setText("");
        firstname_field_Mayor.setText("");
        lastname_field_Mayor.setText("");
        personnelNo_field_Mayor.setText("");
        gender_box_Mayor.getSelectionModel().getSelectedItem().equals("");
        phoneNo_field_Mayor.setText("");  
        history_field_Mayor.setText("");
        basicSalary_field_Mayor.setText("");
        totalSalary_field_Mayor.setText("");
        dateOfHire_field_Mayor.setText("");
       
        
        
        
    }
    
    public void TotalSalaryMayor(){
       
        
        totalSalary_field_Mayor.setText(String.valueOf((0.05*Integer.parseInt(basicSalary_field_Mayor.getText())*Integer.parseInt(history_field_Mayor.getText()))+ Integer.parseInt(basicSalary_field_Mayor.getText())));
        
        totalSalary_field_Mayor.setEditable(false);
    }
    
   
    
    
    /* Deputies Part */
    
      public ObservableList<Deputies> deputiesListData(){
        
        ObservableList<Deputies> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM deputies";
        
        connect = Database.connectDb();
        
        try{
            
            handler = new FileHandler("logger.log", true);
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            Deputies DeputiesD;
            
            while(result.next()){
                DeputiesD = new Deputies(result.getInt("Row"), 
                         result.getString("First_name"),
                         result.getString("Last_name"),
                         result.getInt("Personnel_No"),
                         result.getDate("Date_of_hire"),
                         result.getString("Gender"),
                         result.getInt("Phone_No"),
                         result.getDouble("History"),
                         result.getDouble("Basic_salary"),
                         result.getDouble("Total_salary"));
                
                listData.add(DeputiesD);
            }
            
        }catch(Exception e){ 
            
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }
        
        return listData;
    }
    
    private ObservableList<Deputies> DeputiesList;
    
    public void ShowDeputiesListData(){
        
        DeputiesList = deputiesListData();
        row_col_deputies.setCellValueFactory(new PropertyValueFactory<>("row"));
        firstname_col_deputies.setCellValueFactory(new PropertyValueFactory<>("firstname"));
        lastname_col_deputies.setCellValueFactory(new PropertyValueFactory<>("lastname"));
        personnelNo_col_deputies.setCellValueFactory(new PropertyValueFactory<>("personnelNo"));
        dateOfHire_col_deputies.setCellValueFactory(new PropertyValueFactory<>("hireDate"));
        gender_col_deputies.setCellValueFactory(new PropertyValueFactory<>("gender"));
        phoneNo_col_deputies.setCellValueFactory(new PropertyValueFactory<>("phoneNo"));
        history_col_deputies.setCellValueFactory(new PropertyValueFactory<>("history"));
        basicSalary_col_deputies.setCellValueFactory(new PropertyValueFactory<>("basicSalary"));
        totalSalary_col_deputies.setCellValueFactory(new PropertyValueFactory<>("totalSalary"));
        
        
        deputiesTable.setItems(DeputiesList);


    }
    
    public void DeputiesSelect(){
        
        Deputies deputies = deputiesTable.getSelectionModel().getSelectedItem();
        int n = deputiesTable.getSelectionModel().getSelectedIndex();
        
        if((n -1)< -1){return;}
        
        row_field_deputies.setText(String.valueOf(deputies.getRow()));
        firstname_field_deputies.setText(deputies.getFirstname());
        lastname_field_deputies.setText(deputies.getLastname());
        personnelNo_field_deputies.setText(String.valueOf(deputies.getPersonnelNo()));
        dateOfHire_field_deputies.setText(String.valueOf(deputies.getHireDate()));
        phoneNo_field_deputies.setText(String.valueOf(deputies.getPhoneNo()));
        history_field_deputies.setText(String.valueOf(deputies.getHistory()));
        basicSalary_field_deputies.setText(String.valueOf(deputies.getBasicSalary()));
        

    }
    
    public void DeputiesAdd(){
        
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        
        String sql  = "INSERT INTO deputies "
                + "(Row,First_name,Last_name,Personnel_No,Date_of_hire,Gender,Phone_No,History,Basic_salary,Total_salary)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?)";
        
        connect = Database.connectDb();
        
        try{
            
            handler = new FileHandler("logger.log", true);
            
            
            if(row_field_deputies.getText().isEmpty()||firstname_field_deputies.getText().isEmpty()
                    ||lastname_field_deputies.getText().isEmpty()||personnelNo_field_deputies.getText().isEmpty()
                    ||dateOfHire_field_deputies.getText().isEmpty()
                    ||gender_box_deputies.getSelectionModel().getSelectedItem()== null 
                    ||phoneNo_field_deputies.getText().isEmpty()||history_field_deputies.getText().isEmpty()
                    ||basicSalary_field_deputies.getText().isEmpty()){
                
            Alert alert = new Alert(Alert.AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            
            }else{
                
            
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, row_field_deputies.getText());
            prepare.setString(2, firstname_field_deputies.getText());
            prepare.setString(3, lastname_field_deputies.getText());
            prepare.setString(4, personnelNo_field_deputies.getText());
            prepare.setString(5, String.valueOf(sqlDate));
            prepare.setString(6,(String) gender_box_deputies.getSelectionModel().getSelectedItem());
            prepare.setString(7, phoneNo_field_deputies.getText());
            prepare.setString(8, history_field_deputies.getText());
            prepare.setString(9, basicSalary_field_deputies.getText());
            prepare.setString(10, totalSalary_field_deputies.getText());
            
            

             
             
            prepare.executeUpdate();
            Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
            alert1.setTitle("Information");
            alert1.setHeaderText("");
            alert1.setContentText("Added successfully");
            alert1.showAndWait();
            
            ShowDeputiesListData();
            DeputiesClear();
            }
        }catch(Exception e){
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        
        
        }
    }
    
     public void GenderListDeputies(){
        
        List<String> glist = new ArrayList<>();
        
        for(String data : genderList){
            glist.add(data);
        }
        
        ObservableList listData = FXCollections.observableArrayList(glist);
        gender_box_deputies.setItems(listData);
        
    }
    
    
    public void DeputiesUpdate(){
        
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        
        String sql = "UPDATE mayor SET First_name = '"
                +firstname_field_deputies.getText()+"' , Last_name = '"+lastname_field_deputies.getText()
                +"' ,Personnel_No = '"+personnelNo_field_deputies.getText()+"' ,Gender = '"+
                gender_box_deputies.getSelectionModel().getSelectedItem()+"' ,Phone_NO = '"+
                phoneNo_field_deputies.getText()+"' ,History = '"+history_field_deputies.getText()
                +"' ,Basic_salary = '"+basicSalary_field_deputies.getText()+"' ,Total_salary = '"
                +totalSalary_field_deputies.getText()
                +"' ,Date_of_hire = '"+dateOfHire_field_deputies.getText()+"',Date_of_hire = '"+
                sqlDate+"' WHERE Row = '"+row_field_deputies.getText()+"'"; 
        
        connect = Database.connectDb();
        
        try{
            
            handler = new FileHandler("logger.log", true);
            
            if(row_field_deputies.getText().isEmpty()||firstname_field_deputies.getText().isEmpty()
                    ||lastname_field_deputies.getText().isEmpty()||personnelNo_field_deputies.getText().isEmpty()
                    ||dateOfHire_field_deputies.getText().isEmpty()
                    ||gender_box_deputies.getSelectionModel().getSelectedItem()== null 
                    ||phoneNo_field_deputies.getText().isEmpty()||history_field_deputies.getText().isEmpty()
                    ||basicSalary_field_deputies.getText().isEmpty()){
                
            Alert alert = new Alert(Alert.AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            }else{
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION); 
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want update mayor "+
                                      firstname_field_deputies.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();
                
                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);
                    
                    Alert alert1 = new Alert(Alert.AlertType.INFORMATION); 
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Updated Successfully ^.^");
                    alert1.showAndWait();
                    ShowDeputiesListData();
                    DeputiesClear();
                }
                
                
            }
        }catch(Exception e){
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        
        
        }
                
    }
    
    public void DeputiesDelete(){
        
        String sql = "DELETE FROM deputies WHERE Row = '"
                +row_field_deputies.getText()+"'";
        
        connect = Database.connectDb();
        
        try{
            
            handler = new FileHandler("logger.log", true);
            
             if(row_field_deputies.getText().isEmpty()||firstname_field_deputies.getText().isEmpty()
                    ||lastname_field_deputies.getText().isEmpty()||personnelNo_field_deputies.getText().isEmpty()
                    ||dateOfHire_field_deputies.getText().isEmpty()
                    ||gender_box_deputies.getSelectionModel().getSelectedItem()== null 
                    ||phoneNo_field_deputies.getText().isEmpty()||history_field_deputies.getText().isEmpty()
                    ||basicSalary_field_deputies.getText().isEmpty()){
                
            Alert alert = new Alert(Alert.AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            }else{
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION); 
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want delete mayor "+
                                      firstname_field_deputies.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();
                
                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);
                    
                    Alert alert1 = new Alert(Alert.AlertType.INFORMATION); 
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Deleted Successfully ^.^");
                    alert1.showAndWait();
                    
                    ShowDeputiesListData();
                    DeputiesClear();
                }
             }
        }catch(Exception e){
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);

       
        }
    }
    
    
    public void DeputiesClear(){
        
        row_field_deputies.setText("");
        firstname_field_deputies.setText("");
        lastname_field_deputies.setText("");
        personnelNo_field_deputies.setText("");
        gender_box_deputies.getSelectionModel().getSelectedItem();
        phoneNo_field_deputies.setText("");  
        history_field_deputies.setText("");
        basicSalary_field_deputies.setText("");
        totalSalary_field_deputies.setText("");
        dateOfHire_field_deputies.setText("");
        
        
    }
    
     public void TotalSalaryDeputies(){
       
        
        totalSalary_field_deputies.setText(String.valueOf((0.05*Integer.parseInt(basicSalary_field_deputies.getText())*Integer.parseInt(history_field_deputies.getText()))+ Integer.parseInt(basicSalary_field_deputies.getText())));
        
        totalSalary_field_deputies.setEditable(false);
    }

    
    
    /* Inspectors Part */
    
    public ObservableList<Inspectors> inspectorsListData(){
        
        ObservableList<Inspectors> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM inspectors";
        
        connect = Database.connectDb();
        
        try{
            
            handler = new FileHandler("logger.log", true);
            
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            Inspectors InspectorsD;
            
            while(result.next()){
                InspectorsD = new Inspectors(result.getInt("Row"), 
                         result.getString("First_name"),
                         result.getString("Last_name"),
                         result.getInt("Personnel_No"),
                         result.getDate("Date_of_hire"),
                         result.getString("Gender"),
                         result.getInt("Phone_No"),
                         result.getDouble("History"),
                         result.getDouble("Basic_salary"),
                         result.getDouble("Total_salary"));
                
                listData.add(InspectorsD);
            }
            
        }catch(Exception e){ 
            e.printStackTrace();
        
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message");
        }
        
        return listData;
    }
    
    private ObservableList<Inspectors> InspectorsList;
    
    public void ShowInspectorsListData(){
        
        InspectorsList = inspectorsListData();
        row_col_inspectors.setCellValueFactory(new PropertyValueFactory<>("row"));
        firstname_col_inspectors.setCellValueFactory(new PropertyValueFactory<>("firstname"));
        lastname_col_inspectors.setCellValueFactory(new PropertyValueFactory<>("lastname"));
        personnelNo_col_inspectors.setCellValueFactory(new PropertyValueFactory<>("personnelNo"));
        dateOfHire_col_inspectors.setCellValueFactory(new PropertyValueFactory<>("hireDate"));
        gender_col_inspectors.setCellValueFactory(new PropertyValueFactory<>("gender"));
        phoneNo_col_inspectors.setCellValueFactory(new PropertyValueFactory<>("phoneNo"));
        history_col_inspectors.setCellValueFactory(new PropertyValueFactory<>("history"));
        basicSalary_col_inspectors.setCellValueFactory(new PropertyValueFactory<>("basicSalary"));
        totalSalary_col_inspectors.setCellValueFactory(new PropertyValueFactory<>("totalSalary"));
        
        
        inspectorsTable.setItems(InspectorsList);


    }
    
    public void InspectorsSelect(){
        
        Inspectors inspectors= inspectorsTable.getSelectionModel().getSelectedItem();
        int n = inspectorsTable.getSelectionModel().getSelectedIndex();
        
        if((n -1)< -1){return;}
        
        row_field_inspectors.setText(String.valueOf(inspectors.getRow()));
        firstname_field_inspectors.setText(inspectors.getFirstname());
        lastname_field_inspectors.setText(inspectors.getLastname());
        personnelNo_field_inspectors.setText(String.valueOf(inspectors.getPersonnelNo()));
        dateOfHire_field_inspectors.setText(String.valueOf(inspectors.getHireDate()));
        phoneNo_field_inspectors.setText(String.valueOf(inspectors.getPhoneNo()));
        history_field_inspectors.setText(String.valueOf(inspectors.getHistory()));
        basicSalary_field_inspectors.setText(String.valueOf(inspectors.getBasicSalary()));
        totalSalary_field_inspectors.setText(String.valueOf(inspectors.getTotalSalary()));

    }
    
    public void InspectorsAdd(){
        
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        
        String sql  = "INSERT INTO inspectors "
                + "(Row,First_name,Last_name,Personnel_No,Date_of_hire,Gender,Phone_No,History,Basic_salary,Total_salary)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?)";
        
        connect = Database.connectDb();
        
        try{
            
            
            handler = new FileHandler("logger.log", true);
            if(row_field_inspectors.getText().isEmpty()||firstname_field_inspectors.getText().isEmpty()
                    ||lastname_field_inspectors.getText().isEmpty()||personnelNo_field_inspectors.getText().isEmpty()
                    ||dateOfHire_field_inspectors.getText().isEmpty()
                    ||gender_box_inspectors.getSelectionModel().getSelectedItem()== null 
                    ||phoneNo_field_inspectors.getText().isEmpty()||history_field_inspectors.getText().isEmpty()
                    ||basicSalary_field_inspectors.getText().isEmpty()){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            
            }else{
                
            
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, row_field_inspectors.getText());
            prepare.setString(2, firstname_field_inspectors.getText());
            prepare.setString(3, lastname_field_inspectors.getText());
            prepare.setString(4, personnelNo_field_inspectors.getText());
            prepare.setString(5, String.valueOf(sqlDate));
            prepare.setString(6,(String) gender_box_inspectors.getSelectionModel().getSelectedItem());
            prepare.setString(7, phoneNo_field_inspectors.getText());
            prepare.setString(8, history_field_inspectors.getText());
            prepare.setString(9, basicSalary_field_inspectors.getText());
            prepare.setString(10, totalSalary_field_inspectors.getText());
            
            

             
             
            prepare.executeUpdate();
            Alert alert1 = new Alert(AlertType.INFORMATION);
            alert1.setTitle("Information");
            alert1.setHeaderText("");
            alert1.setContentText("Added successfully");
            alert1.showAndWait();
            
            ShowInspectorsListData();
            InspectorsClear();
            }
        }catch(Exception e){
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
           logger.addHandler(handler);
           logger.warning("warning message"+e);
        
        
        }
    }
   
    
    public void GenderListInspectors(){
        
        List<String> glist = new ArrayList<>();
        
        for(String data : genderList){
            glist.add(data);
        }
        
        ObservableList listData = FXCollections.observableArrayList(glist);
        gender_box_inspectors.setItems(listData);
        
    }
    
    public void inspectorsUpdate(){
        
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        
        String sql = "UPDATE inspectors SET First_name = '"
                +firstname_field_inspectors.getText()+"' , Last_name = '"+lastname_field_inspectors.getText()
                +"' , Personnel_No = '"+personnelNo_field_inspectors.getText()+"' , Date_of_hire = '"+dateOfHire_field_inspectors.getText()+"' , Gender = '"+
                gender_box_inspectors.getSelectionModel().getSelectedItem()+"' , Phone_No = '"+
                phoneNo_field_inspectors.getText()+"' ,History = '"+history_field_inspectors.getText()
                +"' , Basic_salary = '"+basicSalary_field_inspectors.getText()+"' , Total_salary = '"
                +totalSalary_field_inspectors.getText()
                +"' WHERE Row = '"+row_field_inspectors.getText()+"'"; 
        
        connect = Database.connectDb();
        
        try{
            
            
            handler = new FileHandler("logger.log", true);
            if(row_field_inspectors.getText().isEmpty()||firstname_field_inspectors.getText().isEmpty()
                    ||lastname_field_inspectors.getText().isEmpty()||personnelNo_field_inspectors.getText().isEmpty()
                    ||dateOfHire_field_inspectors.getText().isEmpty()
                    ||gender_box_inspectors.getSelectionModel().getSelectedItem()== null 
                    ||phoneNo_field_inspectors.getText().isEmpty()||history_field_inspectors.getText().isEmpty()
                    ||basicSalary_field_inspectors.getText().isEmpty()){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            }else{
                Alert alert = new Alert(AlertType.CONFIRMATION); 
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want update inspector "+
                                      firstname_field_inspectors.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();
                
                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);
                    
                    Alert alert1 = new Alert(AlertType.INFORMATION); 
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Updated Successfully ^.^");
                    alert1.showAndWait();
                    ShowInspectorsListData();
                    InspectorsClear();
                }
                
                
            }
        }catch(Exception e){
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
           logger.addHandler(handler);
           logger.warning("warning message");
        
        
        
        
        }
                
    }
    
    public void InspectorsDelete(){
        
        String sql = "DELETE FROM inspectors WHERE Row = '"
                +row_field_inspectors.getText()+"'";
        
        connect = Database.connectDb();
        
        try{
            
            handler = new FileHandler("logger.log", true);
             if(row_field_inspectors.getText().isEmpty()||firstname_field_inspectors.getText().isEmpty()
                    ||lastname_field_inspectors.getText().isEmpty()||personnelNo_field_inspectors.getText().isEmpty()
                    ||dateOfHire_field_inspectors.getText().isEmpty()
                    ||gender_box_inspectors.getSelectionModel().getSelectedItem()== null 
                    ||phoneNo_field_inspectors.getText().isEmpty()||history_field_inspectors.getText().isEmpty()
                    ||basicSalary_field_inspectors.getText().isEmpty()){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            }else{
                Alert alert = new Alert(AlertType.CONFIRMATION); 
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want delete inspector "+
                                      firstname_field_inspectors.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();
                
                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);
                    
                    Alert alert1 = new Alert(AlertType.INFORMATION); 
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Deleted Successfully ^.^");
                    alert1.showAndWait();
                    ShowInspectorsListData();
                    InspectorsClear();
                }
             }
        }catch(Exception e){
            
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        
        }
    }
    
    
    public void InspectorsClear(){
        
        row_field_inspectors.setText("");
        firstname_field_inspectors.setText("");
        lastname_field_inspectors.setText("");
        personnelNo_field_inspectors.setText("");
        gender_box_inspectors.getSelectionModel().getSelectedItem();
        phoneNo_field_inspectors.setText("");  
        history_field_inspectors.setText("");
        basicSalary_field_inspectors.setText("");
        totalSalary_field_inspectors.setText("");
        dateOfHire_field_inspectors.setText("");
        
        
    }
    
    public void TotalSalaryInspectors(){
       
        
        totalSalary_field_inspectors.setText(String.valueOf((0.03*Integer.parseInt(basicSalary_field_inspectors.getText())*Integer.parseInt(history_field_inspectors.getText()))+ Integer.parseInt(basicSalary_field_inspectors.getText())));
        
        totalSalary_field_inspectors.setEditable(false);
    }
     
    
    /* Employee Part */
    
    public ObservableList<Employees> employeesListData(){
        
        ObservableList<Employees> listData = FXCollections.observableArrayList();
        
        String sql = "SELECT * FROM employees";
        
        connect = Database.connectDb();
        
        try{
            handler = new FileHandler("logger.log", true);
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            Employees EmployeesD;
            
            while(result.next()){
                EmployeesD = new Employees(result.getInt("Row"), 
                         result.getString("First_name"),
                         result.getString("Last_name"),
                         result.getInt("Personnel_No"),
                         result.getDate("Date_of_hire"),
                         result.getString("Gender"),
                         result.getInt("Phone_No"),
                         result.getDouble("History"),
                         result.getDouble("Basic_salary"), 
                         result.getDouble("Working_hours"),
                         result.getDouble("Total_salary"));
                
                listData.add(EmployeesD);
            }
            
        }catch(Exception e){
            
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message");
        
        }
        
        return listData;
    }
    
    private ObservableList<Employees> EmployeesList;
    
    public void ShowEmployeesListData(){
        
       
        EmployeesList = employeesListData();
        row_col_employees.setCellValueFactory(new PropertyValueFactory<>("row"));
        firstname_col_employees.setCellValueFactory(new PropertyValueFactory<>("firstname"));
        lastname_col_employees.setCellValueFactory(new PropertyValueFactory<>("lastname"));
        personnelNo_col_employees.setCellValueFactory(new PropertyValueFactory<>("personnelNo"));
        dateOfHire_col_employees.setCellValueFactory(new PropertyValueFactory<>("hireDate"));
        gender_col_employees.setCellValueFactory(new PropertyValueFactory<>("gender"));
        phoneNo_col_employees.setCellValueFactory(new PropertyValueFactory<>("phoneNo"));
        history_col_employees.setCellValueFactory(new PropertyValueFactory<>("history"));
        basicSalary_col_employees.setCellValueFactory(new PropertyValueFactory<>("basicSalary"));
        workingHoursPerWeek_col_employees.setCellValueFactory(new PropertyValueFactory<>("Working_hour"));
        totalSalary_col_employees.setCellValueFactory(new PropertyValueFactory<>("totalSalary"));
        
        
        employeesTable.setItems(EmployeesList);


    }
    
    public void EmployeesSelect(){
        
        Employees employees = employeesTable.getSelectionModel().getSelectedItem();
        int n = employeesTable.getSelectionModel().getSelectedIndex();
        
        if((n -1)< -1){return;}
        
        row_field_employees.setText(String.valueOf(employees.getRow()));
        firstname_field_employees.setText(employees.getFirstname());
        lastname_field_employees.setText(employees.getLastname());
        personnelNo_field_employees.setText(String.valueOf(employees.getPersonnelNo()));
        dateOfHire_field_employees.setText(String.valueOf(employees.getHireDate()));
        phoneNo_field_employees.setText(String.valueOf(employees.getPhoneNo()));
        history_field_employees.setText(String.valueOf(employees.getHistory()));
        basicSalary_field_employees.setText(String.valueOf(employees.getBasicSalary()));
        workingHoursPerWeek_field_employees.setText(String.valueOf(employees.getWorking_hour()));
        totalSalary_field_employees.setText(String.valueOf(employees.getTotalSalary()));

    }
    
    public void EmployeesAdd(){
        
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        
        String sql  = "INSERT INTO employees "
                + "(Row,First_name,Last_name,Personnel_No,Date_of_hire,Gender,Phone_No,History,Basic_salary,Working_hours,Total_salary)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        
        connect = Database.connectDb();
        
        try{
            handler = new FileHandler("logger.log", true);
            
            if(row_field_employees.getText().isEmpty()||firstname_field_employees.getText().isEmpty()
                    ||lastname_field_employees.getText().isEmpty()||personnelNo_field_employees.getText().isEmpty()
                    ||dateOfHire_field_employees.getText().isEmpty()
                    ||gender_box_employees.getSelectionModel().getSelectedItem()== null 
                    ||phoneNo_field_employees.getText().isEmpty()||history_field_employees.getText().isEmpty()
                    ||basicSalary_field_employees.getText().isEmpty() ||workingHoursPerWeek_field_employees.getText().isEmpty() ){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            
            }else{
                
            
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, row_field_employees.getText());
            prepare.setString(2, firstname_field_employees.getText());
            prepare.setString(3, lastname_field_employees.getText());
            prepare.setString(4, personnelNo_field_employees.getText());
            prepare.setString(5, String.valueOf(sqlDate));
            prepare.setString(6,(String) gender_box_employees.getSelectionModel().getSelectedItem());
            prepare.setString(7, phoneNo_field_employees.getText());
            prepare.setString(8, history_field_employees.getText());
            prepare.setString(9, basicSalary_field_employees.getText());
            prepare.setString(10, workingHoursPerWeek_field_employees.getText());
            prepare.setString(11, totalSalary_field_employees.getText());
            
            

             
             
            prepare.executeUpdate();
            Alert alert1 = new Alert(AlertType.INFORMATION);
            alert1.setTitle("Information");
            alert1.setHeaderText("");
            alert1.setContentText("Added successfully");
            alert1.showAndWait();
            
            ShowEmployeesListData();
            EmployeesClear();
            }
        }catch(Exception e){
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
           logger.addHandler(handler);
           logger.warning("warning message"+e);
        }
    }
   
    
    public void GenderListEmployees(){
        
        List<String> glist = new ArrayList<>();
        
        for(String data : genderList){
            glist.add(data);
        }
        
        ObservableList listData = FXCollections.observableArrayList(glist);
        gender_box_employees.setItems(listData);
        
    }
    
    public void employeesUpdate(){
        
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        
        String sql = "UPDATE employees SET First_name = '"
                +firstname_field_employees.getText()+"' , Last_name = '"+lastname_field_employees.getText()
                +"' ,Personnel_No = '"+personnelNo_field_employees.getText()+"' ,Date_of_hire = '"+dateOfHire_field_employees.getText()+"' ,Gender = '"+
                gender_box_employees.getSelectionModel().getSelectedItem()+"' ,Phone_No = '"+
                phoneNo_field_employees.getText()+"' ,History = '"+history_field_employees.getText()
                +"' ,Basic_salary = '"+basicSalary_field_employees.getText()+"' ,Working_hours = '" +workingHoursPerWeek_field_employees.getText()+"' ,Total_salary = '"
                +totalSalary_field_employees.getText()
                +"' WHERE Row = '"+row_field_employees.getText()+"'"; 
        
        connect = Database.connectDb();
        
        try{
            
            
             handler = new FileHandler("logger.log", true);
            if(row_field_employees.getText().isEmpty()||firstname_field_employees.getText().isEmpty()
                    ||lastname_field_employees.getText().isEmpty()||personnelNo_field_employees.getText().isEmpty()
                    ||dateOfHire_field_employees.getText().isEmpty()
                    ||gender_box_employees.getSelectionModel().getSelectedItem()== null 
                    ||phoneNo_field_employees.getText().isEmpty()||history_field_employees.getText().isEmpty()
                    ||basicSalary_field_employees.getText().isEmpty() || workingHoursPerWeek_field_employees.getText().isEmpty()){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            }else{
                Alert alert = new Alert(AlertType.CONFIRMATION); 
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want update employee "+
                                      firstname_field_employees.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();
                
                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);
                    
                    Alert alert1 = new Alert(AlertType.INFORMATION); 
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Updated Successfully ^.^");
                    alert1.showAndWait();
                    ShowEmployeesListData();
                    EmployeesClear();
                }
                
                
            }
        }catch(Exception e){
            e.printStackTrace();
        
           Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
           logger.addHandler(handler);
           logger.warning("warning message"+e);
        
        
        }
                
    }
    
    public void EmployeesDelete(){
        
        String sql = "DELETE FROM employees WHERE Row = '"
                +row_field_employees.getText()+"'";
        
        connect = Database.connectDb();
        
        try{
            handler = new FileHandler("logger.log", true);
             if(row_field_employees.getText().isEmpty()||firstname_field_employees.getText().isEmpty()
                    ||lastname_field_employees.getText().isEmpty()||personnelNo_field_employees.getText().isEmpty()
                    ||dateOfHire_field_employees.getText().isEmpty()
                    ||gender_box_employees.getSelectionModel().getSelectedItem()== null 
                    ||phoneNo_field_employees.getText().isEmpty()||history_field_employees.getText().isEmpty()
                    ||basicSalary_field_employees.getText().isEmpty() || workingHoursPerWeek_field_employees.getText().isEmpty()){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            }else{
                Alert alert = new Alert(AlertType.CONFIRMATION); 
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want delete employee "+
                                      firstname_field_employees.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();
                
                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);
                    
                    Alert alert1 = new Alert(AlertType.INFORMATION); 
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Deleted Successfully ^.^");
                    alert1.showAndWait();
                    ShowEmployeesListData();
                    EmployeesClear();
                }
             }
        }catch(Exception e){
            e.printStackTrace();
        Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
        logger.addHandler(handler);
        logger.warning("warning message"+e);
        
        }
    }
    
    
    public void EmployeesClear(){
        
        row_field_employees.setText("");
        firstname_field_employees.setText("");
        lastname_field_employees.setText("");
        personnelNo_field_employees.setText("");
        gender_box_employees.getSelectionModel().getSelectedItem();
        phoneNo_field_employees.setText("");  
        history_field_employees.setText("");
        basicSalary_field_employees.setText("");
        totalSalary_field_employees.setText("");
        dateOfHire_field_employees.setText("");
        workingHoursPerWeek_field_employees.setText("");
        
        
    }
    
    public void TotalSalaryEmployees(){
       
        
        totalSalary_field_employees.setText(String.valueOf((0.03*Integer.parseInt(basicSalary_field_employees.getText())*Integer.parseInt(history_field_employees.getText()))+ Integer.parseInt(basicSalary_field_employees.getText())));
        
        totalSalary_field_employees.setEditable(false);
    }
     
    
    /* Securityguards Part */
    
     public ObservableList<Securityguards> securityListData(){
        
        ObservableList<Securityguards> listData = FXCollections.observableArrayList();
        
        String sql = "SELECT * FROM securitygards";
        
        connect = Database.connectDb();
        
        try{
            handler = new FileHandler("logger.log", true);
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            
            Securityguards SecurityD;
            
            while(result.next()){
                SecurityD = new Securityguards(result.getInt("Row"), 
                         result.getString("First_name"),
                         result.getString("Last_name"),
                         result.getInt("Personnel_No"),
                         result.getDate("Date_of_hire"),
                         result.getString("Gender"),
                         result.getInt("Phone_No"),
                         result.getInt("Shift_work"),
                         result.getDouble("History"),
                         result.getString("Time_work"),
                         result.getDouble("Basic_salary"), 
                         result.getDouble("Total_salary"));
                
                listData.add(SecurityD);
            }
            
        }catch(Exception e){
            
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        
        }
        
        return listData;
    }
    
    private ObservableList<Securityguards> SecurityList;
    
    public void ShowSecurityListData(){
        
        SecurityList = securityListData();
        row_col_securityguards.setCellValueFactory(new PropertyValueFactory<>("row"));
        firstname_col_securityguards.setCellValueFactory(new PropertyValueFactory<>("firstname"));
        lastname_col_securityguards.setCellValueFactory(new PropertyValueFactory<>("lastname"));
        personnelNo_col_securityguards.setCellValueFactory(new PropertyValueFactory<>("personnelNo"));
        dateOfHire_col_securityguards.setCellValueFactory(new PropertyValueFactory<>("hireDate"));
        gender_col_securityguards.setCellValueFactory(new PropertyValueFactory<>("gender"));
        phoneNo_col_securityguards.setCellValueFactory(new PropertyValueFactory<>("phoneNo"));
        shiftWork_col_securityguards.setCellValueFactory(new PropertyValueFactory<>("Shift_works"));
        history_col_securityguards.setCellValueFactory(new PropertyValueFactory<>("history"));
        timework_col_securityguards.setCellValueFactory(new PropertyValueFactory<>("Time_works"));
        basicSalary_col_securityguards.setCellValueFactory(new PropertyValueFactory<>("basicSalary"));
        totalSalary_col_securityguards.setCellValueFactory(new PropertyValueFactory<>("totalSalary"));
        
        
        securityGuardsTable.setItems(SecurityList);


    }
    
    public void SecuritySelect(){
        
        Securityguards security = securityGuardsTable.getSelectionModel().getSelectedItem();
        int n = securityGuardsTable.getSelectionModel().getSelectedIndex();
        
        if((n -1)< -1){return;}
        
        row_field_securityguards.setText(String.valueOf(security.getRow()));
        firstname_field_securityguards.setText(security.getFirstname());
        lastname_field_securityguards.setText(security.getLastname());
        personnelNo_field_securityguards.setText(String.valueOf(security.getPersonnelNo()));
        dateOfHire_field_securityguards.setText(String.valueOf(security.getHireDate()));
        phoneNumber_field_securityguards.setText(String.valueOf(security.getPhoneNo()));
        shiftWork_field_securityguards.setText(String.valueOf(security.getShift_works()));
        history_field_securityguards.setText(String.valueOf(security.getHistory()));
        basicSalary_field_securityguards.setText(String.valueOf(security.getBasicSalary()));
        totalSalary_field_securityguards.setText(String.valueOf(security.getTotalSalary()));
        

    }
    
    public void SecurityAdd(){
        
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        
        String sql  = "INSERT INTO securitygards "
                + "(Row,First_name,Last_name,Personnel_No,Date_of_hire,Gender,Phone_No,Shift_work,History,Time_work,Basic_salary,Total_salary)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        
        connect = Database.connectDb();
        
        try{
            
            handler = new FileHandler("logger.log", true);
            if(row_field_securityguards.getText().isEmpty()||firstname_field_securityguards.getText().isEmpty()
                    ||lastname_field_securityguards.getText().isEmpty()||personnelNo_field_securityguards.getText().isEmpty()
                    ||dateOfHire_field_securityguards.getText().isEmpty()
                    ||gender_box_securityguards.getSelectionModel().getSelectedItem()== null 
                    ||phoneNumber_field_securityguards.getText().isEmpty()|| history_field_securityguards.getText().isEmpty()
                    ||basicSalary_field_securityguards.getText().isEmpty() ||shiftWork_field_securityguards.getText().isEmpty()
                    ||timework_box_securityguards.getSelectionModel().getSelectedItem()== null  ){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            
            }else{
                
            
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, row_field_securityguards.getText());
            prepare.setString(2, firstname_field_securityguards.getText());
            prepare.setString(3, lastname_field_securityguards.getText());
            prepare.setString(4, personnelNo_field_securityguards.getText());
            prepare.setString(5, String.valueOf(sqlDate));
            prepare.setString(6,(String) gender_box_securityguards.getSelectionModel().getSelectedItem());
            prepare.setString(7, phoneNumber_field_securityguards.getText());
            prepare.setString(8, shiftWork_field_securityguards.getText());
            prepare.setString(9, history_field_securityguards.getText());
            prepare.setString(10,(String)timework_box_securityguards.getSelectionModel().getSelectedItem());
            prepare.setString(11, basicSalary_field_securityguards.getText());
            prepare.setString(12, totalSalary_field_securityguards.getText());
            
            

             
             
            prepare.executeUpdate();
            Alert alert1 = new Alert(AlertType.INFORMATION);
            alert1.setTitle("Information");
            alert1.setHeaderText("");
            alert1.setContentText("Added successfully");
            alert1.showAndWait();
            
            ShowSecurityListData();
            SecurityClear();
            }
        }catch(Exception e){
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        
        }
    }
   
    
    public void GenderListSecurity(){
        
        List<String> glist = new ArrayList<>();
        
        for(String data : genderList){
            glist.add(data);
        }
        
        ObservableList listData = FXCollections.observableArrayList(glist);
        gender_box_securityguards.setItems(listData);
        
    }
    
    private String[] timeList = {"Morning 1","Aftenoon 1","Night 2"};
    List<String> TimeworkList = new ArrayList<>();
    
    public void TimeworkListSecurity(){
        
        
        
        for(String Timedata : timeList){
            TimeworkList.add(Timedata);
        }
        
        ObservableList TimelistData = FXCollections.observableArrayList(TimeworkList);
        timework_box_securityguards.setItems(TimelistData);
        
    }
    
    public void SecurityUpdate(){
        
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        
        String sql = "UPDATE securitygards SET First_name = '"
                +firstname_field_securityguards.getText()+"' , Last_name = '"+lastname_field_securityguards.getText()
                +"' ,Personnel_No = '"+personnelNo_field_securityguards.getText()+"' ,Gender = '"+
                gender_box_securityguards.getSelectionModel().getSelectedItem()+"' ,Phone_No = '"+
                phoneNumber_field_securityguards.getText()+"' ,History = '"+history_field_securityguards.getText()
                +"' ,Basic_salary = '"+basicSalary_field_securityguards.getText()+"' ,Shift_work = '" +shiftWork_field_securityguards.getText()+"' ,Total_salary = '"
                +totalSalary_field_securityguards.getText()+"' ,Time_work = '"+ timework_box_securityguards.getSelectionModel().getSelectedItem()
                +"' ,Date_of_hire = '"+dateOfHire_field_securityguards.getText()+"',Date_of_hire = '"+
                sqlDate+"' WHERE Row = '"+row_field_securityguards.getText()+"'"; 
        
        connect = Database.connectDb();
        
        try{
            
            
            handler = new FileHandler("logger.log", true);
            if(row_field_securityguards.getText().isEmpty()||firstname_field_securityguards.getText().isEmpty()
                    ||lastname_field_securityguards.getText().isEmpty()||personnelNo_field_securityguards.getText().isEmpty()
                    ||dateOfHire_field_securityguards.getText().isEmpty()
                    ||gender_box_securityguards.getSelectionModel().getSelectedItem()== null 
                    ||phoneNumber_field_securityguards.getText().isEmpty()||history_field_securityguards.getText().isEmpty()
                    ||basicSalary_field_securityguards.getText().isEmpty() || shiftWork_field_securityguards.getText().isEmpty()
                    ||timework_box_securityguards.getSelectionModel().getSelectedItem()== null){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            }else{
                Alert alert = new Alert(AlertType.CONFIRMATION); 
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want update securityguard "+
                                      firstname_field_securityguards.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();
                
                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);
                    
                    Alert alert1 = new Alert(AlertType.INFORMATION); 
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Updated Successfully ^.^");
                    alert1.showAndWait();
                    ShowSecurityListData();
                    SecurityClear();
                }
                
                
            }
        }catch(Exception e){
            
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        
        }
                
    }
    
    public void SecurityDelete(){
        
        String sql = "DELETE FROM securitygards WHERE Row = '"
                +row_field_securityguards.getText()+"'";
        
        connect = Database.connectDb();
        
        try{
            
            handler = new FileHandler("logger.log", true);
             if(row_field_securityguards.getText().isEmpty()||firstname_field_securityguards.getText().isEmpty()
                    ||lastname_field_securityguards.getText().isEmpty()||personnelNo_field_securityguards.getText().isEmpty()
                    ||dateOfHire_field_securityguards.getText().isEmpty()
                    ||gender_box_securityguards.getSelectionModel().getSelectedItem()== null 
                    ||phoneNumber_field_securityguards.getText().isEmpty()||history_field_securityguards.getText().isEmpty()
                    ||basicSalary_field_securityguards.getText().isEmpty() || shiftWork_field_securityguards.getText().isEmpty()
                    ||timework_box_securityguards.getSelectionModel().getSelectedItem()== null ){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            }else{
                Alert alert = new Alert(AlertType.CONFIRMATION); 
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want delete securityguard "+
                                      firstname_field_securityguards.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();
                
                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);
                    
                    Alert alert1 = new Alert(AlertType.INFORMATION); 
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Deleted Successfully ^.^");
                    alert1.showAndWait();
                    ShowSecurityListData();
                    SecurityClear();
                }
             }
        }catch(Exception e){
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);

        }
    }
    
    
    public void SecurityClear(){
        
        row_field_securityguards.setText("");
        firstname_field_securityguards.setText("");
        lastname_field_securityguards.setText("");
        personnelNo_field_securityguards.setText("");
        dateOfHire_field_securityguards.setText("");
        phoneNumber_field_securityguards.setText("");  
        shiftWork_field_securityguards.setText("");
        history_field_securityguards.setText("");
        basicSalary_field_securityguards.setText("");
        totalSalary_field_securityguards.setText("");
        
        
        
        
        
    }
    
    public void TotalSalarySecurity(){
       
        double t1 = 0.02*Integer.parseInt(basicSalary_field_securityguards.getText())*Integer.parseInt(history_field_securityguards.getText());
        
        
        if(TimeworkList.get(0).equals("Morning 1")){
         double t2 = 0.01*Integer.parseInt(basicSalary_field_securityguards.getText())*Integer.parseInt(shiftWork_field_securityguards.getText())*1;
         totalSalary_field_securityguards.setText(String.valueOf(t1+t2+Integer.parseInt(basicSalary_field_securityguards.getText())));
        }
        
        
        if(TimeworkList.get(1).equals("Afternoon 1")){
         double t2 = 0.01*Integer.parseInt(basicSalary_field_securityguards.getText())*Integer.parseInt(shiftWork_field_securityguards.getText())*1;
         totalSalary_field_securityguards.setText(String.valueOf(t1+t2+Integer.parseInt(basicSalary_field_securityguards.getText())));
        }
        
        if(TimeworkList.get(2).equals("Night 2")){
         double t2 = 0.01*Integer.parseInt(basicSalary_field_securityguards.getText())*Integer.parseInt(shiftWork_field_securityguards.getText())*2;
         totalSalary_field_securityguards.setText(String.valueOf(t1+t2+Integer.parseInt(basicSalary_field_securityguards.getText())));
        }
        
        
        totalSalary_field_securityguards.setEditable(false);
    }
     
    
    
    
    
    
    
    
    
    
    
    
    
    
   

}
