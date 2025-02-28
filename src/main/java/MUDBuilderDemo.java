public class MUDBuilderDemo {
    public static void main(String[] args) {
        World minecraftWorld = new SimpleWorldBuilder()
                .setWorldName("Кубический мир")
                .addBiome("Лес")
                .addBiome("Пустыня")
                .addStructure("Деревня")
                .addStructure("Замок")
                .build();

        minecraftWorld.showWorld();
    }
}
