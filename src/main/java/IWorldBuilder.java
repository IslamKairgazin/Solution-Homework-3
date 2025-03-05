// Интерфейс для строителя мира
public interface IWorldBuilder {
    IWorldBuilder setWorldName(String name); //название мира
    IWorldBuilder addBiome(String biome); //Добавляем биом (типа Лес, Пустыня)
    IWorldBuilder addStructure(String structure); //Добавляем постройку (типа Деревня)
    World build(); //Создаем готовый мир
}
