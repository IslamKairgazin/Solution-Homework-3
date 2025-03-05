import java.util.ArrayList;
import java.util.List;

//Реализация строителя мира
public class SimpleWorldBuilder implements IWorldBuilder {
    private String worldName;
    private List<String> biomes = new ArrayList<>();
    private List<String> structures = new ArrayList<>();

    public IWorldBuilder setWorldName(String name) {
        this.worldName = name;
        return this;
    }

    public IWorldBuilder addBiome(String biome) {
        biomes.add(biome);
        return this;
    }

    public IWorldBuilder addStructure(String structure) {
        structures.add(structure);
        return this;
    }

    public World build() {
        return new World(worldName, biomes, structures);
    }
}
