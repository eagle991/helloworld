public class Book {
    private String name;
    private int year;
    private Author author;

    public Book(){

    }
    public Book(String name, int year, Author author) {
        this(name,year);
        this.author = author;
    }
    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }
    public Book(Author author){
        this.author = author;
    }
    public String getName() {
        return name;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
