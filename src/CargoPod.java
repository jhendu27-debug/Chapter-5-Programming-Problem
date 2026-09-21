public class CargoPod {
    private int id;
    private String contents;
    private boolean salvaged;

    public CargoPod(int id, String contents) {
        this.id = id;
        this.contents = contents;
        this.salvaged = false;
    }

    public int getId() {
        return id;
    }

    public String getContents() {
        return contents;
    }

    public boolean isSalvaged() {
        return salvaged;
    }

    public void setSalvaged(boolean salvaged) {
        this.salvaged = salvaged;
    }
}