import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RendiSüsteem {
    private List<Masin> autodeList = new ArrayList<>();
    private List<Broneering> broneeringuteList = new ArrayList<>();

    public void lisaAuto(Masin auto) {
        autodeList.add(auto);
    }

    public void eemaldaAuto(Masin auto) {
        autodeList.remove(auto);
    }

    public List<Masin> otsiSaadavadAutod() {
        List<Masin> saadavadAutod = new ArrayList<>();
        for (Masin auto : autodeList) {
            if (auto.isSaadaval()) {
                saadavadAutod.add(auto);
            }
        }
        return saadavadAutod;
    }

    public void broneeriAuto(Masin auto, String kliendiNimi, Date rendiaeg) {
        auto.rendiAuto();
        Broneering broneering = new Broneering(broneeringuteList.size() + 1, rendiaeg, kliendiNimi, auto);
        broneeringuteList.add(broneering);
    }

    public void tühistaBroneering(int broneeringuNr) {
        for (Broneering broneering : broneeringuteList) {
            if (broneering.getBroneeringuNr() == broneeringuNr) {
                broneering.tühistaBroneering();
                broneeringuteList.remove(broneering);
                break;
            }
        }
    }
}
