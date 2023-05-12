import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.*;
public class UserDAO{

    public ArrayList<User> listUsers() throws Exception{
    	ArrayList<User> userList = new ArrayList<User>();
    	//fill your code here
      Connection con=DBConnection.getConnection();
      Statement ps=con.createStatement();
      ResultSet r=ps.executeQuery("select * from \"user\" ");
      while(r.next()){
      userList.add(new User(r.getInt(1),r.getString(2),r.getString(3),r.getString(4),r.getInt(5),r.getString(6),r.getDate(7),r.getString(8)));
        
      }
		return userList;
    }
    public void deleteUser(Integer id) throws Exception{
    	//fill your code here
      // String q="delete from  \"user\" where id="+id;
      Connection con=DBConnection.getConnection();
     Statement st = con.createStatement();
     st.executeUpdate("delete from \"user\" where id ="+id);
    }
    
}