import java.sql.*;

public class AddMarks {

    public void addMarks(int id,int e,int h,int p,int m,int c,int s){

        try{

            Connection con=DBConnection.getConnection();

            String sql="UPDATE students SET english=?,hindi=?,physics=?,math=?,chemistry=?,science=? WHERE id=?";

            PreparedStatement ps=con.prepareStatement(sql);

            ps.setInt(1,e);
            ps.setInt(2,h);
            ps.setInt(3,p);
            ps.setInt(4,m);
            ps.setInt(5,c);
            ps.setInt(6,s);
            ps.setInt(7,id);

            ps.executeUpdate();

            System.out.println("Marks Added");

        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}