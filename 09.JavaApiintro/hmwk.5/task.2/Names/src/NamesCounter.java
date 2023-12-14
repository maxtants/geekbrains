
import java.util.HashMap;


public class NamesCounter {
    private HashMap<String, Integer> names = new HashMap<>();

    // Метод для добавления имени в HashMap
    public void addName(String name) {
        // Введите свое решение ниже
        if (names.containsKey(name)) {
            names.put(name, names.get(name) + 1);
        } else {
            names.put(name, 1);
        }

    }

    // Метод для вывода содержимого HashMap
    public void showNamesOccurrences() {
        // Введите свое решение ниже
        // StringBuilder sb = new StringBuilder("{");
        // names.entrySet().forEach(entry -> {
        //     sb.append(entry.getKey()+"="+entry.getValue()+", ");
        // });
        // String res = sb.toString();
        // System.out.println(res.substring(0, res.length()-2) + "}");

        System.out.println(names);
    }
}
