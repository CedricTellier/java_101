package classes;

// Static methods to use this class
public class Utils {

    public static double add(int[] aValues){
        double result=0.0;
        for(int values : aValues){
            result+=values;
        }
        return result;
    }


    public static boolean isEven(int aNumber){
        return (aNumber%2==0);
    }
}
