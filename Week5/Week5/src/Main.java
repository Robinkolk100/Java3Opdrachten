import enums.GrowthStatus;
import vegetables.Carrots;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


    // Maak een instantie van de Carrots-klasse
    Carrots carrots = new Carrots();

    // Simuleer groeiomstandigheden
    int lux = 50000;
    int water = 33;
    int days = 9;

    // Roep de GrowVegetable-methode aan om de groei te simuleren
    GrowthStatus[] growthStatuses = carrots.GrowVegetable(lux, water, days);

    // Toon de resultaten
        System.out.println("Groeistatussen:");
        for (GrowthStatus status : growthStatuses) {
        System.out.println(status);
    }

    // Toon de huidige grootte en isReady-status van de wortels
        System.out.println("Huidige grootte van wortels: " + carrots.getSize());
        //System.out.println("Is wortels klaar om te oogsten? " + carrots.isReady());
}
}