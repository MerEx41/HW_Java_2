package HW3;

import java.util.*;

public class Phonebook {

    private final HashMap<Integer, String> phonebook;

    Phonebook() {
        phonebook = new HashMap<>();
    }

    public void add(int phoneNumber,String lastName){
        phonebook.put(phoneNumber,lastName);
    }
    
    public void get(String lastName){
        if(phonebook.containsValue(lastName)){
            Set<Map.Entry<Integer, String>> set = phonebook.entrySet();
            for (Map.Entry<Integer, String> temp : set) {
                if(temp.getValue().equals(lastName)) {
                    System.out.println(temp.getValue() + " : " + temp.getKey());
                }
            }
        }
    }
}
