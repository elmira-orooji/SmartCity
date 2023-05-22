

import java.sql.Date;


public class Mayor extends Person  {
    
    protected String mayorUsername;
    protected String mayorPassword;
    
    public Mayor(int row ,String firstname , String lastname ,int personnelNo ,Date hireDate
        ,String gender,int phoneNo ,double history , double basicSalary,double totalSalary
        
        ){
    
    super(row,firstname,lastname,personnelNo,hireDate,phoneNo,gender,history,basicSalary,totalSalary);
    
    
}
 
    public String MayorUsername(){
        return this.mayorUsername;
    }
    
    public String MayorPassword(){
        return this.mayorPassword;
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
    
    @Override
    public double getTotalSalary() {
        return super.totalSalary;
    }


    
    
    
    
    

}


















