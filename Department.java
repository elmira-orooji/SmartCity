
public abstract class Department {

    protected String department_name;
    protected String department_address;
    protected int    department_code;
    protected int    department_employees;
    protected double hour_work;
    
    
    public Department(String department_name , String department_address ,int department_code,
                       int department_employees , double hour_work){
        
        this.department_name = department_name;
        this.department_address = department_address;
        this.department_code = department_code;
        this.department_employees = department_employees;
        this.hour_work = hour_work;
        
    }
    
    public abstract String getDepartment_name();
    public abstract String getDepartment_address();
    public abstract int getDepartment_code();
    public abstract int getDepartment_employees();
    public abstract double getHour_work();

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
