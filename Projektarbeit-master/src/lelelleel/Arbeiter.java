 package lelelleel;

 //Importe
 //-----------------------------------------
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import java.util.*;
 //-----------------------------------------

 
public class Arbeiter {
    
    //Attribute
    //-----------------------------------------
    private String name;
    private int arbeiterID;                  //Die zusätzliche Variable "MitarbeiterID" wurde eingeführt, um jeden Mitarbeiter einzigartig zu machen
    private String berufsBezeichnung;
    private LocalDate einstellungsDatum;
    private double jahresGehalt;
    private boolean hatAuftrag;
    private LinkedList <LocalDate> auftragsBegin;
    private LinkedList <LocalDate> auftragsEnde;
    
    static Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    static LinkedList<Arbeiter> arbeiterListe = new LinkedList<Arbeiter>();
    //-----------------------------------------

    
    //-----------------------------------------
    //Methode zum erstellen eines Arbeiters
    public static Arbeiter arbeiterErstellen(String name,int mitarbID,String berufsBez,double jahresGehalt,LocalDate einstelDat) {
       
            Arbeiter a1 = new Arbeiter(name, mitarbID, berufsBez, jahresGehalt, einstelDat);
            arbeiterListe.add(a1);
        return a1;

    }       
    //-----------------------------------------
    
    
    //-----------------------------------------
    //Um alle Mitarbeiter auszugeben
    public static void arbeiterListeAusgeben() {
        if (arbeiterListe.isEmpty()) {
            System.out.println("Die Liste ist leer");
        }
        
        for (int j = 0; j < arbeiterListe.size(); j++) {
            
            System.out.println("Stelle im Array: "+j);
            System.out.println("MitarbeiterID: " + arbeiterListe.get(j).getArbeiterID());
            System.out.println("Name: " + arbeiterListe.get(j).getName());
            System.out.println("Berufsvezeichnung: " + arbeiterListe.get(j).getBerufsBezeichnung());
            System.out.println("Einstellungsdatum: " + arbeiterListe.get(j).getEinstellungsDatum());
            System.out.println("Jahresgehalt: " + arbeiterListe.get(j).getJahresGehalt());
            System.out.println("BeginDaten: "+arbeiterListe.get(j).getAuftragsBegin());
            System.out.println("EndDaten: "+arbeiterListe.get(j).getAuftragsEnde());
            System.out.println("--------------------------");
        }
    }
    //-----------------------------------------
    
    //-----------------------------------------
    //Um eine Stringeingabe zu einem Datum zu konvertieren
    public static LocalDate stringZuDatumKonvertieren(String datum) throws Exception{
       
    LocalDate datee = LocalDate.parse(datum,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    
    return datee;
    }
    //-----------------------------------------

    

    //-----------------------------------------
    //Konstruktor
    public Arbeiter(String name, int mitarbeiterId, String berufsBezeichnung, double jahresGehalt,LocalDate einstellungsDatum) {
        this.name = name;
        this.arbeiterID = mitarbeiterId;
        this.berufsBezeichnung = berufsBezeichnung;
        this.einstellungsDatum = einstellungsDatum;
        this.jahresGehalt = jahresGehalt;
        this.hatAuftrag = false;
        auftragsBegin = new LinkedList<LocalDate>();
        auftragsEnde = new LinkedList<LocalDate>();
    }         
    //-----------------------------------------

    //getter & setter
    //-----------------------------------------
    public int getArbeiterID() {
        return arbeiterID;
    }
    public void setArbeiterID(int mitarbeiterId) {
        this.arbeiterID = mitarbeiterId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getBerufsBezeichnung() {
        return berufsBezeichnung;
    }

    public void setBerufsBezeichnung(String berufsBezeichnung) {
        this.berufsBezeichnung = berufsBezeichnung;
    }

    public LocalDate getEinstellungsDatum() {
        return einstellungsDatum;
    }

    public void setEinstellungsDatum(LocalDate einstellungsDatum) {
        this.einstellungsDatum = einstellungsDatum;
    }

    public double getJahresGehalt() {
        return jahresGehalt;
    }

    public void setJahresGehalt(double jahresGehalt) {
        this.jahresGehalt = jahresGehalt;
    }

    public boolean getHatAuftrag() {
        return hatAuftrag;
    }

    public void setHatAuftrag(boolean hatAuftrag) {
        this.hatAuftrag = hatAuftrag;
    }

    public static LinkedList<Arbeiter> getMitArbeiterListe(){
        return arbeiterListe;
    }

    public static void listeZuArray(){
        arbeiterListe.toArray();
    }
    
    public LinkedList<LocalDate> getAuftragsBegin(){
        return auftragsBegin;
    }
    
    public LinkedList<LocalDate> getAuftragsEnde(){
        return auftragsEnde;
    }
    
    //-----------------------------------------
}
