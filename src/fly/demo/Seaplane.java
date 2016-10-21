
package fly.demo;

import swim.demo.Swimmer;

public class Seaplane implements Swimmer,Flyer {
    private String name;
    
    public Seaplane(String name){
        this.name=name;
    } 
    
    @Override
    public void fly(){
        System.out.printf("seaplane %s is flying %n", name);
    }
    
    @Override
    public void swim(){
        System.out.printf("seaplane %s soating in sea %n", name);
    }
}
