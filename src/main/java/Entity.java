// Класс Entity представляет игровых существ (мобы, NPC)
public class Entity implements CloneableGameEntity {
    private String name; 
    private int health;   // Здоровье существа

    public Entity(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public CloneableGameEntity cloneEntity() {
        // Создаём новый объект Entity с теми же параметрами
        return new Entity(this.name, this.health);
    }

    public String toString() {
        return "Entity: " + name + " (HP: " + health + ")";
    }
}
