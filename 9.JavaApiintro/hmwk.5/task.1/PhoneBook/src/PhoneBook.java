
import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        // Введите свое решение ниже
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            ArrayList<Integer> phones = new ArrayList<>();
            phones.add(phoneNum);
            phoneBook.put(name, phones);
        }
    }

    public ArrayList<Integer> find(String name) {
        // Введите свое решение ниже
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        } else {
            return new ArrayList<>();
        }
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        // Введите свое решение ниже
        return phoneBook;
    }
}
