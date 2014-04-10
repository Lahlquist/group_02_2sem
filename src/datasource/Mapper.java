package datasource;

import domain.Booking;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import domain.Gaest;
import domain.Lejlighed;
import java.util.Date;

/*
 * Semesterprojekt - "Casablanca Holiday Center" 2. semester 2014
 *
 * Udarbejdet af: Emil, Anders, Søren og Laura
 *
 * Torsdag den 1. maj 2014 #Part 1
 */

public class Mapper {

    //FIELDS
    ArrayList<Integer> ledig_id = new ArrayList<>();
    int bookingID;
    private final Connection con;

    //CONSTRUCTOR   
    public Mapper(Connection con) {
        this.con = con;
    }

    
    
    public List<Gaest> getGaester() {
        String SQLString =
                " select * from GAEST_TBL";
        PreparedStatement statement = null;
        List<Gaest> gaesteListe = new ArrayList<>();

        try {
            statement = con.prepareStatement(SQLString);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                int gaeid = rs.getInt("GAEST_ID");
                String fnavn = rs.getString("FORNAVN_E");
                String enavn = rs.getString("EFTERNAVN");
                int telnu = rs.getInt("TELEFONNUMMER");
                String mail = rs.getString("E_MAIL");
                String vnavn = rs.getString("VEJNAVN");
                int vno = rs.getInt("VEJNUMMER");
                int pno = rs.getInt("POSTNUMMER");
                String bnavn = rs.getString("BYNAVN");
                String land = rs.getString("LAND");
                String rbu = rs.getString("REJSEBUREAU");

                gaesteListe.add(new Gaest(gaeid, fnavn, enavn, telnu, mail, vnavn, vno, pno, bnavn, land, rbu));
            }
        } catch (SQLException e) {
            System.out.println("Fail in Mapper - getGæster");
            System.out.println(e.getMessage());
        } finally // must close statement
        {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                System.out.println("Fail in Mapper - getGæster");
                System.out.println(e.getMessage());
            }
        }
        return gaesteListe;
    }

    
    
    public boolean createNewBooking(Gaest g, String IN, String OUT) {

        int rowsInserted = 0;
        
        String SQLStringGæst = "insert into GAEST_TBL values (?,?,?,?,?,?,?,?,?,?,?)";

        String SQLString1 = "select gaest_iddd.nextval from dual";

        String SQLString2 = "select booking_iddd.nextval from dual";

        String SQLStringGB = "insert into GAEST_BOOKING_TBL values (?,?)";

        String SQLStringLB = "insert into BOOKEDE_LEJLIGHED_TBL values (?,?, to_date(?,'DD-MM-YYYY'), to_date(?,'DD-MM-YYYY'))";

        PreparedStatement statement = null;
        
        System.out.println(rowsInserted);

        try {
            statement = con.prepareStatement(SQLString1);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                g.setGaestid(rs.getInt(1));
            }
            statement = con.prepareStatement(SQLString2);
            ResultSet rs2 = statement.executeQuery();
            if (rs2.next()) {
                b.setBooking_id(rs2.getInt(1));
            }
            
            //INSERT INTO GUEST_TBL
            statement = con.prepareStatement(SQLStringGæst);
            statement.setInt(1, g.getGaestid());
            statement.setString(2, g.getFornavn());
            statement.setString(3, g.getEfternavn());
            statement.setInt(4, g.getTelefonnummer());
            statement.setString(5, g.getEmail());
            statement.setString(6, g.getVejnavn());
            statement.setInt(7, g.getVejnummer());
            statement.setInt(8, g.getPostnummer());
            statement.setString(9, g.getBynavn());
            statement.setString(10, g.getLand());
            statement.setString(11, g.getRejsebureau());
            rowsInserted = statement.executeUpdate();

            System.out.println(rowsInserted);
            
            statement = con.prepareStatement(SQLStringGB);

            //INSERT INTO GUEST_BOOKING_TBL
            statement.setInt(1, b.getBooking_id());               // BOOKING_ID
            statement.setInt(2, g.getGaestid());
            rowsInserted = statement.executeUpdate();

            System.out.println(rowsInserted);
            
            statement = con.prepareStatement(SQLStringLB);

            //INSERT INTO BOOKEDE_LEJLIGHED_TBL
            statement.setInt(1, bookingID);           // BOOKING_ID
            statement.setInt(2, ledig_id.get(0));     // LEJLIGHED_ID
            statement.setString(3, IN);               // CHECKIN
            statement.setString(4, OUT);              // CHECKOUT   
            rowsInserted = statement.executeUpdate();
            
            
            System.out.println(rowsInserted);
            System.out.println("date in: " +b.getCheckIn());
            System.out.println("date out: "+b.getCheckUd());
            
            
            
        } catch (SQLException e) {
            System.out.println("Fejler i mapper - Create New Booking før close");
            System.out.println(e.getMessage());
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Fejler i mapper - Create New booking");
            }
        }
        return rowsInserted == 3; 
    }

    
    

    public List<Lejlighed> getvaerelseliste() {
        
        String SQLString =
                " select * from LEJLIGHED_TBL";
        PreparedStatement statement = null;
        List<Lejlighed> vaerelseListe = new ArrayList<>();

        try {
            statement = con.prepareStatement(SQLString);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                int Lid = rs.getInt("LEJLIGHED_ID");
                String Let = rs.getString("LEJLIGHED_TYPE");

                vaerelseListe.add(new Lejlighed(Lid, Let));
            }
        } catch (SQLException e) {
            System.out.println("Fail in Mapper - getGæster");
            System.out.println(e.getMessage());
        } finally // must close statement
        {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                System.out.println("Fail in Mapper - getGæster");
                System.out.println(e.getMessage());
            }
        }
        return vaerelseListe;
    }

    public boolean tjekLogind(String brugernavn, String kode) {
        boolean tjek = false;

        ResultSet rs = null;
        PreparedStatement pst = null;

        String SQLString1 = "SELECT * from BRUGER_LOGIN_TBL WHERE BRUGERNAVN = ? AND KODEORD = ?";

        try {
            pst = con.prepareStatement(SQLString1);
            pst.setString(1, brugernavn);
            pst.setString(2, kode);

            rs = pst.executeQuery();
            if (rs.next()) {
                tjek = true;
            }
        } catch (SQLException e) {
            System.out.println("Fail in OrderMapper - getOrder");
            System.out.println(e.getMessage());
        } finally {

            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
                System.out.println("Fail in OrderMapper - getOrder");
                System.out.println(e.getMessage());
            }
        }

        return tjek;
    }

    
    
    public ArrayList getRooms(String x, String y, String w) {
        ledig_id.clear();

        //SKAL OGSÅ TAGE IMOD 'TYPE' LEJLIGHED 'w'
        String SQLString = "SELECT BOOKING_ID, LEJLIGHED_ID, to_char(CHECK_IN_DATO, 'DD-MM-YYYY'),"
                + " to_char(CHECK_OUT_DATO, 'DD-MM-YYYY') from BOOKEDE_LEJLIGHED_TBL"
                + " WHERE BOOKING_ID NOT IN("
                + " SELECT BOOKING_ID FROM BOOKEDE_LEJLIGHED_TBL"
                + " WHERE CHECK_IN_DATO < to_date('" + x + "','DD-MM-YYYY') AND"
                + " CHECK_OUT_DATO      > to_date('" + x + "','DD-MM-YYYY') OR"
                + " CHECK_IN_DATO       < to_date('" + y + "','DD-MM-YYYY') AND"
                + " CHECK_OUT_DATO      > to_date('" + y + "','DD-MM-YYYY') OR"
                + " CHECK_IN_DATO       > to_date('" + x + "','DD-MM-YYYY') AND"
                + " CHECK_OUT_DATO      < to_date('" + y + "','DD-MM-YYYY') OR"
                + " CHECK_IN_DATO       < to_date('" + x + "','DD-MM-YYYY') AND"
                + " CHECK_OUT_DATO      > to_date('" + y + "','DD-MM-YYYY'))";

        String SQLString2 = "SELECT LEJLIGHED_ID FROM LEJLIGHED_TBL"
                + " WHERE LEJLIGHED_TYPE = '" + w + "' AND LEJLIGHED_ID"
                + " NOT IN (select LEJLIGHED_ID FROM BOOKEDE_LEJLIGHED_TBL)";

        PreparedStatement statement  = null;
        PreparedStatement statement2 = null;

        try {
            statement = con.prepareStatement(SQLString);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                //        String BOOK_ID   = rs.getString(1);
                int LEJ_ID = rs.getInt(2);
                //        String CHECK_IND = rs.getString(3);
                //        String CHECK_UD  = rs.getString(4);

                ledig_id.add(LEJ_ID);
            }
            statement2 = con.prepareStatement(SQLString2);
            ResultSet rs2 = statement2.executeQuery();

            while (rs2.next()) {
                int LEJ_ID = rs2.getInt(1);
                ledig_id.add(LEJ_ID);
            }

        } catch (Exception e) {
            System.out.println("Fail in Mapper - getRooms");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                System.out.println("Fail in Mapper - getRooms");
                System.out.println(e.getMessage());
            }
            return ledig_id;
        }
    }
 
    
    boolean createNewgaest(Gaest gaest) {
        int rowsInserted = 0;
        String SQLStringGæst = "insert into GAEST_TBL "
                + "values (?,?,?,?,?,?,?,?,?,?,?)";
        String SQLString1 = "select gaest_iddd.nextval  "
                + "from dual";

        PreparedStatement statement = null;
        try {

            statement = con.prepareStatement(SQLString1);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                gaest.setGaestid(rs.getInt(1));
            }
            statement = con.prepareStatement(SQLStringGæst);
            statement.setInt(1, gaest.getGaestid());
            statement.setString(2, gaest.getFornavn());
            statement.setString(3, gaest.getEfternavn());
            statement.setInt(4, gaest.getTelefonnummer());
            statement.setString(5, gaest.getEmail());
            statement.setString(6, gaest.getVejnavn());
            statement.setInt(7, gaest.getVejnummer());
            statement.setInt(8, gaest.getPostnummer());
            statement.setString(9, gaest.getBynavn());
            statement.setString(10, gaest.getLand());
            statement.setString(11, gaest.getRejsebureau());
            rowsInserted = statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Fejler i mapper - Create New Booking før close");
            System.out.println(e.getMessage());
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Fejler i mapper - Create New booking");
            }
        }
        return rowsInserted == 1;
    }

    
    
    public Gaest getGaest(int gaeid) {
        Gaest g = null;

        String SQLgetGaest = "Select * from GAEST_TBL where GAEST_ID = ?";

        PreparedStatement statement = null;

        try {
            statement = con.prepareStatement(SQLgetGaest);
            statement.setInt(1, gaeid);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                g = new Gaest(gaeid,
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11));

            }
        } catch (SQLException e) {
            System.out.println("Fail in Mapper - getGaest");
            System.out.println(e.getMessage());
        } finally // must close statement
        {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                System.out.println("Fail in Mapper - getGaest");
                System.out.println(e.getMessage());
            }
        }
        return g;
    }

    
    
    boolean UpdateGaest(Gaest gaest) {
        int RowsUpdated = 0;
        String UpdateGaest = "UPDATE GAEST_TBL SET FORNAVN_E = ?,EFTERNAVN = ?,TELEFONNUMMER = ?, E_MAIL = ?, VEJNAVN = ?,"
                + "VEJNUMMER = ?, POSTNUMMER = ?, BYNAVN = ?, LAND = ?, REJSEBUREAU = ? WHERE GAEST_ID = ? ";

        try {
            PreparedStatement statement = con.prepareStatement(UpdateGaest);
              System.out.println(gaest);
            statement.setString(1, gaest.getFornavn());
            statement.setString(2, gaest.getEfternavn());
            statement.setInt(3, gaest.getTelefonnummer());
            statement.setString(4, gaest.getEmail());
            statement.setString(5, gaest.getVejnavn());
            statement.setInt(6, gaest.getVejnummer());
            statement.setInt(7, gaest.getPostnummer());
            statement.setString(8, gaest.getBynavn());
            statement.setString(9, gaest.getLand());
            statement.setString(10, gaest.getRejsebureau());
            statement.setInt(11, gaest.getGaestid());
            RowsUpdated = statement.executeUpdate();
            System.out.println(RowsUpdated);
            System.out.println(gaest.getGaestid());
            System.out.println(gaest.getEfternavn());
            

        } catch (SQLException e) {
            System.out.println("Fail in Mapper - UpdateGaest");
            System.out.println(e.getMessage());
        }
        return RowsUpdated == 1;
    }

    boolean SletGaest(Gaest gaest)
    {
        int RowsSlettet = 0; 
        String SletGaest = "DELETE GAEST_TBL where GAEST_ID = ?";
        
        try {
            PreparedStatement statement = con.prepareStatement(SletGaest);
            statement.setInt(1, gaest.getGaestid());
            RowsSlettet = statement.executeUpdate();
        }catch (SQLException e) {
            System.out.println("Fail in Mapper - Slet Gaest");
            System.out.println(e.getMessage());
        }
        return RowsSlettet == 1;
    }

    List<Booking> getVaerelseliste()
    {
        String SQLString =
                " select * from BOOKEDE_LEJLIGHED_TBL";
        PreparedStatement statement = null;
        List<Booking> VaerelseListe = new ArrayList<>();

        try {
            statement = con.prepareStatement(SQLString);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                int bid = rs.getInt("BOOKING_ID");
                int lid = rs.getInt("LEJLIGHED_ID");
                Date cid = rs.getDate("CHECK_IN_DATO");
                Date cud = rs.getDate("CHECK_OUT_DATO");
                

                VaerelseListe.add(new Booking(bid, lid,cid, cud));
            }
        } catch (SQLException e) {
            System.out.println("Fail in Mapper - getGæster");
            System.out.println(e.getMessage());
        } finally // must close statement
        {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                System.out.println("Fail in Mapper - getGæster");
                System.out.println(e.getMessage());
            }
        }
        return VaerelseListe;
    }
}









