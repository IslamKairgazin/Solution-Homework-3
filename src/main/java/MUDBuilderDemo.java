//Демонстрация работы паттерна Builder
public class MUDBuilderDemo {
    public static void main(String[] args) {
        //Создаем мир с Builder
        World myWorld = new SimpleWorldBuilder()
                .setWorldName("Кубический мир")
                .addBiome("Лес")
                .addBiome("Пустыня")
                .addStructure("Деревня")
                .addStructure("Замок")
                .build();

        //Выводим инфо о мире
        myWorld.showWorld();
    }
}
