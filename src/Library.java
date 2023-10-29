import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // Factory Design Pattern
    public Book createBook(String type, String title) {
        if (type.equalsIgnoreCase("Fiction")) {
            return new FictionBook(title);
        } else if (type.equalsIgnoreCase("NonFiction")) {
            return new NonFictionBook(title);
        } else {
            throw new IllegalArgumentException("Invalid book type");
        }
    }
}