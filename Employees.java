
import java.sql.Date;


public class Employees extends Person{

    protected Double working_hour;
    
    public Employees(int row ,String firstname , String lastname ,int personnelNo ,Date hireDate
        ,String gender,int phoneNo ,double history , double basicSalary,Double working_hour,double totalSalary
        ){
    
    super(row,firstname,lastname,personnelNo,hireDate,phoneNo,gender,history,basicSalary,totalSalary);
    this.working_hour = working_hour;
}
 
    public Employees(){}  
    
    public double getWorkingHour(){
        return this.working_hour;
    }

    @Override
    public int getRow() {
        return super.row;
    }

    @Override
    public String getFirstname() {
        return super.firstname;
    }

    @Override
    public String getLastname() {
          return super.lastname;
    }

    @Override
    public int getPersonnelNo() {
        return super.personnelNo;
    }

    @Override
    public Date getHireDate() {
        return super.hireDate;
    }

    @Override
    public int getPhoneNo() {
        return super.phoneNo;
    }

    @Override
    public String getGender() {
         return super.gender;
    }

    @Override
    public double getHistory() {
       return super.history;
    }

    @Override
    public double getBasicSalary() {
        return super.basicSalary;
    }

    @Override
    public double getTotalSalary() {
        return super.totalSalary;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
