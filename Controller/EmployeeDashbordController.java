
package Controller;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import Model.*;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class EmployeeDashbordController implements Initializable {

    private ArrayList<Airplane> Airplanes = new ArrayList<Airplane>(20);

    @FXML
    private AnchorPane employee_profile_page;

    @FXML
    private TextField employee_flight_time_textfield;

    @FXML
    private AnchorPane employee_skleton;

    @FXML
    private TableColumn<?, ?> employee_flight_stateCol;

    @FXML
    private Button employee_flight_updateBtn;

    @FXML
    private Button employee_closeBtn;
    @FXML
    private Button employee_profile_clearBtn;
    @FXML
    private Button employee_profile_updateBtn;
    @FXML
    private ComboBox<?> employee_flight_passengersCombox;

    @FXML
    private ComboBox<?> employee_flight_statusCombox1;
    @FXML
    private TextField employee_message_firstlastname_textfield;

    @FXML
    private AnchorPane employee_message_page;

    @FXML
    private Button employee_flight_deleteBtn;

    @FXML
    private TextField employee_flight_from_textfield;

    @FXML
    private TextField employee_flight_id_textfield;

    @FXML
    private Button employee_signout_btn;

    @FXML
    private Button employee_flight_addBtn;

    @FXML
    private Button employee_minimizeBtn;

    @FXML
    private TableColumn<?, ?> employee_profile_idCol;
    @FXML
    private TableColumn<?, ?> employee_profile_firstnameCol;
    @FXML
    private TableColumn<?, ?> employee_profile_lastnameCol;
    @FXML
    private TableColumn<?, ?> employee_profile_usernameCol;
    @FXML
    private TableColumn<?, ?> employee_profile_passwordCol;
    @FXML
    private TableColumn<?, ?> employee_profile_phoneCol;
    @FXML
    private TableColumn<?, ?> employee_profile_addressCol;
    @FXML
    private TableColumn<?, ?> employee_profile_emailCol;
    @FXML
    private TableView<Employee> employee_profile_table;


    @FXML
    private Button employee_message_sendBtn;

    @FXML
    private TextField employee_flight_state_textfield;

    @FXML
    private TextField employee_flight_ticket_price_textfield;

    @FXML
    private TableColumn<?, ?> employee_flight_ticket_fineCol;

    @FXML
    private Button employee_profile_btn;

    @FXML
    private TableColumn<?, ?> employee_flight_idCol;

    @FXML
    private TableColumn<?, ?> employee_flight_toCol;
    @FXML
    private TableColumn<?, ?> employee_flight_fromCol;

    @FXML
    private TableColumn<?, ?> employee_flight_sold_ticketsCol;

    @FXML
    private TableColumn<?, ?> employee_flight_dateCol;

    @FXML
    private Button employee_send_message_btn;

    @FXML
    private TableColumn<?, ?> employee_flight_ticket_priceCol;

    @FXML
    private TextField employee_message_description_textfield;

    @FXML
    private TextField employee_flight_to_textfield;

    @FXML
    private TableColumn<?, ?> employee_flight_timeCol;

    @FXML
    private TextField employee_flight_plane_textfield;

    @FXML
    private TableColumn<?, ?> employee_flight_ticketidCol;

    @FXML
    private TableView<Flight> employee_flight_table;

    @FXML
    private TextField employee_flight_ticket_fine_textfield;

    @FXML
    private AnchorPane employee_flights_page;

    @FXML
    private TextField employee_flight_sold_tickets_textfield;

    @FXML
    private TextField employee_profile_idtextfield;
    @FXML
    private TextField employee_profile_firstnametextfield;
    @FXML
    private TextField employee_profile_lastnametextfield;
    @FXML
    private TextField employee_profile_usernametextfield;
    @FXML
    private TextField employee_profile_passwordtextfield;
    @FXML
    private TextField employee_profile_phonetextfield;
    @FXML
    private TextField employee_profile_addresstextfield;
    @FXML
    private TextField employee_profile_emailtextfield;


    @FXML
    private Button employee_flights_btn;

    @FXML
    private TableColumn<?, ?> employee_flight_planeCol;

    @FXML
    private TextField employee_flight_ticket_id_textfield;

    @FXML
    private Button employee_flight_clearBtn;

    @FXML
    private TextField employee_flight_date_textfield;

    FileHandler handler;
    private double x = 0;
    private double y = 0;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ShowEmployeeListData();
        ShowFlightListData();
        statusbox();


    }


    @FXML
    private void close(ActionEvent event) {

        System.exit(0);
    }

    @FXML
    private void minimize(ActionEvent event) {

        Stage stage = (Stage) employee_skleton.getScene().getWindow();
        stage.setIconified(true);
    }

    public void switchPage(ActionEvent event) {

        if (event.getSource() == employee_profile_btn) {
            employee_profile_page.setVisible(true);
            employee_message_page.setVisible(false);
            employee_flights_page.setVisible(false);


        } else if (event.getSource() == employee_send_message_btn) {
            employee_profile_page.setVisible(false);
            employee_message_page.setVisible(true);
            employee_flights_page.setVisible(false);

        } else if (event.getSource() == employee_flights_btn) {
            employee_profile_page.setVisible(false);
            employee_message_page.setVisible(false);
            employee_flights_page.setVisible(true);

        }
    }


    public void signOut_employee() {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to sign out?");
        Optional<ButtonType> option = alert.showAndWait();
        try {

            handler = new FileHandler("logger.log", true);

            if (option.get().equals(ButtonType.OK)) {

                employee_signout_btn.getScene().getWindow().hide();
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


    private Connection connect;
    private Statement statement;
    private PreparedStatement prepare;
    private ResultSet result;

    public ObservableList<Employee> EmployeeListData() {

        ObservableList<Employee> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM employee";

        connect = Database.connectDb();

        try {

            handler = new FileHandler("logger.log", true);
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            Employee employee;

            while (result.next()) {
                employee = new Employee(result.getInt("Id"),
                        result.getString("First_name"),
                        result.getString("Last_name"),
                        result.getString("User_name"),
                        result.getString("Password"),
                        result.getString("Phone_no"),
                        result.getString("Address"),
                        result.getString("Email"),
                        result.getDouble("Salary"));


                if (employee.getPassword().equals(Employee.employeeArrayList.get(1)) && employee.getUsername().equals(Employee.employeeArrayList.get(0))) {
                    listData.add(employee);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message" + e);
        }

        return listData;
    }

    private ObservableList<Employee> EmployeeList;

    public void ShowEmployeeListData() {

        EmployeeList = EmployeeListData();
        employee_profile_idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        employee_profile_firstnameCol.setCellValueFactory(new PropertyValueFactory<>("firstname"));
        employee_profile_lastnameCol.setCellValueFactory(new PropertyValueFactory<>("lastname"));
        employee_profile_usernameCol.setCellValueFactory(new PropertyValueFactory<>("username"));
        employee_profile_passwordCol.setCellValueFactory(new PropertyValueFactory<>("password"));
        employee_profile_phoneCol.setCellValueFactory(new PropertyValueFactory<>("phonenumber"));
        employee_profile_addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        employee_profile_emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));

        employee_profile_table.setItems(EmployeeList);

    }

    public void EmployeeSelect() {

        Employee employee2 = employee_profile_table.getSelectionModel().getSelectedItem();
        int n = employee_profile_table.getSelectionModel().getSelectedIndex();

        if ((n - 1) < -1) {
            return;
        }

        employee_profile_idtextfield.setText(String.valueOf(employee2.getId()));
        employee_profile_firstnametextfield.setText(employee2.getFirstname());
        employee_profile_lastnametextfield.setText(employee2.getLastname());
        employee_profile_usernametextfield.setText(String.valueOf(employee2.getUsername()));
        employee_profile_passwordtextfield.setText(String.valueOf(employee2.getPassword()));
        employee_profile_phonetextfield.setText(String.valueOf(employee2.getPhonenumber()));
        employee_profile_addresstextfield.setText(String.valueOf(employee2.getAddress()));
        employee_profile_emailtextfield.setText(String.valueOf(employee2.getEmail()));

    }

    public void EmployeeClear() {

        employee_profile_idtextfield.setText("");
        employee_profile_firstnametextfield.setText("");
        employee_profile_lastnametextfield.setText("");
        employee_profile_usernametextfield.setText("");
        employee_profile_passwordtextfield.setText("");
        employee_profile_phonetextfield.setText("");
        employee_profile_addresstextfield.setText("");
        employee_profile_emailtextfield.setText("");

    }

    public void EmployeeUpdate() {


        String sql = "UPDATE employee SET First_name = '" + employee_profile_firstnametextfield.getText()
                + "' ,Last_name = '" + employee_profile_lastnametextfield.getText() + "' ,User_name= '" +
                employee_profile_usernametextfield.getText() + "',Password = '" + employee_profile_passwordtextfield.getText() + "' ,Phone_no = '" +
                employee_profile_phonetextfield.getText() + "' ,Address = '" + employee_profile_addresstextfield.getText()
                + "' ,Email = '" + employee_profile_emailtextfield.getText() + "' WHERE Id = '" + employee_profile_idtextfield.getText() + "'";

        connect = Database.connectDb();

        try {


            handler = new FileHandler("logger.log", true);

            if (employee_profile_idtextfield.getText().isEmpty() || employee_profile_firstnametextfield.getText().isEmpty()
                    || employee_profile_lastnametextfield.getText().isEmpty() || employee_profile_usernametextfield.getText().isEmpty()
                    || employee_profile_passwordtextfield.getText().isEmpty()
                    || employee_profile_phonetextfield.getText().isEmpty() || employee_profile_addresstextfield.getText().isEmpty()
                    || employee_profile_emailtextfield.getText().isEmpty()


            ) {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blanks");
                alert.showAndWait();
            } else if (!regexemail(employee_profile_emailtextfield.getText())) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real email !");
                alert.showAndWait();

            } else if (!regexphonenumber(employee_profile_phonetextfield.getText())) {
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
                        employee_profile_idtextfield.getText() + "?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
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


//**********************************************************************************************************


    Ticket ticket1;

    public ObservableList<Flight> FlightListData() {

        ObservableList<Flight> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM flight";

        connect = Database.connectDb();

        try {

            handler = new FileHandler("logger.log", true);
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();


            try {


                while (result.next()) {

                    Airplane airplane1 = null;
                    for (Airplane airplane : Airplane.getAirplanelist()) {
                        if (airplane.getId() == result.getInt("Airplaneid")) {
                            airplane1 = airplane;
                            break;
                        }
                    }

                    Flight flight;
                    ticket1 = new Ticket(result.getInt("Ticketid"),
                            result.getInt("Ticketprice"),
                            result.getInt("Ticketfine"));



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
                            status,
                            result.getInt("Airplaneid"),
                            result.getInt("Ticketid"),
                            result.getInt("Ticketprice"),
                            result.getInt("Ticketfine")

                    );
                    listData.add(flight);
                }

            } catch (Exception e) {
                e.printStackTrace();
                Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
                logger.addHandler(handler);
                logger.warning("warning message" + e);

            }


        } catch (Exception e) {
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message" + e);
        }

        return listData;
    }

    public void statusbox() {

        List<Enum> state = new ArrayList<>();

        for (Enum data : FlightStatus.values()) {
            state.add(data);
        }

        ObservableList listData = FXCollections.observableArrayList(state);
        employee_flight_statusCombox1.setItems(listData);

    }

    private ObservableList<Flight> FlightList;

    public void ShowFlightListData() {


        FlightList = FlightListData();
        employee_flight_idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        employee_flight_fromCol.setCellValueFactory(new PropertyValueFactory<>("from"));
        employee_flight_toCol.setCellValueFactory(new PropertyValueFactory<>("to"));
        employee_flight_dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        employee_flight_timeCol.setCellValueFactory(new PropertyValueFactory<>("boarding"));
        employee_flight_sold_ticketsCol.setCellValueFactory(new PropertyValueFactory<>("soldticket"));
        employee_flight_stateCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        employee_flight_planeCol.setCellValueFactory(new PropertyValueFactory<>("airplaneid"));
        employee_flight_ticketidCol.setCellValueFactory(new PropertyValueFactory<>("ticketid"));
        employee_flight_ticket_priceCol.setCellValueFactory(new PropertyValueFactory<>("ticketprice"));
        employee_flight_ticket_fineCol.setCellValueFactory(new PropertyValueFactory<>("ticketcost"));


        employee_flight_table.setItems(FlightList);

    }

    public void FlightSelect() {

        Flight flight2 = employee_flight_table.getSelectionModel().getSelectedItem();
        int n = employee_flight_table.getSelectionModel().getSelectedIndex();

        if ((n - 1) < -1) {
            return;
        }

        employee_flight_id_textfield.setText(String.valueOf(flight2.getId()));
        employee_flight_from_textfield.setText(String.valueOf(flight2.getFrom()));
        employee_flight_to_textfield.setText(String.valueOf(flight2.getTo()));
        employee_flight_date_textfield.setText(String.valueOf(flight2.getDate()));
        employee_flight_time_textfield.setText(String.valueOf(flight2.getBoarding()));
        employee_flight_sold_tickets_textfield.setText(String.valueOf(flight2.getSoldticket()));
        employee_flight_plane_textfield.setText(String.valueOf(flight2.getAirplaneid()));
        employee_flight_ticket_id_textfield.setText(String.valueOf(flight2.getTicketid()));
        employee_flight_ticket_price_textfield.setText(String.valueOf(flight2.getTicketprice()));
        employee_flight_ticket_fine_textfield.setText(String.valueOf(flight2.getTicketcost()));

//        employee_flight_statusCombox1.getSelectionModel().getSelectedItem().equals(String.valueOf(flight2.getStatus()));
    }

    public void FlightClear() {

        employee_flight_id_textfield.setText("");
        employee_flight_from_textfield.setText("");
        employee_flight_to_textfield.setText("");
        employee_flight_date_textfield.setText("");
        employee_flight_time_textfield.setText("");
        employee_flight_sold_tickets_textfield.setText("");
        employee_flight_plane_textfield.setText("");
        employee_flight_ticket_id_textfield.setText("");
        employee_flight_ticket_price_textfield.setText("");
        employee_flight_ticket_fine_textfield.setText("");


//        employee_flight_statusCombox1.getSelectionModel().getSelectedItem().equals("");


    }

    public void FlightUpdate(){


        String sql = "UPDATE flight SET FromWhere = '"+employee_flight_from_textfield.getText()
                +"' ,Towhere = '"+employee_flight_to_textfield.getText()+"' ,Date = '"
                +employee_flight_date_textfield.getText()
                +"' ,Time = '"+employee_flight_time_textfield.getText()+"',Soldticket = '"+
                employee_flight_sold_tickets_textfield.getText()+"',Flightstatus = '"+
                employee_flight_statusCombox1.getSelectionModel().getSelectedItem()+"',Airplaneid = '"
                              + employee_flight_plane_textfield.getText()+"'  ,Ticketid = '"+
                                employee_flight_ticket_id_textfield.getText()+"' ,Ticketprice = '"+ employee_flight_ticket_price_textfield.getText()
                             +"'  ,Ticketfine = '"+employee_flight_ticket_fine_textfield.getText()+"'  WHERE Id = '" +employee_flight_id_textfield.getText()+"'";

        connect = Database.connectDb();

        try{


            handler = new FileHandler("logger.log", true);

            if(employee_flight_id_textfield.getText().isEmpty()|| employee_flight_plane_textfield.getText().isEmpty()
                    ||employee_flight_from_textfield.getText().isEmpty()||employee_flight_to_textfield.getText().isEmpty()
                    || employee_flight_ticket_fine_textfield.getText().isEmpty()||  employee_flight_ticket_id_textfield.getText().isEmpty()
                    || employee_flight_ticket_price_textfield.getText().isEmpty()|| employee_flight_date_textfield.getText().isEmpty()
                    || employee_flight_time_textfield.getText().isEmpty()|| employee_flight_sold_tickets_textfield.getText().isEmpty()
                    || employee_flight_statusCombox1.getSelectionModel().getSelectedItem()== null
            ){

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blanks  correctly");
                alert.showAndWait();
            }else{
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want update "+
                        employee_flight_id_textfield.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();

                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);

                    for (int i=0; i<Airplane.getAirplanelist().size();i++) {
                        Airplane newairplane = Airplane.getAirplanelist().get(i);
                        int airid = Integer.parseInt(employee_flight_plane_textfield.getText());
                        int airflightid = Integer.parseInt(employee_flight_id_textfield.getText());
                        if (Airplane.getAirplanelist().get(i).getId() == airid) {
                            Airplane.getAirplanelist().get(i).getFlightlistid().add(airflightid);

                        }

                    }

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


    public void AddFlight(){


        String sql  = "INSERT INTO flight "
                + "(Id,Fromwhere,Towhere,Date,Time,Soldticket,Hours,Flightstatus,Airplaneid,Ticketid,Ticketprice,Ticketfine)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

        connect = Database.connectDb();

        try{

            handler = new FileHandler("logger.log", true);

            if(employee_flight_id_textfield.getText().isEmpty()|| employee_flight_plane_textfield.getText().isEmpty()
                    ||employee_flight_from_textfield.getText().isEmpty()||employee_flight_to_textfield.getText().isEmpty()
                    || employee_flight_ticket_fine_textfield.getText().isEmpty()||  employee_flight_ticket_id_textfield.getText().isEmpty()
                    || employee_flight_ticket_price_textfield.getText().isEmpty()|| employee_flight_date_textfield.getText().isEmpty()
                    || employee_flight_time_textfield.getText().isEmpty()|| employee_flight_sold_tickets_textfield.getText().isEmpty()
                    || employee_flight_statusCombox1.getSelectionModel().getSelectedItem()== null
            ){

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blanks  correctly");
                alert.showAndWait();

            }else{


                prepare = connect.prepareStatement(sql);
                prepare.setString(1, employee_flight_id_textfield.getText());
                prepare.setString(2, employee_flight_from_textfield.getText());
                prepare.setString(3,employee_flight_to_textfield.getText());
                prepare.setString(4, employee_flight_date_textfield.getText());
                prepare.setString(5,employee_flight_time_textfield.getText());
                prepare.setString(6, employee_flight_sold_tickets_textfield.getText());
                prepare.setDouble(7, 2);
                prepare.setString(8, String.valueOf(employee_flight_statusCombox1.getSelectionModel().getSelectedItem()));
                prepare.setString(9,employee_flight_plane_textfield.getText());
                prepare.setString(10,employee_flight_ticket_id_textfield.getText());
                prepare.setString(11,employee_flight_ticket_price_textfield.getText());
                prepare.setString(12,employee_flight_ticket_fine_textfield.getText());



                for (int i=0; i<Airplane.getAirplanelist().size();i++) {
                    Airplane newairplane = Airplane.getAirplanelist().get(i);
                    int airid = Integer.parseInt(employee_flight_plane_textfield.getText());
                    int airflightid = Integer.parseInt(employee_flight_id_textfield.getText());
                    if (Airplane.getAirplanelist().get(i).getId() == airid) {
                        Airplane.getAirplanelist().get(i).getFlightlistid().add( airflightid);

                    }

                }

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

    public void Flightdelete(){

        String sql = "DELETE FROM flight WHERE Id = '"
                +employee_flight_id_textfield.getText()+"'";

        connect = Database.connectDb();

        try{

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confimation ^.^");
            alert.setHeaderText(null);
            alert.setContentText("Are you sure do you want delete flight "+
                    employee_flight_id_textfield.getText()+"?");
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

//    public boolean checkplane(){
//        for(int i=0; i<Airplane.getAirplanelist().size();i++){
//            Airplane airplane = Airplane.getAirplanelist().get(i);
//            if(employee_flight_plane_textfield.getText().equals(String.valueOf(airplane.getId()))){
//                return true;
//            }
//
//        }
//        return false;
//    }
//********************************************************************************

    public void sendMessage() {

        if (employee_message_firstlastname_textfield.getText().isEmpty() ||employee_message_description_textfield.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please Please fill all the blanks");
            alert.showAndWait();

        } else {




            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confimation ^.^");
            alert.setHeaderText(null);
            alert.setContentText("Are you sure do you want send " +
                    "?");
            Optional<ButtonType> option = alert.showAndWait();

            if (option.get().equals(ButtonType.OK)) {
//                statement = connect.createStatement();
//                statement.executeUpdate(sql);

                Employee.getEmployeemessage().add(employee_message_firstlastname_textfield.getText());
                Employee.getEmployeemessage().add(employee_message_description_textfield.getText());


                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("INFORMATION ^-^");
                alert1.setHeaderText(null);
                alert1.setContentText(" Successfully ^.^");
                alert1.showAndWait();
                EmployeeMessageClear();

            }

       }
        }


    public void EmployeeMessageClear() {

        employee_message_firstlastname_textfield.setText("");
        employee_message_description_textfield.setText("");

    }
}


