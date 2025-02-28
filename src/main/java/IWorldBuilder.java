public interface IWorldBuilder {
    IWorldBuilder setWorldName(String name);
    IWorldBuilder addBiome(String biome);
    IWorldBuilder addStructure(String structure);
    World build();
}
