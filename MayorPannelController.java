
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;
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


public class MayorPannelController implements Initializable {

    
    @FXML
    private AnchorPane Skeleton_mayorpannel;
    
    @FXML
    private Button AirportBtn;
     
    @FXML
    private Button HospitalBtn;
      
    @FXML
    private Button UniversityBtn;
       
    @FXML
    private Button LibraryBtn;
    
    @FXML
    private Button LanguageBtn;
    
    @FXML
    private Button minimizeBtn_Language;

    @FXML
    private TableColumn<?, ?> Hospital_col_code;

    @FXML
    private Button AddBtn_hospital;

    @FXML
    private TableColumn<?, ?> Library_col_employees;

    @FXML
    private TableColumn<?, ?> Library_col_membership;

    @FXML
    private TableColumn<?, ?> Airport_col_employees;

    @FXML
    private TableColumn<?, ?> Library_col_code;

    @FXML
    private TextField University_field_faculties;

    @FXML
    private Button UpdateBtn_hospital;

    @FXML
    private Button ClearBtn_Library;

    @FXML
    private TableColumn<?, ?> Airport_col_workhours;

    @FXML
    private TableColumn<?, ?> Language_col_teachers;

    @FXML
    private TableColumn<?, ?> Hospital_col_section;

    @FXML
    private Button minimizeBtn_Airport;

    @FXML
    private TableColumn<?, ?> Airport_col_code;

    @FXML
    private TextField Airport_field__name;

    @FXML
    private Button closeBtn_Hospital;

    @FXML
    private TextField Library_field_employees;

    @FXML
    private TextField Library_field_work_hours;

    @FXML
    private TableColumn<?, ?> University_col_faculties;

    @FXML
    private TextField Hospital_field_name;

    @FXML
    private TableColumn<?, ?> University_col_code;

    @FXML
    private TextField Library_field_code;

    @FXML
    private TextField Language_field_name;

    @FXML
    private TableView<Airport> Airport_table;

    @FXML
    private TableView<LanguageInstitute> Language_table;

    @FXML
    private TextField University_field_work_hour;

    @FXML
    private TextField Hospital_field_work_hour;

    @FXML
    private Button AddBtn_Library;

    @FXML
    private TableColumn<?, ?> University_col_address;

    @FXML
    private AnchorPane Library_page;

    @FXML
    private TableColumn<?, ?> Language_col_code;

    @FXML
    private TableColumn<?, ?> University_col_employees;

    @FXML
    private Button DeleteBtn_airport;

    @FXML
    private TextField Hospital_field_section;

    @FXML
    private Button AddBtn_airport;

    @FXML
    private TableColumn<?, ?> Language_col_workhours;

    @FXML
    private Button minimizeBtn_Hospital;

    @FXML
    private TextField Airport_field_work_hour;

    @FXML
    private TextField Language_field_teachers;

    @FXML
    private Button ClearBtn_airport;

    @FXML
    private TableColumn<?, ?> Airport_col_airstrip;

    @FXML
    private TextField University_field_name;

    @FXML
    private Button DeleteBtn_Library;

    @FXML
    private TableView<Univeristy> University_table;

    @FXML
    private TableColumn<?, ?> Hospital_col_workhours;

    @FXML
    private Button DeleteBtn_hospital;

    @FXML
    private TextField Airport_field_address;

    @FXML
    private TextField Library_field_address;

    @FXML
    private TableColumn<?, ?> Language_col_address;

    @FXML
    private Button DeleteBtn_Language;

    @FXML
    private Button minimizeBtn_University;

    @FXML
    private TableColumn<?, ?> Library_col_name;

    @FXML
    private Button closeBtn_University;

    @FXML
    private Button DeleteBtn_university;

    @FXML
    private TextField Airport_field_airstrip;

    @FXML
    private Button AddBtn_Language;

    @FXML
    private AnchorPane University_page;

    @FXML
    private TextField Hospital_field_code;

    @FXML
    private Button UpdateBtn_Language;

    @FXML
    private AnchorPane Hospital_page;

    @FXML
    private TableView<Library> Library_table;

    @FXML
    private TableColumn<?, ?> Hospital_col_employees;

    @FXML
    private TableColumn<?, ?> Hospital_col_name;

    @FXML
    private TextField Language_field_address;

    @FXML
    private Button closeBtn_Language;

    @FXML
    private TableColumn<?, ?> Airport_col_address;

    @FXML
    private Button ClearBtn_hospital;

    @FXML
    private AnchorPane Airport_page;

    @FXML
    private TableColumn<?, ?> Airport_col_name;

    @FXML
    private Button UpdateBtn_airport;

    @FXML
    private TextField University_field_address;

    @FXML
    private TableColumn<?, ?> Language_col_name;

    @FXML
    private TextField Language_field_work_hour;

    @FXML
    private Button signOut_mayor;

    @FXML
    private TableColumn<?, ?> Library_col_workhours;

    @FXML
    private TextField Language_field_employees;

    @FXML
    private TextField Airport_field_code;

    @FXML
    private TextField Hospital_field_address;

    @FXML
    private TextField University_field_code;

    @FXML
    private Button ClearBtn_Language;

    @FXML
    private TextField Airport_field_employees;

    @FXML
    private Button UpdateBtn_university;

    @FXML
    private TextField Library_field_name;

    @FXML
    private Button UpdateBtn_Library;

    @FXML
    private TableColumn<?, ?> University_col_name;

    @FXML
    private TextField Library_field_membership;

    @FXML
    private TextField University_field_employees;

    @FXML
    private Button closeBtn_Airport;

    @FXML
    private TextField Language_field_code;

    @FXML
    private TableColumn<?, ?> Hospital_col_address;

    @FXML
    private TableView<Hospital> Hospital_table;

    @FXML
    private TableColumn<?, ?> Library_col_address;

    @FXML
    private Button AddBtn_university;

    @FXML
    private TableColumn<?, ?> University_col_workhours;

    @FXML
    private TextField Hospital_field_employees;

    @FXML
    private Button ClearBtn_university;

    @FXML
    private AnchorPane Language_page;

    @FXML
    private TableColumn<?, ?> Language_col_employees;

    
    @FXML
    private void close(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void minimize(ActionEvent event) {
        
        Stage stage = (Stage) Skeleton_mayorpannel.getScene().getWindow();
        stage.setIconified(true);
    }

    private double x = 0;
    private double y = 0;
    @FXML
    private void signOut_mayor() {
        
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to sign out?");
        Optional<ButtonType> option = alert.showAndWait();
        try {
            if (option.get().equals(ButtonType.OK)) {

                signOut_mayor.getScene().getWindow().hide();
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
        
        if(event.getSource() == LibraryBtn){
            Library_page.setVisible(true);
            Airport_page.setVisible(false);
            Hospital_page.setVisible(false);
            Language_page.setVisible(false);
            University_page.setVisible(false);
            
           
        }
        else if(event.getSource() == AirportBtn){
            Library_page.setVisible(false);
            Airport_page.setVisible(true);
            Hospital_page.setVisible(false);
            Language_page.setVisible(false);
            University_page.setVisible(false);
            
        }
        else if(event.getSource() == HospitalBtn){
            Library_page.setVisible(false);
            Airport_page.setVisible(false);
            Hospital_page.setVisible(true);
            Language_page.setVisible(false);
            University_page.setVisible(false);
            
        }
        else if(event.getSource() == LanguageBtn){
            Library_page.setVisible(false);
            Airport_page.setVisible(false);
            Hospital_page.setVisible(false);
            Language_page.setVisible(true);
            University_page.setVisible(false);
          
        }
        else if(event.getSource() == UniversityBtn){
           
             Library_page.setVisible(false);
            Airport_page.setVisible(false);
            Hospital_page.setVisible(false);
            Language_page.setVisible(false);
            University_page.setVisible(true);
          
        }
        
    }
    
    
    private Connection connect;
    private Statement statement;
    private PreparedStatement prepare;
    private ResultSet result;
    
    public ObservableList<Library> LibraryListData(){
        
        ObservableList<Library> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM library";
        
        connect = Database.connectDb();
        
        try{
            
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            Library LibraryD;
            
            while(result.next()){
                LibraryD = new Library(result.getString("department_name"), 
                         result.getString("department_adress"),
                         result.getInt("department_code"),
                         result.getInt("department_employees"),
                         result.getDouble("hour_work"),
                         result.getInt("library_num_of_membership"));
                         
                
                
                listData.add(LibraryD);
            }
            
        }catch(Exception e){ e.printStackTrace();}
        
        return listData;
    }
    
    private ObservableList<Library> LibraryList;
    
    public void ShowLibraryListData(){
        
        LibraryList = LibraryListData();
        Library_col_name.setCellValueFactory(new PropertyValueFactory<>("department_name"));
        Library_col_address.setCellValueFactory(new PropertyValueFactory<>("department_adress"));
        Library_col_code.setCellValueFactory(new PropertyValueFactory<>("department_code"));
        Library_col_employees.setCellValueFactory(new PropertyValueFactory<>("department_employees"));
        Library_col_workhours.setCellValueFactory(new PropertyValueFactory<>("hour_work"));
        Library_col_membership.setCellValueFactory(new PropertyValueFactory<>("library_num_of_membership"));
      
        
        Library_table.setItems(LibraryList);


    }
    
    public void LibrarySelect(){
        
        Library library = Library_table.getSelectionModel().getSelectedItem();
        int n = Library_table.getSelectionModel().getSelectedIndex();
        
        if((n -1)< -1){return;}
        
        Library_field_name.setText(String.valueOf(library.getDepartment_name()));
        Library_field_address.setText(library.getDepartment_address());
        Library_field_code.setText(String.valueOf(library.getDepartment_code()));
        Library_field_employees.setText(String.valueOf(library.getDepartment_employees()));
        Library_field_work_hours.setText(String.valueOf(library.getHour_work()));
        Library_field_membership.setText(String.valueOf(library.getLibrary_num_of_membership()));
        
    }
    
    public void LibraryAdd(){
       
        
        String sql  = "INSERT INTO library "
                + "(department_name,department_adress,department_code,department_employees,hour_work,library_num_of_membership)"
                + "VALUES(?,?,?,?,?,?)";
        
        connect = Database.connectDb();
        
        try{
            
            if(Library_field_name.getText().isEmpty()||Library_field_address.getText().isEmpty()
                    ||Library_field_code.getText().isEmpty()||Library_field_employees.getText().isEmpty()
                    ||Library_field_work_hours.getText().isEmpty()
                    ||Library_field_membership.getText().isEmpty()){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            
            }else{
                
            
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, Library_field_name.getText());
            prepare.setString(2, Library_field_address.getText());
            prepare.setString(3, Library_field_code.getText());
            prepare.setString(4, Library_field_employees.getText());
            prepare.setString(5, Library_field_work_hours.getText());
            prepare.setString(6, Library_field_membership.getText());
            
            
            prepare.executeUpdate();
            Alert alert1 = new Alert(AlertType.INFORMATION);
            alert1.setTitle("Information");
            alert1.setHeaderText("");
            alert1.setContentText("Added successfully");
            alert1.showAndWait();
            
            ShowLibraryListData();
            LibraryClear();
            }
        }catch(Exception e){e.printStackTrace();}
    }
    
     public void LibraryUpdate(){
        
        
        String sql = "UPDATE library department_adress = '"+Library_field_address.getText()
                +"' ,department_code = '"+Library_field_code.getText()+"' ,department_employees = '"+
                Library_field_employees.getText()+"' ,hour_work = '"+
                Library_field_work_hours.getText()+"' ,library_num_of_membership = '"+Library_field_membership.getText()
                +"' WHERE department_name =  = '"+Library_field_name.getText()+"'"; 
        
        connect = Database.connectDb();
        
        try{
            if(Library_field_address.getText().isEmpty()||Library_field_code.getText().isEmpty()
                    ||Library_field_employees.getText().isEmpty()||Library_field_work_hours.getText().isEmpty()
                    ||Library_field_membership.getText().isEmpty()
                    ||Library_field_name.getText().isEmpty()){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            }else{
                Alert alert = new Alert(AlertType.CONFIRMATION); 
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want update Library "+
                                      Library_field_name.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();
                
                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);
                    
                    Alert alert1 = new Alert(AlertType.INFORMATION); 
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Updated Successfully ^.^");
                    alert1.showAndWait();
                    ShowLibraryListData();
                    LibraryClear();
                }
                
                
            }
        }catch(Exception e){e.printStackTrace();}
                
    }
     
     
      public void LibraryDelete(){
        
        String sql = "DELETE FROM library WHERE department_name = '"
                +Library_field_name.getText()+"'";
        
        connect = Database.connectDb();
        
        try{
            
             if(Library_field_name.getText().isEmpty()||Library_field_address.getText().isEmpty()
                    ||Library_field_code.getText().isEmpty()||Library_field_employees.getText().isEmpty()
                    ||Library_field_work_hours.getText().isEmpty()
                    ||Library_field_membership.getText().isEmpty()){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            }else{
                Alert alert = new Alert(AlertType.CONFIRMATION); 
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want delete Library "+
                                      Library_field_name.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();
                
                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);
                    
                    Alert alert1 = new Alert(AlertType.INFORMATION); 
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Deleted Successfully ^.^");
                    alert1.showAndWait();
                    ShowLibraryListData();
                    LibraryClear();
                }
             }
        }catch(Exception e){e.printStackTrace();}
    }
    
      
    public void LibraryClear(){
        
        Library_field_name.setText("");
        Library_field_address.setText("");
        Library_field_code.setText("");
        Library_field_employees.setText("");
        Library_field_work_hours.setText("");  
        Library_field_membership.setText("");
       
    }  
    
    
    /* Airport part */
    
     public ObservableList<Airport> AirportListData(){
        
        ObservableList<Airport> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM airport";
        
        connect = Database.connectDb();
        
        try{
            
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            Airport AirportD;
            
            while(result.next()){
                AirportD = new Airport(result.getString("department_name"), 
                         result.getString("department_adress"),
                         result.getInt("department_code"),
                         result.getInt("department_employees"),
                         result.getDouble("hour_work"),
                         result.getInt("airstrip"));
                         
                
                
                listData.add(AirportD);
            }
            
        }catch(Exception e){ e.printStackTrace();}
        
        return listData;
    }
    
    private ObservableList<Airport> AirportList;
    
    public void ShowAirportListData(){
        
        AirportList = AirportListData();
        Airport_col_name.setCellValueFactory(new PropertyValueFactory<>("department_name"));
        Airport_col_address.setCellValueFactory(new PropertyValueFactory<>("department_adress"));
        Airport_col_code.setCellValueFactory(new PropertyValueFactory<>("department_code"));
        Airport_col_employees.setCellValueFactory(new PropertyValueFactory<>("department_employees"));
        Airport_col_workhours.setCellValueFactory(new PropertyValueFactory<>("hour_work"));
        Airport_col_airstrip.setCellValueFactory(new PropertyValueFactory<>("airstrip"));
      
        
        Airport_table.setItems(AirportList);


    }
    
    public void AirportSelect(){
        
        Airport airport = Airport_table.getSelectionModel().getSelectedItem();
        int n = Airport_table.getSelectionModel().getSelectedIndex();
        
        if((n -1)< -1){return;}
        
        Airport_field__name.setText(String.valueOf(airport.getDepartment_name()));
        Airport_field_address.setText(airport.getDepartment_address());
        Airport_field_code.setText(String.valueOf(airport.getDepartment_code()));
        Airport_field_employees.setText(String.valueOf(airport.getDepartment_employees()));
        Airport_field_work_hour.setText(String.valueOf(airport.getHour_work()));
        Airport_field_airstrip.setText(String.valueOf(airport.getAirstrip()));
        
    }
    
    public void AirportAdd(){
       
        
        String sql  = "INSERT INTO airport "
                + "(department_name,department_adress,department_code,department_employees,hour_work,airstrip)"
                + "VALUES(?,?,?,?,?,?)";
        
        connect = Database.connectDb();
        
        try{
            
            if(Airport_field__name.getText().isEmpty()||Airport_field_address.getText().isEmpty()
                    ||Airport_field_code.getText().isEmpty()||Airport_field_employees.getText().isEmpty()
                    ||Airport_field_work_hour.getText().isEmpty()
                    ||Airport_field_airstrip.getText().isEmpty()){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            
            }else{
                
            
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, Airport_field__name.getText());
            prepare.setString(2, Airport_field_address.getText());
            prepare.setString(3, Airport_field_code.getText());
            prepare.setString(4, Airport_field_employees.getText());
            prepare.setString(5, Airport_field_work_hour.getText());
            prepare.setString(6, Airport_field_airstrip.getText());
            
            
            prepare.executeUpdate();
            Alert alert1 = new Alert(AlertType.INFORMATION);
            alert1.setTitle("Information");
            alert1.setHeaderText("");
            alert1.setContentText("Added successfully");
            alert1.showAndWait();
            
            ShowAirportListData();
            AirportClear();
            }
        }catch(Exception e){e.printStackTrace();}
    }
    
     public void AirportUpdate(){
        
        
        String sql = "UPDATE airport department_adress = '"+Airport_field_address.getText()
                +"' ,department_code = '"+Airport_field_code.getText()+"' ,department_employees = '"+
                Airport_field_employees.getText()+"' ,hour_work = '"+
                Airport_field_work_hour.getText()+"' ,airstrip = '"+Airport_field_airstrip.getText()
                +"' WHERE department_name =  = '"+Airport_field__name.getText()+"'"; 
        
        connect = Database.connectDb();
        
        try{
            if(Airport_field_address.getText().isEmpty()||Airport_field_code.getText().isEmpty()
                    ||Airport_field_employees.getText().isEmpty()||Airport_field_work_hour.getText().isEmpty()
                    ||Airport_field_airstrip.getText().isEmpty()
                    ||Airport_field__name.getText().isEmpty()){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            }else{
                Alert alert = new Alert(AlertType.CONFIRMATION); 
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want update Airport "+
                                      Airport_field__name.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();
                
                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);
                    
                    Alert alert1 = new Alert(AlertType.INFORMATION); 
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Updated Successfully ^.^");
                    alert1.showAndWait();
                    ShowAirportListData();
                    AirportClear();
                }
                
                
            }
        }catch(Exception e){e.printStackTrace();}
                
    }
     
     
      public void AirportDelete(){
        
        String sql = "DELETE FROM airport WHERE department_name = '"
                +Airport_field__name.getText()+"'";
        
        connect = Database.connectDb();
        
        try{
            
             if(Airport_field__name.getText().isEmpty()||Airport_field_address.getText().isEmpty()
                    ||Airport_field_code.getText().isEmpty()||Airport_field_employees.getText().isEmpty()
                    ||Airport_field_work_hour.getText().isEmpty()
                    ||Airport_field_airstrip.getText().isEmpty()){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            }else{
                Alert alert = new Alert(AlertType.CONFIRMATION); 
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want delete airport "+
                                      Airport_field__name.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();
                
                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);
                    
                    Alert alert1 = new Alert(AlertType.INFORMATION); 
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Deleted Successfully ^.^");
                    alert1.showAndWait();
                    ShowAirportListData();
                    AirportClear();
                }
             }
        }catch(Exception e){e.printStackTrace();}
    }
    
      
    public void AirportClear(){
        
        Airport_field__name.setText("");
        Airport_field_address.setText("");
        Airport_field_code.setText("");
        Airport_field_employees.setText("");
        Airport_field_airstrip.setText("");  
        Airport_field_work_hour.setText("");
       
    }  
    
    /* Hospital part */
    
     
    public ObservableList<Hospital> HospitalListData(){
        
        ObservableList<Hospital> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM hospital";
        
        connect = Database.connectDb();
        
        try{
            
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            Hospital HospitalD;
            
            while(result.next()){
                HospitalD = new Hospital(result.getString("department_name"), 
                         result.getString("department_adress"),
                         result.getInt("department_code"),
                         result.getInt("department_employees"),
                         result.getDouble("hour_work"),
                         result.getInt("section"));
                         
                
                
                listData.add(HospitalD);
            }
            
        }catch(Exception e){ e.printStackTrace();}
        
        return listData;
    }
    
    private ObservableList<Hospital> HospitalList;
    
    public void ShowHospitalListData(){
        
        HospitalList = HospitalListData();
        Hospital_col_name.setCellValueFactory(new PropertyValueFactory<>("department_name"));
        Hospital_col_address.setCellValueFactory(new PropertyValueFactory<>("department_adress"));
        Hospital_col_code.setCellValueFactory(new PropertyValueFactory<>("department_code"));
        Hospital_col_employees.setCellValueFactory(new PropertyValueFactory<>("department_employees"));
        Hospital_col_workhours.setCellValueFactory(new PropertyValueFactory<>("hour_work"));
        Hospital_col_section.setCellValueFactory(new PropertyValueFactory<>("section_hospital"));
      
        
        Hospital_table.setItems(HospitalList);


    }
    
    public void HospitalSelect(){
        
        Hospital hospital = Hospital_table.getSelectionModel().getSelectedItem();
        int n = Hospital_table.getSelectionModel().getSelectedIndex();
        
        if((n -1)< -1){return;}
        
        Hospital_field_name.setText(String.valueOf(hospital.getDepartment_name()));
        Hospital_field_address.setText(hospital.getDepartment_address());
        Hospital_field_code.setText(String.valueOf(hospital.getDepartment_code()));
        Hospital_field_employees.setText(String.valueOf(hospital.getDepartment_employees()));
        Hospital_field_work_hour.setText(String.valueOf(hospital.getHour_work()));
        Hospital_field_section.setText(String.valueOf(hospital.getSection()));
        
    }
    
    public void HospitalAdd(){
       
        
        String sql  = "INSERT INTO hospital "
                + "(department_name,department_adress,department_code,department_employees,hour_work,section_hospital)"
                + "VALUES(?,?,?,?,?,?)";
        
        connect = Database.connectDb();
        
        try{
            
            if(Hospital_field_name.getText().isEmpty()||Hospital_field_address.getText().isEmpty()
                    ||Hospital_field_code.getText().isEmpty()||Hospital_field_employees.getText().isEmpty()
                    ||Hospital_field_work_hour.getText().isEmpty()
                    ||Hospital_field_section.getText().isEmpty()){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            
            }else{
                
            
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, Hospital_field_name.getText());
            prepare.setString(2, Hospital_field_address.getText());
            prepare.setString(3, Hospital_field_code.getText());
            prepare.setString(4, Hospital_field_employees.getText());
            prepare.setString(5, Hospital_field_work_hour.getText());
            prepare.setString(6, Hospital_field_section.getText());
            
            
            prepare.executeUpdate();
            Alert alert1 = new Alert(AlertType.INFORMATION);
            alert1.setTitle("Information");
            alert1.setHeaderText("");
            alert1.setContentText("Added successfully");
            alert1.showAndWait();
            
            ShowHospitalListData();
            HospitalClear();
            }
        }catch(Exception e){e.printStackTrace();}
    }
    
     public void HospitalUpdate(){
        
        
        String sql = "UPDATE hospital department_adress = '"+Hospital_field_address.getText()
                +"' ,department_code = '"+Hospital_field_code.getText()+"' ,department_employees = '"+
                Hospital_field_employees.getText()+"' ,hour_work = '"+
                Hospital_field_work_hour.getText()+"' ,section_hospital = '"+Hospital_field_section.getText()
                +"' WHERE department_name =  = '"+Hospital_field_name.getText()+"'"; 
        
        connect = Database.connectDb();
        
        try{
            if(Hospital_field_address.getText().isEmpty()||Hospital_field_code.getText().isEmpty()
                    ||Hospital_field_employees.getText().isEmpty()||Hospital_field_work_hour.getText().isEmpty()
                    ||Hospital_field_section.getText().isEmpty()||Hospital_field_name.getText().isEmpty()){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            }else{
                Alert alert = new Alert(AlertType.CONFIRMATION); 
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want update Hospital "+
                                      Hospital_field_name.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();
                
                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);
                    
                    Alert alert1 = new Alert(AlertType.INFORMATION); 
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Updated Successfully ^.^");
                    alert1.showAndWait();
                    ShowHospitalListData();
                    HospitalClear();
                }
                
                
            }
        }catch(Exception e){e.printStackTrace();}
                
    }
     
     
      public void HospitalDelete(){
        
        String sql = "DELETE FROM hospital WHERE department_name = '"
                +Hospital_field_name.getText()+"'";
        
        connect = Database.connectDb();
        
        try{
            
             if(Hospital_field_name.getText().isEmpty()||Hospital_field_address.getText().isEmpty()
                    ||Hospital_field_code.getText().isEmpty()||Hospital_field_employees.getText().isEmpty()
                    ||Hospital_field_work_hour.getText().isEmpty()
                    ||Hospital_field_section.getText().isEmpty()){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            }else{
                Alert alert = new Alert(AlertType.CONFIRMATION); 
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want delete Hospital "+
                                      Hospital_field_name.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();
                
                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);
                    
                    Alert alert1 = new Alert(AlertType.INFORMATION); 
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Deleted Successfully ^.^");
                    alert1.showAndWait();
                    ShowHospitalListData();
                    HospitalClear();
                }
             }
        }catch(Exception e){e.printStackTrace();}
    }
    
      
    public void HospitalClear(){
        
        Hospital_field_name.setText("");
        Hospital_field_address.setText("");
        Hospital_field_code.setText("");
        Hospital_field_employees.setText("");
        Hospital_field_work_hour.setText("");  
        Hospital_field_section.setText("");
       
    }  
    
    
    /* University part */
    
     public ObservableList<Univeristy> UniversityListData(){
        
        ObservableList<Univeristy> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM uni";
        
        connect = Database.connectDb();
        
        try{
            
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            Univeristy UniversityD;
            
            while(result.next()){
                UniversityD = new Univeristy(result.getString("department_name"), 
                         result.getString("department_adress"),
                         result.getInt("department_code"),
                         result.getInt("department_employees"),
                         result.getDouble("hour_work"),
                         result.getInt("faculties"));
                         
                
                
                listData.add(UniversityD);
            }
            
        }catch(Exception e){ e.printStackTrace();}
        
        return listData;
    }
    
    private ObservableList<Univeristy> UniversityList;
    
    public void ShowUniversityListData(){
        
        UniversityList = UniversityListData();
        Hospital_col_name.setCellValueFactory(new PropertyValueFactory<>("department_name"));
        Hospital_col_address.setCellValueFactory(new PropertyValueFactory<>("department_adress"));
        Hospital_col_code.setCellValueFactory(new PropertyValueFactory<>("department_code"));
        Hospital_col_employees.setCellValueFactory(new PropertyValueFactory<>("department_employees"));
        Hospital_col_workhours.setCellValueFactory(new PropertyValueFactory<>("hour_work"));
        Hospital_col_section.setCellValueFactory(new PropertyValueFactory<>("section_hospital"));
      
        
        Hospital_table.setItems(HospitalList);


    }
    
    public void UniversitySelect(){
        
        Univeristy university = University_table.getSelectionModel().getSelectedItem();
        int n = University_table.getSelectionModel().getSelectedIndex();
        
        if((n -1)< -1){return;}
        
        University_field_name.setText(String.valueOf(university));
        University_field_address.setText(university.getDepartment_address());
        University_field_code.setText(String.valueOf(university.getDepartment_code()));
        University_field_employees.setText(String.valueOf(university.getDepartment_employees()));
        University_field_work_hour.setText(String.valueOf(university.getHour_work()));
        University_field_faculties.setText(String.valueOf(university.getFaculties()));
        
    }
    
    public void UniversityAdd(){
       
        
        String sql  = "INSERT INTO uni "
                + "(department_name,department_adress,department_code,department_employees,hour_work,uni_faculties)"
                + "VALUES(?,?,?,?,?,?)";
        
        connect = Database.connectDb();
        
        try{
            
            if(University_field_name.getText().isEmpty()||University_field_address.getText().isEmpty()
                    ||University_field_code.getText().isEmpty()||University_field_employees.getText().isEmpty()
                    ||University_field_work_hour.getText().isEmpty()
                    ||University_field_faculties.getText().isEmpty()){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            
            }else{
                
            
            prepare = connect.prepareStatement(sql);
            prepare.setString(1, University_field_name.getText());
            prepare.setString(2, University_field_address.getText());
            prepare.setString(3, University_field_code.getText());
            prepare.setString(4, University_field_employees.getText());
            prepare.setString(5, University_field_work_hour.getText());
            prepare.setString(6, University_field_faculties.getText());
            
            
            prepare.executeUpdate();
            Alert alert1 = new Alert(AlertType.INFORMATION);
            alert1.setTitle("Information");
            alert1.setHeaderText("");
            alert1.setContentText("Added successfully");
            alert1.showAndWait();
            
            ShowUniversityListData();
            UniversityClear();
            }
        }catch(Exception e){e.printStackTrace();}
    }
    
     public void UniversityUpdate(){
        
        
        String sql = "UPDATE uni uni_address = '"+University_field_address.getText()
                +"' ,uni_code = '"+University_field_code.getText()+"' ,uni_employees = '"+
                University_field_employees.getText()+"' ,uni_hourwork = '"+
                University_field_work_hour.getText()+"' ,uni_faculties = '"+University_field_faculties.getText()
                +"' WHERE uni_name =  = '"+University_field_name.getText()+"'"; 
        
        connect = Database.connectDb();
        
        try{
            if(University_field_address.getText().isEmpty()||University_field_code.getText().isEmpty()
                    ||University_field_employees.getText().isEmpty()||University_field_work_hour.getText().isEmpty()
                    ||University_field_faculties.getText().isEmpty()||University_field_name.getText().isEmpty()){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            }else{
                Alert alert = new Alert(AlertType.CONFIRMATION); 
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want update University "+
                                      University_field_name.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();
                
                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);
                    
                    Alert alert1 = new Alert(AlertType.INFORMATION); 
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Updated Successfully ^.^");
                    alert1.showAndWait();
                    ShowHospitalListData();
                    HospitalClear();
                }
                
                
            }
        }catch(Exception e){e.printStackTrace();}
                
    }
     
     
      public void UniversityDelete(){
        
        String sql = "DELETE FROM uni WHERE department_name = '"
                +Hospital_field_name.getText()+"'";
        
        connect = Database.connectDb();
        
        try{
            
             if(University_field_name.getText().isEmpty()||University_field_address.getText().isEmpty()
                    ||University_field_code.getText().isEmpty()||University_field_employees.getText().isEmpty()
                    ||University_field_work_hour.getText().isEmpty()
                    ||University_field_faculties.getText().isEmpty()){
                
            Alert alert = new Alert(AlertType.ERROR); 
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the blanks");
            alert.showAndWait();
            }else{
                Alert alert = new Alert(AlertType.CONFIRMATION); 
                alert.setTitle("Confimation ^.^");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure do you want delete Univeristy"+
                                      University_field_name.getText()+"?");
                Optional<ButtonType> option = alert.showAndWait();
                
                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(sql);
                    
                    Alert alert1 = new Alert(AlertType.INFORMATION); 
                    alert1.setTitle("INFORMATION ^-^");
                    alert1.setHeaderText(null);
                    alert1.setContentText("Deleted Successfully ^.^");
                    alert1.showAndWait();
                    ShowUniversityListData();
                    UniversityClear();
                }
             }
        }catch(Exception e){e.printStackTrace();}
    }
    
      
    public void UniversityClear(){
        
        University_field_name.setText("");
        University_field_address.setText("");
        University_field_code.setText("");
        University_field_employees.setText("");
        University_field_work_hour.setText("");  
        University_field_faculties.setText("");
       
    }  
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ShowLibraryListData();
        ShowAirportListData();
        ShowHospitalListData();
        ShowUniversityListData();
    }    
    
}
