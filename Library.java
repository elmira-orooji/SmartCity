
public class Library extends Department {

    public Library(String admin_name , String adress ,int number_of_employee){
        
        super(admin_name,adress,number_of_employee);
        
        
    }

    @Override
    public String admin_name() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String adress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String number_of_employee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
