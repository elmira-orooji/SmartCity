package Model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.FileHandler;
import java.util.logging.Logger;


public class Database {

    static FileHandler handler;
    
    public static Connection connectDb(){
       
     try{
         
     handler = new FileHandler("logger.log", true);
     
    Class.forName("com.mysql.jdbc.Driver");
    Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/smartcity","root","");
    return connect;
    
        }catch(Exception e){
            
            e.printStackTrace();  
            Logger logger = Logger.getLogger("com.javacodegeeks.snippets.core");
            logger.addHandler(handler);
            logger.warning("warning message"+e);}
        return null;
}

    
}
    

