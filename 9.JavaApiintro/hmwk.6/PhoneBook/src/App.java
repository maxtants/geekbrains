

public class App {
    public static void main(String[] args) throws Exception {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.getAllContacts();

        phoneBook.addContactOrPhone("Ivanov", 12345);
        phoneBook.addContactOrPhone("Petrov", 23451);
        phoneBook.addContactOrPhone("Petrov", 23452);
        phoneBook.addContactOrPhone("Petrov", 23453);
        phoneBook.addContactOrPhone("Sidorov", 34512);
        phoneBook.addContactOrPhone("Uasia", 45123);
        phoneBook.addContactOrPhone("Uasia", 45122);
        phoneBook.getAllContacts();

        phoneBook.addContactOrPhone("Petrov", 23456);
        phoneBook.getAllContacts();

        phoneBook.removeContact("Ivanov");
        phoneBook.getAllContacts();

        phoneBook.removePhone("Petrov", 23456);
        phoneBook.getAllContacts();

        phoneBook.getContactByName("Uasia");

        //сортировка по убыванию числа телефонов
        phoneBook.sortContacts(phoneBook.phoneBook);
    }
}
