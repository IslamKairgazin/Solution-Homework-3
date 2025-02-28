public class MUDCombinedDemo {
    public static void main(String[] args) {

        World minecraftWorld = new SimpleWorldBuilder()
                .setWorldName("Кубический мир")
                .addBiome("Лес")
                .addBiome("Пустыня")
                .addStructure("Деревня")
                .addStructure("Замок")
                .build();

        System.out.println("Создан мир:");
        minecraftWorld.showWorld();

        Block stoneBlock = new Block("Камень");
        Block clonedStone = (Block) stoneBlock.cloneEntity();

        Entity cow = new Entity("Корова", 10);
        Entity clonedCow = (Entity) cow.cloneEntity();

        System.out.println("\nКлонированные объекты:");
        System.out.println(stoneBlock);
        System.out.println(clonedStone);
        System.out.println(cow);
        System.out.println(clonedCow);
    }
}
