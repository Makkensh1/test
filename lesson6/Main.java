package lesson6;

public class Main {
    public static void main(String[] args) {
       Author author1 = new Author();
      //  author1.name = "Брюс";
      //  System.out.println(author1.name);

        // вызов метода
        author1.setName("Брюс");

        System.out.println(author1.getName());
        author1.setSurname("Экель");

        Author author2 = new Author();
        author2.setName("Роберт");
        String name = author2.getName();
        System.out.println(name);
       // author2.name = "Роберт";
       // System.out.println(author2.name);

        author2.setSurname("Мартин");
        System.out.println(author2);

        Book book1 = new Book("Философия Java");
        book1.setPageCount(1350);
        book1.setAuthor(author1);
        book1.setForHome(true);

        System.out.println(book1);
        // TODO: 16.03.20 Значения по умолчанию
        // ссылочные типы null
        // целые числа 0
        //boolean false
        // числа с плавающей точкой 0.0
        Book book2 = new Book("Чистый код", 500);
        book2.setAuthor(author2);
        System.out.println(book2);
        //если в классе описан хотя бы один конструктор с параметрами
        // то конструктор без параметров т.е по умолчанию будет не доступен

        String book1AuthorName = book1.getAuthor().getName();
        System.out.println(book1AuthorName);
        Book [] books = {book1, book2};
        for (int i = 0; i < books.length ; i++) {
            System.out.println(books[i].getAuthor().getSurname());
        // for (Book book : books) {
         //   System.out.println(book1.getAuthor().getSurname());

            Library library = new Library();
            library.addBook(book1, book2);
            library.addBook(book2);
            library.addBook(book1);
        }
    }
}
