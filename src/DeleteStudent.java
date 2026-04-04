import java.sql.*;

public class DeleteStudent {

    public void delete(int id){

        try{

            Connection con=DBConnection.getConnection();

            String sql="DELETE FROM students WHERE id=?";

            PreparedStatement ps=con.prepareStatement(sql);

            ps.setInt(1,id);

            ps.executeUpdate();

            System.out.println("Student Deleted");

        }catch(Exception e){
            System.out.println(e);
        }
    }
}