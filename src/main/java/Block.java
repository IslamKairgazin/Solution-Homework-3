// Класс Block представляет блоки в игре (например Камень, Дерево)
public class Block implements CloneableGameEntity {
    private String type; 

    public Block(String type) {
        this.type = type;
    }

    public CloneableGameEntity cloneEntity() {
        // Создаём новый объект Block с таким же типом
        return new Block(this.type);
    }

    public String toString() {
        return "Block: " + type;
    }
}
