
package Controller;

import Model.*;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import static javafx.collections.FXCollections.observableList;

import com.mysql.fabric.xmlrpc.base.Value;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class ManagerDashbordController implements Initializable {

    private ArrayList<Airplane> Airplanes = new ArrayList<Airplane>(20);

    ObservableList<Airplane> fligthData;

    @FXML
    private TableColumn manager_planes_flightsCol;

    @FXML
    private TextField manager_passengers_email_textfield;

    @FXML
    private TextField manager_setting_idtextfield;

    @FXML
    private AnchorPane manager_skeleton_page;

    @FXML
    private TableColumn<?, ?> manager_flight_planeCol;

    @FXML
    private TextField manager_setting_addresstextfield;

    @FXML
    private AnchorPane manager_flights_page;

    @FXML
    private TableColumn<?, ?> manager_passengers_usernameCol;

    @FXML
    private TableColumn<?, ?> manager_passengers_passwordCol1;

    @FXML
    private TextField manager_planes_seats_textfield;

    @FXML
    private TableColumn<?, ?> manager_passengers_emailCol;

    @FXML
    private Button manager_passengers_clearBtn;

    @FXML
    private Button manager_planes_clearBtn;

    @FXML
    private TextField manager_passengers_password_textfield;

    @FXML
    private Button manager_employees_addBtn;

    @FXML
    private TableColumn<?, ?> manager_passengers_addressCol;

    @FXML
    private TextField manager_flights_search;

    @FXML
    private TextField manager_passengers_username_textfield;

    @FXML
    private TableColumn<?, ?> manager_passengers_passwordCol;

    @FXML
    private TableColumn<?, ?> manager_setting_emailCol;

    @FXML
    private TextField manager_passengers_phone_textfield;

    @FXML
    private TextField manager_setting_phonetextfield;

    @FXML
    private TableColumn<?, ?> manager_setting_passwordCol;

    @FXML
    private TextField manager_setting_firstnametextfield;

    @FXML
    private TableColumn<?, ?> manager_flight_soldticketsCol;

    @FXML
    private TableColumn<?, ?> manager_passengers_idCol;

    @FXML
    private TextField manager_passengers_firstname_textfield;

    @FXML
    private Button manager_flight_addBtn;

    @FXML
    private Button manager_passengers_addBtn11;

    @FXML
    private TableColumn<?, ?> manager_passengers_phoneCol;

    @FXML
    private TableColumn<?, ?> manager_planes_seatsCol;

    @FXML
    private Button manager_passengers_addBtn;

    @FXML
    private TextField manager_passengers_address_textfield;

    @FXML
    private TableColumn<?, ?> manager_setting_usernameCol;

    @FXML
    private TextField manager_flight_from_textfield;

    @FXML
    private TableColumn<?, ?> manager_setting_addressCol;

    @FXML
    private TableColumn<?, ?> manager_flight_toCol;

    @FXML
    private TableColumn<?, ?> manager_flight_ticket_priceCol;

    @FXML
    private Button close;

    @FXML
    private TextField manager_flight_plane_textfield;

    @FXML
    private Button minimize;

    @FXML
    private TextField manager_setting_passwordtextfield;

    @FXML
    private TableColumn<?, ?> manager_setting_phoneCol;

    @FXML
    private TableColumn<?, ?> manager_flight_ticket_fineCol;

    @FXML
    private TextField manager_employees_address_textfield;

    @FXML
    private Button manager_flight_updateBtn;

    @FXML
    private TextField manager_flight_ticket_id_textfield;

    @FXML
    private Button manager_setting_clearBtn;

    @FXML
    private TextField manager_passengers_lastname_textfield;

    @FXML
    private TextField manager_employees_search_textfield;

    @FXML
    private TextField manager_setting_lastnametextfield;

    @FXML
    private TextField manager_flight_ticket_fine_textfield;

    @FXML
    private TextField manager_employees_id_textfield;

    @FXML
    private TableColumn<?, ?> manager_setting_lastnameCol;

    @FXML
    private TextField manager_flight_ticket_price_textfield;

    @FXML
    private TableColumn<?, ?> manager_employees_lastnameCol;

    @FXML
    private TextField manager_flight_date_textfield;

    @FXML
    private AnchorPane manager_setting_page;

    @FXML
    private TableColumn<?, ?> manager_employees_passwordCol;

    @FXML
    private TableColumn<?, ?> manager_employees_firstnameCol;

    @FXML
    private ImageView manager_planes_addBtn;

    @FXML
    private TableView<Passenger> manager_passengers_table;

    @FXML
    private TextField manager_passengers_id_textfield;

    @FXML
    private TextField manager_flight_to_textfield;

    @FXML
    private Button manager_employees_fireBtn;

    @FXML
    private TextField manager_employees_firstname_textfield;

    @FXML
    private TableColumn<?, ?> manager_setting_idCol;

    @FXML
    private TextField manager_messages_employees_textfield;

    @FXML
    private TextField manager_employees_phone_textfield;

    @FXML
    private TableColumn<?, ?> manager_flight_stateCol;

    @FXML
    private TableColumn<?, ?> manager_employees_usernameCol;

    @FXML
    private AnchorPane manager_passengers_page;

    @FXML
    private TableColumn<?, ?> manager_employees_idCol;

    @FXML
    private TextField manager_employees_email_textfield;

    @FXML
    private Button manager_signout_btn;

    @FXML
    private TextField manager_employees_password_textfield;

    @FXML
    private Button manager_planes_updateBtn;

    @FXML
    private TableColumn<?, ?> manager_employees_addressCol;

    @FXML
    private TableColumn<?, ?> manager_setting_firstnameCol;

    @FXML
    private TextField manager_employees_username_textfield;

    @FXML
    private Button manager_passengers_updateBtn;

    @FXML
    private Button manager_flight_clearBtn;

    @FXML
    private TextField manager_flight_id_textfield;

    @FXML
    private TableColumn<?, ?> manager_employees_emailCol;

    @FXML
    private TextField manager_passengers_search_textfield;

    @FXML
    private TableColumn<?, ?> manager_flight_timeCol;

    @FXML
    private Button manager_planes_deleteBtn;

    @FXML
    private TextField manager_flight_time_textfield;

    @FXML
    private AnchorPane manager_employees_page;

    @FXML
    private TableView<Flight> manager_flights_table;

    @FXML
    private Button manager_passengers_deleteBtn;

    @FXML
    private TableView<Employee> manager_employees_table;

    @FXML
    private TextField manager_setting_emailtextfield;

    @FXML
    private Button manager_flight_deleteBtn;

    @FXML
    private Button manager_employees_updateBtn;

    @FXML
    private TextField manager_setting_usernametextfield;

    @FXML
    private TextField manager_flight_soldtickets_textfield;

    @FXML
    private TableColumn<?, ?> manager_passengers_firstnameCol;

    @FXML
    private TableColumn<?, ?> manager_flight_idCol;

    @FXML
    private TextField manager_planes_id_textfield;

    @FXML
    private ComboBox<?> manager_flight_passengerCombobox;

    @FXML
    private TextField manager_planes_search;

    @FXML
    private TableView<Manager> manager_setting_table;

    @FXML
    private TextField manager_employees_lastname_textfield;

    @FXML
    private TableColumn<?, ?> manager_flight_ticket_idCol;

    @FXML
    private TableColumn<?, ?> manager_planes_idCol;

    @FXML
    private ComboBox<?> manager_planes_flightCombobox;

    @FXML
    private AnchorPane manager_messages_page;

    @FXML
    private TextField manager_messages_passenger_textfield;

    @FXML
    private Button manager_setting_updateBtn;

    @FXML
    private TableColumn<?, ?> manager_flight_fromCol;

    @FXML
    private Button manager_employees_clearBtn;

    @FXML
    private AnchorPane manager_planes_page;

    @FXML
    private TableColumn<?, ?> manager_passengers_lastnameCol;

    @FXML
    private TableColumn<?, ?> manager_employees_phoneCol;

    @FXML
    private TableColumn<?, ?> manager_flight_dateCol;

    @FXML
    private TextField manager_flight_state_textfield;
    @FXML
    private ComboBox manager_flight_statusCombobox1;

    @FXML
    private TableView<Airplane> manager_planes_table;
    @FXML
    private Button manager_settingBtn;
    @FXML
    private Button manager_employeeBtn;
    @FXML
    private Button manager_pasengerBtn;
    @FXML
    private Button manager_planesBtn;
    @FXML
    private Button manager_flightsBtn;
    @FXML
    private Button manager_massagesBtn;
    FileHandler handler;
    private double x = 0;
    private double y = 0;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ShowManagerListData();
        ShowEmployeeListData();
        ShowPassengerListData();
        ShowPlaneListData();
        ShowFlightListData();
        statusbox();
    }

    @FXML
    private void close(ActionEvent event) {

        System.exit(0);
    }

    @FXML
    private void minimize(ActionEvent event) {

        Stage stage = (Stage) manager_skeleton_page.getScene().getWindow();
        stage.setIconified(true);
    }

    public void switchPage(ActionEvent event) {

        if (event.getSource() == manager_settingBtn) {
            manager_setting_page.setVisible(true);
            manager_employees_page.setVisible(false);
            manager_passengers_page.setVisible(false);
            manager_planes_page.setVisible(false);
            manager_flights_page.setVisible(false);
            manager_messages_page.setVisible(false);


        } else if (event.getSource() == manager_employeeBtn) {
            manager_setting_page.setVisible(false);
            manager_employees_page.setVisible(true);
            manager_passengers_page.setVisible(false);
            manager_planes_page.setVisible(false);
            manager_flights_page.setVisible(false);
            manager_messages_page.setVisible(false);

        } else if (event.getSource() == manager_pasengerBtn) {
            manager_setting_page.setVisible(false);
            manager_employees_page.setVisible(false);
            manager_passengers_page.setVisible(true);
            manager_planes_page.setVisible(false);
            manager_flights_page.setVisible(false);
            manager_messages_page.setVisible(false);
            passenger_search();

        } else if (event.getSource() == manager_planesBtn) {
            manager_setting_page.setVisible(false);
            manager_employees_page.setVisible(false);
            manager_passengers_page.setVisible(false);
            manager_planes_page.setVisible(true);
            manager_flights_page.setVisible(false);
            manager_messages_page.setVisible(false);
            
            airplane_search();
            
        } else if (event.getSource() == manager_flightsBtn) {
            manager_setting_page.setVisible(false);
            manager_employees_page.setVisible(false);
            manager_passengers_page.setVisible(false);
            manager_planes_page.setVisible(false);
            manager_flights_page.setVisible(true);
            manager_messages_page.setVisible(false);
            flight_search();

        } else if (event.getSource() == manager_massagesBtn) {
            manager_setting_page.setVisible(false);
            manager_employees_page.setVisible(false);
            manager_passengers_page.setVisible(false);
            manager_planes_page.setVisible(false);
            manager_flights_page.setVisible(false);
            manager_messages_page.setVisible(true);
        }
    }

    public void signOut_manager() {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to sign out?");
        Optional<ButtonType> option = alert.showAndWait();
        try {

            handler = new FileHandler("logger.log", true);

            if (option.get().equals(ButtonType.OK)) {

                manager_signout_btn.getScene().getWindow().hide();
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
            logger.warning("warning message" + e);
        }
    }

//    ******************************************************************************************************

    private Connection connect;
    private Statement statement;
    private PreparedStatement prepare;
    private ResultSet result;

    public ObservableList<Manager> ManagerListData() {

        ObservableList<Manager> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM manager";

        connect = Database.connectDb();

        try {

            handler = new FileHandler("logger.log", true);
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            Manager manager;

            while (result.next()) {
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

        } catch (Exception e) {
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message" + e);
        }

        return listData;
    }

    private ObservableList<Manager> ManagerList;

    public void ShowManagerListData() {

        ManagerList = ManagerListData();
        manager_setting_idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        manager_setting_firstnameCol.setCellValueFactory(new PropertyValueFactory<>("firstname"));
        manager_setting_lastnameCol.setCellValueFactory(new PropertyValueFactory<>("lastname"));
        manager_setting_usernameCol.setCellValueFactory(new PropertyValueFactory<>("username"));
        manager_setting_passwordCol.setCellValueFactory(new PropertyValueFactory<>("password"));
        manager_setting_phoneCol.setCellValueFactory(new PropertyValueFactory<>("phonenumber"));
        manager_setting_addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        manager_setting_emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));

        manager_setting_table.setItems(ManagerList);

    }

    public void ManagerSelect() {

        Manager manager2 = manager_setting_table.getSelectionModel().getSelectedItem();
        int n = manager_setting_table.getSelectionModel().getSelectedIndex();

        if ((n - 1) < -1) {
            return;
        }

        manager_setting_idtextfield.setText(String.valueOf(manager2.getId()));
        manager_setting_firstnametextfield.setText(manager2.getFirstname());
        manager_setting_lastnametextfield.setText(manager2.getLastname());
        manager_setting_usernametextfield.setText(String.valueOf(manager2.getUsername()));
        manager_setting_passwordtextfield.setText(String.valueOf(manager2.getPassword()));
        manager_setting_phonetextfield.setText(String.valueOf(manager2.getPhonenumber()));
        manager_setting_addresstextfield.setText(String.valueOf(manager2.getAddress()));
        manager_setting_emailtextfield.setText(String.valueOf(manager2.getEmail()));

    }

    public void ManagerClear() {

        manager_setting_idtextfield.setText("");
        manager_setting_firstnametextfield.setText("");
        manager_setting_lastnametextfield.setText("");
        manager_setting_usernametextfield.setText("");
        manager_setting_passwordtextfield.setText("");
        manager_setting_phonetextfield.setText("");
        manager_setting_addresstextfield.setText("");
        manager_setting_emailtextfield.setText("");

    }

    public void ManagerUpdate() {


        String sql = "UPDATE manager SET First_name = '" + manager_setting_firstnametextfield.getText()
                + "' ,Last_name = '" + manager_setting_lastnametextfield.getText() + "' ,User_name= '" +
                manager_setting_usernametextfield.getText() + "',Password = '" + manager_setting_passwordtextfield.getText() + "' ,Phone_no = '" +
                manager_setting_phonetextfield.getText() + "' ,Address = '" + manager_setting_addresstextfield.getText()
                + "' ,Email = '" + manager_setting_emailtextfield.getText() + "' WHERE Id = '" + manager_setting_idtextfield.getText() + "'";

        connect = Database.connectDb();

        try {


            handler = new FileHandler("logger.log", true);

            if (manager_setting_idtextfield.getText().isEmpty() || manager_setting_firstnametextfield.getText().isEmpty()
                    || manager_setting_usernametextfield.getText().isEmpty() || manager_setting_lastnametextfield.getText().isEmpty()
                    || manager_setting_passwordtextfield.getText().isEmpty()
                    || manager_setting_phonetextfield.getText().isEmpty() || manager_setting_addresstextfield.getText().isEmpty()
                    || manager_setting_emailtextfield.getText().isEmpty()


            ) {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blanks");
                alert.showAndWait();
            } else if (!regexemail(manager_setting_emailtextfield.getText())) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real email !");
                alert.showAndWait();

            } else if (!regexphonenumber(manager_setting_phonetextfield.getText())) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real phone number !");
                alert.showAndWait();

            } else {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want update " +
                        manager_setting_idtextfield.getText() + "?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
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
        } catch (Exception e) {
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message" + e);
        }
    }
    public boolean regexemail(String a) {

        String regex = "[a-zA-Z0-9.-_]{6,30}@[ge]mail.com";
        return a.matches(regex);
    }

    public boolean regexphonenumber(String a) {
        String regex = "[0][9][0-9]{9}";
        return a.matches(regex);
    }
//************************************************************************************************

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
        manager_employees_idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        manager_employees_firstnameCol.setCellValueFactory(new PropertyValueFactory<>("firstname"));
        manager_employees_lastnameCol.setCellValueFactory(new PropertyValueFactory<>("lastname"));
        manager_employees_usernameCol.setCellValueFactory(new PropertyValueFactory<>("username"));
        manager_employees_passwordCol.setCellValueFactory(new PropertyValueFactory<>("password"));
        manager_employees_phoneCol.setCellValueFactory(new PropertyValueFactory<>("phonenumber"));
        manager_employees_addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        manager_employees_emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));

        manager_employees_table.setItems(EmployeeList);

    }

    public void EmployeeSelect(){

        Employee employee2=  manager_employees_table.getSelectionModel().getSelectedItem();
        int n =  manager_employees_table.getSelectionModel().getSelectedIndex();

        if((n -1)< -1){return;}

        manager_employees_id_textfield.setText(String.valueOf(employee2.getId()));
        manager_employees_firstname_textfield.setText(employee2.getFirstname());
        manager_employees_lastname_textfield.setText(employee2.getLastname());
        manager_employees_username_textfield.setText(String.valueOf(employee2.getUsername()));
        manager_employees_password_textfield.setText(String.valueOf(employee2.getPassword()));
        manager_employees_phone_textfield.setText(String.valueOf(employee2.getPhonenumber()));
        manager_employees_address_textfield.setText(String.valueOf(employee2.getAddress()));
        manager_employees_email_textfield.setText(String.valueOf(employee2.getEmail()));
    }

    public void AddEmployee(){


        String sql  = "INSERT INTO employee "
                + "(Id,First_name,Last_name,User_name,Password,Phone_No,Address,Email,Salary)"
                + "VALUES(?,?,?,?,?,?,?,?,?)";

        connect = Database.connectDb();

        try{

            handler = new FileHandler("logger.log", true);

            if(manager_employees_id_textfield.getText().isEmpty()|| manager_employees_firstname_textfield.getText().isEmpty()
                    ||  manager_employees_lastname_textfield.getText().isEmpty()||  manager_employees_username_textfield.getText().isEmpty()
                    ||  manager_employees_password_textfield.getText().isEmpty()
                    || manager_employees_phone_textfield.getText().isEmpty()|| manager_employees_email_textfield.getText().isEmpty()
                    |  manager_employees_address_textfield.getText().isEmpty()

            ){

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blanks");
                alert.showAndWait();

            }else if(!regexemail( manager_employees_email_textfield.getText())){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real email !");
                alert.showAndWait();

            }else if(!regexphonenumber( manager_employees_phone_textfield.getText())) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real phone number !");
                alert.showAndWait();

            }else{


                prepare = connect.prepareStatement(sql);
                prepare.setString(1, manager_employees_id_textfield.getText());
                prepare.setString(2, manager_employees_firstname_textfield.getText());
                prepare.setString(3,manager_employees_lastname_textfield.getText());
                prepare.setString(4, manager_employees_username_textfield.getText());
                prepare.setString(5, manager_employees_password_textfield.getText());
                prepare.setString(6, manager_employees_phone_textfield.getText());
                prepare.setString(7, manager_employees_address_textfield.getText());
                prepare.setString(8,manager_employees_email_textfield.getText());
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

        manager_employees_id_textfield.setText("");
        manager_employees_firstname_textfield.setText("");
        manager_employees_lastname_textfield.setText("");
        manager_employees_username_textfield.setText("");
        manager_employees_password_textfield.setText("");
        manager_employees_phone_textfield.setText("");
        manager_employees_address_textfield.setText("");
        manager_employees_email_textfield.setText("");

    }

    public void Employeefire(){

        String sql = "DELETE FROM employee WHERE Id = '"
                + manager_employees_id_textfield.getText()+"'";

        connect = Database.connectDb();

        try{

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confimation ^.^");
            alert.setHeaderText(null);
            alert.setContentText("Are you sure do you want fire employee "+
                    manager_employees_id_textfield.getText()+"?");
            Optional<ButtonType> option = alert.showAndWait();

            if(option.get().equals(ButtonType.OK)){
                statement = connect.createStatement();
                statement.executeUpdate(sql);

                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("INFORMATION ^-^");
                alert1.setHeaderText(null);
                alert1.setContentText("Fired Successfully ^.^");
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


        String sql = "UPDATE employee SET First_name = '"+  manager_employees_firstname_textfield.getText()
                +"' ,Last_name = '"+  manager_employees_lastname_textfield.getText()+"' ,User_name= '"+
                manager_employees_username_textfield.getText()+"',Password = '"+  manager_employees_password_textfield.getText()+"' ,Phone_no = '"+
                manager_employees_phone_textfield.getText()+"' ,Address = '"+  manager_employees_address_textfield.getText()
                +"' ,Email = '"+ manager_employees_email_textfield.getText()+"' WHERE Id = '"+  manager_employees_id_textfield.getText()+"'";

        connect = Database.connectDb();

        try{


            handler = new FileHandler("logger.log", true);

            if( manager_employees_id_textfield.getText().isEmpty()||manager_employees_firstname_textfield.getText().isEmpty()
                    || manager_employees_lastname_textfield.getText().isEmpty()||manager_employees_username_textfield.getText().isEmpty()
                    ||manager_employees_password_textfield.getText().isEmpty()
                    ||manager_employees_phone_textfield.getText().isEmpty()|| manager_employees_address_textfield.getText().isEmpty()
                    ||manager_employees_email_textfield.getText().isEmpty()


            ){

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blanks");
                alert.showAndWait();
            }else if(!regexemail(manager_employees_email_textfield.getText())){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real email !");
                alert.showAndWait();

            }else if(!regexphonenumber(manager_employees_phone_textfield.getText())) {
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
                        manager_employees_id_textfield.getText()+"?");
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
        manager_passengers_idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        manager_passengers_firstnameCol.setCellValueFactory(new PropertyValueFactory<>("firstname"));
        manager_passengers_lastnameCol.setCellValueFactory(new PropertyValueFactory<>("lastname"));
        manager_passengers_usernameCol.setCellValueFactory(new PropertyValueFactory<>("username"));
        manager_passengers_passwordCol.setCellValueFactory(new PropertyValueFactory<>("password"));
        manager_passengers_phoneCol.setCellValueFactory(new PropertyValueFactory<>("phonenumber"));
        manager_passengers_addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        manager_passengers_emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));

        manager_passengers_table.setItems(PassengerList);

    }
    
     public void passenger_search(){
         
    FilteredList<Passenger> filter = new FilteredList<>(PassengerList, e -> true);

        manager_passengers_search_textfield.textProperty().addListener((Observable, oldValue, newValue) -> {

            filter.setPredicate(predicatePassenger -> {

                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                String searchKey = newValue.toLowerCase();

                if (predicatePassenger.getId().toString().contains(searchKey)) {
                    return true;
                } else if (predicatePassenger.getFirstname().toLowerCase().contains(searchKey)) {
                    return true;
                } else if (predicatePassenger.getLastname().toLowerCase().contains(searchKey)) {
                    return true;
                } else if (predicatePassenger.getUsername().toLowerCase().contains(searchKey)) {
                    return true;
                } else if (predicatePassenger.getPassword().toLowerCase().contains(searchKey)) {
                    return true;
                } else if (predicatePassenger.getPhonenumber().toLowerCase().contains(searchKey)) {
                    return true;
                } else if (predicatePassenger.getAddress().toString().contains(searchKey)) {
                    return true;
                } else if (predicatePassenger.getEmail().toString().contains(searchKey)) {
                    return true;
                } 
                else {
                    return false;
                }
            });
        });

        SortedList<Passenger> sortList = new SortedList<>(filter);

        sortList.comparatorProperty().bind(manager_passengers_table.comparatorProperty());
        manager_passengers_table.setItems(sortList);
    }

    public void PassengerSelect(){

        Passenger passenger2=  manager_passengers_table.getSelectionModel().getSelectedItem();
        int n =  manager_passengers_table.getSelectionModel().getSelectedIndex();

        if((n -1)< -1){return;}

        manager_passengers_id_textfield.setText(String.valueOf(passenger2.getId()));
        manager_passengers_firstname_textfield.setText(passenger2.getFirstname());
        manager_passengers_lastname_textfield.setText(passenger2.getLastname());
        manager_passengers_username_textfield.setText(String.valueOf(passenger2.getUsername()));
        manager_passengers_password_textfield.setText(String.valueOf(passenger2.getPassword()));
        manager_passengers_phone_textfield.setText(String.valueOf(passenger2.getPhonenumber()));
        manager_passengers_address_textfield.setText(String.valueOf(passenger2.getAddress()));
        manager_passengers_email_textfield.setText(String.valueOf(passenger2.getEmail()));

    }

    public void AddPassenger(){


        String sql  = "INSERT INTO passenger "
                + "(Id,First_name,Last_name,User_name,Password,Phone_No,Address,Email,Wallet,Tickets)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?)";

        connect = Database.connectDb();

        try{

            handler = new FileHandler("logger.log", true);

            if(manager_passengers_id_textfield.getText().isEmpty()|| manager_passengers_firstname_textfield.getText().isEmpty()
                    || manager_passengers_lastname_textfield.getText().isEmpty()||  manager_passengers_username_textfield.getText().isEmpty()
                    ||  manager_passengers_password_textfield.getText().isEmpty()
                    || manager_passengers_phone_textfield.getText().isEmpty()||manager_passengers_address_textfield.getText().isEmpty()
                    ||manager_passengers_email_textfield.getText().isEmpty()

            ){

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blanks");
                alert.showAndWait();

            }else if(!regexemail(manager_passengers_email_textfield.getText())){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real email !");
                alert.showAndWait();

            }else if(!regexphonenumber(manager_passengers_phone_textfield.getText())) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real phone number !");
                alert.showAndWait();

            }else{


                prepare = connect.prepareStatement(sql);
                prepare.setString(1, manager_passengers_id_textfield.getText());
                prepare.setString(2, manager_passengers_firstname_textfield.getText());
                prepare.setString(3, manager_passengers_lastname_textfield.getText());
                prepare.setString(4, manager_passengers_username_textfield.getText());
                prepare.setString(5, manager_passengers_password_textfield.getText());
                prepare.setString(6, manager_passengers_phone_textfield.getText());
                prepare.setString(7, manager_passengers_address_textfield.getText());
                prepare.setString(8, manager_passengers_email_textfield.getText());
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

        manager_passengers_id_textfield.setText("");
        manager_passengers_firstname_textfield.setText("");
        manager_passengers_lastname_textfield.setText("");
        manager_passengers_username_textfield.setText("");
        manager_passengers_password_textfield.setText("");
        manager_passengers_phone_textfield.setText("");
        manager_passengers_address_textfield.setText("");
        manager_passengers_email_textfield.setText("");

    }

    public void Passengerdelete(){

        String sql = "DELETE FROM passenger WHERE Id = '"
                +manager_passengers_id_textfield.getText()+"'";

        connect = Database.connectDb();

        try{

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confimation ^.^");
            alert.setHeaderText(null);
            alert.setContentText("Are you sure do you want delete passenger "+
                    manager_passengers_id_textfield.getText()+"?");
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


        String sql = "UPDATE passenger SET First_name = '"+ manager_passengers_firstname_textfield.getText()
                +"' ,Last_name = '"+ manager_passengers_lastname_textfield.getText()+"' ,User_name= '"+
                manager_passengers_username_textfield.getText()+"',Password = '"+ manager_passengers_password_textfield.getText()+"' ,Phone_no = '"+
                manager_passengers_phone_textfield.getText()+"' ,Address = '"+ manager_passengers_address_textfield.getText()
                +"' ,Email = '"+manager_passengers_email_textfield.getText()+"' WHERE Id = '"+ manager_passengers_id_textfield.getText()+"'";

        connect = Database.connectDb();

        try{


            handler = new FileHandler("logger.log", true);

            if(manager_passengers_id_textfield.getText().isEmpty()|| manager_passengers_firstname_textfield.getText().isEmpty()
                    ||manager_passengers_lastname_textfield.getText().isEmpty()|| manager_passengers_password_textfield.getText().isEmpty()
                    || manager_passengers_username_textfield.getText().isEmpty()
                    || manager_passengers_phone_textfield.getText().isEmpty()||manager_passengers_email_textfield.getText().isEmpty()
                    || manager_passengers_id_textfield.getText().isEmpty()


            ){

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blanks");
                alert.showAndWait();
            }else if(!regexemail(manager_passengers_email_textfield.getText())){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real email !");
                alert.showAndWait();

            }else if(!regexphonenumber( manager_passengers_phone_textfield.getText())) {
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
                        manager_passengers_id_textfield.getText()+"?");
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

//1111
    public ObservableList<Airplane> PlaneListData(){

        ObservableList<Airplane> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM plane";

        connect = Database.connectDb();

        try{

            handler = new FileHandler("logger.log", true);
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            Airplane plane;

            while(result.next()){
                plane = new Airplane(result.getInt("Id"),
                        result.getInt("Seats"));



                listData.add(plane);
            }

        }catch(Exception e){
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }

        return listData;
    }

    private ObservableList<Airplane> PlaneList;
    public void ShowPlaneListData(){

        PlaneList = PlaneListData();
        manager_planes_idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        manager_planes_seatsCol.setCellValueFactory(new PropertyValueFactory<>("seats"));


        manager_planes_table.setItems(PlaneList);

    }

    public void PlaneSelect(){

        Airplane plane2=  manager_planes_table.getSelectionModel().getSelectedItem();
        int n =  manager_planes_table.getSelectionModel().getSelectedIndex();

        if((n -1)< -1){return;}

        manager_planes_id_textfield.setText(String.valueOf(plane2.getId()));
        manager_planes_seats_textfield.setText(String.valueOf(plane2.getSeats()));

//        Flight newflight = new Flight(11,plane2);
//        plane2.setFlightlist(newflight);
//
//        List<Integer> flightsid = new ArrayList<>();
//
//        for(Flight flight : plane2.getFlightlist() ){
//           flightsid.add(flight.getId());
//        }
//
//        ObservableList listData = FXCollections.observableArrayList(flightsid);
//        manager_planes_flightCombobox.setItems(listData);
    }
    
     public void airplane_search(){
         
      FilteredList<Airplane> filter = new FilteredList<>(PlaneList, e -> true);

        manager_planes_search.textProperty().addListener((Observable, oldValue, newValue) -> {

            
            filter.setPredicate(predicateAirplane -> {

                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                String searchKey = newValue.toLowerCase();

                if (predicateAirplane.getId().toString().contains(searchKey)) {
                    return true;
                } else if (predicateAirplane.getSeats().toString().contains(searchKey)) {
                    return true;
                
                } else {
                    return false;
                }
            });
        });

        SortedList<Airplane> sortList = new SortedList<>(filter);

        sortList.comparatorProperty().bind(manager_planes_table.comparatorProperty());
        manager_planes_table.setItems(sortList);
    }





    public void AddPlane(){


        String sql  = "INSERT INTO plane "
                + "(Id,Seats)"
                + "VALUES(?,?)";

        connect = Database.connectDb();

        try{

            handler = new FileHandler("logger.log", true);

            if( manager_planes_id_textfield.getText().isEmpty()|| manager_planes_seats_textfield.getText().isEmpty()
            ){

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blanks");
                alert.showAndWait();

            }else{


                prepare = connect.prepareStatement(sql);
                prepare.setString(1,manager_planes_id_textfield.getText());
                prepare.setString(2, manager_planes_seats_textfield.getText());

                int newid = Integer.parseInt(manager_planes_id_textfield.getText());
                int newseats = Integer.parseInt(manager_planes_seats_textfield.getText());

                Airplane flightplane = new Airplane(newid,newseats);
                Airplanes.add(flightplane);


                prepare.executeUpdate();
                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("Information");
                alert1.setHeaderText("");
                alert1.setContentText("Added successfully");
                alert1.showAndWait();

                ShowPlaneListData();
                PlaneClear();
            }
        }catch(Exception e){
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }
    }

    public void PlaneClear(){

        manager_planes_id_textfield.setText("");
        manager_planes_seats_textfield.setText("");


    }

    public void Planedelete(){

        String sql = "DELETE FROM plane WHERE Id = '"
                +manager_planes_id_textfield.getText()+"'";

        connect = Database.connectDb();

        try{

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confimation ^.^");
            alert.setHeaderText(null);
            alert.setContentText("Are you sure do you want delete passenger "+
                    manager_planes_id_textfield.getText()+"?");
            Optional<ButtonType> option = alert.showAndWait();

            if(option.get().equals(ButtonType.OK)){
                statement = connect.createStatement();
                statement.executeUpdate(sql);

                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("INFORMATION ^-^");
                alert1.setHeaderText(null);
                alert1.setContentText("Deleted Successfully ^.^");
                alert1.showAndWait();
                ShowPlaneListData();
                PlaneClear();
            }

        }catch(Exception e){

            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);


        }
    }

    public void PlaneUpdate(){


        String sql = "UPDATE plane SET Seats = '"+ manager_planes_seats_textfield.getText()
                +"'  WHERE Id = '"+manager_planes_id_textfield.getText()+"'";

        connect = Database.connectDb();

        try{


            handler = new FileHandler("logger.log", true);

            if(manager_planes_id_textfield.getText().isEmpty()|| manager_planes_seats_textfield.getText().isEmpty()
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
                alert.setContentText("Are you sure do you want update "+
                        manager_planes_id_textfield.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();

                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);

                    Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Updated Successfully ^.^");
                    alert1.showAndWait();
                    ShowPlaneListData();
                   PlaneClear();
                }


            }
        }catch(Exception e){e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }
    }

//    *********************************************************************************************************

    //22222

    Ticket ticket1;
    public ObservableList<Flight> FlightListData(){

        ObservableList<Flight> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM flight";

        connect = Database.connectDb();

        try{

            handler = new FileHandler("logger.log", true);
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();





            try{


            while(result.next()) {

                Flight flight;
                ticket1 = new Ticket(result.getInt("Ticketid"),
                        result.getInt("Ticketprice"),
                        result.getInt("Ticketfine"));

                Airplane airplane1 = null;
                int airplaneid =  result.getInt("Airplaneid");
                for(Airplane airplane : Airplanes){
                    if(airplane.getId()==result.getInt("Airplaneid")){
                        airplane1  = airplane;
                        break;
                    }
                }

                LocalDate date = result.getDate("Date").toLocalDate();
                LocalTime time = result.getTime("Time").toLocalTime();
                FlightStatus status = FlightStatus.valueOf(result.getString("Flightstatus"));
                flight = new Flight(result.getInt("Id"),
                        airplane1,
                        ticket1,
                        result.getString("Fromwhere"),
                        result.getString("Towhere"),
                        date,
                        time,
                        result.getInt("Soldticket"),
                        result.getString("Hours"),
                        status,
                        result.getInt("Airplaneid"),
                        result.getInt("Ticketid"),
                        result.getInt("Ticketprice"),
                        result.getInt("Ticketfine")

                        );
                listData.add(flight);
            }

                }catch(Exception e) {
                e.printStackTrace();
                Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
                logger.addHandler(handler);
                logger.warning("warning message" + e);

            }



        }catch(Exception e){
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }

        return listData;
    }

    public void statusbox(){
        manager_flight_statusCombobox1.setItems( FXCollections.observableArrayList( FlightStatus.values()));
    }

    private ObservableList<Flight> FlightList;
    public void ShowFlightListData(){

String str = "hi";
        FlightList = FlightListData();
        manager_flight_idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        manager_flight_fromCol.setCellValueFactory(new PropertyValueFactory<>("from"));
        manager_flight_toCol.setCellValueFactory(new PropertyValueFactory<>("to"));
        manager_flight_dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        manager_flight_timeCol.setCellValueFactory(new PropertyValueFactory<>("boarding"));
        manager_flight_soldticketsCol.setCellValueFactory(new PropertyValueFactory<>("soldticket"));
        manager_flight_stateCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        manager_flight_planeCol.setCellValueFactory(new PropertyValueFactory<>("airplaneid"));
        manager_flight_ticket_idCol.setCellValueFactory(new PropertyValueFactory<>("ticketid"));
        manager_flight_ticket_priceCol.setCellValueFactory(new PropertyValueFactory<>("ticketprice"));
        manager_flight_ticket_fineCol.setCellValueFactory(new PropertyValueFactory<>("ticketcost"));



//            List<String> status = new ArrayList<>();
//
//            for(String data : FlightStatus){
//                status.add(data);
//            }
//
//            ObservableList listData = FXCollections.observableArrayList(status);
//        manager_flight_statusCombobox1.setItems(listData);



        manager_flights_table.setItems(FlightList);

    }
    
    public void flight_search(){
         
    FilteredList<Flight> filter = new FilteredList<>(FlightList, e -> true);

        manager_flights_search.textProperty().addListener((Observable, oldValue, newValue) -> {

            filter.setPredicate(predicateFlight -> {

                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                String searchKey = newValue.toLowerCase();

                if (predicateFlight.getId().toString().contains(searchKey)) {
                    return true;
                } else if (predicateFlight.getFrom().toLowerCase().contains(searchKey)) {
                    return true;
                } else if (predicateFlight.getTo().toLowerCase().contains(searchKey)) {
                    return true;
                } 
                else {
                    return false;
                }
            });
        });

        SortedList<Flight> sortList = new SortedList<>(filter);

        sortList.comparatorProperty().bind(manager_flights_table.comparatorProperty());
        manager_flights_table.setItems(sortList);
    }

    public void FlightSelect(){

        Flight flight2=  manager_flights_table.getSelectionModel().getSelectedItem();
        int n =  manager_flights_table.getSelectionModel().getSelectedIndex();

        if((n -1)< -1){return;}

        manager_flight_idCol.setText(String.valueOf(flight2.getId()));
        manager_flight_planeCol.setText(String.valueOf(flight2.getAirplane().getId()));
        manager_flight_fromCol.setText(String.valueOf(flight2.getFrom()));
        manager_flight_toCol.setText(String.valueOf(flight2.getTo()));
        manager_flight_ticket_idCol.setText(String.valueOf(flight2.getTicket().getId()));
        manager_flight_ticket_priceCol.setText(String.valueOf(flight2.getTicket().getPrice()));
        manager_flight_ticket_fineCol.setText(String.valueOf(flight2.getTicket().getCost()));
        manager_flight_soldticketsCol.setText(String.valueOf(flight2.getSoldticket()));
        manager_flight_stateCol.setText(String.valueOf(flight2.getStatus()));



//        Flight newflight = new Flight(11,plane2);
//        plane2.setFlightlist(newflight);
//
//        List<Integer> flightsid = new ArrayList<>();
//
//        for(Flight flight : plane2.getFlightlist() ){
//           flightsid.add(flight.getId());
//        }
//
//        ObservableList listData = FXCollections.observableArrayList(flightsid);
//        manager_planes_flightCombobox.setItems(listData);
    }





    public void AddFlight(){


        String sql  = "INSERT INTO flight "
                + "(Id,Airpplaneid,Fromwhere,Towhwre,Ticketid,Ticketprice,Ticketfine,Date,Time,Soldticket,Hours,Status)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

        connect = Database.connectDb();

        try{

            handler = new FileHandler("logger.log", true);

            if( manager_flight_id_textfield.getText().isEmpty()|| manager_flight_plane_textfield.getText().isEmpty()
                    || manager_flight_from_textfield.getText().isEmpty()|| manager_flight_to_textfield.getText().isEmpty()
                    || manager_flight_ticket_fine_textfield.getText().isEmpty()||  manager_flight_ticket_id_textfield.getText().isEmpty()
                    || manager_flight_ticket_price_textfield.getText().isEmpty()|| manager_flight_date_textfield.getText().isEmpty()
                    || manager_flight_time_textfield.getText().isEmpty()|| manager_flight_soldtickets_textfield.getText().isEmpty()
                    || manager_flight_statusCombobox1.getSelectionModel().getSelectedItem()== null
            ){

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blanks");
                alert.showAndWait();

            }else{


                prepare = connect.prepareStatement(sql);
                prepare.setString(1, manager_flight_id_textfield.getText());
                prepare.setString(2, manager_flight_plane_textfield.getText());
                prepare.setString(3,  manager_flight_from_textfield.getText());
                prepare.setString(4,  manager_flight_to_textfield.getText());
                prepare.setString(5,  manager_flight_ticket_id_textfield.getText());
                prepare.setString(6,  manager_flight_ticket_price_textfield.getText());
                prepare.setString(7,  manager_flight_ticket_fine_textfield.getText());
                prepare.setString(8,  manager_flight_date_textfield.getText());
                prepare.setString(9,  manager_flight_time_textfield.getText());
                prepare.setString(10,  manager_flight_soldtickets_textfield.getText());
                prepare.setString(11,  (String) manager_flight_statusCombobox1.getSelectionModel().getSelectedItem());








                prepare.executeUpdate();
                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("Information");
                alert1.setHeaderText("");
                alert1.setContentText("Added successfully");
                alert1.showAndWait();

                ShowFlightListData();
               FlightClear();
            }
        }catch(Exception e){
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }
    }

    public void FlightClear(){

        manager_flight_id_textfield.setText("");
        manager_flight_plane_textfield.setText("");
        manager_flight_from_textfield.setText("");
        manager_flight_to_textfield.setText("");
        manager_flight_ticket_id_textfield.setText("");
        manager_flight_ticket_price_textfield.setText("");
        manager_flight_ticket_fine_textfield.setText("");
        manager_flight_date_textfield.setText("");
        manager_flight_time_textfield.setText("");
        manager_flight_soldtickets_textfield.setText("");
        manager_flight_statusCombobox1.getSelectionModel().getSelectedItem().equals("");





    }

    public void Flightdelete(){

        String sql = "DELETE FROM flight WHERE Id = '"
                +manager_flight_id_textfield.getText()+"'";

        connect = Database.connectDb();

        try{

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confimation ^.^");
            alert.setHeaderText(null);
            alert.setContentText("Are you sure do you want delete flight "+
                    manager_flight_id_textfield.getText()+"?");
            Optional<ButtonType> option = alert.showAndWait();

            if(option.get().equals(ButtonType.OK)){
                statement = connect.createStatement();
                statement.executeUpdate(sql);

                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("INFORMATION ^-^");
                alert1.setHeaderText(null);
                alert1.setContentText("Deleted Successfully ^.^");
                alert1.showAndWait();
                ShowFlightListData();
                FlightClear();
            }

        }catch(Exception e){

            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);


        }
    }

    public void FlightUpdate(){


        String sql = "UPDATE mayor SET Airplaneid = '"
                +manager_flight_plane_textfield.getText()+"' , FromWhere = '"+manager_flight_from_textfield.getText()
                +"' ,Towhere = '"+manager_flight_to_textfield.getText()+"'  ,Ticketid = '"+
                manager_flight_ticket_id_textfield.getText()+"' ,Ticketprice = '"+ manager_flight_ticket_price_textfield.getText()
                +"' ,Ticketfine = '"+manager_flight_ticket_fine_textfield.getText()+"' ,Date = '"
                +manager_flight_date_textfield.getText()
                +"' ,Time = '"+manager_flight_time_textfield.getText()+"',Soldticket = '"+
                manager_flight_soldtickets_textfield.getText()+"',Flightstatus = '"+
                manager_flight_statusCombobox1.getSelectionModel().getSelectedItem()+"' WHERE Id = '"+manager_flight_id_textfield.getText()+"'";

        connect = Database.connectDb();

        try{


            handler = new FileHandler("logger.log", true);

            if( manager_flight_id_textfield.getText().isEmpty()|| manager_flight_plane_textfield.getText().isEmpty()
                    || manager_flight_from_textfield.getText().isEmpty()|| manager_flight_to_textfield.getText().isEmpty()
                    || manager_flight_ticket_fine_textfield.getText().isEmpty()||  manager_flight_ticket_id_textfield.getText().isEmpty()
                    || manager_flight_ticket_price_textfield.getText().isEmpty()|| manager_flight_date_textfield.getText().isEmpty()
                    || manager_flight_time_textfield.getText().isEmpty()|| manager_flight_soldtickets_textfield.getText().isEmpty()
                    || manager_flight_statusCombobox1.getSelectionModel().getSelectedItem()== null
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
                alert.setContentText("Are you sure do you want update "+
                        manager_flight_id_textfield.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();

                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);

                    Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Updated Successfully ^.^");
                    alert1.showAndWait();
                    ShowFlightListData();
                    FlightClear();
                }


            }
        }catch(Exception e){e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);
        }
    }






}



