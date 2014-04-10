//NYESTE

package domain;

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

public class Lejlighed
{
    private int Lejlighed_id;
    private String Lejlighed_type;

    private List<Lejlighed> lejlighedliste;
    
    
    public Lejlighed(int Lid,String Let)
    {
        Lejlighed_id = Lid;
        Lejlighed_type= Let;
        lejlighedliste = new ArrayList<Lejlighed>();
    }

    public int getLejlighed_id()
    {
        return Lejlighed_id;
    }

    public void setLejlighed_id(int Lejlighed_id)
    {
        this.Lejlighed_id = Lejlighed_id;
    }

    public String getLejlighed_type()
    {
        return Lejlighed_type;
    }

    public void setLejlighed_type(String Lejlighed_type)
    {
        this.Lejlighed_type = Lejlighed_type;
    }

    public void addLejlighed(Lejlighed l1)
    {
        lejlighedliste.add(l1);
    }


}
