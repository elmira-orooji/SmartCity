
public class Library extends Department {

    protected int library_num_of_membership;
    
    public Library(String department_name , String department_address ,int department_code,
            int department_employees,double hour_work,int library_num_of_membership){
        
        super(department_name,department_address,department_code,department_employees,hour_work);
        this.library_num_of_membership = library_num_of_membership;
        
        
    }
    
    public int getLibrary_num_of_membership(){
        return this.library_num_of_membership;
    }

    @Override
    public String getDepartment_name() {
        return super.department_name;
    }

    @Override
    public String getDepartment_address() {
        return super.department_address;
    }

    @Override
    public int getDepartment_code() {
        return super.department_code;
    }

    @Override
    public int getDepartment_employees() {
        return super.department_employees;
    }

    @Override
    public double getHour_work() {
        return super.hour_work;
    }

   
}
