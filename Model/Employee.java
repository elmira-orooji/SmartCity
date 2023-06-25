package Model;

import java.util.ArrayList;

public class Employee extends AirPerson {
    private double salary;
    public static ArrayList<String> employeeArrayList = new ArrayList<String>(20);
    private static ArrayList<String> employeemessage = new ArrayList<String>(20);

    public Employee(Integer id, String firstname, String lastname, String username,
                       String password, String phonenumber, String address, String email, double salary){
        super(id,firstname,lastname,username,password,phonenumber,address,email);
        this.salary = salary;
    }



    @Override
    public Integer getId(){
        return super.id;
    }
    @Override
    public String getFirstname(){
        return super.firstname;
    }
    @Override
    public String getLastname(){
        return super.lastname;
    }
    @Override
    public String getUsername(){
        return super.username;
    }
    @Override
    public String getPassword(){
        return super.password;
    }
    @Override
    public String getPhonenumber(){
        return  super.phonenumber;
    }
    @Override
    public String getAddress(){
        return super.address;
    }
    @Override
    public String getEmail(){
        return super.email;
    }
    public double getSalary(){
        return salary;
    }

    public static ArrayList<String> getEmployeemessage() {
        return employeeArrayList;
    }


    @Override
    public void setId(Integer id){
        super.id = id;
    }
    @Override
    public void setFirstname(String firstname){
        super.firstname = firstname;
    }
    @Override
    public void setLastname(String lastname){
        super.lastname = lastname;
    }
    @Override
    public void setUsername(String username){
        super.username = username;
    }
    @Override
    public void setPassword(String password){
        super.password = password;
    }
    @Override
    public void setPhonenumber(String phonenumber){
        super.phonenumber = phonenumber;
    }
    @Override
    public void setAddress(String address){
        super.address = address;
    }
    @Override
    public void setEmail(String email){
        super.email = email;
    }

    public void setSalary(double salary){
        this.salary= salary;
    }
}
