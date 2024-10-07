package Modell;

public class Auto {

    private String szin, rendszam;
    private boolean extra;

    public String getSzin() {
        return szin;
    }

    public String getRendszam() {
        return rendszam;
    }

    public boolean isExtra() {
        return extra;
    }

    public void keretunkExtrat(boolean extra) {
        this.extra = true;
    }

    public void nemKertunkExtrat(boolean extra) {
        this.extra = false;
    }

    public Auto(String szin, String rendszam) {
        this(szin, rendszam, false);
    }

    public Auto(String szin, String rendszam, boolean extra) {
        this.szin = szin;
        this.rendszam = rendszam;
        this.extra = extra;
    }

}
