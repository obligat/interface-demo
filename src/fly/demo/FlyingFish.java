
package fly.demo;

import swim.demo.Fish;

public class FlyingFish  extends Fish implements Flyer{
    public FlyingFish(String name){
        super(name);
    }
    
    @Override 
    public void swim(){
        System.out.println("FlyingFish is swimming");
    }
    
    @Override
    public void fly(){
        System.out.println("FlyingFish is flying");
    }
}

