
import java.io.*;
import java.sql.Date;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.image.*;
import javafx.scene.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;


public abstract class SmartCity extends Application {
    
    private double x = 0;
    private double y = 0;
    protected int row;
    protected String firstname;
    protected String lastname;
    protected int personnelNo;
    protected Date hireDate;
    protected int phoneNo;
    protected String gender;
    protected double history;
    protected double basicSalary;
    
    public SmartCity(int row ,String firstname , String lastname ,int personnelNo ,Date hireDate ,int phoneNo ,String gender ,double history , double basicSalary){
        
        this.row = row;
        this.firstname = firstname;
        this.lastname = lastname;
        this.personnelNo = personnelNo;
        this.hireDate = hireDate;
        this.phoneNo = phoneNo;
        this.gender = gender;
        this.history = history;
        this.basicSalary = basicSalary;
    }
    public abstract int getRow();
    public abstract String getFirstname();
    public abstract String getLastname();
    public abstract int getPersonnelNo();
    public abstract Date getHireDate();
    public abstract int getPhoneNo();
    public abstract String getGender();
    public abstract double getHistory();
    public abstract double getBasicSalary();
       
    
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/View/LoginPage.fxml"));
               

        
        Scene scene = new Scene(root);
        
        
        root.setOnMousePressed((MouseEvent event) ->{
            x = event.getSceneX();
            y = event.getSceneY();
            
      
        
    });
        root.setOnMouseDragged((MouseEvent event) ->{
            stage.setX(event.getSceneX() - x);
            stage.setY(event.getSceneY() - y);
            stage.setOpacity(.8);
        });
        root.setOnMouseReleased((MouseEvent event) ->{
        stage.setOpacity(1);
    });
        stage.initStyle(StageStyle.TRANSPARENT);
        
        stage.setScene(scene);
        stage.show();
    }
    

    public static void main(String[] args) {
        launch(args);
    }
    
}
