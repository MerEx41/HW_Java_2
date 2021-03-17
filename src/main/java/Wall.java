public class Wall {

    int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean jumpOver(int jumpLimit) {
        return jumpLimit >= this.height;

    }
}
