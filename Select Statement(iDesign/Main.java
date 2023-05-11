import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception
    {
        
        //fill your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("List of Books");
        BookDAO b=new BookDAO();
       // bookList=b.listBooks();
        ArrayList<Book>bookList=new ArrayList<>();
        bookList=b.listBooks();

    System.out.format("%-5s %-20s %-20s %-10s %s\n","Id","Title","Category","Author","Price");
   for(Book book:bookList)
   {
       System.out.format("%-5s %-20s %-20s %-10s %s\n",book.getId(),book.getTitle(),book.getCategory(),book.getAuthor(),book.getPrice());
   }
    }
}
