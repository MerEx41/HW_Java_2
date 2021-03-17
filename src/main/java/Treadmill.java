public class Treadmill {

    int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public boolean runDistance(int runLimit) {
       return runLimit >= this.distance;

    }
}
