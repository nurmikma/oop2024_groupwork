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

    // Call the loeAutod method and catch any potential exceptions
    Map<String, ArrayList<? extends Masin>> autodeDictionary = null;
        try {
        autodeDictionary = andmetootleja.loeAutod("rendiautod.txt");
        // Do something with the autodeDictionary if needed
    } catch (Exception e) {
        // Handle any exceptions that might occur during the method call
        e.printStackTrace();
    }


        // Example of iterating over the premium cars list
            /*for (PremiumSõiduauto auto : (ArrayList<PremiumSõiduauto>) autodeDictionary.get("premium")) {
                System.out.println(auto.toString());
                System.out.println(auto.rendiMaksumus(new Rentija("John Doe", 4, "B", 4, "premium", 800, 12)));
                System.out.println("Soodus: " + soodus());
                System.out.println(auto.rendiMaksumus(new Rentija("John Doe", 4, "B", 4, "premium", 800, 12)) - soodus());
            }*/
        System.out.println(soovitudAutotüüp);
        int index = 0;
        if (soovitudAutotüüp.strip().equals("premium")){

            for (PremiumSõiduauto auto : (ArrayList<PremiumSõiduauto>) autodeDictionary.get("premium")) {
                if (autodeDictionary.get(soovitudAutotüüp).get(index).isSaadaval()){
                    System.out.println((index +1) +": "  + auto.toString());
                    System.out.println("Soodus: " + soodus());
                    System.out.println(auto.rendiMaksumus(uus));
                }
                index++;


            }
            index = 0;

        } else if (soovitudAutotüüp.strip().equals("tavaline")) {
            for (PremiumSõiduauto auto : (ArrayList<PremiumSõiduauto>) autodeDictionary.get("tavaline")) {
                if (autodeDictionary.get(soovitudAutotüüp).get(index).isSaadaval()){
                    System.out.println((index +1) +": "  + auto.toString());
                    System.out.println("Soodus: " + soodus());
                    System.out.println(auto.rendiMaksumus(uus));
                }
                index++;


            }
            index = 0;
        } else if (soovitudAutotüüp.strip().equals("kaubik")) {
            for (PremiumSõiduauto auto : (ArrayList<PremiumSõiduauto>) autodeDictionary.get("kaubik")) {
                if (autodeDictionary.get(soovitudAutotüüp).get(index).isSaadaval()){
                    System.out.println((index +1) +": "  + auto.toString());
                    System.out.println("Soodus: " + soodus());
                    System.out.println(auto.rendiMaksumus(uus));
                }
                index++;


            }
            index = 0;
        }
        /*String renditav = JOptionPane.showInputDialog(null, "Sisesta auto number ", "Auto rentimine", JOptionPane.QUESTION_MESSAGE);
        int rent = Integer.parseInt(renditav);
        System.out.println(autodeDictionary.get(soovitudAutotüüp).get(rent - 1));
        autodeDictionary.get(soovitudAutotüüp).get(rent - 1).rendiAuto();
        for (PremiumSõiduauto auto : (ArrayList<PremiumSõiduauto>) autodeDictionary.get("premium")) {
            if (autodeDictionary.get(soovitudAutotüüp).get(index).isSaadaval()){
                System.out.println((index +1) +": "  + auto.toString());
                System.out.println("Soodus: " + soodus());
                System.out.println(auto.rendiMaksumus(uus));
            }

        index++;}
        index = 0;*/
    }
}