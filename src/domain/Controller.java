//NYESTE

package domain;

import datasource.*;
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

public class Controller
{

    DBFacade facade = new DBFacade();
    private List<Gaest> currentgListe;
    private List<Lejlighed> currentlListe;
    private Gaest gaest;
    private Gaest currentgaeid;
    private Booking booking;
    //TEST
    private ArrayList<Booking> currentARListe;
    private List<Booking> currentvListe;

    public Controller()
    {
        currentgListe = null;
        currentlListe = null;
        currentvListe =null; 
        gaest = null;
        currentgaeid = null;
        booking = null; 
        //TEST
        currentARListe = null;
        
        
    }

    public List<Gaest> getGaesteListe()
    {
        currentgListe = facade.getGaesteListe();
        return currentgListe;
    }

    public Gaest createNewBooking(int gaeid, String fnavn, String enavn, int telnu, String mail, String vnavn, int vno, int pno, String bnavn, String land, String rbu, Date cid, Date cud)
    {
        gaest = new Gaest(gaeid, fnavn, enavn, telnu, mail, vnavn, vno, pno, bnavn, land, rbu);
        booking = new Booking(cid, cud);
        boolean status = facade.createNewBooking(gaest, booking);
        if (!status);
        {
            gaest = null;
        }
        return gaest;
    }
    
    public List<Lejlighed> getvaerelseliste()
    {
        currentlListe = facade.getvaerelseliste();
        return currentlListe;
    }

    public boolean tjekLogind(String brugernavn, String kode){
        return (facade.tjekLogind(brugernavn, kode));
    }
    
    
    // ANDERS - NYT
    
    
    // antal lejligheder ledige i given periode.
    public int getRoomsList(String x, String y, String w) {
        currentARListe = facade.getRoomsList(x,y,w);
        int rooms = currentARListe.size();
        
        return rooms;
    }

    public Gaest createNewGaest(int gaeid, String fnavn, String enavn, int telnu, String mail, String vnavn, int vno, int pno, String bnavn, String land, String rbu)
    {
        gaest = new Gaest(gaeid, fnavn, enavn, telnu, mail, vnavn, vno, pno, bnavn, land, rbu);
        boolean status = facade.createNewGaest(gaest);
        if (!status);
        {
            gaest = null;
        }
        return gaest;
    }


    public Gaest GetGaest(int gaeid)
    {

        currentgaeid = facade.GetGaest(gaeid);

        return currentgaeid;
    }

    public boolean UpdateGaest(int gaeid, String fnavn, String enavn, int telnu, String mail, String vnavn, int vno, int pno, String bnavn, String land, String rbu)
    {
        gaest = new Gaest(gaeid, fnavn, enavn, telnu, mail, vnavn, vno, pno, bnavn, land, rbu);
        boolean status = facade.UpdateGaest(gaest);
        if (!status);
        {
            gaest = null;
        }
        return status;
    }

    public Gaest SletGaest(int gaeid, String fnavn, String enavn, int telnu, String mail, String vnavn, int vno, int pno, String bnavn, String land, String rbu)
    {
        gaest = new Gaest(gaeid, fnavn, enavn, telnu, mail, vnavn, vno, pno, bnavn, land, rbu);
        boolean status = facade.SletGaest(gaest);
        if (!status);
        {
            gaest = null;
        }
        return gaest;
    }

    public List<Booking> getVaerelseliste()
    {
        currentvListe = facade.getVaerelseliste();
        return currentvListe;
    }







    
    
    
}
