package other;

import static java.lang.System.out;

public class Game {

    public static void main(String[] args) {
        play(Action.DOWN);
        play(Action.LEFT);
    }

    public static void play(int action) {
        switch (action) {
            case Action.STOP:
                out.println("stop action");
                break;
            case Action.RIGHT:
                out.println("right action");
                break;
            case Action.LEFT:
                out.println("left action");
                break;
            case Action.UP:
                out.println("up action");
                break;
            case Action.DOWN:
                out.println("down action");
                break;
            default:
                out.println("no this action");
        }
    }
}
