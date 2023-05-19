
import java.sql.Date;


abstract public class Person {

    public int row;
    public String firstname;
    public String lastname;
    public int personnelNo;
    public Date hireDate;
    public  int phoneNo;
    public  String gender;
    public double history;
    public double basicSalary;
    public double totalSalary;
    
    public Person(int row ,String firstname , String lastname ,int personnelNo 
            ,Date hireDate ,int phoneNo ,String gender ,double history , double basicSalary,
            double totalSalary){
        
        this.row = row;
        this.firstname = firstname;
        this.lastname = lastname;
        this.personnelNo = personnelNo;
        this.hireDate = hireDate;
        this.phoneNo = phoneNo;
        this.gender = gender;
        this.history = history;
        this.basicSalary = basicSalary;
        this.totalSalary = totalSalary;
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
    public abstract double getTotalSalary();   

    
    
    
    
    
    
    
    
    
    
    
    
}
