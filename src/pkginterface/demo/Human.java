
package pkginterface.demo;

public class Human {
    private String name;
    
    public Human (String name ){
        this.name = name ;
    }
    
    public String getName(){
        return name;
    }
    
    public void swim(){
        System.out.printf("human %s swim %n", name);
    }
}
