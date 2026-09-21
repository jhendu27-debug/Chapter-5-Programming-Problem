public class StorageBay {
    private CargoPod[] pods;

    public StorageBay() {
        pods = new CargoPod[5];

        for (int i = 0; i < pods.length; i++) {
            if (i == 2) {
                pods[i] = new CargoPod(i, "Power Cell");
            } else if (i == 1 || i == 4) {
                pods[i] = new CargoPod(i, "Hazardous Waste");
            } else {
                pods[i] = new CargoPod(i, "Empty");
            }
        }
    }

    public void displayManifest() {
        for (CargoPod pod : pods) {
            String status;

            if (pod.isSalvaged()) {
                status = "Salvaged";
            } else {
                status = "Sealed";
            }

            System.out.println("Pod " + pod.getId() + ": "
                    + status + " [" + pod.getContents() + "]");
        }
    }

    public boolean salvagePod(int index) {
        if (index < 0 || index >= pods.length) {
            System.out.println("Invalid pod index.");
            return false;
        }

        CargoPod pod = pods[index];

        if (pod.isSalvaged()) {
            System.out.println("Pod " + index + " has already been salvaged.");
            return false;
        }

        pod.setSalvaged(true);

        System.out.println("Pod " + index + " opened.");

        if (pod.getContents().equals("Power Cell")) {
            System.out.println("You found the Power Cell!");
            return true;
        } else if (pod.getContents().equals("Hazardous Waste")) {
            System.out.println("Warning: Hazardous Waste found.");
        } else {
            System.out.println("The pod is empty.");
        }

        return false;
    }
}