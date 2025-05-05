// Step 1: The base interface
interface Coffee {
    String getDescription();
    int getCost();
}

// Step 2: Basic coffee class
class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Simple Coffee";
    }

    public int getCost() {
        return 50;
    }
}

// Step 3: Abstract decorator class
abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}

// Step 4: Concrete decorators
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    public int getCost() {
        return coffee.getCost() + 10;
    }
}

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    public int getCost() {
        return coffee.getCost() + 5;
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();                 // ₹50
        coffee = new MilkDecorator(coffee);                // ₹60
        coffee = new SugarDecorator(coffee);               // ₹65

        System.out.println(coffee.getDescription());       // Output: Simple Coffee, Milk, Sugar
        System.out.println("Cost: ₹" + coffee.getCost());  // Output: Cost: ₹65
    }
}

