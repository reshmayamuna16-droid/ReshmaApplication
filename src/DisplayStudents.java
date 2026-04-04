import java.sql.*;

public class DisplayStudents {

    public void display(){

        try{

            Connection con=DBConnection.getConnection();

            Statement stmt=con.createStatement();

            ResultSet rs=stmt.executeQuery("SELECT * FROM students");

            while(rs.next()){

                System.out.println(
                        rs.getInt("id")+" "+
                                rs.getString("name")+" "+
                                rs.getString("department")
                );
            }

        }catch(Exception e){
            System.out.println(e);
        }
    }
}