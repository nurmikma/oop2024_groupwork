import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Andmetöötleja {
    public static List<Andmetöötleja> loeAutod(String failinimi) throws Exception {
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
                    PremiumSõiduauto uusPremium = new PremiumSõiduauto(autoNimi, autoAasta, autoHind)
                }


                }
                String tüüp = osad[1];
                if (tüüp.equals("K")) {
                    double rohimatus = Double.parseDouble(osad[2]);
                    Kasvuhoonetaim uusTaim = new Kasvuhoonetaim(nimi, veevajadus, rohimatus);
                    tulemus.add(uusTaim);
                } else if (tüüp.equals("T")) {
                    boolean valgustatus = osad.length == 3;
                    Toataim uusTaim = new Toataim(nimi, veevajadus, valgustatus);
                    tulemus.add(uusTaim);
                }
            }
        }
    }
}
