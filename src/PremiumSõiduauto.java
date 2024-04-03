public class PremiumSõiduauto extends Masin {
    public PremiumSõiduauto(String mudel, int aasta, double rendihind) {
        super(mudel, aasta, rendihind);
    }

    @Override
    public double rendiMaksumus(Rentija rentija) {
        double rendiSumma = getRendihind() * rentija.getRenditudPäevad();
        return rendiSumma;
    }
}
