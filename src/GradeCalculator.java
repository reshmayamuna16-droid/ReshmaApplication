public class GradeCalculator {

    public static String calculate(int avg){

        if(avg>=90)
            return "A+";
        else if(avg>=75)
            return "A";
        else if(avg>=60)
            return "B";
        else if(avg>=50)
            return "C";
        else
            return "Fail";
    }
}