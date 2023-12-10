import java.util.ArrayList;
import java.util.HashMap;

class PhoneBook {

    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        ArrayList<Integer> temp = new ArrayList<>();
        if (!phoneBook.containsKey(name)) {
            temp.add(phoneNum);
            phoneBook.put(name, temp);
        } else {
            temp = phoneBook.get(name);
            temp.add(phoneNum);
            phoneBook.put(name, temp);
        }
    }

    public ArrayList<Integer> find(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        else return new ArrayList<Integer>();

    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }

    public static void main(String[] args) {

        String name1;
        String name2;
        int phone1;
        int phone2;

        name1 = "Ivanov";
        name2 = "Petrov";
        phone1 = 123456;
        phone2 = 654321;

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);

        System.out.println(myPhoneBook.find(name1));
        System.out.println(PhoneBook.getPhoneBook());
        System.out.println(myPhoneBook.find("Me"));
    }
}