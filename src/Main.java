public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(name"qwe", year 34234, new Author("Василий","Петров"));
        Author author = book1.getAuthor();
        System.out.println(author);

        Book book = new Book(name "Гроза", year 1999);
        System.out.println(book.getName());
    }
}
