class Light {
     void on() 
     { 
        System.out.println("Light ON"); 
    } 
}
class Fan { 
    void on() 
    { 
        System.out.println("Fan ON"); 
    } 
}

class HomeFacade {
    Light light = new Light();
    Fan fan = new Fan();

    void turnOnEverything() {
        light.on();
        fan.on();
    }
}

public class Main {
    public static void main(String[] args) {
        HomeFacade home = new HomeFacade();
        home.turnOnEverything();
    }
}