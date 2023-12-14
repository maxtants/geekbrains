import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class PhoneBook {
    HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void addContactOrPhone(String name, int phone) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phone);
        } else {
            ArrayList<Integer> phones = new ArrayList<>();
            phones.add(phone);
            phoneBook.put(name, phones);
        }
    }

    public void removePhone(String name, Integer phone) {
        phoneBook.get(name).remove(phone);
    }

    public void removeContact(String name) {
        phoneBook.remove(name);
    }

    public void getContactByName(String name) {
        System.out.println(phoneBook.get(name));
    }

    public void getAllContacts() {
        System.out.println(phoneBook);
    }

    public int countPhones(String name) {
        return phoneBook.get(name).size();
    }

    public void sortContacts(HashMap<String, ArrayList<Integer>> phoneBook) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        for (HashMap.Entry<String, ArrayList<Integer>> entry : phoneBook.entrySet()) {
            int key = entry.getValue().size();
            String value = entry.getKey() + ": " + entry.getValue();
            treeMap.put(key, value);
        }

        System.out.println(treeMap.descendingMap().values());
    }
}
