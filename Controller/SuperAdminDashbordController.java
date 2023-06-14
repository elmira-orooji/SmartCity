
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;



public class SuperAdminDashbordController implements Initializable {
    
     @FXML
    private Button superadmin_employees_clearBtn;

    @FXML
    private TableColumn<?, ?> superadmin_employees_salaryCol;

    @FXML
    private AnchorPane superadmin_passengers_page1;

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
    private TableView<?> superadmin_financial_employees_table;

    @FXML
    private TableView<?> superadmin_manager_table;

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
    private AnchorPane superadmin_financial_page;

    @FXML
    private TextField superadmin_setting_addresstextfield;

    @FXML
    private TextField superadmin_setting_phonetextfield;

    @FXML
    private TextField superadmin_manager_emailtextfield;

    @FXML
    private Label superadmin_reports_canceledflightnumber;

    @FXML
    private TableView<?> superadmin_employees_table;

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
    private AnchorPane superadmin_manager_page;

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
    private TableView<?> superadmin_financial_passengers_table;

    @FXML
    private Button close;

    @FXML
    private Button minimize;

    @FXML
    private TextField superadmin_employees_addresstextfield;

    @FXML
    private TableColumn<?, ?> superadmin_setting_firstnameCol;

    @FXML
    private TableView<?> superadmin_passenger_table;

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
    private TableView<?> superadmin_financial_manager_table;

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
    private AnchorPane superadmin_reports_page;

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
    private AnchorPane superadmin_setting_page;

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
    private Button superadmin_signoutBtn;
    
    
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
