public class PerformancePredictor {

    public static String predict(int avg){

        if(avg>=85)
            return "Excellent";

        else if(avg>=60)
            return "Average";

        else
            return "Needs Improvement";
    }
}