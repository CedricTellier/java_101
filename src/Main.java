
import classes.Utils;

//Let just say that it is the entry point to that program
public class Main {
    public static void main(String[] args) {

        int[] table ={1,2,3,4,5};
        System.out.println(Utils.add(table));

        //dirty casting to avoid and try to test it
        System.out.println(Utils.isEven((int)Utils.add(table)));
    }
}
