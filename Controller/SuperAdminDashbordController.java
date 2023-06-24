
package Controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import Model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class SuperAdminDashbordController implements Initializable {
    
     @FXML
    private Button superadmin_employees_clearBtn;

    @FXML
    private TableColumn<?, ?> superadmin_employees_salaryCol;

    @FXML
    private AnchorPane superadmin_passengers_page1;
    @FXML
    private AnchorPane skeleton_page ;

    @FXML
    private TableColumn<?, ?> superadmin_financial_employees_usernameCol;

    @FXML
    private TableColumn<?, ?> superadmin_employees_idCol;

    @FXML
    private Button superadmin_passenger_fireBtn;

    @FXML
    private TableColumn<?, ?> superadmin_passenger_addressCol;

    @FXML
    private Label superadmin_reports_flightnumber;

    @FXML
    private TableColumn<?, ?> superadmin_manager_firstnameCol;

    @FXML
    private TextField superadmin_setting_emailtextfield;

    @FXML
    private TextField superadmin_manager_phonetextfield;

    @FXML
    private TableColumn<?, ?> superadmin_manager_emailCol;

    @FXML
    private TableView<Employee> superadmin_financial_employees_table;

    @FXML
    private TableView<Manager> superadmin_manager_table;

    @FXML
    private TableColumn<?, ?> superadmin_setting_usernameCol;

    @FXML
    private TextField superadmin_employees_salarytextfield;

    @FXML
    private TableColumn<?, ?> superadmin_passenger_usernameCol;

    @FXML
    private TextField superadmin_passenger_phonetextfield;

    @FXML
    private AnchorPane superadmin_employees_page;
    @FXML
    private AnchorPane superadmin_setting_page;
    @FXML
    private AnchorPane superadmin_reports_page;
    @FXML
    private AnchorPane superadmin_manager_page;
    @FXML
    private AnchorPane superadmin_financial_page;


    @FXML
    private Label superadmin_reports_passengersnumber;

    @FXML
    private TextField superadmin_passenger_emailtextfield;

    @FXML
    private Button superadmin_employees_fireBtn;

    @FXML
    private Button superadmin_employees_updateBtn;

    @FXML
    private Button superadmin_setting_updateBtn;

    @FXML
    private TextField superadmin_setting_addresstextfield;

    @FXML
    private TextField superadmin_setting_phonetextfield;

    @FXML
    private TextField superadmin_manager_emailtextfield;

    @FXML
    private Label superadmin_reports_canceledflightnumber;

    @FXML
    private TableView<Employee> superadmin_employees_table;

    @FXML
    private TableColumn<?, ?> superadmin_financial_passengers_walletCol;

    @FXML
    private TextField superadmin_employees_lastnametextfield;

    @FXML
    private TextField superadmin_passenger_usernametextfield;

    @FXML
    private Button superadmin_passenger_updateBtn;

    @FXML
    private TextField superadmin_setting_passwordtextfield;

    @FXML
    private TextField superadmin_employees_phonetextfield;

    @FXML
    private TableColumn<?, ?> superadmin_setting_phoneCol;

    @FXML
    private TableColumn<?, ?> superadmin_employees_firstnameCol;

    @FXML
    private TextField superadmin_setting_lastnametextfield;

    @FXML
    private TableColumn<?, ?> superadmin_employees_phoneCol;

    @FXML
    private TableView<?> superadmin_setting_table;

    @FXML
    private TextField superadmin_employees_passwordtextfield;

    @FXML
    private TextField superadmin_manager_addresstextfield;

    @FXML
    private TableView<Passenger> superadmin_financial_passengers_table;

    @FXML
    private Button close;

    @FXML
    private Button minimize;

    @FXML
    private TextField superadmin_employees_addresstextfield;

    @FXML
    private TableColumn<?, ?> superadmin_setting_firstnameCol;

    @FXML
    private TableView<Passenger> superadmin_passenger_table;

    @FXML
    private TextField superadmin_manager_firstnametextfield;

    @FXML
    private TableColumn<?, ?> superadmin_passenger_idCol;

    @FXML
    private TextField superadmin_passenger_addresstextfield;

    @FXML
    private TableColumn<?, ?> superadmin_financial_manager_salaryCol;

    @FXML
    private TableColumn<?, ?> superadmin_passenger_emailCol;

    @FXML
    private Button superadmin_reportsBtn;

    @FXML
    private TableView<Manager> superadmin_financial_manager_table;

    @FXML
    private TableColumn<?, ?> superadmin_passenger_phoneCol;

    @FXML
    private TableColumn<?, ?> superadmin_manager_addressCol;

    @FXML
    private Label superadmin_reports_soldticketnumber;

    @FXML
    private TableColumn<?, ?> superadmin_employees_addressCol;

    @FXML
    private TableColumn<?, ?> superadmin_manager_passwordCol;

    @FXML
    private Label superadmin_reports_airplanenumber;

    @FXML
    private TableColumn<?, ?> superadmin_employees_passwordCol;

    @FXML
    private TextField superadmin_manager_idtextfield;

    @FXML
    private Button superadmin_manager_fireBtn;

    @FXML
    private TableColumn<?, ?> superadmin_setting_addressCol;

    @FXML
    private Button superadmin_employees_addBtn;

    @FXML
    private Button superadmin_financial_manager_updateBtn;

    @FXML
    private TableColumn<?, ?> superadmin_passenger_lastnameCol;

    @FXML
    private TextField superadmin_employees_firstnametextfield;

    @FXML
    private TableColumn<?, ?> superadmin_setting_emailCol;

    @FXML
    private TableColumn<?, ?> superadmin_manager_phoneCol;

    @FXML
    private TableColumn<?, ?> superadmin_setting_idCol;

    @FXML
    private TableColumn<?, ?> superadmin_financial_employees_salaryCol;

    @FXML
    private TextField superadmin_manager_usernametextfield;

    @FXML
    private Button superadmin_managerBtn;

    @FXML
    private Button superadmin_setting_clearBtn;

    @FXML
    private TableColumn<?, ?> superadmin_manager_usernameCol;

    @FXML
    private Button superadmin_passenger_addBtn;

    @FXML
    private TableColumn<?, ?> superadmin_manager_idCol;

    @FXML
    private TextField superadmin_financial_employees_salarytextfield;

    @FXML
    private TextField superadmin_passenger_passwordtextfield;

    @FXML
    private TextField superadmin_setting_idtextfield;

    @FXML
    private TableColumn<?, ?> superadmin_financial_passengers_ticketCol;

    @FXML
    private Button superadmin_passenger_clearBtn;

    @FXML
    private Button superadmin_financial_employees_updateBtn;

    @FXML
    private Label superadmin_reports_employeesnumber;

    @FXML
    private Button superadmin_manager_updateBtn;

    @FXML
    private Label superadmin_reports_canceledticketsnumber;

    @FXML
    private TableColumn<?, ?> superadmin_passenger_passwordCol;

    @FXML
    private TableColumn<?, ?> superadmin_financial_manager_usernameCol;

    @FXML
    private TextField superadmin_passenger_idtextfield;

    @FXML
    private TableColumn<?, ?> superadmin_manager_lastnameCol;

    @FXML
    private TableColumn<?, ?> superadmin_employees_emailCol;

    @FXML
    private TextField superadmin_passenger_lastnametextfield;

    @FXML
    private TextField superadmin_manager_lastnametextfield;

    @FXML
    private TableColumn<?, ?> superadmin_passenger_firstnameCol;

    @FXML
    private Button superadmin_manager_clearBtn;

    @FXML
    private TableColumn<?, ?> superadmin_setting_passwordCol;

    @FXML
    private Button superadmin_settingBtn;

    @FXML
    private TableColumn<?, ?> superadmin_employees_lastnameCol;

    @FXML
    private TableColumn<?, ?> superadmin_setting_lastnameCol;

    @FXML
    private TableColumn<?, ?> superadmin_employees_usernameCol;

    @FXML
    private TextField superadmin_passenger_firstnametextfield;

    @FXML
    private TableColumn<?, ?> superadmin_financial_passengers_usernameCol;

    @FXML
    private TextField superadmin_employees_idtextfield;

    @FXML
    private TextField superadmin_financial_manager_salarytextfield;

    @FXML
    private Button superadmin_manager_addBtn;

    @FXML
    private TextField superadmin_manager_passwordtextfield;

    @FXML
    private TextField superadmin_setting_usernametextfield;

    @FXML
    private TextField superadmin_employees_usernametextfield;

    @FXML
    private TextField superadmin_employees_emailtextfield;

    @FXML
    private Button superadmin_employeesBtn;

    @FXML
    private Button superadmin_financialBtn;

    @FXML
    private TextField superadmin_setting_firstnametextfield;

    @FXML
    private Button  signOut_adminsuper;
    @FXML
    private Button superadmin_passengersbtn;
    FileHandler handler;
    private double x = 0;
    private double y = 0;
    
    
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ShowAdminSuperListData();
        ShowManagerListData();
        ShowEmployeeListData();
        ShowPassengerListData();
        ShowEmployeeSalaryListData();
        ShowManagerSalaryListData();
        ShowPassengerWalletListData();
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

    public void switchPage(ActionEvent event){

        if(event.getSource() == superadmin_settingBtn){
            superadmin_setting_page.setVisible(true);
            superadmin_financial_page.setVisible(false);
            superadmin_employees_page.setVisible(false);
            superadmin_manager_page.setVisible(false);
            superadmin_passengers_page1.setVisible(false);
            superadmin_reports_page.setVisible(false);


        }
        else if(event.getSource() == superadmin_managerBtn){
            superadmin_manager_page.setVisible(true);
            superadmin_setting_page.setVisible(false);
            superadmin_financial_page.setVisible(false);
            superadmin_employees_page.setVisible(false);
            superadmin_passengers_page1.setVisible(false);
            superadmin_reports_page.setVisible(false);

        }
        else if(event.getSource() == superadmin_employeesBtn){
            superadmin_employees_page.setVisible(true);
            superadmin_setting_page.setVisible(false);
            superadmin_financial_page.setVisible(false);
            superadmin_manager_page.setVisible(false);
            superadmin_passengers_page1.setVisible(false);
            superadmin_reports_page.setVisible(false);

        }
        else if(event.getSource() == superadmin_passengersbtn){
            superadmin_passengers_page1.setVisible(true);
            superadmin_setting_page.setVisible(false);
            superadmin_financial_page.setVisible(false);
            superadmin_employees_page.setVisible(false);
            superadmin_manager_page.setVisible(false);
            superadmin_reports_page.setVisible(false);
        }
        else if(event.getSource() == superadmin_reportsBtn){
            superadmin_reports_page.setVisible(true);
            superadmin_setting_page.setVisible(false);
            superadmin_financial_page.setVisible(false);
            superadmin_employees_page.setVisible(false);
            superadmin_manager_page.setVisible(false);
            superadmin_passengers_page1.setVisible(false);

        }else if(event.getSource() == superadmin_financialBtn){
            superadmin_financial_page.setVisible(true);
            superadmin_manager_page.setVisible(false);
            superadmin_setting_page.setVisible(false);
            superadmin_employees_page.setVisible(false);
            superadmin_passengers_page1.setVisible(false);
            superadmin_reports_page.setVisible(false);
        }
    }
   public void signOut_adminsuper() {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to sign out?");
        Optional<ButtonType> option = alert.showAndWait();
        try {

            handler = new FileHandler("logger.log", true);

            if (option.get().equals(ButtonType.OK)) {

                signOut_adminsuper.getScene().getWindow().hide();
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


//*******************************************************************************************************

//    setting page:
    private Connection connect;
    private Statement statement;
    private PreparedStatement prepare;
    private ResultSet result;

    public ObservableList<AdminSuper> AdminSuperListData(){

        ObservableList<AdminSuper> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM adminsuper";

        connect = Database.connectDb();

        try{

            handler = new FileHandler("logger.log", true);
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            AdminSuper adminSuper;

            while(result.next()){
                adminSuper = new AdminSuper(result.getInt("Id"),
                        result.getString("First_name"),
                        result.getString("Last_name"),
                        result.getString("User_name"),
                        result.getString("Password"),
                        result.getString("Phone_no"),
                        result.getString("Address"),
                        result.getString("Email"));


                listData.add(adminSuper);
            }

        }catch(Exception e){
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }

        return listData;
    }

    private ObservableList<AdminSuper> AdminSuperList;
    @FXML
    private TableColumn<?, ?> adminsuper_col_id;
    @FXML
    private TableColumn<?, ?> adminsuper_col_firstname;
    @FXML
    private TableColumn<?, ?> adminsuper_col_lastname;
    @FXML
    private TableColumn<?, ?> adminsuper_col_username;
    @FXML
    private TableColumn<?, ?> adminsuper_col_password;
    @FXML
    private TableColumn<?, ?> adminsuper_col_phonenumber;
    @FXML
    private TableColumn<?, ?> adminsuper_col_address;
    @FXML
    private TableColumn<?, ?> adminsuper_col_email;
    @FXML
    private TableView<AdminSuper> tableAdminSuper;

    public void ShowAdminSuperListData(){

        AdminSuperList = AdminSuperListData();
        adminsuper_col_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        adminsuper_col_firstname.setCellValueFactory(new PropertyValueFactory<>("firstname"));
        adminsuper_col_lastname.setCellValueFactory(new PropertyValueFactory<>("lastname"));
        adminsuper_col_username.setCellValueFactory(new PropertyValueFactory<>("username"));
        adminsuper_col_password.setCellValueFactory(new PropertyValueFactory<>("password"));
        adminsuper_col_phonenumber.setCellValueFactory(new PropertyValueFactory<>("phonenumber"));
        adminsuper_col_address.setCellValueFactory(new PropertyValueFactory<>("address"));
        adminsuper_col_email.setCellValueFactory(new PropertyValueFactory<>("email"));

        tableAdminSuper.setItems(AdminSuperList);

    }

    public void AdminSuperSelect(){

        AdminSuper adminsuper2= tableAdminSuper.getSelectionModel().getSelectedItem();
        int n = tableAdminSuper.getSelectionModel().getSelectedIndex();

        if((n -1)< -1){return;}

        superadmin_setting_idtextfield.setText(String.valueOf(adminsuper2.getId()));
        superadmin_setting_firstnametextfield.setText(adminsuper2.getFirstname());
        superadmin_setting_lastnametextfield.setText(adminsuper2.getLastname());
        superadmin_setting_usernametextfield.setText(String.valueOf(adminsuper2.getUsername()));
        superadmin_setting_passwordtextfield.setText(String.valueOf(adminsuper2.getPassword()));
        superadmin_setting_phonetextfield.setText(String.valueOf(adminsuper2.getPhonenumber()));
        superadmin_setting_addresstextfield.setText(String.valueOf(adminsuper2.getAddress()));
        superadmin_setting_emailtextfield.setText(String.valueOf(adminsuper2.getEmail()));

    }

    public void AdminsuperUpdate(){


        String sql = "UPDATE adminsuper SET First_name = '"+ superadmin_setting_firstnametextfield.getText()
                +"' ,Last_name = '"+ superadmin_setting_lastnametextfield.getText()+"' ,User_name= '"+
                superadmin_setting_usernametextfield.getText()+"',Password = '"+ superadmin_setting_passwordtextfield.getText()+"' ,Phone_no = '"+
                superadmin_setting_phonetextfield.getText()+"' ,Address = '"+ superadmin_setting_addresstextfield.getText()
                +"' ,Email = '"+superadmin_setting_emailtextfield.getText()+"' WHERE Id = '"+ superadmin_setting_idtextfield.getText()+"'";

        connect = Database.connectDb();

        try{


            handler = new FileHandler("logger.log", true);

            if(superadmin_setting_idtextfield.getText().isEmpty()||superadmin_setting_firstnametextfield.getText().isEmpty()
                    ||superadmin_setting_lastnametextfield.getText().isEmpty()||superadmin_setting_usernametextfield.getText().isEmpty()
                    ||superadmin_setting_passwordtextfield.getText().isEmpty()
                    ||superadmin_setting_phonetextfield.getText().isEmpty()||superadmin_setting_addresstextfield.getText().isEmpty()
                    ||superadmin_setting_emailtextfield.getText().isEmpty()


            ){

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blanks");
                alert.showAndWait();
            }else if(!regexemail(superadmin_setting_emailtextfield.getText())){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real email !");
                alert.showAndWait();

            }else if(!regexphonenumber(superadmin_setting_phonetextfield.getText())) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real phone number !");
                alert.showAndWait();

            }else{
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want update "+
                        superadmin_setting_idtextfield.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();

                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);

                    Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Updated Successfully ^.^");
                    alert1.showAndWait();
                    ShowAdminSuperListData();
                    AdminsuperClear();
                }


            }
        }catch(Exception e){e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);

        }
    }
    public void AdminsuperClear(){

        superadmin_setting_idtextfield.setText("");
        superadmin_setting_firstnametextfield.setText("");
        superadmin_setting_lastnametextfield.setText("");
        superadmin_setting_usernametextfield.setText("");
        superadmin_setting_passwordtextfield.setText("");
        superadmin_setting_phonetextfield.setText("");
        superadmin_setting_addresstextfield.setText("");
        superadmin_setting_emailtextfield.setText("");

    }
    public boolean regexemail(String a) {

        String regex = "[a-zA-Z0-9.-_]{6,30}@[ge]mail.com";
        return a.matches(regex);
    }
    public boolean regexphonenumber(String a) {
        String regex = "[0][9][0-9]{9}";
        return a.matches(regex);
    }

//    ***************************************************************************************************

//    manager page :


    public ObservableList<Manager> ManagerListData(){

        ObservableList<Manager> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM manager";

        connect = Database.connectDb();

        try{

            handler = new FileHandler("logger.log", true);
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            Manager manager;

            while(result.next()){
                manager = new Manager(result.getInt("Id"),
                        result.getString("First_name"),
                        result.getString("Last_name"),
                        result.getString("User_name"),
                        result.getString("Password"),
                        result.getString("Phone_no"),
                        result.getString("Address"),
                        result.getString("Email"),
                        result.getDouble("Salary"));



                listData.add(manager);
            }

        }catch(Exception e){
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }

        return listData;
    }

    private ObservableList<Manager> ManagerList;
    public void ShowManagerListData(){

        ManagerList = ManagerListData();
        superadmin_manager_idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        superadmin_manager_firstnameCol.setCellValueFactory(new PropertyValueFactory<>("firstname"));
        superadmin_manager_lastnameCol.setCellValueFactory(new PropertyValueFactory<>("lastname"));
        superadmin_manager_usernameCol.setCellValueFactory(new PropertyValueFactory<>("username"));
        superadmin_manager_passwordCol.setCellValueFactory(new PropertyValueFactory<>("password"));
        superadmin_manager_phoneCol.setCellValueFactory(new PropertyValueFactory<>("phonenumber"));
        superadmin_manager_addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        superadmin_manager_emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));

        superadmin_manager_table.setItems(ManagerList);

    }

    public void ManagerSelect(){

        Manager manager2= superadmin_manager_table.getSelectionModel().getSelectedItem();
        int n = superadmin_manager_table.getSelectionModel().getSelectedIndex();

        if((n -1)< -1){return;}

        superadmin_manager_idtextfield.setText(String.valueOf(manager2.getId()));
        superadmin_manager_firstnametextfield.setText(manager2.getFirstname());
        superadmin_manager_lastnametextfield.setText(manager2.getLastname());
        superadmin_manager_usernametextfield.setText(String.valueOf(manager2.getUsername()));
        superadmin_manager_passwordtextfield.setText(String.valueOf(manager2.getPassword()));
        superadmin_manager_phonetextfield.setText(String.valueOf(manager2.getPhonenumber()));
        superadmin_manager_addresstextfield.setText(String.valueOf(manager2.getAddress()));
        superadmin_manager_emailtextfield.setText(String.valueOf(manager2.getEmail()));

    }

    public void AddManager(){


        String sql  = "INSERT INTO manager "
                + "(Id,First_name,Last_name,User_name,Password,Phone_No,Address,Email,Salary)"
                + "VALUES(?,?,?,?,?,?,?,?,?)";

        connect = Database.connectDb();

        try{

            handler = new FileHandler("logger.log", true);

            if(superadmin_manager_idtextfield.getText().isEmpty()||superadmin_manager_firstnametextfield.getText().isEmpty()
                    ||superadmin_manager_lastnametextfield.getText().isEmpty()||superadmin_manager_usernametextfield.getText().isEmpty()
                    ||superadmin_manager_passwordtextfield.getText().isEmpty()
                    ||superadmin_manager_phonetextfield.getText().isEmpty()||superadmin_manager_addresstextfield.getText().isEmpty()
                    ||superadmin_manager_emailtextfield.getText().isEmpty()

            ){

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blanks");
                alert.showAndWait();

            }else if(!regexemail(superadmin_manager_emailtextfield.getText())){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real email !");
                alert.showAndWait();

            }else if(!regexphonenumber(superadmin_manager_phonetextfield.getText())) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real phone number !");
                alert.showAndWait();

            }else{


                prepare = connect.prepareStatement(sql);
                prepare.setString(1, superadmin_manager_idtextfield.getText());
                prepare.setString(2, superadmin_manager_firstnametextfield.getText());
                prepare.setString(3, superadmin_manager_lastnametextfield.getText());
                prepare.setString(4, superadmin_manager_usernametextfield.getText());
                prepare.setString(5, superadmin_manager_passwordtextfield.getText());
                prepare.setString(6, superadmin_manager_phonetextfield.getText());
                prepare.setString(7, superadmin_manager_addresstextfield.getText());
                prepare.setString(8,superadmin_manager_emailtextfield.getText());
                prepare.setDouble(9,0);



                prepare.executeUpdate();
                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("Information");
                alert1.setHeaderText("");
                alert1.setContentText("Added successfully");
                alert1.showAndWait();

                ShowManagerListData();
                ManagerClear();
            }
        }catch(Exception e){
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }
    }

    public void ManagerClear(){

        superadmin_manager_idtextfield.setText("");
        superadmin_manager_firstnametextfield.setText("");
        superadmin_manager_lastnametextfield.setText("");
        superadmin_manager_usernametextfield.setText("");
        superadmin_manager_passwordtextfield.setText("");
        superadmin_manager_phonetextfield.setText("");
        superadmin_manager_addresstextfield.setText("");
        superadmin_manager_emailtextfield.setText("");

    }

    public void managerfire(){

        String sql = "DELETE FROM manager WHERE Id = '"
                +superadmin_manager_idtextfield.getText()+"'";

        connect = Database.connectDb();

        try{

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confimation ^.^");
            alert.setHeaderText(null);
            alert.setContentText("Are you sure do you want delete manager "+
                    superadmin_manager_idtextfield.getText()+"?");
            Optional<ButtonType> option = alert.showAndWait();

            if(option.get().equals(ButtonType.OK)){
                statement = connect.createStatement();
                statement.executeUpdate(sql);

                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("INFORMATION ^-^");
                alert1.setHeaderText(null);
                alert1.setContentText("Deleted Successfully ^.^");
                alert1.showAndWait();
                ShowManagerListData();
                ManagerClear();
            }

        }catch(Exception e){

            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);


        }
    }


    public void ManagerUpdate(){


        String sql = "UPDATE manager SET First_name = '"+ superadmin_manager_firstnametextfield.getText()
                +"' ,Last_name = '"+ superadmin_manager_lastnametextfield.getText()+"' ,User_name= '"+
                superadmin_manager_usernametextfield.getText()+"',Password = '"+ superadmin_manager_passwordtextfield.getText()+"' ,Phone_no = '"+
                superadmin_manager_phonetextfield.getText()+"' ,Address = '"+ superadmin_manager_addresstextfield.getText()
                +"' ,Email = '"+superadmin_manager_emailtextfield.getText()+"' WHERE Id = '"+ superadmin_manager_idtextfield.getText()+"'";

        connect = Database.connectDb();

        try{


            handler = new FileHandler("logger.log", true);

            if(superadmin_manager_idtextfield.getText().isEmpty()||superadmin_manager_firstnametextfield.getText().isEmpty()
                    ||superadmin_manager_lastnametextfield.getText().isEmpty()||superadmin_manager_usernametextfield.getText().isEmpty()
                    ||superadmin_manager_passwordtextfield.getText().isEmpty()
                    ||superadmin_manager_phonetextfield.getText().isEmpty()||superadmin_manager_addresstextfield.getText().isEmpty()
                    ||superadmin_manager_emailtextfield.getText().isEmpty()


            ){

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blanks");
                alert.showAndWait();
            }else if(!regexemail(superadmin_manager_emailtextfield.getText())){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real email !");
                alert.showAndWait();

            }else if(!regexphonenumber(superadmin_manager_phonetextfield.getText())) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real phone number !");
                alert.showAndWait();

            }else{
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want update "+
                        superadmin_manager_idtextfield.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();

                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);

                    Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Updated Successfully ^.^");
                    alert1.showAndWait();
                    ShowManagerListData();
                   ManagerClear();
                }


            }
        }catch(Exception e){e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);

        }
    }

//***************************************************************************************************

//    employee page :

    public ObservableList<Employee> EmployeeListData(){

        ObservableList<Employee> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM employee";

        connect = Database.connectDb();

        try{

            handler = new FileHandler("logger.log", true);
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
           Employee employee;

            while(result.next()){
               employee = new Employee(result.getInt("Id"),
                        result.getString("First_name"),
                        result.getString("Last_name"),
                        result.getString("User_name"),
                        result.getString("Password"),
                        result.getString("Phone_no"),
                        result.getString("Address"),
                        result.getString("Email"),
                        result.getDouble("Salary"));



                listData.add(employee);
            }

        }catch(Exception e){
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }

        return listData;
    }

    private ObservableList<Employee> EmployeeList;
    public void ShowEmployeeListData(){

       EmployeeList = EmployeeListData();
        superadmin_employees_idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        superadmin_employees_firstnameCol.setCellValueFactory(new PropertyValueFactory<>("firstname"));
        superadmin_employees_lastnameCol.setCellValueFactory(new PropertyValueFactory<>("lastname"));
        superadmin_employees_usernameCol.setCellValueFactory(new PropertyValueFactory<>("username"));
        superadmin_employees_passwordCol.setCellValueFactory(new PropertyValueFactory<>("password"));
        superadmin_employees_phoneCol.setCellValueFactory(new PropertyValueFactory<>("phonenumber"));
        superadmin_employees_addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        superadmin_employees_emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));

        superadmin_employees_table.setItems(EmployeeList);

    }

    public void EmployeeSelect(){

        Employee employee2= superadmin_employees_table.getSelectionModel().getSelectedItem();
        int n = superadmin_employees_table.getSelectionModel().getSelectedIndex();

        if((n -1)< -1){return;}

        superadmin_employees_idtextfield.setText(String.valueOf(employee2.getId()));
        superadmin_employees_firstnametextfield.setText(employee2.getFirstname());
        superadmin_employees_lastnametextfield.setText(employee2.getLastname());
        superadmin_employees_usernametextfield.setText(String.valueOf(employee2.getUsername()));
        superadmin_employees_passwordtextfield.setText(String.valueOf(employee2.getPassword()));
        superadmin_employees_phonetextfield.setText(String.valueOf(employee2.getPhonenumber()));
        superadmin_employees_addresstextfield.setText(String.valueOf(employee2.getAddress()));
        superadmin_employees_emailtextfield.setText(String.valueOf(employee2.getEmail()));

    }

    public void AddEmployee(){


        String sql  = "INSERT INTO employee "
                + "(Id,First_name,Last_name,User_name,Password,Phone_No,Address,Email,Salary)"
                + "VALUES(?,?,?,?,?,?,?,?,?)";

        connect = Database.connectDb();

        try{

            handler = new FileHandler("logger.log", true);

            if(superadmin_employees_addresstextfield.getText().isEmpty()||superadmin_employees_firstnametextfield.getText().isEmpty()
                    ||superadmin_employees_lastnametextfield.getText().isEmpty()||superadmin_employees_usernametextfield.getText().isEmpty()
                    ||superadmin_employees_passwordtextfield.getText().isEmpty()
                    ||superadmin_employees_phonetextfield.getText().isEmpty()||superadmin_employees_addresstextfield.getText().isEmpty()
                    ||superadmin_employees_emailtextfield.getText().isEmpty()

            ){

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blanks");
                alert.showAndWait();

            }else if(!regexemail(superadmin_employees_emailtextfield.getText())){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real email !");
                alert.showAndWait();

            }else if(!regexphonenumber(superadmin_employees_phonetextfield.getText())) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real phone number !");
                alert.showAndWait();

            }else{


                prepare = connect.prepareStatement(sql);
                prepare.setString(1, superadmin_employees_idtextfield.getText());
                prepare.setString(2, superadmin_employees_firstnametextfield.getText());
                prepare.setString(3, superadmin_employees_lastnametextfield.getText());
                prepare.setString(4, superadmin_employees_usernametextfield.getText());
                prepare.setString(5, superadmin_employees_passwordtextfield.getText());
                prepare.setString(6, superadmin_employees_phonetextfield.getText());
                prepare.setString(7, superadmin_employees_addresstextfield.getText());
                prepare.setString(8,superadmin_employees_emailtextfield.getText());
                prepare.setDouble(9,0);



                prepare.executeUpdate();
                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("Information");
                alert1.setHeaderText("");
                alert1.setContentText("Added successfully");
                alert1.showAndWait();

                ShowEmployeeListData();
                EmployeeClear();
            }
        }catch(Exception e){
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }
    }

    public void EmployeeClear(){

        superadmin_employees_idtextfield.setText("");
        superadmin_employees_firstnametextfield.setText("");
        superadmin_employees_lastnametextfield.setText("");
        superadmin_employees_usernametextfield.setText("");
        superadmin_employees_passwordtextfield.setText("");
        superadmin_employees_phonetextfield.setText("");
        superadmin_employees_addresstextfield.setText("");
        superadmin_employees_emailtextfield.setText("");

    }

    public void Employeefire(){

        String sql = "DELETE FROM employee WHERE Id = '"
                +superadmin_employees_idtextfield.getText()+"'";

        connect = Database.connectDb();

        try{

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confimation ^.^");
            alert.setHeaderText(null);
            alert.setContentText("Are you sure do you want delete employee "+
                    superadmin_employees_idtextfield.getText()+"?");
            Optional<ButtonType> option = alert.showAndWait();

            if(option.get().equals(ButtonType.OK)){
                statement = connect.createStatement();
                statement.executeUpdate(sql);

                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("INFORMATION ^-^");
                alert1.setHeaderText(null);
                alert1.setContentText("Deleted Successfully ^.^");
                alert1.showAndWait();
                ShowEmployeeListData();
               EmployeeClear();
            }

        }catch(Exception e){

            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);


        }
    }

    public void EmployeeUpdate(){


        String sql = "UPDATE employee SET First_name = '"+ superadmin_employees_firstnametextfield.getText()
                +"' ,Last_name = '"+ superadmin_employees_lastnametextfield.getText()+"' ,User_name= '"+
                superadmin_employees_usernametextfield.getText()+"',Password = '"+ superadmin_employees_passwordtextfield.getText()+"' ,Phone_no = '"+
                superadmin_employees_phonetextfield.getText()+"' ,Address = '"+ superadmin_employees_addresstextfield.getText()
                +"' ,Email = '"+superadmin_employees_emailtextfield.getText()+"' WHERE Id = '"+ superadmin_employees_idtextfield.getText()+"'";

        connect = Database.connectDb();

        try{


            handler = new FileHandler("logger.log", true);

            if(superadmin_employees_idtextfield.getText().isEmpty()||superadmin_employees_firstnametextfield.getText().isEmpty()
                    ||superadmin_employees_lastnametextfield.getText().isEmpty()||superadmin_employees_usernametextfield.getText().isEmpty()
                    ||superadmin_employees_passwordtextfield.getText().isEmpty()
                    ||superadmin_employees_phonetextfield.getText().isEmpty()||superadmin_employees_addresstextfield.getText().isEmpty()
                    ||superadmin_employees_emailtextfield.getText().isEmpty()


            ){

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blanks");
                alert.showAndWait();
            }else if(!regexemail(superadmin_employees_emailtextfield.getText())){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real email !");
                alert.showAndWait();

            }else if(!regexphonenumber(superadmin_employees_phonetextfield.getText())) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real phone number !");
                alert.showAndWait();

            }else{
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want update "+
                        superadmin_employees_idtextfield.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();

                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);

                    Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Updated Successfully ^.^");
                    alert1.showAndWait();
                    ShowEmployeeListData();
                    EmployeeClear();
                }


            }
        }catch(Exception e){e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }
    }

//****************************************************************************************************
    //    passenger page :

    public ObservableList<Passenger> PassengerListData(){

        ObservableList<Passenger> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM passenger";

        connect = Database.connectDb();

        try{

            handler = new FileHandler("logger.log", true);
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
           Passenger passenger;

            while(result.next()){
               passenger = new Passenger(result.getInt("Id"),
                        result.getString("First_name"),
                        result.getString("Last_name"),
                        result.getString("User_name"),
                        result.getString("Password"),
                        result.getString("Phone_no"),
                        result.getString("Address"),
                        result.getString("Email"),
                        result.getDouble("Wallet"),
                        result.getInt("Tickets"));



                listData.add(passenger);
            }

        }catch(Exception e){
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }

        return listData;
    }

    private ObservableList<Passenger> PassengerList;
    public void ShowPassengerListData(){

       PassengerList = PassengerListData();
        superadmin_passenger_idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        superadmin_passenger_firstnameCol.setCellValueFactory(new PropertyValueFactory<>("firstname"));
        superadmin_passenger_lastnameCol.setCellValueFactory(new PropertyValueFactory<>("lastname"));
        superadmin_passenger_usernameCol.setCellValueFactory(new PropertyValueFactory<>("username"));
        superadmin_passenger_passwordCol.setCellValueFactory(new PropertyValueFactory<>("password"));
        superadmin_passenger_phoneCol.setCellValueFactory(new PropertyValueFactory<>("phonenumber"));
        superadmin_passenger_addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        superadmin_passenger_emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));

        superadmin_passenger_table.setItems(PassengerList);

    }

    public void PassengerSelect(){

        Passenger passenger2= superadmin_passenger_table.getSelectionModel().getSelectedItem();
        int n = superadmin_passenger_table.getSelectionModel().getSelectedIndex();

        if((n -1)< -1){return;}

        superadmin_passenger_idtextfield.setText(String.valueOf(passenger2.getId()));
        superadmin_passenger_firstnametextfield.setText(passenger2.getFirstname());
        superadmin_passenger_lastnametextfield.setText(passenger2.getLastname());
        superadmin_passenger_usernametextfield.setText(String.valueOf(passenger2.getUsername()));
        superadmin_passenger_passwordtextfield.setText(String.valueOf(passenger2.getPassword()));
        superadmin_passenger_phonetextfield.setText(String.valueOf(passenger2.getPhonenumber()));
        superadmin_passenger_addresstextfield.setText(String.valueOf(passenger2.getAddress()));
        superadmin_passenger_emailtextfield.setText(String.valueOf(passenger2.getEmail()));

    }

    public void AddPassenger(){


        String sql  = "INSERT INTO passenger "
                + "(Id,First_name,Last_name,User_name,Password,Phone_No,Address,Email,Wallet,Tickets)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?)";

        connect = Database.connectDb();

        try{

            handler = new FileHandler("logger.log", true);

            if(superadmin_passenger_addresstextfield.getText().isEmpty()||superadmin_passenger_firstnametextfield.getText().isEmpty()
                    ||superadmin_passenger_lastnametextfield.getText().isEmpty()||superadmin_passenger_usernametextfield.getText().isEmpty()
                    ||superadmin_passenger_passwordtextfield.getText().isEmpty()
                    ||superadmin_passenger_phonetextfield.getText().isEmpty()||superadmin_passenger_addresstextfield.getText().isEmpty()
                    ||superadmin_passenger_emailtextfield.getText().isEmpty()

            ){

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blanks");
                alert.showAndWait();

            }else if(!regexemail(superadmin_passenger_emailtextfield.getText())){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real email !");
                alert.showAndWait();

            }else if(!regexphonenumber(superadmin_passenger_phonetextfield.getText())) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real phone number !");
                alert.showAndWait();

            }else{


                prepare = connect.prepareStatement(sql);
                prepare.setString(1, superadmin_passenger_idtextfield.getText());
                prepare.setString(2, superadmin_passenger_firstnametextfield.getText());
                prepare.setString(3, superadmin_passenger_lastnametextfield.getText());
                prepare.setString(4, superadmin_passenger_usernametextfield.getText());
                prepare.setString(5, superadmin_passenger_passwordtextfield.getText());
                prepare.setString(6, superadmin_passenger_phonetextfield.getText());
                prepare.setString(7, superadmin_passenger_addresstextfield.getText());
                prepare.setString(8,superadmin_passenger_emailtextfield.getText());
                prepare.setDouble(9,0);
                prepare.setInt(10,0);



                prepare.executeUpdate();
                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("Information");
                alert1.setHeaderText("");
                alert1.setContentText("Added successfully");
                alert1.showAndWait();

                ShowPassengerListData();
                PassengerClear();
            }
        }catch(Exception e){
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }
    }

    public void PassengerClear(){

        superadmin_passenger_idtextfield.setText("");
        superadmin_passenger_firstnametextfield.setText("");
        superadmin_passenger_lastnametextfield.setText("");
        superadmin_passenger_usernametextfield.setText("");
        superadmin_passenger_passwordtextfield.setText("");
        superadmin_passenger_phonetextfield.setText("");
        superadmin_passenger_addresstextfield.setText("");
        superadmin_passenger_emailtextfield.setText("");

    }

    public void Passengerfire(){

        String sql = "DELETE FROM passenger WHERE Id = '"
                +superadmin_passenger_idtextfield.getText()+"'";

        connect = Database.connectDb();

        try{

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confimation ^.^");
            alert.setHeaderText(null);
            alert.setContentText("Are you sure do you want delete passenger "+
                    superadmin_passenger_idtextfield.getText()+"?");
            Optional<ButtonType> option = alert.showAndWait();

            if(option.get().equals(ButtonType.OK)){
                statement = connect.createStatement();
                statement.executeUpdate(sql);

                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("INFORMATION ^-^");
                alert1.setHeaderText(null);
                alert1.setContentText("Deleted Successfully ^.^");
                alert1.showAndWait();
                ShowPassengerListData();
                PassengerClear();
            }

        }catch(Exception e){

            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);


        }
    }

    public void PassengerUpdate(){


        String sql = "UPDATE passenger SET First_name = '"+ superadmin_passenger_firstnametextfield.getText()
                +"' ,Last_name = '"+ superadmin_passenger_lastnametextfield.getText()+"' ,User_name= '"+
                superadmin_passenger_usernametextfield.getText()+"',Password = '"+ superadmin_passenger_passwordtextfield.getText()+"' ,Phone_no = '"+
                superadmin_passenger_phonetextfield.getText()+"' ,Address = '"+ superadmin_passenger_addresstextfield.getText()
                +"' ,Email = '"+superadmin_passenger_emailtextfield.getText()+"' WHERE Id = '"+ superadmin_passenger_idtextfield.getText()+"'";

        connect = Database.connectDb();

        try{


            handler = new FileHandler("logger.log", true);

            if(superadmin_passenger_idtextfield.getText().isEmpty()||superadmin_passenger_firstnametextfield.getText().isEmpty()
                    ||superadmin_passenger_lastnametextfield.getText().isEmpty()||superadmin_passenger_usernametextfield.getText().isEmpty()
                    ||superadmin_passenger_passwordtextfield.getText().isEmpty()
                    ||superadmin_passenger_phonetextfield.getText().isEmpty()||superadmin_passenger_addresstextfield.getText().isEmpty()
                    ||superadmin_passenger_emailtextfield.getText().isEmpty()


            ){

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blanks");
                alert.showAndWait();
            }else if(!regexemail(superadmin_passenger_emailtextfield.getText())){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real email !");
                alert.showAndWait();

            }else if(!regexphonenumber(superadmin_passenger_phonetextfield.getText())) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real phone number !");
                alert.showAndWait();

            }else{
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want update "+
                        superadmin_passenger_idtextfield.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();

                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);

                    Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Updated Successfully ^.^");
                    alert1.showAndWait();
                    ShowPassengerListData();
                    PassengerClear();
                }


            }
        }catch(Exception e){e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }
    }



//*************************************************************************************



//    financial page :


    public ObservableList<Employee> EmployeeSalaryListData(){

        ObservableList<Employee> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM employee";

        connect = Database.connectDb();

        try{

            handler = new FileHandler("logger.log", true);
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            Employee employee2;

            while(result.next()){
                employee2 = new Employee(result.getInt("Id"),
                        result.getString("First_name"),
                        result.getString("Last_name"),
                        result.getString("User_name"),
                        result.getString("Password"),
                        result.getString("Phone_no"),
                        result.getString("Address"),
                        result.getString("Email"),
                        result.getDouble("Salary"));



                listData.add(employee2);
            }

        }catch(Exception e){
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }

        return listData;
    }
    private ObservableList<Employee> EmployeeSalaryList;
    public void ShowEmployeeSalaryListData(){

        EmployeeSalaryList = EmployeeSalaryListData();

        superadmin_financial_employees_usernameCol.setCellValueFactory(new PropertyValueFactory<>("username"));
        superadmin_financial_employees_salaryCol.setCellValueFactory(new PropertyValueFactory<>("Salary"));

        superadmin_financial_employees_table.setItems(EmployeeSalaryList);

    }

    public void EmployeeSalarySelect(){

       Employee employee2= superadmin_financial_employees_table.getSelectionModel().getSelectedItem();
        int n =superadmin_financial_employees_table.getSelectionModel().getSelectedIndex();

        if((n -1)< -1){return;}

        superadmin_financial_employees_salarytextfield.setText(String.valueOf(employee2.getSalary()));

    }

    public void EmployeeSalaryUpdate(){


        String sql = "UPDATE employee SET Salary = '"+ superadmin_financial_employees_salarytextfield.getText()+"'";
        connect = Database.connectDb();

        try{


            handler = new FileHandler("logger.log", true);

            if(superadmin_financial_employees_salarytextfield.getText().isEmpty()

            ){

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blanks");
                alert.showAndWait();
            }else{
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want update ?");
                Optional<ButtonType> option = alert.showAndWait();

                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);

                    Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Updated Successfully ^.^");
                    alert1.showAndWait();
                    ShowEmployeeSalaryListData();

                }


            }
        }catch(Exception e){e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }
    }

//-------------------------------------------------------------------------------------------------------------------------
    public ObservableList<Manager> ManagerSalaryListData(){

        ObservableList<Manager> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM manager";

        connect = Database.connectDb();

        try{

            handler = new FileHandler("logger.log", true);
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            Manager manager2;

            while(result.next()){
               manager2 = new Manager(result.getInt("Id"),
                        result.getString("First_name"),
                        result.getString("Last_name"),
                        result.getString("User_name"),
                        result.getString("Password"),
                        result.getString("Phone_no"),
                        result.getString("Address"),
                        result.getString("Email"),
                        result.getDouble("Salary"));



                listData.add(manager2);
            }

        }catch(Exception e){
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }

        return listData;
    }
    private ObservableList<Manager> ManagerSalaryList;
    public void ShowManagerSalaryListData(){

        ManagerSalaryList = ManagerSalaryListData();

        superadmin_financial_manager_usernameCol.setCellValueFactory(new PropertyValueFactory<>("username"));
        superadmin_financial_manager_salaryCol.setCellValueFactory(new PropertyValueFactory<>("Salary"));

        superadmin_financial_manager_table.setItems(ManagerSalaryList);

    }

    public void ManagerSalarySelect(){

       Manager manager2= superadmin_financial_manager_table.getSelectionModel().getSelectedItem();
        int n =superadmin_financial_manager_table.getSelectionModel().getSelectedIndex();

        if((n -1)< -1){return;}

        superadmin_financial_manager_salarytextfield.setText(String.valueOf(manager2.getSalary()));

    }

    public void ManagerSalaryUpdate(){


        String sql = "UPDATE manager SET Salary = '"+ superadmin_financial_manager_salarytextfield.getText()+"'";
        connect = Database.connectDb();

        try{


            handler = new FileHandler("logger.log", true);

            if(superadmin_financial_manager_salarytextfield.getText().isEmpty()

            ){

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blanks");
                alert.showAndWait();
            }else{
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want update ?");
                Optional<ButtonType> option = alert.showAndWait();

                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);

                    Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Updated Successfully ^.^");
                    alert1.showAndWait();
                    ShowManagerSalaryListData();

                }


            }
        }catch(Exception e){e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }
    }

// ________________________________________________________________________________________________________



    public ObservableList<Passenger> PassengerWalletListData(){

        ObservableList<Passenger> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM passenger";

        connect = Database.connectDb();

        try{

            handler = new FileHandler("logger.log", true);
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            Passenger passenger2;


            while(result.next()){
               passenger2 = new Passenger(result.getInt("Id"),
                        result.getString("First_name"),
                        result.getString("Last_name"),
                        result.getString("User_name"),
                        result.getString("Password"),
                        result.getString("Phone_no"),
                        result.getString("Address"),
                        result.getString("Email"),
                        result.getDouble("Wallet"),
                        result.getInt("Tickets"));




                listData.add(passenger2);
            }

        }catch(Exception e){
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }

        return listData;
    }
    private ObservableList<Passenger> PassengerWalletList;
    public void ShowPassengerWalletListData(){

        PassengerWalletList = PassengerWalletListData();


        superadmin_financial_passengers_usernameCol.setCellValueFactory(new PropertyValueFactory<>("username"));
        superadmin_financial_passengers_walletCol.setCellValueFactory(new PropertyValueFactory<>("wallet"));
        superadmin_financial_passengers_ticketCol.setCellValueFactory(new PropertyValueFactory<>("boughtticket"));



        superadmin_financial_passengers_table.setItems(PassengerWalletList);

    }

    public void PassengerWalletSelect(){

        Passenger passenger2= superadmin_financial_passengers_table.getSelectionModel().getSelectedItem();
        int n =superadmin_financial_passengers_table.getSelectionModel().getSelectedIndex();

        if((n -1)< -1){return;}

    }

}
