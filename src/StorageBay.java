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
}