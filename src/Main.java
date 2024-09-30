public class main {
    public static void main(String[] args){
        Book book1 = new Book("Евгений Онегин", 1831, new Author(" Александр","Пушкин"));
        System.out.println(book1.getAuthor());
        System.out.println(book1.getYear());
        book1.setYear(1832);
        System.out.println(book1);
        Book book = new Book("Евгений Онегин",1831);
        System.out.println(book.getName());


    }
}