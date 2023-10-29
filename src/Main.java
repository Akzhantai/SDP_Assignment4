public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        User user1 = new User("Alice");
        User user2 = new User("Bob");

        library.addObserver(user1);
        library.addObserver(user2);

        Book fictionBook = library.createBook("Fiction", "The Great Gatsby");
        library.notifyObservers("New book available: " + fictionBook.getTitle());

        Book nonFictionBook = library.createBook("NonFiction", "Sapiens");
        library.notifyObservers("New book available: " + nonFictionBook.getTitle());

        library.removeObserver(user1);

        Book anotherFictionBook = library.createBook("Fiction", "1984");
        library.notifyObservers("New book available: " + anotherFictionBook.getTitle());
    }
}
