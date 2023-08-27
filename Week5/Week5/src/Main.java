import enums.Collor;
import enums.GrowthStatus;
import vegetables.Carrots;
import vegetables.Pepper;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Maak een instantie van de Carrots-klasse
        Carrots carrots = new Carrots(Collor.BLUE, 10000, 10000, 9);
        Pepper pepper = new Pepper(Collor.RED, 10000,10000,7);

        // Roep de statusVegetable-methode aan om de groei te simuleren
        GrowthStatus growthStatus1 = carrots.statusVegetable();
        GrowthStatus growthStatus2 = pepper.statusVegetable();

        // Toon de resultaten
        System.out.println("Groeistatus Carrot: " + growthStatus1);
        System.out.println("Groeistatus Pepper: " + growthStatus2);

        // Toon de huidige grootte en isReady-status van de wortels
        System.out.println("Huidige grootte van wortels: " + carrots.getSize());
      //  System.out.println("Is wortels klaar om te oogsten? " + carrots.isReady);
    }
}
