package lelelleel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.time.LocalDate;

public class erweitert extends JFrame {
    private JButton exportBauaufträgeButton;
    private JButton importBauaufträgeButton;
    private JButton zugewieseneArbeiterButton;
    private JPanel mainFrame;
    private JButton exportArbeiterlisteButton;
    private JButton importArbeiterlisteButton;

    public erweitert() {
        this.setContentPane(mainFrame);
        this.setVisible(true);                                  //sorgt dafür, dass wir das Fenster überhaupt sehenn
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.pack();

        zugewieseneArbeiterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {//
                new zugewieseneMitArbeiter(FirmaGUI.gui.getTableBauaufträge()).setVisible(true);
            }
        });
 /*


            }
        });
    }



  */
        exportBauaufträgeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(Bauauftrag.bauAuftragListe.isEmpty()){
                        JOptionPane.showMessageDialog(null,"Sie müssen erst Bauaufträge hinzufügen. Sonst exportieren Sie eine leere Liste");
                        return;
                    }
                    FileWriter writer = new FileWriter("Bauauftragliste.csv");
                    PrintWriter out = new PrintWriter(writer);

                    for(int i = 0;i < Bauauftrag.bauAuftragListe.size(); i++){
                        out.append("" + Bauauftrag.bauAuftragListe.get(i).getBauauftragsID());
                        out.append("/");
                        out.append("" + Bauauftrag.bauAuftragListe.get(i).getAuftragGeber());
                        out.append("/");
                        out.append("" + Bauauftrag.bauAuftragListe.get(i).getadresse());
                        out.append("/");
                        out.append("" + Bauauftrag.bauAuftragListe.get(i).getBeschreibung());
                        out.append("/");
                        out.append("" + Bauauftrag.bauAuftragListe.get(i).getOrt());
                        out.append("/");
                        out.append("" + Bauauftrag.bauAuftragListe.get(i).getStartDatum());
                        out.append("/");
                        out.append("" + Bauauftrag.bauAuftragListe.get(i).getEndDatum());
                        out.append("\n");


                    }
                    writer.close();
                    out.close();
                    JOptionPane.showMessageDialog(null,"Erfolgreich Exportiert");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
        exportArbeiterlisteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(Arbeiter.arbeiterListe.isEmpty()){
                        JOptionPane.showMessageDialog(null,"Sie müssen erst Arbeiter hinzufügen, sonst würden sie eine leere Liste exportieren");
                        return;
                    }
                    FileWriter writer = new FileWriter("Mitarbeiterliste.csv");
                    PrintWriter out = new PrintWriter(writer);

                    for(int i = 0;i < Arbeiter.arbeiterListe.size(); i++){
                        out.append("" + Arbeiter.arbeiterListe.get(i).getArbeiterID());
                        out.append("/");
                        out.append(Arbeiter.arbeiterListe.get(i).getName());
                        out.append("/");
                        out.append(Arbeiter.arbeiterListe.get(i).getBerufsBezeichnung());
                        out.append("/");
                        out.append("" + Arbeiter.arbeiterListe.get(i).getEinstellungsDatum());
                        out.append("/");
                        out.append("" + Arbeiter.arbeiterListe.get(i).getJahresGehalt());
                        out.append("\n");
                    }
                    writer.close();
                    out.close();
                    JOptionPane.showMessageDialog(null,"Erfolgreich Exportiert");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });




        importArbeiterlisteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {

                try {

                    FileReader fr = new FileReader("Mitarbeiterliste.csv");
                    BufferedReader br = new BufferedReader(fr);
                    while (true) {
                        System.out.println("test");
                        if (br.readLine() == null) break;
                        String[] s = new String[5];
                        s = br.readLine().split("/");
                        System.out.println(s[1]);
                        Arbeiter.arbeiterListe.add(new Arbeiter(s[1], Integer.parseInt(s[0]), s[2], Double.parseDouble(s[4]), LocalDate.parse(s[3])));

                    }
                } catch (Exception ex){

                }

            }
        });
    }
}