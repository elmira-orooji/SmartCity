
package Controller;

import Model.Airplane;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.collections.FXCollections.observableList;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;


public class ManagerDashbordController implements Initializable {
    
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
    private TableView<?> manager_passengers_table;

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
    private TableView<?> manager_flights_table;

    @FXML
    private Button manager_passengers_deleteBtn;

    @FXML
    private TableView<?> manager_employees_table;

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
    private TableView<?> manager_setting_table;

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
    private TableView<?> manager_planes_table;
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
