package lelelleel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FirmaGUI extends JFrame {

    
    //* Das Hauptfenster der GUI wird erstellt
    public FirmaGUI() {
        initComponents();
        this.setContentPane(mainFrame);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //sorgt dafür, dass sich dass Programm stoppt, sobald das Fenster schließt                                            //passt das Fenster den Knöpfen an
        this.setVisible(true);                                  //sorgt dafür, dass wir das Fenster überhaupt sehenn
        this.setResizable(false);
        this.pack();
    }
    static FirmaGUI gui;

    @SuppressWarnings("unchecked")
    /*
    Die Methode "initComponents()", wurde automatisch vom Compiler "NetBeans" generiert, der die Eigenschaften der GUI deklariert. Und diese
    dann nach wunsch Initialisiert.
     */
    private void initComponents() {

        mainFrame = new javax.swing.JPanel();
        mitarbeiterHinzufügenButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        /*
        die Attribute "tableArbeiter" und "tableBauaufträge" sind ja Tabellen. Standartgemäß ist es eingeschaltet,
        dass man die Tabelle bearbeiten kann. Nun, verändert man aber direkt danach die Methode, indem man direkt sagt, dass die bearbeitung
        der Zellen nicht eingeschaltet ist, indem man ein "false" zurückgibt.
         */
        tableArbeiter = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            };
        };
        mitarbeiterEntfernenButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBauaufträge = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            };
        };
        arbeiterÄndernButton = new javax.swing.JButton();
        arbeiterZuBauauftrag = new javax.swing.JButton();
        arbeiterVonBauauftragLöschenButton = new javax.swing.JButton();
        bauAufträgeHinzufügenButton = new javax.swing.JButton();
        bauAuftragÄndernButton = new javax.swing.JButton();
        erweitert = new javax.swing.JButton();
        bauAuftragEntfernenButton = new javax.swing.JButton();

        setTitle("ACT - GmbH & Co.KG");
        setLocation(new java.awt.Point(0, 0));
        setName("mainFrame"); // NOI18N

        mainFrame.setName(""); // NOI18N

        mitarbeiterHinzufügenButton.setText("Arbeiter hinzufügen");
        mitarbeiterHinzufügenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitarbeiterHinzufügenButtonActionPerformed(evt);
            }
        });

        tableArbeiter.getTableHeader().setReorderingAllowed(false);
        tableBauaufträge.getTableHeader().setReorderingAllowed(false);



        tableArbeiter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name - Nachname", "Beruf", "Jahresgehalt", "Einstellungsdatum", "hat Auftrag"
            }
        ));
        jScrollPane1.setViewportView(tableArbeiter);

        mitarbeiterEntfernenButton.setText("Arbeiter entfernen");
        mitarbeiterEntfernenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitarbeiterEntfernenButtonActionPerformed(evt);
            }
        });

        tableBauaufträge.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Auftraggeber", "Adresse", "Ort", "Tätigkeit", "Anfangsdatum", "Enddatum"
            }
        ));
        jScrollPane2.setViewportView(tableBauaufträge);

        arbeiterÄndernButton.setText("Arbeiter ändern");
        arbeiterÄndernButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arbeiterÄndernButtonActionPerformed(evt);
            }
        });

        arbeiterZuBauauftrag.setText("Arbeit geben");
        arbeiterZuBauauftrag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arbeiterZuBauauftragActionPerformed(evt);
            }
        });

        arbeiterVonBauauftragLöschenButton.setText("Arbeit entziehen");
        arbeiterVonBauauftragLöschenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arbeiterVonBauauftragLöschenButtonActionPerformed(evt);
            }
        });

        bauAufträgeHinzufügenButton.setText("Bauauftrag erstellen");
        bauAufträgeHinzufügenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bauAufträgeHinzufügenButtonActionPerformed(evt);
            }
        });

        bauAuftragÄndernButton.setText("Bauauftrag ändern");
        bauAuftragÄndernButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bauAuftragÄndernButtonActionPerformed(evt);
            }
        });

        erweitert.setText("Import/Export/zugewieseneArbeiter");
        erweitert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erweitertActionPerformed(evt);
            }
        });

        bauAuftragEntfernenButton.setText("Bauauftrag entfernen");
        bauAuftragEntfernenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bauAuftragEntfernenButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainFrameLayout = new javax.swing.GroupLayout(mainFrame);
        mainFrame.setLayout(mainFrameLayout);
        mainFrameLayout.setHorizontalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addComponent(mitarbeiterHinzufügenButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arbeiterÄndernButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mitarbeiterEntfernenButton)
                        .addGap(15, 15, 15))
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainFrameLayout.createSequentialGroup()
                                .addComponent(arbeiterVonBauauftragLöschenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 3, Short.MAX_VALUE))
                            .addComponent(arbeiterZuBauauftrag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addComponent(erweitert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bauAuftragEntfernenButton))
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addComponent(bauAufträgeHinzufügenButton)
                        .addGap(24, 24, 24)
                        .addComponent(bauAuftragÄndernButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        mainFrameLayout.setVerticalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mitarbeiterHinzufügenButton)
                    .addComponent(mitarbeiterEntfernenButton)
                    .addComponent(arbeiterÄndernButton)
                    .addComponent(bauAufträgeHinzufügenButton)
                    .addComponent(bauAuftragÄndernButton))
                .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(arbeiterZuBauauftrag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arbeiterVonBauauftragLöschenButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainFrameLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(erweitert)
                            .addComponent(bauAuftragEntfernenButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }
    
    //Knopf zur erstellung eines Mitarbeiters
    //-----------------------------------------
    private void mitarbeiterHinzufügenButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String name = JOptionPane.showInputDialog(null, "Name? (Vorname - Nachname)");
        
        //Hier ein try-catch, damit dass wenn ein String eingegeben wird, das Programm nicht abschmiert
        int mitarbID = 0;
        try {
            mitarbID = Integer.parseInt(JOptionPane.showInputDialog(null, "ID?"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hier muss eine Zahl eingegeben werden");
            return;
        }

        String berufsBez = JOptionPane.showInputDialog(null, "Berufsbezeichnung?");
        double jahresGehalt = Double.parseDouble(JOptionPane.showInputDialog(null, "Jahresgehalt?"));
        String einstelDat = JOptionPane.showInputDialog(null, "Einstellungsdatum? (Datum bitte in dd-MM-yyyy eingeben)");
        boolean istVorhanden = false;
        
        //Hier wird nochmal überprüft, ob die MitarbeiterID bereits existiert oder nicht. Falls er bereits existiert, dann kriegt er den status "istVorhanden"
        for (int i = 0; i < Arbeiter.arbeiterListe.size(); i++) {
            if (Arbeiter.arbeiterListe.get(i).getArbeiterID() == mitarbID) {
                JOptionPane.showMessageDialog(null, "Diese MitarbeiterID existiert bereits!!");
                istVorhanden = true;
                return;
            }
        }
        //Wenn der Mitarbeiter nicht vorhanden ist, dann erstell einen Arbeiter und füge ihn zur Tabelle hinzu.
        //Der try-catch sorgt dafür, dass die Eingabe des Datum vom Typ "DateTime" abgefangen werden kann
        if (istVorhanden == false) {
            try {
                Arbeiter.arbeiterErstellen(name, mitarbID, berufsBez, jahresGehalt, Arbeiter.stringZuDatumKonvertieren(einstelDat));
                ArbeiterZurTabelleHinzufügen();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "uupsi da ist wohl was schief gegangen ");
            }
        }
    }
    //-----------------------------------------
    
    //Knopf zum entfernen des Arbeiters
    //-----------------------------------------
    private void mitarbeiterEntfernenButtonActionPerformed(java.awt.event.ActionEvent evt) {                               
        //Hier wird geschaut, ob es überhaupt Mitarbeiter gibt, denn wir können Mitarbeiter nicht entfernen die nicht existieren.
        //Wenn Mitarbeiter existieren, führe die Methode "ArbeiterVonTabelleEntfernen()" aus.
        if (Arbeiter.arbeiterListe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Wir haben keine Mitarbeiter");
            return;
        }
        ArbeiterVonTabelleEntfernen(getTableArbeiter());
        JOptionPane.showMessageDialog(null, "Der Arbeiter wurde erfolgreich entfernt");
    }                             
    //-----------------------------------------


    //Knopf zum Abändern eines Arbeiters
    //-----------------------------------------
    private void arbeiterÄndernButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        /*
        Auch hier machen wir einen try-catch, falls wir das Einstellugnsdatum des Mitarbeiters ändern möchten, die Eingabe falsch machen
         */
        try{
            //Zusätzlich wird bei der if-Abfrage geschaut, ob überhaupt ein Mitarbeiter existiert, wenn nicht, dann führe die Methode "ArbeiterTabelleAbÄndern()" aus
            if (Arbeiter.arbeiterListe.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Wir haben keine Mitarbeiter");
                return;
            }
            arbeiterTabelleAbÄndern(getTableArbeiter());
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ein Fehler ist aufgetreten");
                return;
            }
        

    }                                                    
    //-----------------------------------------
    
    //Knopf, um einen Arbeiter, zu einem Bauauftrag hinzuzufügen
    //-----------------------------------------
    private void arbeiterZuBauauftragActionPerformed(java.awt.event.ActionEvent evt) {
        //Hier ein try-catch, weil das Programm eine Exception ausgibt, sobald man keinen Arbeiter und einen Bauauftrag auswählt
        if (Bauauftrag.bauAuftragListe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Wir haben keine Bauaufträge");
        }
        if (Arbeiter.arbeiterListe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Wir haben keine Arbeiter");
        }
        //Hier werden verschiedenste if-Abfragen gemacht, um die verschiedensten Fälle abzudecken.
        if (!Bauauftrag.bauAuftragListe.isEmpty()) {
            try {
                arbeiterKriegtJob(getTableArbeiter(), getTableBauaufträge(), Arbeiter.arbeiterListe.get(getTableArbeiter().getSelectedRow()));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Sie müssen einen Arbeiter UND einen Bauauftrag auswählen");
            }
        }
        


    }                                                    
    //-----------------------------------------

    //Knopf um einen Arbeiter, von einem Bauauftrag zu entfernen
    //-----------------------------------------
    private void arbeiterVonBauauftragLöschenButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //Hier eine verschiedene if-Abfragen, um denn fall "Liste leer oder nicht" abzudecken. 
        //Wenn nicht, dann führe die "arbeiterWirdArbeitslos()" Methode aus
        if (Bauauftrag.bauAuftragListe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Wir haben keine Bauaufträge");
        }
        if (!Bauauftrag.bauAuftragListe.isEmpty()) {
            arbeiterWirdArbeitslos(getTableArbeiter(), getTableBauaufträge(), Arbeiter.arbeiterListe.get(getTableArbeiter().getSelectedRow()));
        }
    }//
    //-----------------------------------------
    
    //Knopf um einen Bauauftrag hinzuzufügen
    //-----------------------------------------
    private void bauAufträgeHinzufügenButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int bauauftragID = 0;
        //Hier wird ein try-catch gemacht, falls anstatt ein Integer, etwas anderes eingegeben wird.
        try {
            bauauftragID = Integer.parseInt(JOptionPane.showInputDialog(null, "ID?"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hier soll bitte ein Integer rein ");
            return;
        }
        String auftragGeber = JOptionPane.showInputDialog(null, "Aufftraggeber?");
        String adresse = JOptionPane.showInputDialog(null, "Adresse ?");
        String ort = JOptionPane.showInputDialog(null, "Ort? ");
        String beschreibungg = JOptionPane.showInputDialog(null, "Was wird dort gemacht? ");
        String eingabeStartDatum = (JOptionPane.showInputDialog(null, "Startdatum? (Bitte die Eingabe in dd(Tage) - mm(Monat in Zahl) - yyyy(Jahr))"));
        String eingabeEndDatumm = (JOptionPane.showInputDialog(null, "Enddatum? (Bitte die Eingabe in dd(Tage) - mm(Monat in Zahl) - yyyy(Jahr))"));



        boolean istVorhanden = false;
        
        //Hier wird überprüft, ob die eingegebene ID bereits existiert. Denn wenn doch, dann erhält sie den Status "ist Vorhanden"
        for (int i = 0; i < Bauauftrag.bauAuftragListe.size(); i++) {
            if (Bauauftrag.bauAuftragListe.get(i).getBauauftragsID() == bauauftragID) {
                JOptionPane.showMessageDialog(null, "Dieser BauauftragsID existiert bereits ");
                istVorhanden = true;
            }
        }
        //Falls der Status nicht "ist Vorhanden" ist, dann erstellt der ein Objekt und fügt ihn zur Tabelle hinzu.
        //Ein try-catch wird für die Eingabe des Datums benötigt, falls man diese falsch eingibt.
        if (istVorhanden == false) {
            try {
                if(Bauauftrag.stringZuDatumKonvertieren(eingabeStartDatum).isAfter(Bauauftrag.stringZuDatumKonvertieren(eingabeEndDatumm))){
                    JOptionPane.showMessageDialog(null,"der Startdatum kann nicht nach dem Enddatum sein !");
                    return;
                }
                Bauauftrag.bauauftragErstellen(auftragGeber, ort, bauauftragID, adresse, beschreibungg, Bauauftrag.stringZuDatumKonvertieren(eingabeStartDatum), Bauauftrag.stringZuDatumKonvertieren(eingabeEndDatumm));
                bauauftragZurTabelleHinzufügen();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Oh nein das mit dem Datum hat wohl nicht ganz so geklappt ");
            }
        }
    }                                                           
    //-----------------------------------------
    
    
    //Knopf um einen Bauauftrag zu entfernen
    //-----------------------------------------
    private void bauAuftragEntfernenButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if(Bauauftrag.bauAuftragListe.isEmpty()){
            JOptionPane.showMessageDialog(null, "Wir haben keine Bauaufträge");
            return;
        }
        bauauftragVonTabelleEntfernen(getTableArbeiter(), getTableBauaufträge());
        JOptionPane.showMessageDialog(null, "Bauauftrag erfolgreich entfernt.");
    }
    //-----------------------------------------
    
    //Knopf um einen Bauauftrag zu verändern
    //-----------------------------------------
    private void bauAuftragÄndernButtonActionPerformed(java.awt.event.ActionEvent evt) {
        /*
        Hier muss ein try-catch ausgeführt werden, falls man eines der Daten vom Typ "DateTime" verändert werden möchte
        und diesen dann aber falsch eingibt.
        */
        try {
            bauAuftragTabelleAbändern(getTableBauaufträge());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ein Fehler ist aufgetreten");
            return;
        }
    }
    //-----------------------------------------

    //Methode um die zusätzliche GUI für "Import/Export/zugewiesene Arbeiter" zu öffnen
    private void erweitertActionPerformed(java.awt.event.ActionEvent evt) {
        /*
        Hier wird die GUI "zugewieseneMitArbeiter aufgerufen.
        */
        new erweitert().setVisible(true);
    }


    // Variablen
        private javax.swing.JButton arbeiterVonBauauftragLöschenButton;
        private javax.swing.JButton arbeiterZuBauauftrag;
        private javax.swing.JButton arbeiterÄndernButton;
        private javax.swing.JButton bauAuftragEntfernenButton;
        private javax.swing.JButton bauAuftragÄndernButton;
        private javax.swing.JButton bauAufträgeHinzufügenButton;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JPanel mainFrame;
        private javax.swing.JButton mitarbeiterEntfernenButton;
        private javax.swing.JButton mitarbeiterHinzufügenButton;
        private javax.swing.JTable tableArbeiter;
        private javax.swing.JTable tableBauaufträge;
        private javax.swing.JButton erweitert;
        // End of variables declaration                   

    /*
    Das Programm wurde eigenständig erstellt von der Gruppe 62:
    * Süleyman Enes Ates :      108 021 200618
    * Rodin Onay Tanriverdi :   108 021 207888
    * Alican Cömert :           108 021 202896

    Außerdem wurden folgende Funktionen bearbeitet:
    Mindestanforderungen:
        * Datenmodell:  Entwerfen Sie ein UML-Diagramm, welches die oben genannten Ei-
                        genschaften in einer Klassenstruktur zusammenfasst.
        * GUI:          Erstellen Sie eine grafische Benutzeroberfläche zum Anzeigen von Mitarbeitern
                        und Aufträgen.
        * GUI:          Implementieren Sie Funktionen zum Erstellen, Editieren und Löschen von
                        Aufträgen und Mitarbeitern.
        * Zuweisung:    Mitarbeiter sollen zu Aufträgen zugeordnet werden können. Mitarbeiter
                        können mehrere Aufträge annehmen, und Aufträge können von mehreren Mitarbei-
                        ter bearbeitet werden.
        * Export: Aufträge und Mitarbeiter sollen als .csv geschrieben werden

    ---

    Zusätzliche Anforderungen:
        * Terminbelegung:   Ein Mitarbeiter sollte keine Aufträge zugewiesen bekommen, wenn
                            dieser zeitlich mit einem anderen Auftrag überschneidet.
    */
    public static void main(String[] args) {
        gui = new FirmaGUI();
    }

    //Methode um Arbeiter in die Tabelle hinzuzufügen
    //----------------------------------------
    public void ArbeiterZurTabelleHinzufügen() {
        /*
        Hier wird erstmal ein Array "row" vom Typ "Object" erstellt. Wir können ganz einfach ein Array nutzen,
        weil die anzahl der Spalten bzw. Attribute fix ist und während der Laufzeit nicht noch vergrößert bzw.
        verkleinert werden muss. Der Datentyp "Object" ist quasi ein Allrounder unter den
        Datentypen. Der Vorteil ist, dass wir praktisch alles reinpacken können (int, String,Objekte etc.)
        
        Das DefaultTableModel, kann man sich vorstellen wie ein 2-Dimensionales Array. Der Vorteil dieser Klasse ist es,
        dass man ganz einfach rows (zeilen) hinzufügen kann oder Zellen aufrufen kann. Um diesen zu erstellen, wird as model das die
        Tabelle Standartgemäß hat, einfach auf das DefaultTableModel "getypecastet".
        Wichtig ist noch zu wissen, dass es lediglich nur Tabelleneinträge sind. Leider wird allein durch das hinzufügen in die 
        Tabelle, nicht per se ein Objekt erstellt.
        */
        Object[] row = new Object[6];
        DefaultTableModel model = (DefaultTableModel) getTableArbeiter().getModel();
        
        //Hier wird jeder Mitarbeiter, in eine "schublade" des Arrays gestellt.
        for (int i = 0; i < Arbeiter.arbeiterListe.size(); i++) {
            row[0] = Arbeiter.arbeiterListe.get(i).getArbeiterID();
            row[1] = Arbeiter.arbeiterListe.get(i).getName();
            row[2] = Arbeiter.arbeiterListe.get(i).getBerufsBezeichnung();
            row[4] = Arbeiter.arbeiterListe.get(i).getEinstellungsDatum();
            row[3] = Arbeiter.arbeiterListe.get(i).getJahresGehalt();
            row[5] = Arbeiter.arbeiterListe.get(i).getHatAuftrag();

            //Diese if-Abfrage hat einen esthetischen Grund, nämlich wenn ein Arbeiter komplett Arbeitslos ist, dann mach ein Kreuz als zeichen.
            if (Arbeiter.arbeiterListe.get(i).getHatAuftrag() == false) {
                row[5] = '✖';
            }

        }
        /*
        Diese Methode macht das entscheidende.... nämlich fügt sie die Tabelle als eine Hintereinanderreihung des Arrays 
        in eine Zeile ein.
        */
        model.addRow(row);
        

    }
    //----------------------------------------
    
    
    //Methode um einen Arbeiter, von der Tabelle zu entfernen
    //----------------------------------------
    public void ArbeiterVonTabelleEntfernen(JTable table) {
        /*
        Auch hier wurde das DefaultTableModel benutzt, um Zeilen zu entfernen oder hinzuzufügen. Auch hier können wir das
        Standartmodel vom JTable, als den DefaultTableModel Typecasten.
        */
        DefaultTableModel model = (DefaultTableModel) this.getTableArbeiter().getModel();
        /*
        mit der if-Abfrage, gucken wir ob die Zeile überhautpt elemente enthält. Wenn ein Element Leer ist, hat es im Jtable immer
        den Wert -1. Wenn die Zeile nicht leer ist also nicht den Wert -1 hat, kann das System bedenkenlos die Folgenden Methoden
        ausführen. Die Erste Methode entfern das Objekt, während die zweite Methode lediglich den Tabelleneintrag entfernt.
        */
        if (table.getSelectedRow() != -1) {                                                   
            Arbeiter.arbeiterListe.remove(table.getSelectedRow());
            model.removeRow(table.getSelectedRow());
        }
    }
    //----------------------------------------
    
    //Methode um die Attribute der Arbeiter zu verändern.
    //----------------------------------------
    public void arbeiterTabelleAbÄndern(JTable table) throws Exception  { 
        /*
        Das throws Exception mach ich, damit ich überhaupt den try-catch nutzen kann. Außerdem signalisieren wir mit dem Stichtwort, 
        "throws" dass es sein kann, dass das System ein Exception (plötzlich unerwarteter Fehler) rauswirft und abgefangen werden möchte.
        */
        //Hier nutzen wir wieder das DefaultTableModel, aufgrund seiner bereits genannten Vorteile.
        DefaultTableModel model = (DefaultTableModel) this.getTableArbeiter().getModel();
        //Die if-Abfrage überprüft, ob die Zelle leer ist, die wie verändern möchten. 
        if (table.getSelectedRow() != -1) {
            /*
            Nun wollen wür überprüfen, um welche Spalte bzw. Attribut des Objekt es sich handelt. Dazu nutzen wir viele
            if-Abfragen, die alle genau das überprüfen. Alternativ, hätte man die Überprüfung auch mithilfe eines "switch-case"
            machen können. Trifft eines der if-Abfragen zu, dann erscheint ein Eingabefenster, wo wir das neue Attribut eingeben können.
            Nach der Eingabe, wird der neue Eintrag sowohl in der Tabelle, als auch im Objekt verändert.
            */
            if (model.getColumnName(table.getSelectedColumn()) == "ID") {
                int aenderungZahl = Integer.parseInt(JOptionPane.showInputDialog(null, "Geben Sie die neue ID ein?"));
                //Hier wird überprüft, ob die ArbeiterID, bereits vorhanden ist.
                for (int i = 0; i < Arbeiter.arbeiterListe.size(); i++) {
                    if (Arbeiter.arbeiterListe.get(i).getArbeiterID() == aenderungZahl) {
                        JOptionPane.showMessageDialog(null, "Diese ArbeiterID existiert bereits");
                        return;
                    }   
                }
                /*
                Diesen try-catch, müssen wir unbedingt machen, wenn wir die Exception auffangen wollen, die erscheint, wenn man keine
                ganze Zahl eingibt
                */
                model.setValueAt(aenderungZahl, table.getSelectedRow(), table.getSelectedColumn());
                Arbeiter.arbeiterListe.get(table.getSelectedRow()).setArbeiterID(aenderungZahl);
            } else if (model.getColumnName(table.getSelectedColumn()) == "Name") {
                String aenderungWort = JOptionPane.showInputDialog(null, "Geben Sie den neuen Namen ein");
                model.setValueAt(aenderungWort, table.getSelectedRow(), table.getSelectedColumn());
                Arbeiter.arbeiterListe.get(table.getSelectedRow()).setName(aenderungWort);
            } else if (model.getColumnName(table.getSelectedColumn()) == "Beruf") {
                String aenderungWort = JOptionPane.showInputDialog(null, "Geben Sie den neuen Beruf ein");
                model.setValueAt(aenderungWort, table.getSelectedRow(), table.getSelectedColumn());
                Arbeiter.arbeiterListe.get(table.getSelectedRow()).setBerufsBezeichnung(aenderungWort);
            } else if (model.getColumnName(table.getSelectedColumn()) == "Jahresgehalt") {
                double aenderungZahl = Double.parseDouble(JOptionPane.showInputDialog(null, "Geben Sie das neue Gehalt ein"));
                model.setValueAt(aenderungZahl, table.getSelectedRow(), table.getSelectedColumn());
                Arbeiter.arbeiterListe.get(table.getSelectedRow()).setJahresGehalt(aenderungZahl);
            } else if (model.getColumnName(table.getSelectedColumn()) == "Einstellungsdatum") {
                String neuesDatum = JOptionPane.showInputDialog(null, "Geben Sie das neue Einstellungsdatum ein");
                model.setValueAt(Arbeiter.stringZuDatumKonvertieren(neuesDatum), table.getSelectedRow(), table.getSelectedColumn());
                Arbeiter.arbeiterListe.get(table.getSelectedRow()).setEinstellungsDatum(Arbeiter.stringZuDatumKonvertieren(neuesDatum));
            }
           
        }
    }
    //----------------------------------------

    //Methoden für die Bauaufträge
    
    //Methode um den Bauauftrag, zur Tabelle hinzuzufügen
    //----------------------------------------
    public void bauauftragZurTabelleHinzufügen() {
        /*
        Hier ist das Prinzip eigentlich genau gleich wie bei der Methode "ArbeiterZurTabelleHinzufügen()".
        Auch hier wird zunächst ein Array erstellt. Diesmal ist es größer, weil wir für die Klasse Bauauftrag,
        auch mehr Attribute haben als bei der Klasse Arbeiter. Auch hier benutzen wir das DefaultTableModel, damit wir 
        Zeilen bearbeiten und abfragen können.
        */
        DefaultTableModel model = (DefaultTableModel) getTableBauaufträge().getModel();
        Object[] row = new Object[7];

        for (int i = 0; i < Bauauftrag.bauAuftragListe.size(); i++) {
            row[0] = Bauauftrag.bauAuftragListe.get(i).getBauauftragsID();
            row[1] = Bauauftrag.bauAuftragListe.get(i).getAuftragGeber();
            row[2] = Bauauftrag.bauAuftragListe.get(i).getadresse();
            row[3] = Bauauftrag.bauAuftragListe.get(i).getOrt();
            row[4] = Bauauftrag.bauAuftragListe.get(i).getBeschreibung();
            row[5] = Bauauftrag.bauAuftragListe.get(i).getStartDatum();
            row[6] = Bauauftrag.bauAuftragListe.get(i).getEndDatum();

        }
        
        /*
        Auch hier wird werden die Information mittels einer hintereinanderreihung der Elemente des Arrays in eine Zeile eingefügt.
        */
        model.addRow(row);

    }

    //Methode, um Bauauftrag von der Tabelle zu entfernen
    //----------------------------------------
    public void bauauftragVonTabelleEntfernen(JTable table1, JTable table2) {
        //Hier benutzen wir für die methode addRow das DefaultTableModel.
        DefaultTableModel model = (DefaultTableModel) this.getTableBauaufträge().getModel();
        //Mit der if-Abfrage überprüfen wir, ob die Reihe leer ist, denn man kann ja nicht nichts entfernen
        if (table2.getSelectedRow() != -1) {
            /*
            Diese Schleife, hat nur einen Esthetischen Aspekt. Wenn ein Bauauftrag entfernt wird, und fügt ein x bei der Spalte
            "hatAuftrag" des Arbeiters, falls das der einzige Job war, den dieser Arbeiter hatte.
            */
            for (int i = 0; i < Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().size(); i++) {
                Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().get(i).setHatAuftrag(false);
                table1.setValueAt('✖', i, 5);
            }
            /*
            Diese for-Schleife ist schon etwas wichtiger. Hier ist das so, dass jeder Arbeiter, die Start und Enddaten der Bauaufträge zu denen 
            er zugeteilt wird speichert. Diese for schleife, und die darin enthaltenen if-Abfragen sorgen dafür, dass die Daten dann entfernt werden,
            und der Arbeiter dann diese Zeitspanne wieder frei hat.
            */
            if(!Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().isEmpty())
            for (int k = 0; k < Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().size();k++){
                if(Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().get(k) == Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getStartDatum()){
                    Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().remove(k);
                }
                if(Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsEnde().get(k) == Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getEndDatum()){
                    Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsEnde().remove(k);
                }
            }
            
            /*
            Haben wir die Termine vom arbeiter entfernt, entfernen wir nun das Objekt, und den Tabelleneintrag.
            */
            Bauauftrag.bauAuftragListe.remove(table2.getSelectedRow());
            model.removeRow(table2.getSelectedRow());
            
        }
    }
    //----------------------------------------
    
    //Methode, um Bauaufträge von der
    //----------------------------------------
    public void bauAuftragTabelleAbändern(JTable table) throws Exception {
        /*
        Hier Funktioniert das Prinzip analog zu der Methode "ArbeiterTabelleAbändern()". 
        */
        DefaultTableModel model = (DefaultTableModel) this.getTableBauaufträge().getModel();
        if (table.getSelectedRow() != -1) {
            /*
            Auch hier klappern wir viele Fälle ab um zu überprüfen, welches Attribut wir jetzt verändern müssen. Hier wird also
            überprüft, In Welcher spalte sich die angeklickte Zelle befindet.
            */
            if (model.getColumnName(table.getSelectedColumn()) == "ID") {
                int aenderungZahl = Integer.parseInt(JOptionPane.showInputDialog(null, "Geben Sie die neue ID ein"));
                for (int i = 0; i < Bauauftrag.bauAuftragListe.size(); i++) {
                    if (Bauauftrag.bauAuftragListe.get(i).getBauauftragsID() == aenderungZahl) {
                        JOptionPane.showMessageDialog(null, "Dieser Bauauftrag exisitert schon ");
                        return;
                    }
                }
                model.setValueAt(aenderungZahl, table.getSelectedRow(), table.getSelectedColumn());
                Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).setBauauftragsID(aenderungZahl);
            }
            else if (model.getColumnName(table.getSelectedColumn()) == "Auftraggeber") {
                String aenderungWort = JOptionPane.showInputDialog(null, "Wie soll der neue Auftraggeber heißen?");
                model.setValueAt(aenderungWort, table.getSelectedRow(), table.getSelectedColumn());
                Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).setAuftragGeber(aenderungWort);

            }
            else if (model.getColumnName(table.getSelectedColumn()) == "Adresse") {
                String aenderungWort = JOptionPane.showInputDialog(null, "Geben Sie die neue Adresse ein");
                model.setValueAt(aenderungWort, table.getSelectedRow(), table.getSelectedColumn());
                Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).setAdresse(aenderungWort);

            }
            else if (model.getColumnName(table.getSelectedColumn()) == "Ort") {
                String aenderungWort = JOptionPane.showInputDialog(null, "Geben Sie den neuen Ort ein");
                model.setValueAt(aenderungWort, table.getSelectedRow(), table.getSelectedColumn());
                Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).setOrt(aenderungWort);

            }
            else if (model.getColumnName(table.getSelectedColumn()) == "Tätigkeit") {
                String aenderungWort = JOptionPane.showInputDialog(null, "Geben Sie die neue Tätigkeit ein");
                model.setValueAt(aenderungWort, table.getSelectedRow(), table.getSelectedColumn());
                Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).setBeschreibung(aenderungWort);

            }
            else if (model.getColumnName(table.getSelectedColumn()) == "Anfangsdatum") {
                String aenderungWort = JOptionPane.showInputDialog(null, "Geben Sie das neue Anfangsdatum ein!!");
                if(Bauauftrag.stringZuDatumKonvertieren(aenderungWort).isAfter(Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).getEndDatum())){
                    JOptionPane.showMessageDialog(null,"Das Startdatum, kann nicht nach dem Enddatum sein");
                    return;
                }
                model.setValueAt(Bauauftrag.stringZuDatumKonvertieren(aenderungWort), table.getSelectedRow(), table.getSelectedColumn());


                for(int i = 0;i < Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).getBauAuftragMitArbeiter().size();i++) {
                    for (int j = 0; j < Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).getBauAuftragMitArbeiter().get(i).getAuftragsBegin().size(); j++) {
                        if (Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).getBauAuftragMitArbeiter().get(i).getAuftragsBegin().get(j).equals(Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).getStartDatum())) {
                            Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).getBauAuftragMitArbeiter().get(i).getAuftragsBegin().set(j, Bauauftrag.stringZuDatumKonvertieren(aenderungWort));

                        }
                    }
                }
                Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).setStartDatum(Bauauftrag.stringZuDatumKonvertieren(aenderungWort));

            }
            else if (model.getColumnName(table.getSelectedColumn()) == "Enddatum") {
                String aenderungWort = JOptionPane.showInputDialog(null, "Geben Sie das neue Enddatum ein!!");
                if(Bauauftrag.stringZuDatumKonvertieren(aenderungWort).isBefore(Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).getStartDatum())){
                    JOptionPane.showMessageDialog(null,"Das Enddatum kann nicht vor dem Anfangsdatum sein !!");
                    return;
                }
                model.setValueAt(Bauauftrag.stringZuDatumKonvertieren(aenderungWort), table.getSelectedRow(), table.getSelectedColumn());

                for(int i = 0;i < Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).getBauAuftragMitArbeiter().size();i++) {
                    for (int j = 0; j < Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).getBauAuftragMitArbeiter().get(i).getAuftragsEnde().size(); j++) {
                        if (Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).getBauAuftragMitArbeiter().get(i).getAuftragsEnde().get(j).equals(Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).getEndDatum())) {
                            Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).getBauAuftragMitArbeiter().get(i).getAuftragsEnde().set(j, Bauauftrag.stringZuDatumKonvertieren(aenderungWort));

                        }
                    }
                }
                Bauauftrag.bauAuftragListe.get(table.getSelectedRow()).setEndDatum(Bauauftrag.stringZuDatumKonvertieren(aenderungWort));
            }

        }
    }
    //----------------------------------------
    
    //Methode, um Arbeiter zu einem Bauauftrag zuzuweisen.
    //----------------------------------------
    public void arbeiterKriegtJob(JTable table1, JTable table2, Arbeiter a1) {
        /*
        Hier geben wir diesmal 2 Tabellen, als Parameter an. Anstelle von table1 übergeben wir dann die Tabelle von den Mitarbeitern.
        Anstelle von table2, übergeben wir dann die Tabelle der Bauaufträge.
        */
        //Diese Variable kann man sich wie ein Hebel vorstellen der aktiv werden muss, damit das System den Arbeiter zuweisen kann.
        boolean beschäftigt = false;
        if (Bauauftrag.bauAuftragListe.isEmpty() && Arbeiter.arbeiterListe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Wir haben keine Bauaufträge und keine Arbeiter");
            return;
        }

        /*
        Diese if-Abfrage dient dazu, dass wenn ein Arbeiter zu einem Job eingetragen wird, wo es ihn nichtmal gab eine Fehlermeldung
        kommt und der Arbeiter dann selbstverständlich nicht eingetragen wird.
        */
        if (Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getStartDatum().isBefore(Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getEinstellungsDatum())) {
                JOptionPane.showMessageDialog(null, "Der Arbeiter war zu diesem Zeitpunkt noch nicht eingestellt ");
                return;
        }
        
        /*
        Diese for-schleife überprüft, ob der Arbeiter bereits in dem Bauauftrag drinne ist oder nicht. Schließlich, kann der
        Arbeiter sich nicht teilen.
         */
        for (int i = 0; i < Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().size(); i++) {
            if (Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().get(i).equals(Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getStartDatum())) {
                JOptionPane.showMessageDialog(null, "Dieser Mitarbeiter, ist bereits in diesem Bauauftrag.");
                return;
            }
        }
        /*
        Diese for-schleife bzw. die darin enthaltene if-Abfrage ist Essenziell für diese Methode. Sie blockt den Arbeiter für einen bestimmten Zeitraum, damit er
        in diesem Zeitraum nicht für andere Bauaufträge eingetragen werden kann.
        Außerdem wird nochmal geguckt, ob er nicht schon bereits in diesem Auftrag zugeteilt wurde.
        Wenn wir jetzt den Fall haben, dass der Arbeiter für einen bestimmten Auftrag geblockt ist,weil er zu diesem Zeitpunkt beschäfrigt ist,
        dann schaltet sich die variable "beschäftigt" auf "true" und die folgende if-Abfrage fällt negativ aus.
        */
        
        for (int k = 0; k < Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().size(); k++) {

            if(Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().get(k).isBefore(Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getStartDatum()) || Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsEnde().get(k).isAfter(Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getEndDatum())){
                JOptionPane.showMessageDialog(null, "Der Arbeiter ist zu diesem Zeitpunkt beschäftigt");
                beschäftigt = true;
                return;
            }
        }
        /*
        Falls aber jetzt der die if-Abfrage davor negativ ausfallen sollte, dann wird aber jetzt die folgende if-Abfrage positiv
        ausfallen.

        Zunächst mal, sollte erklärt werden, wie überhaupt die Mitarbeiter in die Bauaufträge gespeichert werden.
        Jedes Bauauftragobjekt, besitzt eine Liste von typ "Arbeiter" mit den Bauaufträgen drin.
        */
        if(beschäftigt == false){
        /*
        Als erstes wird nach der Abfrage, der ein Objekt in die Liste eingefügt.
         */
        Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().add(a1);

        //Danach erhalten die Mitarbeiter dann das Start und das Enddatum des Auftrags, zu dem sie Eingeteilt werden.
        Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().add(Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getStartDatum());
        Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsEnde().add(Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getEndDatum());

        //Nun folgen ein paar optische dinger, wie z.B dass eine Bestätigung erscheint, oder der Mitarbeiter dann einen haken bekommt.
        JOptionPane.showMessageDialog(null, "Arbeiter erfolgreich hinzugefügt");
        Arbeiter.arbeiterListe.get(table1.getSelectedRow()).setHatAuftrag(true);
        table1.setValueAt('✓', table1.getSelectedRow(), 5);

        }
    }
    //----------------------------------------
    

    //Methode , um Arbeiter von einem Bauauftrag zu entziehen
    public void arbeiterWirdArbeitslos(JTable table1, JTable table2, Arbeiter a1) {
        /*
        Ähnlich wie bei der Methode "arbeiterKriegtJob()", wird auch hier mit beiden Tabellen gleichzeitig gearbeitet.
         */
        //Hier checken wir erstmal ab, ob wir überhaupt Bauaufträge haben
        if (Bauauftrag.bauAuftragListe.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Wir haben keine Bauaufträge");
            return;
        }

        //checkt erstmal, ob ein Mitarbeiter ausgewählt wurde
        if (!table1.isRowSelected(table1.getSelectedRow())) {
            JOptionPane.showMessageDialog(null, "Sie müssen noch einen Arbeiter auswählen");
            return;
        }

        //checkt erstmal, ob ein Mitarbeiter ausgewählt wurde
        if (!table2.isRowSelected(table2.getSelectedRow())) {
            JOptionPane.showMessageDialog(null, "Sie müssen noch einen Bauauftrag auswählen");
            return;
        }

        //Hier wird die blockierung entfernt, die der Arbeiter in seinem Terminkalender für diesen Auftrag hat.
        for (int i = 0; i < Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().size(); i++) {
            if (Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().get(i).equals(Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getStartDatum())) {
                Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().remove(i);
                Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsEnde().remove(i);
            }
        }
        //Hier wird der das Objekt Bauauftrag von System gelöscht
        Bauauftrag.bauAuftragListe.get(table2.getSelectedRow()).getBauAuftragMitArbeiter().remove(a1);
        //Der Mitarbeiter bekommt in der Tabelle dank dieser if-Abfrage ein "x", falls er komplett keine Aufgabe hat.
        if (Arbeiter.arbeiterListe.get(table1.getSelectedRow()).getAuftragsBegin().isEmpty()) {
            Arbeiter.arbeiterListe.get(table1.getSelectedRow()).setHatAuftrag(false);
            table1.setValueAt('✖', table1.getSelectedRow(), 5);
        }
        JOptionPane.showMessageDialog(null, "Arbeiter erfolgreich entfernt");
    }


    public javax.swing.JButton getArbeiterVonBauauftragLöschenButton() {
        return arbeiterVonBauauftragLöschenButton;
    }

    public void setArbeiterVonBauauftragLöschenButton(javax.swing.JButton arbeiterVonBauauftragLöschenButton) {
        this.arbeiterVonBauauftragLöschenButton = arbeiterVonBauauftragLöschenButton;
    }

    public javax.swing.JButton getArbeiterZuBauauftrag() {
        return arbeiterZuBauauftrag;
    }

    public void setArbeiterZuBauauftrag(javax.swing.JButton arbeiterZuBauauftrag) {
        this.arbeiterZuBauauftrag = arbeiterZuBauauftrag;
    }

    public javax.swing.JButton getArbeiterÄndernButton() {
        return arbeiterÄndernButton;
    }


    public void setArbeiterÄndernButton(javax.swing.JButton arbeiterÄndernButton) {
        this.arbeiterÄndernButton = arbeiterÄndernButton;
    }

    public javax.swing.JButton getBauAuftragEntfernenButton() {
        return bauAuftragEntfernenButton;
    }

    public void setBauAuftragEntfernenButton(javax.swing.JButton bauAuftragEntfernenButton) {
        this.bauAuftragEntfernenButton = bauAuftragEntfernenButton;
    }

    public javax.swing.JButton getBauAuftragÄndernButton() {
        return bauAuftragÄndernButton;
    }

    public void setBauAuftragÄndernButton(javax.swing.JButton bauAuftragÄndernButton) {
        this.bauAuftragÄndernButton = bauAuftragÄndernButton;
    }


    public javax.swing.JButton getBauAufträgeHinzufügenButton() {
        return bauAufträgeHinzufügenButton;
    }

    public void setBauAufträgeHinzufügenButton(javax.swing.JButton bauAufträgeHinzufügenButton) {
        this.bauAufträgeHinzufügenButton = bauAufträgeHinzufügenButton;
    }

    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }


    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public javax.swing.JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(javax.swing.JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public javax.swing.JPanel getMainFrame() {
        return mainFrame;
    }


    public void setMainFrame(javax.swing.JPanel mainFrame) {
        this.mainFrame = mainFrame;
    }


    public javax.swing.JButton getMitarbeiterEntfernenButton() {
        return mitarbeiterEntfernenButton;
    }


    public void setMitarbeiterEntfernenButton(javax.swing.JButton mitarbeiterEntfernenButton) {
        this.mitarbeiterEntfernenButton = mitarbeiterEntfernenButton;
    }


    public javax.swing.JButton getMitarbeiterHinzufügenButton() {
        return mitarbeiterHinzufügenButton;
    }

    public void setMitarbeiterHinzufügenButton(javax.swing.JButton mitarbeiterHinzufügenButton) {
        this.mitarbeiterHinzufügenButton = mitarbeiterHinzufügenButton;
    }


    public javax.swing.JTable getTableArbeiter() {
        return tableArbeiter;
    }

    public void setTableArbeiter(javax.swing.JTable tableArbeiter) {
        this.tableArbeiter = tableArbeiter;
    }

    public javax.swing.JTable getTableBauaufträge() {
        return tableBauaufträge;
    }

    public void setTableBauaufträge(javax.swing.JTable tableBauaufträge) {
        this.tableBauaufträge = tableBauaufträge;
    }

    public javax.swing.JButton getErweitert() {
        return erweitert;
    }

    public void setErweitert(javax.swing.JButton erweitert) {
        this.erweitert = erweitert;
    }


}
