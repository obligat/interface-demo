package other;

interface method {

    void execute();
}

interface Some extends method {

    void doSome();
}

interface Other extends method {

    void doOther();
}

public class Service implements Some, Other {

    @Override
    public void execute() {
        System.out.println("execute()");
    }

    @Override
    public void doSome() {
        System.out.println("doSome()");
    }

    @Override
    public void doOther() {
        System.out.println("doOther");
    }

}
