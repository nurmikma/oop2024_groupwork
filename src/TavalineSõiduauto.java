import java.util.ArrayList;

public class TavalineSõiduauto extends Masin {
    private ArrayList<TavalineSõiduauto> TavalisedSõiduautod = new ArrayList<>();

    public ArrayList<TavalineSõiduauto> getTavalisedSõiduautod() {
        return TavalisedSõiduautod;
    }

    public TavalineSõiduauto(String mudel, int aasta, double rendihind, boolean saadavus) {
        super(mudel, aasta, rendihind, saadavus);
    }

    @Override
    public double rendiMaksumus(Rentija rentija) {
        double rendiSumma;
        if(rentija.getRenditudPäevad() <= 3){
            rendiSumma = getRendihind() * rentija.getRenditudPäevad();
        }else if (rentija.getRenditudPäevad() > 3 && rentija.getRenditudPäevad() <= 7){
            rendiSumma = getRendihind() * rentija.getRenditudPäevad() * 0.8;
        }else{
            rendiSumma = getRendihind() * rentija.getRenditudPäevad() * 0.7;
        }


        return rendiSumma;
    }
}
