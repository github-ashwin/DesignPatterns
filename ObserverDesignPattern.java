interface Observer { void update(String message); }
class Subscriber implements Observer {
    private String name;
    public Subscriber(String name) { this.name = name; }
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

class NewsAgency {
    List<Observer> observers = new ArrayList<>();
    void addObserver(Observer o) { observers.add(o); }
    void notifyObservers(String news) {
        for (Observer o : observers) o.update(news);
    }
}

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        agency.addObserver(new Subscriber("User1"));
        agency.addObserver(new Subscriber("User2"));
        agency.notifyObservers("Breaking News!");
    }
}