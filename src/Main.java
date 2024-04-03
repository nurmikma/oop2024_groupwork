import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static double soodus(){
        double soodus = Math.random()*60;
        return Math.round(soodus * 100.0) / 100.0;
    }
    public static void main(String[] args) {
        System.out.println("Tere tulemast meie autorendisüsteemi! Teil on võimalik sisestada enda andmed ja vastavad soovid. \n" +
                "Vastavalt neile saate valida sobiva auto, millega saate sõitma hakata \uD83D\uDE42");
        System.out.println();
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
        for (PremiumSõiduauto auto : (ArrayList<PremiumSõiduauto>) autodeDictionary.get("premium")) {
            System.out.println(auto.toString());
            System.out.println(auto.rendiMaksumus(new Rentija("John Doe",4, "B", 4,"premium", 800, 12)));
            System.out.println("Soodus: "+soodus());
            System.out.println(auto.rendiMaksumus(new Rentija("John Doe",4, "B", 4,"premium", 800, 12))-soodus());
        }
    }
}