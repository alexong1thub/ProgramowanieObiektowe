package zadanie1;

public class Book {
    private String title;
    private String author;
    private int releaseYear;
    private int pages;
    private String genre;

    public Book(String title, String author, int pages){
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
