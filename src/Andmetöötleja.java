import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Andmetöötleja {
    //võtan listid ja need lisan dictionariesse.
    public ArrayList<PremiumSõiduauto> PremiumSõiduautod = new ArrayList<>();
    public ArrayList<TavalineSõiduauto> TavalineSõiduautod = new ArrayList<>();
    public ArrayList<Kaubik> kaubikud = new ArrayList<>();
    public Map<String, ArrayList<? extends Masin>> autodeDictionary = new HashMap<>();

    public Map<String, ArrayList<? extends Masin>> loeAutod(String failinimi) throws Exception {

        //loeb andmed failist sisse, muudab vastavateks objektideks ja lisab listidesse, mille omakorda hashmapi
        try (Scanner lugeja = new Scanner(new File(failinimi), "UTF-8")) {
            while (lugeja.hasNextLine()) {
                String rida = lugeja.nextLine();
                String[] osad = rida.split(";");
                String autoNimi = osad[0];
                int autoAasta = Integer.parseInt(osad[1]);
                double autoHind = Double.parseDouble(osad[2]);
                boolean kasSaadaval = Boolean.parseBoolean(osad[3]);
                String sõidukiTüüp = osad[4];
                if (sõidukiTüüp.equals("premium")) {
                    PremiumSõiduauto uusPremium = new PremiumSõiduauto(autoNimi, autoAasta, autoHind, kasSaadaval);
                    PremiumSõiduautod.add(uusPremium);
                } else if (sõidukiTüüp.equals("tavaline")) {
                    TavalineSõiduauto uusTavaline = new TavalineSõiduauto(autoNimi, autoAasta, autoHind, kasSaadaval);
                    TavalineSõiduautod.add(uusTavaline);
                } else {
                    Kaubik uusKaubik = new Kaubik(autoNimi, autoAasta, autoHind, kasSaadaval);
                    kaubikud.add(uusKaubik);
                }
            }
            autodeDictionary.put("premium", PremiumSõiduautod);
            autodeDictionary.put("tavaline", TavalineSõiduautod);
            autodeDictionary.put("kaubik", kaubikud);
        }
        return autodeDictionary;
    }
}
