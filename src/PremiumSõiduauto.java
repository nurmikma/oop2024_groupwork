import java.util.ArrayList;

public class PremiumSõiduauto extends Masin {
    private ArrayList<PremiumSõiduauto> PremiumSõiduautod = new ArrayList<>();

    public ArrayList<PremiumSõiduauto> getPremiumSõiduautod() {
        return PremiumSõiduautod;
    }

    public PremiumSõiduauto(String mudel, int aasta, double rendihind, boolean saadavus) {
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
