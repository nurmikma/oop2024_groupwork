import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Main {
    public static double soodus(){
        double soodus = Math.random()*60;
        return Math.round(soodus * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        System.out.println("Tere tulemast meie autorendisüsteemi! Teil on võimalik sisestada enda andmed ja vastavad soovid. \n" +
                "Vastavalt neile saate valida sobiva auto, millega saate sõitma hakata \uD83D\uDE42");
        String rentijaNimi = JOptionPane.showInputDialog(null, "Sisesta nimi ", "Andmete sisestamine", JOptionPane.QUESTION_MESSAGE);
        String rentijaVanus = JOptionPane.showInputDialog(null, "Sisesta vanus ", "Andmete sisestamine", JOptionPane.QUESTION_MESSAGE);
        String loatüüp = JOptionPane.showInputDialog(null, "Sisesta loatüüp (B, C)", "Andmete sisestamine", JOptionPane.QUESTION_MESSAGE);
        String kauaOlnudLoad = JOptionPane.showInputDialog(null, "Mitu aastat sul load on olnud ", "Andmete sisestamine", JOptionPane.QUESTION_MESSAGE);
        String soovitudAutotüüp = JOptionPane.showInputDialog(null, "Mis autotüüpi soovid (premium, tavaline, kaubik) ", "Andmete sisestamine", JOptionPane.QUESTION_MESSAGE);
        String distants = JOptionPane.showInputDialog(null, "Sisesta läbitava distantsi pikkus ", "Andmete sisestamine", JOptionPane.QUESTION_MESSAGE);
        String päevadeArv = JOptionPane.showInputDialog(null, "Sisesta renditavate päevade arv ", "Andmete sisestamine", JOptionPane.QUESTION_MESSAGE);
        String soovitudMaksumus = JOptionPane.showInputDialog(null, "Kui palju sa oleksid nõus oma rendi eest kokku maksma, teeme sulle " +
                "vastava pakkumise (premium(150-200päev), tavaline(80-100päev), kaubik(100-120päev)) ", "Andmete sisestamine", JOptionPane.QUESTION_MESSAGE);

        int uus_rentijaVanus = Integer.parseInt(rentijaVanus);
        int uus_kauaOlnudLoad = Integer.parseInt(kauaOlnudLoad);
        double uus_distants = Double.parseDouble(distants);
        int uus_päevadeArv = Integer.parseInt(päevadeArv);
        double uus_SoovitudMaksumus = Double.parseDouble(soovitudMaksumus);

        Rentija uus = new Rentija(rentijaNimi, uus_rentijaVanus, loatüüp, uus_kauaOlnudLoad, soovitudAutotüüp, uus_distants, uus_päevadeArv);
        Andmetöötleja andmetootleja = new Andmetöötleja();

        Map<String, ArrayList<? extends Masin>> autodeDictionary = null;
        try {
            autodeDictionary = andmetootleja.loeAutod("rendiautod.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        while(true) {
            if (uus.getSoovitudAutotüüp() == "premium"){
                for (PremiumSõiduauto auto : (ArrayList<PremiumSõiduauto>) autodeDictionary.get("premium")) {
                    System.out.println(auto.toString());
                    System.out.println("Soodus: " + soodus());
                    System.out.println(auto.rendiMaksumus(new Rentija(uus));
                }
            } else if (uus.getSoovitudAutotüüp() == "tavaline") {
                for (TavalineSõiduauto auto : (ArrayList<TavalineSõiduauto>) autodeDictionary.get("tavaline")) {
                    System.out.println(auto.toString());
                    System.out.println("Soodus: " + soodus());
                    System.out.println(auto.rendiMaksumus(new Rentija(uus));
                }
            } else {
                for (Kaubik auto : (ArrayList<Kaubik>) autodeDictionary.get("kaubik")) {
                    System.out.println(auto.toString());
                    System.out.println("Soodus: " + soodus());
                    System.out.println(auto.rendiMaksumus(new Rentija(uus));
            }
        }
    }
}