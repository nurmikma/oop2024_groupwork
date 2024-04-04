public class PremiumSõiduauto extends Masin {
    public PremiumSõiduauto(String mudel, int aasta, double rendihind, boolean saadavus) {
        super(mudel, aasta, rendihind, saadavus);
    }

    @Override
    //arvuta kui palju rent maksab
    public double rendiMaksumus(Rentija rentija) {
        double rendiSumma;
        if(rentija.getRenditudPäevad() <= 3){
            rendiSumma = getRendihind() * rentija.getRenditudPäevad();
        }else if (rentija.getRenditudPäevad() > 3 && rentija.getRenditudPäevad() <= 7){
            rendiSumma = getRendihind() * rentija.getRenditudPäevad() * 0.8;
        }else{
            rendiSumma = getRendihind() * rentija.getRenditudPäevad() * 0.7;
        }


        return Math.round(rendiSumma * 100.0) / 100.0;
    }
}
