package materials;

public abstract class Material {

    private boolean sustainable;

    public Material(boolean sustainable) {
        this.sustainable = sustainable;
    }

    public boolean isSustainable() {
        return sustainable;
    }
}
