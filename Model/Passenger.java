package Model;

public class Passanger extends AirPerson {
    private double wallet;

    public Passanger(int id, String firstname, String lastname, String username,
                        String password, String phonenumber, String address, String email, double wallet){
        super(id,firstname,lastname,username,password,phonenumber,address,email);
        this.wallet = wallet;
    }

    @Override
    public int getId(){
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
    public double getWallet(){
        return wallet;
    }


    @Override
    public void setId(int id){
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
    public void setWallet(double wallet){
        this.wallet = wallet;
    }
}
