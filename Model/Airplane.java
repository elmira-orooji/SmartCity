package Model;

import java.util.ArrayList;
public class Airplane {
    private int id;
    private int seats;
     private ArrayList<Flight> flightlist = new ArrayList<Flight>(20);


     public Airplane(int id,int seats){
         this.id = id;
         this.seats = seats;
     }

     public int getId(){
         return id;
     }
     public int getSeats(){
         return seats;
     }
     public Flight setFlight(int i){
         return flightlist.get(i);
     }

     public void setId(int id){
         this.id = id;
     }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public void setFlightlist(Flight newflightlist){
         flightlist.add(newflightlist);
     }


     public void rmoveflight(int i){
         flightlist.remove(i);
     }

}