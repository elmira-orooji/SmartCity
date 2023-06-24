package Model;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
public class Flight {
    private int id;
    private Airplane airplane;

    private Ticket ticket;
    private String from;
    private String to;
    private LocalDate date;
    private LocalTime boarding;
    private int soldticket;
    private ArrayList<Passenger> passengerlist = new ArrayList<Passenger>(20);
    private String time;
    private FlightStatus status;

    private int ticketid;
    private double ticketprice;
    private double ticketcost;
    private int airplaneid;


    public Flight(int id, Airplane airplane , Ticket ticket, String from, String to, LocalDate date, LocalTime boarding, int soldticket, String time, FlightStatus status,int ticketid,double ticketprice,double ticketcost,int airplaneid){
        this.id = id;
        this.airplane = airplane;
        this.ticket = ticket;
        this.from = from;
        this.to = to;
        this.date = date;
        this.boarding = boarding;
        this.soldticket = soldticket;
        this.time = time ;
        this.status = status;
        this.airplaneid = airplaneid;
        this.ticketid = ticketid;
        this.ticketprice = ticketprice;
        this.ticketcost = ticketcost;
    }

    public int getId(){
        return id;
    }
    public Airplane getAirplane(){
        return airplane;
    }
    public Ticket getTicket(){
        return ticket;
    }
    public String getFrom(){
        return from;
    }
    public String getTo(){
        return to;
    }
    public LocalDate getDate(){
        return date;
    }
    public LocalTime getBoarding(){
        return boarding;
    }
    public int getSoldticket(){
        return soldticket;
    }

//    public ArrayList<Passanger> getPassangerlist() {
//        return passangerlist;
//    }
    public Passenger getpassengerlist(int i){
        return passengerlist.get(i);
    }
    public String getTime(){
        return time;
    }
    public FlightStatus getStatus(){
        return status;
    }


    
    public void setId(int id){
        this.id = id;
    }
    public void setAirplane(Airplane airplane){
        this.airplane = airplane;
    }
    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }
    public void setFrom(String from){
        this.from = from;
    }
    public void setTo(String to) {
        this.to = to;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setBoarding(LocalTime boarding) {
        this.boarding = boarding;
    }
    public void setSoldticket(int soldticket) {
        this.soldticket = soldticket;
    }

//    public void setPassangerlist(ArrayList<Passanger> passangerlist) {
//        this.passangerlist = passangerlist;
//    }
    public void setPassengerlist(Passenger newpassenger){
        passengerlist.add(newpassenger);
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setStatus(FlightStatus status) {
        this.status = status;
    }


    public void removepasenger(int i){
        passengerlist.remove(i);
    }
}
