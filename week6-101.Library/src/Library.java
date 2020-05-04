
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
public class Library {
    
    private ArrayList<Book> list;

    public Library() {
        this.list = new ArrayList();
    }
    
    public void addBook(Book newBook) {
        this.list.add(newBook);
    }
    
    public void printBooks() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println( list.get(i).toString());
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> searched = new ArrayList<Book>();
        for (int i = 0; i < this.list.size(); i++) {
            if (StringUtils.included(this.list.get(i).title(), title)) {
                searched.add(list.get(i));
            }
        }
        return searched;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> searched = new ArrayList<Book>();
        for (int i = 0; i < this.list.size(); i++) {
            if (StringUtils.included(this.list.get(i).publisher(), publisher)) {
                searched.add(list.get(i));
            }
        }
        return searched;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> searched = new ArrayList<Book>();
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).year() == year) {
                searched.add(list.get(i));
            }
        }
        return searched;
    }
    
}
