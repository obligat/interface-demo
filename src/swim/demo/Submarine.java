package swim.demo;

public class Submarine extends Boat implements Diver {

    public Submarine(String name) {
        super(name);
    }

    @Override
    public void dive() {
        System.out.printf("submarine %s submarining %n", name);
    }
}
