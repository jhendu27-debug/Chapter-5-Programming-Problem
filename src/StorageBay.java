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
}