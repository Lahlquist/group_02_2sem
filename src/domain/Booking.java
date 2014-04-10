//NYESTE

package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * Semesterprojekt - "Casablanca Holiday Center"
 * 2. semester 2014
 * 
 * Udarbejdet af:
 * Emil, Anders, Søren og Laura
 * 
 * Torsdag den 1. maj 2014 #Part 1
 */

public class Booking
{
    int booking_id;
    int    lejlighed_id;
    Date checkIn;
    Date checkUd;
    private List<Booking> bookingliste;
    
    public Booking(int booking_id, int lejlighed_id, Date cid, Date cud)
    {
    this.booking_id    = booking_id;
    this.lejlighed_id  = lejlighed_id;
    this.checkIn       = cid;
    this.checkUd       = cud;  
    bookingliste = new ArrayList<Booking>();
    }

    Booking(Date cid, Date cud)
    {
        this.checkIn = cid;
        this.checkUd = cud;
    }

    public int getBooking_id() {
        return booking_id;
    }


    public int getLejlighed_id() {
        return lejlighed_id;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckUd() {
        return checkUd;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public void setLejlighed_id(int lejlighed_id) {
        this.lejlighed_id = lejlighed_id;
    }

    public void setCheckIn(Date cid) {
        this.checkIn = cid;
    }

    public void setCheckUd(Date cud) {
        this.checkUd = cud;
    }
     public void addBooking(Booking l1)
    {
        bookingliste.add(l1);
    }
    
    
}
