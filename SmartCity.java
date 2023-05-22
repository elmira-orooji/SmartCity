
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


 public class SmartCity extends Application {
    
    private double x = 0;
    private double y = 0;
    
    
    
    @Override
    public void start(Stage stage) throws Exception {
        
        
        Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
               

        
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
