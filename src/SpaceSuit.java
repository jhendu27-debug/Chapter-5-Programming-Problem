public class SpaceSuit {
    private int oxygen;

    public SpaceSuit() {
        oxygen = 5;
    }

    public void consumeOxygen() {
        if (oxygen > 0) {
            oxygen--;
        }
    }

    public int getOxygen() {
        return oxygen;
    }

    public boolean hasOxygen() {
        return oxygen > 0;
    }
}