import java.time.LocalDate;

public class Rentija {
    private int vanus;
    private String loatüüp;
    private int kauaOlnudLoad;
    private String soovitudAutotüüp;
    private double km;
    private int rendiaeg;

    // Konstruktor
    public Rentija(int vanus, String loatüüp, int kauaOlnudLoad, String soovitudAutotüüp, double km, int rendiaeg) {
        this.vanus = vanus;
        this.loatüüp = loatüüp;
        this.kauaOlnudLoad = kauaOlnudLoad;
        this.soovitudAutotüüp = soovitudAutotüüp;
        this.km = km;
        this.rendiaeg = rendiaeg;
    }

    // Getterid ja setterid
    public int getVanus() {
        return vanus;
    }

    public void setVanus(int vanus) {
        this.vanus = vanus;
    }

    public String getLoatüüp() {
        return loatüüp;
    }

    public void setLoatüüp(String loatüüp) {
        this.loatüüp = loatüüp;
    }

    public int getKauaOlnudLoad() {
        return kauaOlnudLoad;
    }

    public void setKauaOlnudLoad(int kauaOlnudLoad) {
        this.kauaOlnudLoad = kauaOlnudLoad;
    }

    public String getSoovitudAutotüüp() {
        return soovitudAutotüüp;
    }

    public void setSoovitudAutotüüp(String soovitudAutotüüp) {
        this.soovitudAutotüüp = soovitudAutotüüp;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public int getRendiaeg() {
        return rendiaeg;
    }

    public void setRendiaeg(int rendiaeg) {
        this.rendiaeg = rendiaeg;
    }

    public boolean onÕigustatudLoaOlnudAjaSoodustuseks() {
        return kauaOlnudLoad > 5;
    }
}

