package lesson6;

public class Library {
    //можно ли добавлять книги по одной или несколько сразу
    // можно ли взять книгу(указав автора)
    // домой /для чтения в библиотеке

    private String name = "Библиотека"; // свойство по умолчанию будет библиотека
    private Book [] books = new Book[5];

    public String getName() {
        return name;
    }
    // добавление одной книги
    public  void addBook (Book newBook) { //метод имя метода addBook, тип переменных Book, имя переменной newBook
        for (int i = 0; i <books.length ; i++) {
            if (books[i] == null) {
                newBook.setInLibrary(true); // почему екгу в скобках а не =true?
                books[i] = newBook;
            break;
            }
        }
    }
    // добавление нескольких книг

    public  void  addBook (Book ...newBooks) {
        // TODO: 16.03.20 реализация метода ДЗ
        // ... означает переменное количество аргуменных
        //newBooks массив
    }
    public Book getHome(String title) {
        for (int i = 0; i <books.length ; i++) {
            if (books[i].getTitle().equals(title)
            && books [i]!= null
            && books[i].isForHome() == true
            && books[i].isInLibrary()  == true
            ){ books[i].isInLibrary();
            return  books [i];
            }
            }
        return null;
    }

    }




