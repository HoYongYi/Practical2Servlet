package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chitboon on 10/23/15.
 */
public class BookDBAO {
    // get book details given the bookId
    // this method is dummy for now
    public BookDetails getBookDetails(String bookId) {
        // return dummy book for testing now
        return createDummyBook(bookId);
    }


    // convenient method to create a dummy book detail
    // this method is meant for testing
    private BookDetails createDummyBook(String bookId) {
        BookDetails details = new BookDetails();
        details.setBookId(bookId);
        details.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
        details.setFirstName("Java");
        details.setSurname("Expert");
        details.setInventory(5);
        details.setOnSale(false);
        details.setPrice(5.9f);
        details.setTitle("Web components for developers");
        details.setYear(2015);
        return details;


    }

     public List<BookDetails> getAllBooks(){
    ArrayList<BookDetails> list = new ArrayList<BookDetails>();
         for (int i = 0 ; i <3 ; i++){
             BookDetails details = new BookDetails();
             details.setBookId("" + i);
             details.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
             details.setFirstName("Java");
             details.setSurname("Expert");
             details.setInventory(i);
             details.setOnSale(false);
             details.setPrice(5.9f + i);
             details.setTitle("Web components for developers Version " + i);
             details.setYear(2015);
             list.add(details);
         }
         return list;
     }

}