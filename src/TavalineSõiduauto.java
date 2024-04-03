import java.util.ArrayList;

public class TavalineSõiduauto extends Masin {
    private ArrayList<TavalineSõiduauto> TavalisedSõiduautod = new ArrayList<>();
    public TavalineSõiduauto(String mudel, int aasta, double rendihind) {
        super(mudel, aasta, rendihind);
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
