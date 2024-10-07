package Modell;

public class Bemutatok {

    private Auto[] autok;
    private int valasztas;

    public Bemutatok() {
        valasztas = -1;
        autok = new Auto[3];
        autok[0] = new Auto("Piros", "RHK567");
        autok[1] = new Auto("Kek", "RHZ876");
        autok[2] = new Auto("Zold", "LIR669");
     
    }

    public int getValasztas() {
        return valasztas;
    }

    public void setValasztas(int valasztas) {
        this.valasztas = valasztas;
    }

    public String kezdes() {
        String s = "";
        s += "Ezek az autóink vannak!\n";
        int i = 1;
        for (Auto auto : autok) {
            String r = auto.getRendszam();
            String sz = auto.getSzin();
            boolean e = auto.isExtra();
            s += i++ + ". " + r + " Autó színe:" + sz + " van e extrai? " + e + "\n";
        }
        return s;
    }

}
