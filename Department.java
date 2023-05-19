
public abstract class Department {

    public String admin_name;
    public String adress;
    public int number_of_emoloyee;
    
    
    public Department(String admin_name , String adress ,int number_of_employee){
        
        this.admin_name = admin_name;
        this.adress = adress;
        this.number_of_emoloyee = number_of_employee;
        
    }
    
    public abstract String admin_name();
    public abstract String adress();
    public abstract String number_of_employee();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
