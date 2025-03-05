//Демонстрация Builder и Prototype
public class MUDCombinedDemo {
    public static void main(String[] args) {
        //Создаем мир через Builder
        World myWorld = new SimpleWorldBuilder()
                .setWorldName("Кубический мир")
                .addBiome("Горы")
                .addBiome("Океан")
                .addStructure("Форт")
                .addStructure("Подземелье")
                .build();

        //Выводим информацию о мире
        myWorld.showWorld();

        //Создаем прототип объекта
        Block originalBlock = new Block("Дерево");
        Entity originalEntity = new Entity("Зомби", 20);

        //Клонируем объекты для добавления в миру
        Block clonedBlock = (Block) originalBlock.cloneEntity();
        Entity clonedEntity = (Entity) originalEntity.cloneEntity();

        System.out.println("\nДобавленные клоны в мир:");
        System.out.println(clonedBlock);
        System.out.println(clonedEntity);
    }
}
