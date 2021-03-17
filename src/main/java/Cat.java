public class Cat {

    String name;
    int runLimit;
    int jumpLimit;

    public Cat(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public static void run(){
        System.out.println("Кот бежит.");
    }

    public static void jump() {
        System.out.println("Кот прыгает.");
    }
}
