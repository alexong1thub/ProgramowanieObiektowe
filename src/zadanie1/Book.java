package zadanie1;

public class Book {
    private String title;
    private String author;
    private int releaseYear;
    private int pages;
    private String genre;

    public Book() {

    }

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(String title, String author, int pages, int releaseYear, String genre) {
            this.title = title;
        this.author = author;
        this.pages = pages;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public void showBookInformation() {
        if (!this.getTitle().isEmpty()) {
            System.out.print("Tytuł ksiązki to " + this.getTitle() + " napisał/a ją " + this.getAuthor() + " ma " + this.getPages() + " stron.");

        } else {
            System.out.println("Książka nie ma tytułu!");
        }

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getPages() {
        return pages;
    }

    public String getGenre() {
        return genre;
    }
}
