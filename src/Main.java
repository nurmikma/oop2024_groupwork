import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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
        }

    }
}