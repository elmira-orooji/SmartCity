

import java.sql.Date;


public class Securityguards extends Person{

   protected int shift_work;
   protected String time_work;
   
 public Securityguards(int row ,String firstname , String lastname ,int personnelNo ,Date hireDate
        ,String gender,int phoneNo ,int shift_work,double history ,String time_work, double basicSalary,double totalSalary){
    
    super(row,firstname,lastname,personnelNo,hireDate,phoneNo,gender,history,basicSalary,totalSalary);
    
    this.shift_work = shift_work;
    this.time_work = time_work;
}
 
    public int getShiftWork(){
        return this.shift_work;
    }  
    
    public String getTimeWork(){
        return this.time_work;
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
