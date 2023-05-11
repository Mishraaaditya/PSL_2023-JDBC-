import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDAO {
	public ArrayList<Book> listBooks() throws Exception{
    	ArrayList<Book> bookList = new ArrayList<Book>();
    	//fill your code here
		Connection con=DBConnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from book");
		while(rs.next()){
			Book book=new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5));
			bookList.add(book);
		}
		return bookList;
    }
}
