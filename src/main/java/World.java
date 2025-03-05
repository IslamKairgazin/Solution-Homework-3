import java.util.List;

// Класс, представляющий мир
public class World {
    private String name;
    private List<String> biomes;
    private List<String> structures;

    public World(String name, List<String> biomes, List<String> structures) {
        this.name = name;
        this.biomes = biomes;
        this.structures = structures;
    }

    public void showWorld() {
        System.out.println("Создан мир: " + name);
        System.out.println("Биомы: " + String.join(", ", biomes));
        System.out.println("Структуры: " + String.join(", ", structures));
    }
}
