package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by 153262Y on 10/24/2016.
 */
@WebServlet(name = "BookCatalogServlett", urlPatterns = "/bookcatalog")
public class BookCatalogServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BookDBAO b = new BookDBAO();
        List<BookDetails> list = b.getAllBooks();
        PrintWriter out = response.getWriter();
        out.println(getContent());
        out.println("<table>" + "<tr>" + "<th>Title</th>" + "<th>Author</th>" + "<th>Price</th>" + "</tr>");
        out.println("</body>" + "</html>");
        for (int i = 0 ; i < list.size() ; i++){
            BookDetails bd = list.get(i);
            out.println("<tr>" + "<th>" + bd.getTitle() + "</th>"+ "<th>" + bd.getFirstName() + bd.getSurname() + "</th>"
            + "<th>"  + "$" + bd.getPrice()  + "0" + "</th>" +"</tr>");
        }

        out.close();

    }

    private String getContent() {
        BookDBAO db = new BookDBAO();
        BookDetails bd = db.getBookDetails("203");
        StringBuilder buffer = new StringBuilder();
        buffer.append("<html>" + "<head><title>Duke's Bookstore</title></head>");
        buffer.append("<body  bgcolor=\"#ffffff\">" + "<center>" +
                "<hr> <br> &nbsp;" + "<h1>" +
                "<font size=\"+3\" color=\"#CC0066\">Duke's </font> <img src=\"" +
                "./duke.books.gif\" alt=\"Duke holding books\"\">" +
                "<font size=\"+3\" color=\"black\">Bookstore</font>" + "</h1>" +
                "</center>" + "<br> &nbsp; <hr> <br> ");

        return buffer.toString();
    }
}