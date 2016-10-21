package other;

import static java.lang.System.out;

public class Game {

    public static void main(String[] args) {
        play(Action.DOWN);
        play(Action.LEFT);
    }

    public static void play(Action action) {
        switch (action) {
            case STOP:
                out.println("stop action");
                break;
            case RIGHT:
                out.println("right action");
                break;
            case LEFT:
                out.println("left action");
                break;
            case UP:
                out.println("up action");
                break;
            case DOWN:
                out.println("down action");
                break;
        }
    }
}
