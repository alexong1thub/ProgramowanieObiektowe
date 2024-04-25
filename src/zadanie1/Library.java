package zadanie1;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book> books;
    private static final Scanner sc = new Scanner(System.in);
    public Library(){
        books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println("Książka została dodana do naszej biblioteczki!");
    }
    public void addBook(String title, String author, int pages){
        books.add(new Book(title, author, pages));
        System.out.println("Książka została dodana do naszej biblioteczki!");
    }
    public void addBookToLibraryPrompt(){
        System.out.println("Podaj tytuł ksiązki: ");
        String title = sc.nextLine();

        System.out.println("Podaj autora książki: ");
        String author = sc.nextLine();

        System.out.println("Podaj liczbę stron książki: ");
        int pages = Integer.parseInt(sc.nextLine());

        System.out.println("Podaj rok wydania książki: ");
        int releaseYear = Integer.parseInt(sc.nextLine());

        System.out.println("Podaj gatunek książki: ");
        String genre = sc.nextLine();

        books.add(new Book(title, author, pages, releaseYear, genre));
        System.out.println("Książka dodana do naszej biblioteczki!");
    }
    public Book searchByAuthorName(String author){
        System.out.println("Szukam książki autorstwa: " + author);
        for(Book b: books){
            if(b.getAuthor().equals(author)){
                System.out.println("Znaleziono książke tego autora.");
                return b;
            }
        }
        System.out.println("Nie znaleziono książki autora, zwracam pustą książkę.");
        return new Book();
    }
    public void showBooksInLibrary(){
        for(Book b: books){
            System.out.println("Tytuł książki: " + b.getTitle());
            System.out.println("Autor książki: " + b.getAuthor());
            System.out.println("Liczba stron w książce: " + b.getPages());
            if(b.getReleaseYear() != 0 && b.getGenre() != null){
                System.out.println("Rok wydania książki: " + b.getReleaseYear());
                System.out.println("Gatunek książki: " + b.getGenre());
            }
            System.out.println();
        }
    }
}
