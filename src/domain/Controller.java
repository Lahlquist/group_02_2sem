package domain;

import datasource.*;
import java.util.ArrayList;
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
    //TEST
    private ArrayList<Booking> currentARListe;

    public Controller()
    {
        currentgListe = null;
        currentlListe = null;
        gaest = null;
        currentgaeid = null;
        //TEST
        currentARListe = null;
        
        
    }

    public List<Gaest> getGaesteListe()
    {
        currentgListe = facade.getGaesteListe();
        return currentgListe;
    }

    public Gaest createNewBooking(int gaeid, String fnavn, String enavn, int telnu, String mail, String vnavn, int vno, int pno, String bnavn, String land, String rbu)
    {
        gaest = new Gaest(gaeid, fnavn, enavn, telnu, mail, vnavn, vno, pno, bnavn, land, rbu);
        boolean status = facade.createNewBooking(gaest);
        if (!status);
        {
            gaest = null;
        }
        return gaest;
    }
    
    public List<Lejlighed> getLejlighedliste()
    {
        currentlListe = facade.getLejlighedsliste();
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

    public void UpdateGaest(String text)
    {
        return;
    }

    public Gaest GetGaest(int gaeid)
    {

        currentgaeid = facade.GetGaest(gaeid);

        return currentgaeid;
    }


    
    
    
}
