package zadanie1;

public class LibraryTest {
    public static void main(String[] args){
        Library library = new Library();
        library.addBook(new Book("Mroczna wieża", "Stephen King", 359));
        library.addBookToLibraryPrompt();
        library.addBook("Wiedźmin Ostanie życzenie", "Andrzej Sapkowski", 400);
        library.addBook("Smallville Season Eleven", " Bryan Q. Miller", 320);
        library.showBooksInLibrary();

    }
}
