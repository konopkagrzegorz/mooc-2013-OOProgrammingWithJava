
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class Phonebook {
    
    private ArrayList<Person> list;

    public Phonebook() {
        this.list = new ArrayList<Person>();
    }
    
    public void add(String name, String number) {
        list.add(new Person(name, number));
    }
    
    public void printAll() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
    
    public String searchNumber(String name) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().contains(name)) {
                return list.get(i).getNumber();
            }
        }
        return "number not known";
    }
}

