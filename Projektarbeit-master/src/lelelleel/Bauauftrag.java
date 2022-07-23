package lelelleel;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import lelelleel.Arbeiter;
import java.util.*;
import javax.swing.SpringLayout;

public class Bauauftrag{

    //***********************************************
    //Attribute
    //***********************************************
    private String auftragGeber;
    private String ort;
    private String adresse;
    private String beschreibung;
    private LocalDate startDatum;
    private LocalDate endDatum;
    private int bauauftragsID;
    

    static LinkedList<Bauauftrag> bauAuftragListe = new LinkedList<Bauauftrag>();
    //Hier in dieser Liste, werden die zugewiesenen Arbeiter gespeichert.
    LinkedList<Arbeiter> bauAuftragMitArbeiter;


    //***********************************************
    //Methoden
    //***********************************************

    public static Bauauftrag bauauftragErstellen(String auftragGeber, String ort, int bauauftragsID, String adresse, String beschreibung, LocalDate startDatum, LocalDate endDatum) {
        
        
        Bauauftrag b1 = new Bauauftrag(bauauftragsID,auftragGeber,adresse, ort, beschreibung, startDatum, endDatum);
        bauAuftragListe.add(b1);
        return b1;
    }

    /*
    Methode um alle Bauaufträge in der Systemausgabe auszugeben. Um das Zusammenspiel ziwschen der Tabelle und den Objekten zu überprüfen,
    haben wir diese Methode in dieser
     */
    public static void AuftragListeAusgeben() {
        if (bauAuftragListe.isEmpty()) {
            System.out.println("Die Liste ist leer");
        }
        for (int j = 0; j < bauAuftragListe.size(); j++) {
            System.out.println("--------------------------");
            
            System.out.println("AuftragsId: " + bauAuftragListe.get(j).getBauauftragsID());
            System.out.println("Auftragsgeber: " + bauAuftragListe.get(j).getAuftragGeber());
            System.out.println("adresse: " + bauAuftragListe.get(j).getadresse());
            System.out.println("ort: " + bauAuftragListe.get(j).getOrt());
            System.out.println("Beschreibung: " + bauAuftragListe.get(j).getBeschreibung());
            System.out.println("AnfangsDatum: " + bauAuftragListe.get(j).getStartDatum());
            System.out.println("Enddatum: " + bauAuftragListe.get(j).getEndDatum());
            System.out.println("Zugewiesene FirmaGUI.Arbeiter: ");
            if (bauAuftragListe.get(j).getBauAuftragMitArbeiter().isEmpty()) {
                System.out.println("keine :D ");
            } else {
                for (int k = 0; k < bauAuftragListe.get(j).bauAuftragMitArbeiter.size(); k++) {
                    System.out.println("* "+bauAuftragListe.get(j).getBauAuftragMitArbeiter().get(k).getName());
                }
            }
            System.out.println("--------------------------");
        }
    }

    //***********************************************
    //Konstruktor
    public Bauauftrag(int bauauftragsID, String auftragGeber, String adresse, String ort ,String beschreibung, LocalDate startDatum, LocalDate endDatum){
        this.bauAuftragMitArbeiter = new LinkedList<Arbeiter>();
        this.auftragGeber = auftragGeber;
        this.ort = ort;
        this.bauauftragsID = bauauftragsID;
        this.adresse = adresse;
        this.beschreibung = beschreibung;
        this.startDatum = startDatum;
        this.endDatum = endDatum;
    }
    //***********************************************

    /*
    Diese Methode findet man sowohl bei der Klasse Arbeiter, als auch bei der Klasse Bauauftrag. Sie ist essenziell,
    weil sie Einfabe für für die Bauaufträge und Arbeiter von einem String, in den Datentyp "DateTime" konvertiert. Leider musste man hier
    das ganze über eine Methode machen, weil man bei einem JOptionPane nicht automatisch einen String in ein DateTime konvertieren,
    so wie es bsp. bei einem Integer, Double etc der fall war.
     */
    public static LocalDate stringZuDatumKonvertieren(String datum) throws ParseException{
       
       LocalDate datee = LocalDate.parse(datum,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
       
       return datee;
    }

    //***********************************************
    //getter und setter
    public String getAuftragGeber() {
        return auftragGeber;
    }

    public void setAuftragGeber(String auftragGeber) {
        this.auftragGeber = auftragGeber;
    }

    public int getBauauftragsID() {
        return bauauftragsID;
    }

    public void setBauauftragsID(int bauauftragsID) {
        this.bauauftragsID = bauauftragsID;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }


    public String getadresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }


    public LocalDate getStartDatum() {
        return startDatum;
    }

    public void setStartDatum(LocalDate startDatum) {
        this.startDatum = startDatum;
    }


    public LocalDate getEndDatum() {
        return endDatum;
    }

    public void setEndDatum(LocalDate endDatum) {
        this.endDatum = endDatum;
    }

    public LinkedList<Arbeiter> getBauAuftragMitArbeiter() {
        return bauAuftragMitArbeiter;
    }

}

