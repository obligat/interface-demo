
package swim.demo;

public class Human implements Swimmer {
    private String name;
    
    public Human (String name ){
        this.name = name ;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public void swim(){
        System.out.printf("human %s swim %n", name);
    }
}
