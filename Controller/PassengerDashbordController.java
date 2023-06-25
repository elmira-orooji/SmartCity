
package Controller;

import java.io.PrintWriter;
import java.io.StringWriter;
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
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class PassengerDashbordController implements Initializable {

    @FXML
    private TableColumn<?, ?> passenger_profile_idCol;

    @FXML
    private TableColumn<?, ?> passenger_buy_ticket_flightidCol;

    @FXML
    private Button passenger_walletBtn;

    @FXML
    private TextField passenger_profile_firstname_textfield;

    @FXML
    private Button passenger_wallet_addstockBtn;

    @FXML
    private Button passenger_profileBtn;

    @FXML
    private TableColumn<?, ?> passenger_buy_ticket_dateCol;

    @FXML
    private TableColumn<?, ?> passenger_profile_lastnameCol;

    @FXML
    private TextField passenger_profile_id_textfield;

    @FXML
    private TableView<Flight> passenger_buy_ticket_table;

    @FXML
    private AnchorPane passenger_buy_ticket_page;

    @FXML
    private TextField passenger_profile_username_textfield;

    @FXML
    private TableColumn<?, ?> passenger_profile_addressCol;

    @FXML
    private TableColumn<?, ?> passenger_buy_ticket_timeCol;

    @FXML
    private Button passenger_close;

    @FXML
    private TextField passenger_profile_email_textfield;

    @FXML
    private AnchorPane passenger_wallet_page;

    @FXML
    private TableColumn<?, ?> passenger_profile_emailCol;

    @FXML
    private Button passenger_buy_ticket_buyBtn;

    @FXML
    private TableColumn<?, ?> passenger_buy_ticket_fromCol;

    @FXML
    private AnchorPane passenger_profile_page;

    @FXML
    private TableColumn<?, ?> passenger_profile_usernameCol;

    @FXML
    private Button passenger_profile_updateBtn;

    @FXML
    private TableColumn<?, ?> passenger_buy_ticket_fineCol;

    @FXML
    private Button passenger_buy_ticket_Btn;

    @FXML
    private TextField passenger_profile_address_textfield;

    @FXML
    private TableColumn<?, ?> passenger_buy_ticket_priceCol;

    @FXML
    private Button passenger_minimize;

    @FXML
    private TableColumn<?, ?> passenger_profile_passwordCol;

    @FXML
    private TextField passenger_wallet_currentstock_textfield;

    @FXML
    private AnchorPane passenger_skleton;

    @FXML
    private TableColumn<?, ?> passenger_buy_ticket_planeCol;

    @FXML
    private TextField passenger_wallet_addstock_textfield;

    @FXML
    private TableColumn<?, ?> passenger_buy_ticket_stateCol;

    @FXML
    private Button passenger_profile_clearBtn;

    @FXML
    private TextField passenger_message_firstlastname_textfield;

    @FXML
    private TextField passenger_profile_phone_textfield;

    @FXML
    private TableColumn<?, ?> passenger_buy_ticket_capacityCol;

    @FXML
    private TableView<Passenger> passenger_profile_table;

    @FXML
    private TableColumn<?, ?> passenger_profile_firstnameCol;

    @FXML
    private TableColumn<?, ?> passenger_buy_ticket_toCol;

    @FXML
    private Button passenger_message_sendBtn;

    @FXML
    private AnchorPane passenger_send_message_page;

    @FXML
    private TableColumn<?, ?> passenger_profile_phoneCol;

    @FXML
    private Button passenger_send_message_Btn;
    @FXML
    private Button passenger_signout_btn;

    @FXML
    private TextField passenger_message_description_textfield;

    @FXML
    private TextField passenger_profile_lastname_textfield;

    @FXML
    private TextField passenger_profile_password_textfield;

    @FXML
    private TableColumn<?, ?> passenger_buy_ticket_ticketidCol;
    FileHandler handler;
    private double x = 0;
    private double y = 0;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ShowPassengerListData();
        ShowFlightListData();
        ShowPassengerWalletListData();


    }

    @FXML
    private void close(ActionEvent event) {

        System.exit(0);
    }

    @FXML
    private void minimize(ActionEvent event) {

        Stage stage = (Stage) passenger_skleton.getScene().getWindow();
        stage.setIconified(true);
    }

    public void switchPage(ActionEvent event) {

        if (event.getSource() == passenger_profileBtn) {
            passenger_profile_page.setVisible(true);
            passenger_wallet_page.setVisible(false);
            passenger_buy_ticket_page.setVisible(false);
            passenger_send_message_page.setVisible(false);


        } else if (event.getSource() == passenger_walletBtn) {
            passenger_profile_page.setVisible(false);
            passenger_wallet_page.setVisible(true);
            passenger_buy_ticket_page.setVisible(false);
            passenger_send_message_page.setVisible(false);

        } else if (event.getSource() == passenger_buy_ticket_Btn) {
            passenger_profile_page.setVisible(false);
            passenger_wallet_page.setVisible(false);
            passenger_buy_ticket_page.setVisible(true);
            passenger_send_message_page.setVisible(false);

        } else if (event.getSource() == passenger_send_message_Btn) {
            passenger_profile_page.setVisible(false);
            passenger_wallet_page.setVisible(false);
            passenger_buy_ticket_page.setVisible(false);
            passenger_send_message_page.setVisible(true);

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

                passenger_signout_btn.getScene().getWindow().hide();
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

    public ObservableList<Passenger> PassengerListData() {

        ObservableList<Passenger> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM passenger";

        connect = Database.connectDb();

        try {

            handler = new FileHandler("logger.log", true);
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            Passenger passenger;

            while (result.next()) {
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

                if (passenger.getPassword().equals(Passenger.passengerArrayList.get(1)) && passenger.getUsername().equals(Passenger.passengerArrayList.get(0))) {
                    listData.add(passenger);
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


    private ObservableList<Passenger> PassengerwalletList;


    public void ShowPassengerListData() {

        PassengerwalletList = PassengerListData();
        passenger_profile_idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        passenger_profile_firstnameCol.setCellValueFactory(new PropertyValueFactory<>("firstname"));
        passenger_profile_lastnameCol.setCellValueFactory(new PropertyValueFactory<>("lastname"));
        passenger_profile_usernameCol.setCellValueFactory(new PropertyValueFactory<>("username"));
        passenger_profile_passwordCol.setCellValueFactory(new PropertyValueFactory<>("password"));
        passenger_profile_phoneCol.setCellValueFactory(new PropertyValueFactory<>("phonenumber"));
        passenger_profile_addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
        passenger_profile_emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));

        passenger_profile_table.setItems(PassengerwalletList);

    }

    public void PassengerSelect() {

        Passenger passenger2 = passenger_profile_table.getSelectionModel().getSelectedItem();
        int n = passenger_profile_table.getSelectionModel().getSelectedIndex();

        if ((n - 1) < -1) {
            return;
        }

        passenger_profile_id_textfield.setText(String.valueOf(passenger2.getId()));
        passenger_profile_firstname_textfield.setText(passenger2.getFirstname());
        passenger_profile_lastname_textfield.setText(passenger2.getLastname());
        passenger_profile_username_textfield.setText(String.valueOf(passenger2.getUsername()));
        passenger_profile_password_textfield.setText(String.valueOf(passenger2.getPassword()));
        passenger_profile_phone_textfield.setText(String.valueOf(passenger2.getPhonenumber()));
        passenger_profile_address_textfield.setText(String.valueOf(passenger2.getAddress()));
        passenger_profile_email_textfield.setText(String.valueOf(passenger2.getEmail()));

    }


    public void PassengerClear() {

        passenger_profile_id_textfield.setText("");
        passenger_profile_firstname_textfield.setText("");
        passenger_profile_lastname_textfield.setText("");
        passenger_profile_username_textfield.setText("");
        passenger_profile_password_textfield.setText("");
        passenger_profile_phone_textfield.setText("");
        passenger_profile_address_textfield.setText("");
        passenger_profile_email_textfield.setText("");

    }

    public void PassengerUpdate() {


        String sql = "UPDATE passenger SET First_name = '" + passenger_profile_firstname_textfield.getText()
                + "' ,Last_name = '" + passenger_profile_lastname_textfield.getText() + "' ,User_name= '" +
                passenger_profile_username_textfield.getText() + "',Password = '" + passenger_profile_password_textfield.getText() + "' ,Phone_no = '" +
                passenger_profile_phone_textfield.getText() + "' ,Address = '" + passenger_profile_address_textfield.getText()
                + "' ,Email = '" + passenger_profile_email_textfield.getText() + "' WHERE Id = '" + passenger_profile_id_textfield.getText() + "'";

        connect = Database.connectDb();

        try {


            handler = new FileHandler("logger.log", true);

            if (passenger_profile_id_textfield.getText().isEmpty() || passenger_profile_firstname_textfield.getText().isEmpty()
                    || passenger_profile_lastname_textfield.getText().isEmpty() || passenger_profile_password_textfield.getText().isEmpty()
                    || passenger_profile_username_textfield.getText().isEmpty()
                    || passenger_profile_phone_textfield.getText().isEmpty() || passenger_profile_email_textfield.getText().isEmpty()
                    || passenger_profile_id_textfield.getText().isEmpty()


            ) {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the blanks");
                alert.showAndWait();
            } else if (!regexemail(passenger_profile_email_textfield.getText())) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please enter a real email !");
                alert.showAndWait();

            } else if (!regexphonenumber(passenger_profile_phone_textfield.getText())) {
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
                        passenger_profile_id_textfield.getText() + "?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
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
                    Flight.getFlightlist().addAll(listData);
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

    private ObservableList<Flight> FlightList;

    public void ShowFlightListData() {


        FlightList = FlightListData();
        passenger_buy_ticket_flightidCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        passenger_buy_ticket_fromCol.setCellValueFactory(new PropertyValueFactory<>("from"));
        passenger_buy_ticket_toCol.setCellValueFactory(new PropertyValueFactory<>("to"));
        passenger_buy_ticket_dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        passenger_buy_ticket_timeCol.setCellValueFactory(new PropertyValueFactory<>("boarding"));
        passenger_buy_ticket_capacityCol.setCellValueFactory(new PropertyValueFactory<>("soldticket"));
        passenger_buy_ticket_stateCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        passenger_buy_ticket_planeCol.setCellValueFactory(new PropertyValueFactory<>("airplaneid"));
        passenger_buy_ticket_ticketidCol.setCellValueFactory(new PropertyValueFactory<>("ticketid"));
        passenger_buy_ticket_priceCol.setCellValueFactory(new PropertyValueFactory<>("ticketprice"));
        passenger_buy_ticket_fineCol.setCellValueFactory(new PropertyValueFactory<>("ticketcost"));


        passenger_buy_ticket_table.setItems(FlightList);

    }

    public boolean FlightSelect() {

        Flight flight2 = passenger_buy_ticket_table.getSelectionModel().getSelectedItem();
        int n = passenger_buy_ticket_table.getSelectionModel().getSelectedIndex();

        if ((n - 1) < -1) {
            return false;
        }
        return true;
    }

    public void Buyticket() {

        if (!FlightSelect()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please choose");
            alert.showAndWait();

        } else {

            Flight flight2 = passenger_buy_ticket_table.getSelectionModel().getSelectedItem();
            Ticket ticket2 = flight2.getTicket();
            Passenger passenger2 = PassengerListData().get(0);
            if (passenger2.getWallet() < ticket2.getPrice()) {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Please charge your wallet");
                alert.showAndWait();
            } else {

                passenger2.setWallet(passenger2.getWallet() - ticket2.getPrice());
                passenger2.setBoughtticket(passenger2.getBoughtticket() + 1);
                flight2.setSoldticket(flight2.getSoldticket() + 1);


                String sql = "UPDATE passenger SET Wallet  = '" + passenger2.getWallet()
                        + "', Tickets  = '" + passenger2.getBoughtticket() +
                        "'   WHERE Id = '" + passenger2.getId() + "'";


                connect = Database.connectDb();

                try {


                    handler = new FileHandler("logger.log", true);

                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Confimation ^.^");
                    alert.setHeaderText(null);
                    alert.setContentText("Are you sure do you want buy " +
                            flight2.getId() + "?");
                    Optional<ButtonType> option = alert.showAndWait();

                    if (option.get().equals(ButtonType.OK)) {
                        statement = connect.createStatement();
                        statement.executeUpdate(sql);
                        updateflight(flight2);


//                        System.out.println(Flight.getFlightlist().size());
//                        for(int i=0;i<Flight.getFlightlist().size();i++){
//                            if(Flight.getFlightlist().get(i).getId() == flight2.getId()){
//                                Flight.getFlightlist().get(i).getPassengerlist().add(passenger2);
//                            }
//                        }
//
//
//
//                        System.out.println(Flight.getFlightlist().size());


                        Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                        alert1.setTitle("INFORMATION ^-^");
                        alert1.setHeaderText(null);
                        alert1.setContentText(" Successfully ^.^");
                        alert1.showAndWait();
                        ShowFlightListData();
                        ShowPassengerWalletListData();

                    }

                } catch (Exception e) {
                    e.printStackTrace();
                    Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
                    logger.addHandler(handler);
                    logger.warning("warning message" + e);


                }


            }


        }
    }

    public void updateflight(Flight flight2) {


        String sql = "UPDATE flight SET Soldticket   = '" + flight2.getSoldticket()
                + "' WHERE Id = '" + flight2.getId() + "'";

        connect = Database.connectDb();

        try {


            handler = new FileHandler("logger.log", true);


            statement = connect.createStatement();
            statement.executeUpdate(sql);
            ShowFlightListData();
        } catch (Exception e) {
            e.printStackTrace();
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message" + e);


        }
    }


//    ********************************************************************************

    public void ShowPassengerWalletListData() {

        PassengerwalletList = PassengerListData();

        Passenger passenger = PassengerwalletList.get(0);
        passenger_wallet_currentstock_textfield.setText(String.valueOf(passenger.getWallet()));

    }

    public void addStock() {

        if (passenger_wallet_addstock_textfield.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please Please fill the blank");
            alert.showAndWait();

        } else {

            Passenger passenger2 = PassengerListData().get(0);
            double add = Double.parseDouble(passenger_wallet_addstock_textfield.getText());


            passenger2.setWallet(passenger2.getWallet() + add);


            String sql = "UPDATE passenger SET Wallet  = '" + passenger2.getWallet()
                    + "', Tickets  = '" + passenger2.getBoughtticket() +
                    "'   WHERE Id = '" + passenger2.getId() + "'";


            connect = Database.connectDb();

            try {


                handler = new FileHandler("logger.log", true);

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want add " +
                        add + "?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get().equals(ButtonType.OK)) {
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);


                    Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText(" Successfully ^.^");
                    alert1.showAndWait();
                    ShowPassengerWalletListData();
                    PassengerStockClear();

                }

            } catch (Exception e) {
                e.printStackTrace();
                Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
                logger.addHandler(handler);
                logger.warning("warning message" + e);


            }


        }


    }

    public void PassengerStockClear() {

        passenger_wallet_addstock_textfield.setText("");


    }

    //*********************************************************************************
    public void sendMessage() {

        if (passenger_message_firstlastname_textfield.getText().isEmpty() || passenger_message_description_textfield.getText().isEmpty()) {
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

                Passenger.getPassengermessage().add(passenger_message_firstlastname_textfield.getText());
                Passenger.getPassengermessage().add(passenger_message_description_textfield.getText());


                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("INFORMATION ^-^");
                alert1.setHeaderText(null);
                alert1.setContentText(" Successfully ^.^");
                alert1.showAndWait();
                PassengerMessageClear();

            }


        }
    }

    public void PassengerMessageClear() {

        passenger_message_firstlastname_textfield.setText("");
        passenger_message_description_textfield.setText("");

    }
}

