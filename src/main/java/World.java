import java.util.ArrayList;
import java.util.List;

public class World {
    private String name;
    private List<String> biomes;
    private List<String> structures;

    public World(String name) {
        this.name = name;
        this.biomes = new ArrayList<>();
        this.structures = new ArrayList<>();
    }

    public void addBiome(String biome) {
        biomes.add(biome);
    }

    public void addStructure(String structure) {
        structures.add(structure);
    }

    public void showWorld() {
        System.out.println("Мир: " + name);
        System.out.println("Биомы: " + biomes);
        System.out.println("Постройки: " + structures);
    }
}
