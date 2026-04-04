import java.sql.*;

public class AddStudent {

    public void addStudent(int id,String name,String dept){

        try{

            Connection con=DBConnection.getConnection();

            String sql="INSERT INTO students VALUES(?,?,?,0,0,0,0,0,0)";

            PreparedStatement ps=con.prepareStatement(sql);

            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setString(3,dept);

            ps.executeUpdate();

            System.out.println("Student Added");

        }catch(Exception e){
            System.out.println(e);
        }
    }
}