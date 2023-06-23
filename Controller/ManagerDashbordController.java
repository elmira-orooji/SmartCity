
package Controller;

import Model.Airplane;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.collections.FXCollections.observableList;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;


public class ManagerDashbordController implements Initializable {
    
    ObservableList<Airplane> fligthData;
    
    @FXML
    private TableColumn manager_planes_flightsCol;
    
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
