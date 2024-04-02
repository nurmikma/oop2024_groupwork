public class Kaubik extends Masin {
    private double kandevõime;

    public Kaubik(String mudel, int aasta, double rendihind, double kandevõime) {
        super(mudel, aasta, rendihind);
        this.kandevõime = kandevõime;
    }
}
