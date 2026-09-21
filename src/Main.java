import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StorageBay storageBay = new StorageBay();
        SpaceSuit spaceSuit = new SpaceSuit();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Storage bay initialized.");
        System.out.println("Space suit initialized.");

        storageBay.displayManifest();

        while (spaceSuit.hasOxygen()) {
            System.out.println("\nOxygen remaining: " + spaceSuit.getOxygen());
            System.out.print("Enter pod index to breach (0-4): ");

            int index = scanner.nextInt();

            boolean foundPowerCell = storageBay.salvagePod(index);

            spaceSuit.consumeOxygen();

            System.out.println("Oxygen remaining: " + spaceSuit.getOxygen());

            if (foundPowerCell) {
                System.out.println("Mission successful! Power Cell recovered.");
                break;
            }
        }

        if (!spaceSuit.hasOxygen()) {
            System.out.println("Life support has failed. Mission unsuccessful.");
        }

        scanner.close();
    }
}