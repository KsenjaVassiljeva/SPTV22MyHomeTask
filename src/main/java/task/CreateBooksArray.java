/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task;

import task.createbooksarray.Author;
import task.createbooksarray.Book;

/**
 *
 * @author admin
 */
public class CreateBooksArray {

    public void doCreateArray() {
        Book book = new Book();
        Author levTolstoy = new Author("Tolstoy","Lew");
        Author[] authorVoinaIMir=new Author [1];
        authorVoinaIMir[0] = levTolstoy;
        
        Author IvanTurgenev = new Author("Turgenev","Ivan");
        Author[] authorOtsiIDeti=new Author [1];
        authorOtsiIDeti[0] = IvanTurgenev;
        
        Author FedorDostayevskiy = new Author("Dostayevskiy","Fedor");
        Author[] authorPristupleniyeIInakazania=new Author [1];
        authorPristupleniyeIInakazania[0] = FedorDostayevskiy;
        
        Author EvgeniyPetrov = new Author("Petor","Evgeniy");
        Author[] author12stulyev=new Author [1];
        author12stulyev[0] = EvgeniyPetrov;
        
        
        Book[] books = new Book[5];
        books[0]=new Book("Voina i mir",2020,authorVoinaIMir);
        books[1]=new Book("Otsi i deti",2021,authorOtsiIDeti);
        books[2]=new Book("Pristupleni i nakazania",2022,authorPristupleniyeIInakazania);
        books[2]=new Book("12 Стульев",2022,author12stulyev);
        books[4]=new Book("Voina i mir",2020,authorVoinaIMir);
    }
    
}
    