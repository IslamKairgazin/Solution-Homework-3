public class Entity implements CloneableGameEntity {
    private String name;
    private int health;

    public Entity(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public CloneableGameEntity cloneEntity() {
        return new Entity(this.name, this.health);
    }

    public String toString() {
        return "Существо: " + name + " (HP: " + health + ")";
    }
}
