package Lesson4;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.Arrays;

public class Lesson4 {
    public static void main(String[] args) {
        // строки - сслыочный тип данных
        //строки до 9 JAVA хранятся как массив char кодировка UTF-16 каждый символ 2 байта
        char charVar = 'e'; // в одинарных ковычках символы
        char [] chars = {'j', 'j', 'd'};
        String someString = "jjd"; //строки в двойных ковычках
        //строки (компактные строки)после 9 JAVA
        //cтроки хранятся как массив byte[] кодировка UTF-16 либо LATIN-1
        String string = "someString"; // предпочтительный вариант использует Пул строк и создает ссылку на существующие строки
        String string4 = "someString";
        String string2 = new String("someString"); // в памяти создается отдельный объект
        String string3 = new String("someString");
        //сравнение строк
        System.out.println(string == string4); //true т.к один объект
        System.out.println(string2 == string3); //false тк разные объекты
        System.out.println(string2.equals(string3)); //сравнение строк (сравнение на идентичность посимвольное сравнение)

        String newString = new String("new");
        String newString2 = newString.intern(); //помещает строку в пул строк, если строка уже есть то возвращает ссылку
        System.out.println(string2 == string3);
        System.out.println(string2.intern() == string3.intern());

        // строки неизменны и потокобезопасны, любые изменение в строке приводят к созданию новой строки в пуле строк
        // контакенация строк

        String str1 = "строка 1";
        String str2 = "строка 2";
        String str3 = "строка 3";

        str1 = str1 + str2; //первый вариант компатинации строк через +
        str1 = str1 + " " + str2; //текст в ковычках
        System.out.println(str1);

        str2 = str2.concat(str3)
                .concat("Hello")
                .concat("STR"); // каждый + или конкат создание новой строки в пуле строк
        System.out.println(str2);
        // TODO: 13.03.20 Разницы между concat и "+" нет

        System.out.println("Some Data");

        str3 = String.join("::", str1, str2, str3); //в "" будет текст вставленный между последующих строчек
        System.out.println(str3);
// TODO: 13.03.20 работает как + и concat каждый раз создает в пуле новую строку

        str1 = "Строка  ";
        for (int i = 0; i <10 ; i++) {
            str1 += " итерация "  + i; //на каждой итерации создается по одной строке на каждый +
            }
        System.out.println(str1);
        // TODO: 13.03.20  в циклах с большим количеством + или итераций "+" или concat не использовать

        //возможность изменять строки дают объекты
        //StringBuilder или StringBuffer
        //StringBuilder - работает быстрее но его нельзя использовать в многопоточных средах (не потокобезопасен)
        //StringBuffer - работает медленнее но потокобезопасен

        str1 = "Строка  ";
        StringBuilder sb = new StringBuilder(); // new StringBuilder() если внутри скобок можно  положить строку
        sb.append(str1).append("Hello").append("!!"); // .append добавляет текст в ковычках
        // TODO: 13.03.20 объекты StringBuilder это не строки и в пуле строк не учитываются , и новые строки не создаются

        for (int i = 0; i < 10; i++) {
            sb.append(" итерация ").append(i);
        }
        str1 = sb.toString(); // вернет sb как строчку и добавит в пул строк
        //System.out.println(sb);

        char [] charArr = {'q', 'w', 'e'};
        String charStr = new String(charArr); // создание строки из массива символов

        byte [] bytes = charStr.getBytes(); //представляет строку как последовательность байтов
        charStr = new String(bytes);
        System.out.println(Arrays.toString(bytes));

        // TODO: 13.03.20  сравнение
        str1 = "Java";
        str2 = "java";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2)); // сравнение без учета регистра

        System.out.println(str1.compareTo(str2)); // возвращает число
        System.out.println(str1.compareToIgnoreCase(str2)); // возвращает число без учета регистра
         // 0 значит что строки равны
        // сравнивается посимвольно до первого расхождения
        System.out.println(str1.startsWith("Ja")); //сравнение с началом строки
        System.out.println(str1.endsWith("A")); //страчение с окончанием строки

        // TODO: 13.03.20  приведение к верхнему и нижнему регистру

        str1 = str1.toLowerCase(); //нижний регистр всю строку
        System.out.println(str1);
        str1 = str1.toUpperCase(); //верхний регистр всю строку
        System.out.println(str1);

         str1 = "      стр   ";
        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println(str1.trim()); // убирает пробелы в начале и в конце строки
        System.out.println(str1.trim().length()); // убирает пробелы в начале и в конце строки

        str1 = "Java";

        System.out.println(str1.replace("a" , "AA")); // сначала что хотим заменить потом на что


        str1 = "Java Junior";
        String [] strings = str1.split("\\s"); //разбивает строчку и получается ммссив строк
        System.out.println(Arrays.toString(strings));

    }
}
