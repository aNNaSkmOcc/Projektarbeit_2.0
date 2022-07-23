package lelelleel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class erweitert extends JFrame {
    private JButton zugewieseneArbeiterButton;
    private JPanel mainFrame;

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
        exportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

        exportButton.addActionListener(new ActionListener)

  */
    }
}
