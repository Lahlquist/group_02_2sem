package datasource;

import domain.Gaest;
import domain.Booking;
import domain.Lejlighed;
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

public class DBFacade
{
    //FIELDS
    private final Mapper mapp;
    
    
    //CONSTRUCTOR
    public DBFacade()
    {
        mapp = new Mapper(DBConnector.getConnection());
    }
    
    
    
    public List<Gaest> getGaesteListe()
    {
        return mapp.getGaester();
    }
    
    public boolean createNewBooking(Gaest g)
    {
        return mapp.createNewBooking(g);
    }
    
    public List<Lejlighed> getLejlighedliste()
    {
        return mapp.getLejlighedsliste();
    }
    

    public List<Lejlighed> getLejlighedsliste()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean tjekLogind(String brugernavn, String kode){
        return (mapp.tjekLogind(brugernavn, kode));
    }
    
    //ANDERS - NYT     
    public ArrayList<Booking> getRoomsList(String x, String y, String w) {
        return mapp.getRooms(x, y, w);
    }

    public boolean createNewGaest(Gaest gaest)
    {
        return mapp.createNewgaest(gaest);
    }
}
