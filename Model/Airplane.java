package Model;

import java.util.ArrayList;
public class Airplane {
    private int id;
    private int seats;
     private ArrayList<Integer> flightlistid = new ArrayList<Integer>(20);
    private static ArrayList<Airplane> airplanelist = new ArrayList<Airplane>(20);


    public Airplane airplane;


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
//     public Flight getFlight(int i){
//         return flightlist.get(i);
//     }

    public ArrayList<Integer> getFlightlistid() {
        return flightlistid;
    }
    public static ArrayList<Airplane> getAirplanelist(){
         return airplanelist;
    }

    public void setId(int id){
         this.id = id;
     }
    public void setSeats(int seats) {
        this.seats = seats;
    }
//    public void setFlightlist(Flight newflightlist){
//         flightlist.add(newflightlist);
//     }
//
//
//     public void rmoveflight(int i){
//         flightlist.remove(i);
//     }

}