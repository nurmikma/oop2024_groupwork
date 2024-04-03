public class Kaubik extends Masin {
    private double kandevõime;

    public Kaubik(String mudel, int aasta, double rendihind, double kandevõime) {
        super(mudel, aasta, rendihind);
        this.kandevõime = kandevõime;
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
