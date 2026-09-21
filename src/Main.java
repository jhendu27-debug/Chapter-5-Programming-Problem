public class Main {
    public static void main(String[] args) {
        StorageBay storageBay = new StorageBay();
        SpaceSuit spaceSuit = new SpaceSuit();

        System.out.println("Storage bay initialized.");
        System.out.println("Space suit initialized.");

        System.out.println("\nCargo Manifest:");
        storageBay.displayManifest();
    }
}