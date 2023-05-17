
import java.sql.Date;


public class Mayor extends SmartCity {
    
public Mayor(int row ,String firstname , String lastname ,int personnelNo ,Date hireDate ,int phoneNo ,String gender ,double history , double basicSalary){
    
    super(row,firstname,lastname,personnelNo,hireDate,phoneNo,gender,history,basicSalary);
}
 
    @Override
    public int getRow(){
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


















}
