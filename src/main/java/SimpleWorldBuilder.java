public class SimpleWorldBuilder implements IWorldBuilder {
    private World world;

    public SimpleWorldBuilder() {
        this.world = new World("Без имени");
    }

    public IWorldBuilder setWorldName(String name) {
        this.world = new World(name);
        return this;
    }

    public IWorldBuilder addBiome(String biome) {
        world.addBiome(biome);
        return this;
    }

    public IWorldBuilder addStructure(String structure) {
        world.addStructure(structure);
        return this;
    }

    public World build() {
        return world;
    }
}
