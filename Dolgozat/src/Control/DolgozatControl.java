package Control;

import Modell.Auto;
import Modell.Bemutatok;
import View.DolgozatView;

public class DolgozatControl {

    private Bemutatok modell;
    private DolgozatView nezet;

    public DolgozatControl(Bemutatok modell, DolgozatView nezet) {
        this.modell = modell;
        this.nezet = nezet;
        start();
    }

    private void start() {
        nezet.megjelenites(modell.kezdes());
        modell.setValasztas(nezet.kerdes());
        nezet.megjelenites(modell.kezdes());
    }

}
