package Prac1;

public class Book {
    private String author;
    private int nPages;

    public Book()
    {
        this.author = " ";
        this.nPages = 0;
    }

    public Book(String author, int nPages)
    {
        this.author = author;
        this.nPages = nPages;
    }

    public Book(String author)
    {
        this.author = author;
    }

    public Book(int nPages)
    {
        this.nPages = nPages;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setNPages(int nPages)
    {
        this.nPages = nPages;
    }
    public String getAuthor()
    {
        return this.author;
    }

    public int getNPages()
    {
        return this.nPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", nPages=" + nPages +
                '}';
    }
}
