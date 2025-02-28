public class MUDPrototypeDemo {
    public static void main(String[] args) {

        Block stone = new Block("Камень");
        Block clonedStone = (Block) stone.cloneEntity();

        Entity cow = new Entity("Корова", 10);
        Entity clonedCow = (Entity) cow.cloneEntity();

        System.out.println(stone);
        System.out.println(clonedStone);
        System.out.println(cow);
        System.out.println(clonedCow);
    }
}
