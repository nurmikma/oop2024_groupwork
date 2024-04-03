import java.util.ArrayList;

public class Kaubik extends Masin {

    private ArrayList<Kaubik> kaubikud = new ArrayList<>();

    public ArrayList<Kaubik> getKaubikud() {
        return kaubikud;
    }

    private double kandevõime;

    public Kaubik(String mudel, int aasta, double rendihind, double kandevõime, boolean saadavus) {
        super(mudel, aasta, rendihind, saadavus);
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
