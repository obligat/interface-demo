
package swim.demo;

public class Ocean {
    public static void main(String[] args){
        doSwim(new Human("tong"));
        doSwim(new Submarine("hey"));
    }
    
    static void doSwim(Swimmer swimmer){
        swimmer.swim();
    }
}
