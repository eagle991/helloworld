import java.util.Objects;

public class Book {
    //характеристики
    private String name;
    private int year;
    private Author author;
    //конструкторы
    public Book(String name, int year, Author author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Book(Author author) {
        this.author = author;
    }

    public Book() {

    }
    //методы

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, author);
    }

    @Override
    public String toString() {
        return "Книга{" +
                "Имя='" + name + '\'' +
                ", год=" + year +
                ", автор=" + author +
                '}';
    }
}
