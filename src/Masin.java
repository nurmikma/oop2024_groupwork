public class Masin {
    private String mudel;
    private int aasta;
    private double rendihind;
    private boolean saadavus;

    public Masin(String mudel, int aasta, double rendihind) {
        this.mudel = mudel;
        this.aasta = aasta;
        this.rendihind = rendihind;
        this.saadavus = true; // Alguses on auto saadaval
    }

    public String getMudel() {
        return mudel;
    }

    public int getAasta() {
        return aasta;
    }

    public double getRendihind() {
        return rendihind;
    }

    public boolean isSaadaval() {
        return saadavus;
    }

    public void rendiAuto() {
        this.saadavus = false;
    }

    public void tagastaAuto() {
        this.saadavus = true;
    }
    public abstract void rendiMaksumus();
}

