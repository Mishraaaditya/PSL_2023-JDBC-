import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class Main{
    
    public static void main(String [] args) throws Exception{
        //fill your code here
        Scanner sc=new Scanner(System.in);
         System.out.println("Before the Delete");
        System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n","Id","Name","Email","Password","Age","Role","CreatedDate","Status");
        UserDAO dao=new UserDAO();
        ArrayList<User>list=dao.listUsers();
        for(User u : list){
             System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n",u.getId(),u.getName(),u.getEmail(),u.getPassword(),u.getAge(),u.getRole(),u.getCreatedDate(),u.getStatus());
        }
         System.out.println("Enter the Id:");
         int id=sc.nextInt() ;
         dao.deleteUser(id);

          System.out.println("After the Delete"); 
                  System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n","Id","Name","Email","Password","Age","Role","CreatedDate","Status");
            list=dao.listUsers();

          for(User u:list){
               System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n",u.getId(),u.getName(),u.getEmail(),u.getPassword(),u.getAge(),u.getRole(),u.getCreatedDate(),u.getStatus()); 
          }
    }

}