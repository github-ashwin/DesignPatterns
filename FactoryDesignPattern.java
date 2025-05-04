// Interface
interface Transport {
    void deliver();
}

// Two types of transport
class Truck implements Transport {
    public void deliver() {
        System.out.println("Delivering by Truck");
    }
}

class Ship implements Transport {
    public void deliver() {
        System.out.println("Delivering by Ship");
    }
}

// Factory that creates transport objects
class TransportFactory {
    public Transport getTransport(String type) {
        if (type.equalsIgnoreCase("truck")) return new Truck();
        else if (type.equalsIgnoreCase("ship")) return new Ship();
        else return null;
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        TransportFactory factory = new TransportFactory();
        Transport t1 = factory.getTransport("truck");
        t1.deliver();  // Output: Delivering by Truck

        Transport t2 = factory.getTransport("ship");
        t2.deliver();  // Output: Delivering by Ship
    }
}
