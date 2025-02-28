public class Block implements CloneableGameEntity {
    private String type;

    public Block(String type) {
        this.type = type;
    }

    public CloneableGameEntity cloneEntity() {
        return new Block(this.type);
    }

    public String toString() {
        return "Блок: " + type;
    }
}
