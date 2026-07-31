package pets;
import animals.*;

public class Dogs extends Animals {

    public void bark(){
        System.out.println("barking");
        eat();
    }
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.bark();;
       
    }
    
}
