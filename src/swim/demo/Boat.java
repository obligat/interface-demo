
package swim.demo;

public class Boat  implements Swimmer{
    protected String name;
    
    public Boat(String name){
        this.name = name;
    }
    
    @Override
    public void swim(){
        System.out.printf("boat %s is boating %n", name);
    }
}
