import java.util.Date;

public class Broneering {
    private int broneeringuNr;
    private Date rendiaeg;
    private String kliendiNimi;
    private Masin renditudAuto;

    public Broneering(int broneeringuNr, Date rendiaeg, String kliendiNimi, Masin renditudAuto) {
        this.broneeringuNr = broneeringuNr;
        this.rendiaeg = rendiaeg;
        this.kliendiNimi = kliendiNimi;
        this.renditudAuto = renditudAuto;
    }

    public int getBroneeringuNr() {
        return broneeringuNr;
    }

    public Date getRendiaeg() {
        return rendiaeg;
    }

    public String getKliendiNimi() { return kliendiNimi; }

    public Masin getRenditudAuto() {
        return renditudAuto;
    }

    public void setRenditudAuto(Masin auto) {
        this.renditudAuto = auto;
    }

    public void tühistaBroneering() {
        renditudAuto.tagastaAuto();
        renditudAuto = null;
    }

    public Masin getAuto() {
        return renditudAuto;
    }
}
