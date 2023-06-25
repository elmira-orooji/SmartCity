package Model;

import java.util.ArrayList;

public class Passenger extends AirPerson {
    private double wallet;
    private int boughtticket;
    public static ArrayList<String> passengerArrayList = new ArrayList<String>(20);
    private static ArrayList<String> passengermessage = new ArrayList<String>(20);
    private ArrayList<Ticket> tickets = new ArrayList<Ticket>(20);

    public Passenger(int id, String firstname, String lastname, String username,
                     String password, String phonenumber, String address, String email, double wallet, int boughtticket) {
        super(id, firstname, lastname, username, password, phonenumber, address, email);
        this.wallet = wallet;
        this.boughtticket = boughtticket;

    }

    @Override
    public int getId() {
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

    public static ArrayList<String> getPassengermessage() {
        return passengermessage;
    }

    @Override
    public void setId(int id) {
        super.id = id;
    }

    @Override
    public void setFirstname(String firstname) {
        super.firstname = firstname;
    }

    @Override
    public void setLastname(String lastname) {
        super.lastname = lastname;
    }

    @Override
    public void setUsername(String username) {
        super.username = username;
    }

    @Override
    public void setPassword(String password) {
        super.password = password;
    }

    @Override
    public void setPhonenumber(String phonenumber) {
        super.phonenumber = phonenumber;
    }

    @Override
    public void setAddress(String address) {
        super.address = address;
    }

    @Override
    public void setEmail(String email) {
        super.email = email;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
    public void setBoughtticket(int boughtticket) {
        this.boughtticket = boughtticket;
    }

    public void setTickets(Ticket ticket) {
        tickets.add(ticket);
    }

    public void rmoveTickets(int i) {
        tickets.remove(i);
    }
}