import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RendiSüsteem {

    private List<Broneering> broneeringuteList = new ArrayList<>();


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
                broneering.getAuto().tagastaAuto();
                break;
            }
        }
    }
    public ArrayList<Masin> SaadavadAutod(Rentija rentija, ArrayList<Masin> autod, double min, double max){
        ArrayList<Masin> saadavadAutod = new ArrayList<>();
        for (Masin auto : autod) {
            if (auto.isSaadaval() && auto.rendiMaksumus(rentija) >= min && auto.rendiMaksumus(rentija) <= max){
                saadavadAutod.add(auto);
            }
        }
        return saadavadAutod;
    }
}
