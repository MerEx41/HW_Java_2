public class Robot {

    String name;
    int runLimit;
    int jumpLimit;

    public Robot(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public static void run (){
        System.out.println("Робот бежит.");
    }

    public static void jump() {
        System.out.println("Робот прыгает.");
    }
}
