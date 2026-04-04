import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection(){

        Connection con=null;

        try{

            String url="jdbc:mysql://localhost:3306/student_ai";
            String user="root";
            String password="Akshayastar@143";

            con=DriverManager.getConnection(url,user,password);

        }catch(Exception e){
            System.out.println(e);
        }

        return con;
    }
}