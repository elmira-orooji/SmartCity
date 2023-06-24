package Model;

import java.util.ArrayList;

public class Airplane {
    private Integer id;
    private Integer seats;
     private ArrayList<Flight> flightlist = new ArrayList<Flight>(20);




     public Airplane(Integer id,Integer seats){
         this.id = id;
         this.seats = seats;
     }

     
     public Integer getId(){
         return id;
     }
     public Integer getSeats(){
         return seats;
     }
     public Flight getFlight(int i){
         return flightlist.get(i);
     }

    public ArrayList<Flight> getFlightlist() {
        return flightlist;
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