import java.sql.*;

public class RankGenerator {

    public void showTopper(){

        try{

            Connection con=DBConnection.getConnection();

            Statement stmt=con.createStatement();

            ResultSet rs=stmt.executeQuery(
                    "SELECT name,(english+hindi+physics+math+chemistry+science) AS total FROM students ORDER BY total DESC LIMIT 1"
            );

            if(rs.next()){

                System.out.println("Topper: "+rs.getString("name"));
            }

        }catch(Exception e){
            System.out.println(e);
        }
    }
}