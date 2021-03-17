public class Person {

    String name;
    int runLimit;
    int jumpLimit;

    public Person(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public static void run (){
        System.out.println("Человек бежит.");
    }

    public static void jump() {
        System.out.println("Человек прыгает.");
    }

}
