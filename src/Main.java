import java.util.*;

public class Main {
    public static void main(String[] args) {


        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPerson("Артём Кузнецов", "7(902)971-97-17");
        phoneBook.addPerson("Агата Федорова", "7(902)120-05-15");
        phoneBook.addPerson("Ника Шаровм", "7(902)418-82-79");
        phoneBook.addPerson("Ксения Казакова", "7(902)023-76-88");
        phoneBook.addPerson("Алёна Ермилова", "7(902)752-72-75");
        phoneBook.addPerson("Андрей Ершов", "7(902)964-57-97");
        phoneBook.addPerson("Виктория Лебедева", "7(902)150-33-03");
        phoneBook.addPerson("Полина Антипова", "7(902)361-05-95");
        phoneBook.addPerson("Диана Смирнова", "7(902)480-76-61");
        phoneBook.addPerson("Артём Иванов", "7(902)261-06-82");
        phoneBook.addPerson("Алиса Чернов", "7(902)430-84-42");
        phoneBook.addPerson("Антонина Потапова", "7(902)047-63-39");
        phoneBook.addPerson("Дарья Чистякова", "7(902)106-77-73");
        phoneBook.addPerson("Юлия Широкова", "7(902)450-04-27");
        phoneBook.addPerson("Максим Васильева", "7(902)677-01-97");
        phoneBook.addPerson("Василиса Козлова", "7(902)358-78-86");
        phoneBook.addPerson("Рустам Кольцов", "7(902)828-50-25");
        phoneBook.addPerson("Николай Соколов", "7(902)854-28-11");
        phoneBook.addPerson("Алина Кириллова", "7(902)719-69-67");
        phoneBook.addPerson("Арина Филатова", "7(902)894-08-22");
        System.out.println(phoneBook.getMap());


        RandomValue ran = new RandomValue();
        ran.addMap("str1", 1);
        ran.addMap("str2", 2);
        ran.addMap("str1", 3);


        System.out.println(ran.getMap());


        var value1 = new LinkedHashMap<>();
        map.put(1, "one");
        var value2 = new LinkedHashMap<>();
        map.put(2, "two");
        var value3 = new LinkedHashMap<>();
        map.put(3, "three");
        var value4 = new LinkedHashMap<>();
        map.put(4, "four");
        var value5 = new LinkedHashMap<>();
        map.put(5, "five");
        var value6 = new LinkedHashMap<>();
        map.put(6, "six");
        var value7 = new LinkedHashMap<>();
        map.put(7, "seven");
        var value8 = new LinkedHashMap<>();
        map.put(8, "eight");
        var value9 = new LinkedHashMap<>();
        map.put(9, "nine");
        var value10 = new LinkedHashMap<>();
        map.put(10, "ten");

        System.out.println(map);

    }

    public static Map<Integer, String> map = new LinkedHashMap<>();


}