package Model;

import java.util.ArrayList;

public class Passenger extends AirPerson {
    private double wallet;
    private int boughtticket;
    private ArrayList<Ticket> tickets = new ArrayList<Ticket>(20);

    public Passenger(Integer id, String firstname, String lastname, String username,
                     String password, String phonenumber, String address, String email, double wallet, int boughtticket) {
        super(id, firstname, lastname, username, password, phonenumber, address, email);
        this.wallet = wallet;
        this.boughtticket = boughtticket;

    }

    @Override
    public Integer getId() {
        return super.id;
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
    public String getUsername() {
        return super.username;
    }

    @Override
    public String getPassword() {
        return super.password;
    }

    @Override
    public String getPhonenumber() {
        return super.phonenumber;
    }

    @Override
    public String getAddress() {
        return super.address;
    }

    @Override
    public String getEmail() {
        return super.email;
    }

    public double getWallet() {
        return wallet;
    }

    public int getBoughtticket() {
        return boughtticket;
    }

    @Override
    public void setId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFirstname(String firstname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLastname(String lastname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setUsername(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPassword(String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPhonenumber(String phonenumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAddress(String address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   
}