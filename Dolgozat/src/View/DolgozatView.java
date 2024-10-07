package View;

import javax.swing.JOptionPane;

public class DolgozatView {

    public DolgozatView() {
    }

    public void megjelenites(String s) {
        JOptionPane.showMessageDialog(null, s);
    }

    public int kerdes() {
        String v = JOptionPane.showInputDialog("Szeretné e extrát adni valamelyikhez(1,2,3) ?");
        return Integer.parseInt(v) - 1;
    }
}
