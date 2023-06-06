package Model;



import java.sql.Date;


public class Securityguards extends Person{

   protected int Shift_works;
   protected String Time_works;
   
 public Securityguards(int row ,String firstname , String lastname ,int personnelNo ,Date hireDate
        ,String gender,int phoneNo ,int Shift_works,double history ,String Time_works, double basicSalary,double totalSalary){
    
    super(row,firstname,lastname,personnelNo,hireDate,phoneNo,gender,history,basicSalary,totalSalary);
    
    this.Shift_works = Shift_works;
    this.Time_works = Time_works;
    
}
 
    public int getShift_works(){
        return this.Shift_works;
    }  
    
    public String getTime_works(){
        return this.Time_works;
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
