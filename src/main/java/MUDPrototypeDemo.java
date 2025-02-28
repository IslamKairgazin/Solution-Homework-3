// Класс для демонстрации работы паттерна Prototype
public class MUDPrototypeDemo {
    public static void main(String[] args) {
        // Создаём оригинальные объекты
        Block stoneBlock = new Block("Камень");
        Entity cow = new Entity("Корова", 10);

        // Клонируем объекты
        Block clonedBlock = (Block) stoneBlock.cloneEntity();
        Entity clonedCow = (Entity) cow.cloneEntity();

        // Выводим оригиналы и их клоны
        System.out.println("Оригиналы:");
        System.out.println(stoneBlock);
        System.out.println(cow);

        System.out.println("\nКлоны:");
        System.out.println(clonedBlock);
        System.out.println(clonedCow);
    }
}
