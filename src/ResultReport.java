import java.sql.*;

public class ResultReport {

    public void show(){

        try{

            Connection con=DBConnection.getConnection();

            Statement stmt=con.createStatement();

            ResultSet rs=stmt.executeQuery("SELECT * FROM students");

            while(rs.next()){

                int total=
                        rs.getInt("english")+
                                rs.getInt("hindi")+
                                rs.getInt("physics")+
                                rs.getInt("math")+
                                rs.getInt("chemistry")+
                                rs.getInt("science");

                int avg=total/6;

                String grade=GradeCalculator.calculate(avg);

                String prediction=PerformancePredictor.predict(avg);

                System.out.println("\nName: "+rs.getString("name"));
                System.out.println("Average: "+avg);
                System.out.println("Grade: "+grade);
                System.out.println("Prediction: "+prediction);
            }

        }catch(Exception e){
            System.out.println(e);
        }
    }
}