package Main;

import Control.DolgozatControl;
import Modell.Bemutatok;
import View.DolgozatView;

public class Dolgozat {

    public static void main(String[] args) {
        Bemutatok modell = new Bemutatok();
        DolgozatView view = new DolgozatView();
        new DolgozatControl(modell, view);

    }

}
