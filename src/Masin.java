public abstract class Masin {
    private String mudel;
    private int aasta;
    private double rendihind;
    private boolean saadavus;

    public Masin(String mudel, int aasta, double rendihind, boolean saadavus) {
        this.mudel = mudel;
        this.aasta = aasta;
        this.rendihind = rendihind;
        this.saadavus = saadavus;
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

    public String toString() {
        return "Mudel: " + mudel + ", Aasta: " + aasta + ", Rendihind: " + rendihind + ", Saadavus: " + saadavus;
    }

    public abstract double rendiMaksumus(Rentija rentija);
}

