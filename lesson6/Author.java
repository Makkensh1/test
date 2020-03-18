package lesson6;

public class Author {
    // свойства
    private String name;
    private  String surname;
    // private - модификатор доступа запрещает прямой доступ к свойству из вне, т.е доступ есть только
    // внутри класса в текущем случае это класс Author
    // alt+insert
    // методы
    // setter - если через метод присваем значение свойства
    // setName имя , String - тип данных, name - имя
    public void setName(String name) { //publick дает возможность обращаться из любого контекста
        if  (name.length() >=2 );
        // TODO: 16.03.20 &&!"".equals(name) проверка на пустую строку длина от 2 строк
        // name != null

        this.name = name; //this сслыка на текущий объект
    }

    public String getName() { // после public тип данных
        return name;
    }
    //getter возвращает значение свойства
    // TODO: 16.03.20 весь код после return выполнен не будет!!!
    //void выполняет какие либо действия


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if  (surname.length() >=2 );
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
