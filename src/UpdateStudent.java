import java.sql.*;

public class UpdateStudent {

    public void updateName(int id,String name){

        try{

            Connection con=DBConnection.getConnection();

            String sql="UPDATE students SET name=? WHERE id=?";

            PreparedStatement ps=con.prepareStatement(sql);

            ps.setString(1,name);
            ps.setInt(2,id);

            ps.executeUpdate();

            System.out.println("Student Updated");

        }catch(Exception e){
            System.out.println(e);
        }
    }
}