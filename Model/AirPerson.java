package Model;

abstract public class AirPerson {
    protected int id;
    protected String firstname;
    protected String lastname;
    protected String username;
    protected String password;
    protected String phonenumber;
    protected String address;
    protected String email;


    public AirPerson(int id,String firstname,String lastname,String username,
                     String password,String phonenumber,String address,String email){

        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.phonenumber = phonenumber;
        this.address = address;
        this.email = email;
    }

    public abstract int getId();
    public abstract String getFirstname();
    public abstract String getLastname();
    public abstract String getUsername();
    public abstract String getPassword();
    public abstract String getPhonenumber();
    public abstract String getAddress();
    public abstract String getEmail();

    public abstract void setId(int id);
    public abstract void setFirstname(String firstname);
    public abstract void setLastname(String lastname);
    public abstract void setUsername(String username);
    public abstract void setPassword(String password);
    public abstract void setPhonenumber(String phonenumber);
    public abstract void setAddress(String address);
    public abstract void setEmail(String email);

}
